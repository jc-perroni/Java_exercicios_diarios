//https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static final int breadth = sc.nextInt();
    static final int height = sc.nextInt();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try {
            if (breadth <= 0 || height <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
            System.out.println(calculoArea());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    private static int calculoArea(){
        return breadth * height;
    }


}
