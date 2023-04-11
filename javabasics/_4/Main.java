package javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int myAge = 29;
        System.out.println("My age is: " + myAge);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char myFirstNameInitial = 'R';
        int myAge = 29;

        System.out.println("My Age = "  + myAge + ", my initial = "  + myFirstNameInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        // Lo statement 'System.out.println' stampa su una nuova riga il titolo dell'esercizio
        System.out.println("\nExercise 3:");
        // Viene memorizzata una variabile booleana chiamata 'hasEatenLunch' che ha valore 'false'
        boolean hasEatenLunch = false;
        // Viene memorizzata una variabile decimale chiamata 'lunchCost' che ha valore '5.99'
        double lunchCost = 5.99;

        // Viene stampata su una nuova riga una stringa concatenata al nome della variabile decimale
        System.out.println("Lunch cost=" + lunchCost);
        // Viene stampata su una nuova riga una stringa concatenata al nome della variabile booleana
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
