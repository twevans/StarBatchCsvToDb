package star.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import star.batch.listener.JobListener;
import star.batch.model.Star;
import star.batch.model.StarDTO;
import star.batch.processor.StarProcessor;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {
    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    @Bean
    public FlatFileItemReader<Star> reader() {
        FlatFileItemReader<Star> reader = new FlatFileItemReader<Star>();
        reader.setResource(new ClassPathResource("hygdata_v3.csv"));

        reader.setLineMapper(new DefaultLineMapper<Star>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[] { "id","hip","draper","hr","gl","bf","proper","ra","decn","dist","pmra","pmdec","rv","mag","absmag","spect","ci","x","y","z","vx","vy","vz","rarad","decrad","pmrarad","pmdecrad","bayer","flam","con","comp","comp_primary","base","lum","var","var_min","var_max" });
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper() {{
                setTargetType(Star.class);
            }});
        }});
        return reader;
    }


    @Bean
    public StarProcessor processor() {
        return new StarProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<StarDTO> writer() {
        JdbcBatchItemWriter<StarDTO> writer = new JdbcBatchItemWriter<StarDTO>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
        writer.setSql("INSERT INTO Star (id,hip,draper,hr,gl,bf,proper,ra,decn,dist,pmra,pmdec,rv,mag,absmag,spect,ci,x,y,z,vx,vy,vz,rarad,decrad,pmrarad,pmdecrad,bayer,flam,con,comp,comp_primary,base,lum,var,var_min,var_max) " +
                "VALUES (:id, :hip,:draper,:hr,:gl,:bf,:proper,:ra,:decn,:dist,:pmra,:pmdec,:rv,:mag,:absmag,:spect,:ci,:x,:y,:z,:vx,:vy,:vz,:rarad,:decrad,:pmrarad,:pmdecrad,:bayer,:flam,:con,:comp,:comp_primary,:base,:lum,:var,:var_min,:var_max)");
        writer.setDataSource(dataSource);
        return writer;
    }

    @Bean
    public Job importUserJob(JobListener listener) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1())
                .end()
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Star, StarDTO> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }

}
