package week02;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here

        int sea = 0;
        int counter = 0;
        boolean above = false;
        boolean below = false;

        for(int i = 0;i< steps;i++){
            if(path.charAt(i)=='D'){
                sea--;
            }else sea++;
            if(sea > 0) {
                above = true;
                if(below){
                    below = false;
                    counter ++;
                }
            }
            if(sea < 0){
                below = true;
                if(above){
                    above = false;
                }
            }
            if(sea == 0 && below){
                below = false;
                counter++;
            }
        }
        return counter;
    }
}
