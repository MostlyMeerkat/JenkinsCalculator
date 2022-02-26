import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Calculator!!!!!!");
        System.out.println("Enter a command:");
        Scanner scan = new Scanner(System.in);

        while (true) {
            boolean looping = true;
            String input = scan.nextLine();
            switch (input.charAt(0)) {
                case 'a':
                    System.out.println(calc.add(Integer.parseInt(input.substring(4,4)), Integer.parseInt(input.substring(6,6))));
                    break;
                case 's':
                    System.out.println(calc.subtract(Integer.parseInt(input.substring(9,9)), Integer.parseInt(input.substring(11,11))));
                    break;
                case 'm':
                    System.out.println(calc.multiply(Integer.parseInt(input.substring(9,9)), Integer.parseInt(input.substring(11,11))));
                    break;
                case 'd':
                    System.out.println(calc.divide(Integer.parseInt(input.substring(7,7)), Integer.parseInt(input.substring(9,9))));
                    break;
                case 'f':
                    System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(input.substring(10))));
                    break;
                case 'b':
                    System.out.println(calc.intToBinaryNumber(Integer.parseInt(input.substring(7))));
                    break;
                case 'q':
                    looping = false;
                    break;
            }
            if (!looping) {
                break;
            }
        }
    }
}
