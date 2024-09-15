import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{

        int quantityValues = sc.nextInt();
        sc.nextLine();
        int i = 1;
        List<String> numbers = new ArrayList<>();
        while (i <= quantityValues) {
            String number = sc.nextLine();
            numbers.add(number);
            i++;
        }
            for (String n : numbers) {

                try {
                    long x = Long.parseLong(n);

                    System.out.println(x + " can be fitted in: ");
                    if (x >= -128 && x <= 127) {
                        System.out.println("* byte");
                    }
                    if (x >= -32768 && x <= 32767) {
                        System.out.println("* short");
                    }
                    if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
                        System.out.println("* int");
                    }
                    if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
                        System.out.println("* long");
                    }
                } catch (Exception e) {
                    System.out.println(n + " can't be fitted anywhere.");
                }
            }}
            catch (Exception e){
                System.out.println("It cannot be processed.");
            }
                }}