import java.util.Scanner;

class SumOfSquares {
    public static void main(String[] args) {
        Double squareSum = 0.0;
        Double num = 0.0;
        Double num2 = 0.0;
        Double totalOne = 0.0; 
        Double totalTwo = 0.0;
        Double i = 0.0;

        while(i <= 100) {
            squareSum = i;  
            num = Math.pow(squareSum, 2);
            totalOne = totalOne + num;
            i = i + 1;  
        }

        Double f = 0.0;

        while(f <= 100) {
            num2 = f;
            totalTwo = totalTwo + num2;
            f = f + 1;
        }

        totalTwo = Math.pow(totalTwo, 2);

        System.out.println("Answer: " + (totalTwo - totalOne));
    }
}