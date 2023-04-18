package javabasics._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        double value = 23.8;
        double valueSquareRoot = Math.sqrt(value);

        System.out.println("The square root of value is = " + valueSquareRoot);
    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;

        System.out.println("Max= " + Math.max(valueA, valueB));
        System.out.println("Min= " + Math.min(valueA, valueB));

    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        int remainingAmountOfMoneyAfterBuyingAsManyBurgersAsPossible = totalMoney % costPerBurger;
        System.out.println("After buying as many burgers as possible the remainder is = "
                + remainingAmountOfMoneyAfterBuyingAsManyBurgersAsPossible);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Ceiling -> Porta il numero al numero intero successivo, se ci sono cifre decimali diverse da zero
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // Floor -> Porta il numero al numero intero precedente, se ci sono cifre decimali diverse da zero
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // Round -> Porta il numero al numero intero successivo se la posizione decimale è 0,5 o superiore, altrimenti lo porta al numero intero precedente
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // Pow (2) -> Eleva il numero al quadrato
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // Pow (3) -> Eleva il numero al cubo
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // Random -> Genera un valore casuale compreso tra 0 e 1, quindi lo moltiplica per il nostro numero
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}