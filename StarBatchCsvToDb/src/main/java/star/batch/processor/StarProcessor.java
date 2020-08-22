package star.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import star.batch.model.Star;
import star.batch.model.StarDTO;

public class StarProcessor implements ItemProcessor<Star, StarDTO> {

    @Override
    public StarDTO process(final Star star) throws Exception {
        System.out.println("Transforming Star(s) to StarDTO(s)..");
        final StarDTO starDto = new StarDTO(star.getId(), star.getHip(),
                star.getDraper(), star.getHr(),star.getGl(),star.getBf(),star.getProper(),
                star.getRa(), star.getDecn(),star.getDist(),star.getPmra(),star.getPmdec(),
                star.getRv(), star.getMag(),star.getAbsmag(),star.getSpect(),star.getCi(),
                star.getX(), star.getY(),star.getZ(),star.getVx(),star.getVy(),
                star.getVz(), star.getRarad(),star.getDecrad(),star.getPmrarad(),star.getPmdecrad(),
                star.getBayer(), star.getFlam(),star.getCon(),star.getComp(),star.getComp_primary(),
                star.getBase(), star.getLum(),star.getVar(),star.getVar_min(),star.getVar_max());
                
                
        return starDto;
    }

}
