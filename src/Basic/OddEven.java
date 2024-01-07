package Basic;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numToFindOddEven = scanner.nextInt();

        if(numToFindOddEven % 2 == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
