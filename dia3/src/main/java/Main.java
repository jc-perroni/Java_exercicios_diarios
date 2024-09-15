https://www.hackerrank.com/challenges/java-int-to-string

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Integer number = sc.nextInt();
            if (number >= -100 && number <= 100){
                String wordNumber = String.valueOf(number);
                System.out.println("Good job");
            }
            else {
                System.out.println("Wrong answer");

            }
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong answer.");
        }
        finally {
            sc.close();
        }

    }

}
