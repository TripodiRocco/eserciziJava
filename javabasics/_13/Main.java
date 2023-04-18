package javabasics._13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(421);
        numbers.add(9);
        numbers.add(12);
        numbers.add(1349);
        numbers.add(1);
        numbers.add(0);
        numbers.add(20000);

        System.out.println(numbers.get(0));     // stampa primo elemento

        numbers.remove(0);
        System.out.println(numbers);    // rimoz primo numero

        numbers.remove(0);
        System.out.println(numbers);    // rimoz secondo elemento

        numbers.remove(0);        // rimoz terzo elemento
        System.out.println(numbers);

        System.out.println(numbers.get(0));     // stampa primo elemento rimasto

    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Insalata di mare");
        menuItems.add("Carciofi fritti");
        menuItems.add("Risotto in crema di scampi");
        menuItems.add("Filetto di manzo ai ferri");
        menuItems.add("Cheesecake ai frutti di bosco");

        ArrayList<Double> menuPrices = new ArrayList<>();
        menuPrices.add(11.10);
        menuPrices.add(9.80);
        menuPrices.add(12.20);
        menuPrices.add(15.30);
        menuPrices.add(6.10);

        System.out.println(menuItems.get(0) + " = " + menuPrices.get(0) + " euro");
        System.out.println(menuItems.get(1) + " = " + menuPrices.get(1) + " euro");
        System.out.println(menuItems.get(2) + " = " + menuPrices.get(2) + " euro");
        System.out.println(menuItems.get(3) + " = " + menuPrices.get(3) + " euro");
        System.out.println(menuItems.get(4) + " = " + menuPrices.get(4) + " euro");
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        System.out.println(items[0] + items[1] + items[2] + items[3] + items[4] + items [5] + items[6] + items[7] + items[8] + items[9]);
    }
}
