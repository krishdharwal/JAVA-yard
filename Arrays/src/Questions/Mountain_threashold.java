package Questions;
import java.util.ArrayList;
import java.util.List;
public class Mountain_threashold {

    public List<Integer> stableMountains(int[] height, int threshold) {
        if (height.length <= 1){
            return new ArrayList<>(){};
        }

        List<Integer> sm = new ArrayList<>();
        int i = 0;
        int j = 1;
        while (j < height.length){
            if (height[i] > threshold){
                sm.add(j);
            }
            i++;
            j++;
        }
        return sm;
    }
}
