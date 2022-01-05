package day02;

import java.util.List;

public class Hiking {
    public float getPlusElevation(List<Float> elevations){
        float result= 0.0F;
        if(elevations.size()>=2) {
            float prevElevation=elevations.get(0);
            for (float elevation : elevations) {
            if(elevation>prevElevation){
                result+=elevation-prevElevation;
            }
            prevElevation=elevation;
            }
        }
        return result;
    }
}
