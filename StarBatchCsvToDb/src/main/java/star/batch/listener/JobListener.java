package star.batch.listener;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import star.batch.model.StarDTO;

import java.util.List;

@Component
public class JobListener extends JobExecutionListenerSupport {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JobListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
           // System.out.println("In Completion Listener ..");
            List<StarDTO> results = jdbcTemplate.query("SELECT id,hip,draper,hr,gl,bf,proper,ra,decn,dist,pmra,pmdec,rv,mag,absmag,spect,ci,x,y,z,vx,vy,vz,rarad,decrad,pmrarad,pmdecrad,bayer,flam,con,comp,comp_primary,base,lum,var,var_min,var_max FROM star",
                    (rs,rowNum)->{
                        return new StarDTO(rs.getInt(1), 
                        		rs.getInt(2),
                        		rs.getInt(3),
                        		rs.getInt(4),
                                rs.getString(5),
                                rs.getString(6),
                                rs.getString(7),
                                rs.getDouble(8),
                        		rs.getDouble(9),
                        		rs.getDouble(10),
                        		rs.getDouble(11),
                        		rs.getDouble(12),
                        		rs.getDouble(13),
                        		rs.getDouble(14),
                        		rs.getDouble(15),
            					rs.getString(16),
            					rs.getDouble(17),
            					rs.getDouble(18),
            					rs.getDouble(19),
            					rs.getDouble(20),
            					rs.getDouble(21),
            					rs.getDouble(22),
            					rs.getDouble(23),
            					rs.getDouble(24),
            					rs.getDouble(25),
            					rs.getDouble(26),
            					rs.getDouble(27),
            					rs.getString(28),
            					rs.getInt(29),
            					rs.getString(30),
            					rs.getInt(31),
            					rs.getInt(32),
            					rs.getString(33),
            					rs.getDouble(34),
            					rs.getString(35),
            					rs.getDouble(36),
            					rs.getDouble(37));
            					
            
                    }
            );
            //results.forEach(System.out::println);
        }
    }
}
