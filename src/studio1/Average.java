package studio1;

import support.cse131.ArgsProcessor;
public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int x = ap.nextInt("Enter a value for x");
        int y = ap.nextInt("Enter a value for y");
        //
        // Say hello to the names in s0 through s3.
        double avg = (double)(x + y)/2;
        System.out.println("The average of x and y is " + avg + ".");
    }
}