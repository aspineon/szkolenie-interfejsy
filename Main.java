package practice.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Wprowadź rodzaj działania, które chcesz wykonać (+ - dodawanie lub * - mnożenie)");
        String dzialanie = inputScanner.nextLine();
        boolean dzialanie2;
        if (dzialanie.equals("+"))  {
            dzialanie2 = false;
        }
        else {
            dzialanie2 = true;
        }
        return dzialanie2;
    }

    private double getArgument() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        int arg = inputScanner.nextInt();
        return arg;
    }
}
