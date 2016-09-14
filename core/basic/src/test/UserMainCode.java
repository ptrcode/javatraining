package test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by papu bhattacharya on 11/9/16.
 */
public class UserMainCode {
    /* public  int PerfectSums (int input1, int[] input2 , int input3)
     {
         int sum= input3;
         int noOfIdeal=0;
         List candidateArray = new ArrayList();
         List filterArray = new ArrayList();
         //eliminate no's >=sum
         for (int i = 0; i < input2.length ; i++) {
             if (input2[i] < sum)
                 filterArray.add(input2[i]);
         }
         Collections.sort(filterArray);

         for (int i = 0; i < filterArray.size() - 1; i++) {
             int sumOfCandidate=0;

             for (int j = i+1; j < filterArray.size() - 1; j++) {

             }
         }

         return  0;
     }*/
    public String PerfectSums(int input1, double[] input2, double input3) {
        double pie = 3.14;
        double area = 0;
        double DIFF = 0;
        for (int i = 0; i < input2.length; i++) {
            area += pie * (input2[i] * input2[i]);
        }
        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.CEILING);
        if (area < input3)
            return String.format("%.5g%n", DIFF);
        int counter = 1;
        double increment = counter * 0.000001;
        while ((area > input3) && (increment < 1e-6)) {
            area = calculateAreaWithDiff(input1, input2, increment);
            counter++;
            increment = counter * 0.000001;
        }
        return String.format("%.5g%n", increment);
    }

    double calculateAreaWithDiff(int input1, double[] input2, double diff) {
        double pie = 3.14;
        double area = 0;
        double DIFF = 0;
        for (int i = 0; i < input2.length; i++) {
            area += pie * ((input2[i] - diff) * (input2[i] - diff));
        }
        return area;
    }
}
