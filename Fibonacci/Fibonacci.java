import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        int firstTerm = 1;
        int secondTerm = 2;
        int result = 0;
        int total = 0;

        int i = 0;
        while(i < 4000000) {
            result = firstTerm + secondTerm;

            firstTerm = result;
            secondTerm = result + secondTerm;

            i = result + secondTerm;

            if(secondTerm%2 == 0) {
                total = total + secondTerm;
            } else if(firstTerm%2 == 0) {
                total = total + firstTerm;
            }
        }
        total = total + 2;
        System.out.println("Answer: " + total);
    }
}

