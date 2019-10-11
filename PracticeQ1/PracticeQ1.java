import java.util.Scanner;

class PracticeQ1 {
    public static void main(String[] args) {
        int num5 = 5;
        int total5 = 0;
        int num3 = 3;
        int total3 = 0;

        int i = 1;
        while(i < 1000) {
            if(i%num5 == 0) {
                num5 = i;
                total5 = total5 + num5;
            }
            else if(i%num3 == 0) {
                num3 = i;
                total3 = total3 + num3;
            }
            num5 = 5;
            num3 = 3;
            i = i + 1; 
        }

        System.out.println("Answer: " + (total5 + total3));
    }
}