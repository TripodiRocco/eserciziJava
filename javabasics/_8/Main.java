package javabasics._8;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * <p>
     * Once this is converted to an int, increase its value by 2
     * <p>
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        String ourNumberStr = "88";

        int ourNumberAsInt = Integer.valueOf(ourNumberStr);    // Conversione dalla stringa all'intero
        ourNumberAsInt++;   // aumento di un'unità = 89
        ourNumberAsInt++;   // aumento di un'altra unità = 90   // potevo fare anche ourNumberStr += 2;
        String backToString = String.valueOf(ourNumberAsInt);   // Conversione al contrario: dall'intero alla stringa
        System.out.println(backToString);   // stampa del risultato

    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2a:");
        char ourChar = 'a';
        String ourCharString = String.valueOf(ourChar); // <--- Change this line
        // Notice below what happens, the `charAt()` method
        System.out.println(ourCharString.toUpperCase().charAt(0));  // il numero 0 indica la posizione della lettera nella stringa (che iniziano la conta da 0)

        System.out.println("\nExercise 2b:");
        String anotherString = "Hello world";
        int charAtIndex = 6; // <--- Change this line
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
        // Il metodo charAt indica il numero della posizione della lettera all'interno della stringa
        // che possiamo modificare cambiando il valore della nostra variabile
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String intStrToConvert = "55"; // Change this line
        System.out.println(Integer.valueOf(intStrToConvert));

        String booleanStrToConvert = "false"; // And this line
        System.out.println(Boolean.valueOf(booleanStrToConvert));

        String doubleStrToConvert = "2.5"; // Also this line
        System.out.println(Double.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     *    4.1: use a string method to make sure it can convert to an int and convert it to an int
     *    4.2: Times our number by 2
     *    4.3: Convert back to a string, and concatenate our number with itself,
     *         (i.e. 4 concatenated with itself is 44, not 8)
     *    4.4: Convert to a double and divide our number by 3.5
     *    4.5: Use Math.floor to remove decimal places on our number
     *
     *    Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String startStr = "5";

        startStr = String.valueOf(startStr);    // Mi sono accertato, seguendo la traccia, che 'startStr' fosse di tipo stringa
        System.out.println(startStr);

        int stringToNumber = Integer.valueOf(startStr);     // Ho convertito la stringa in un intero
        System.out.println(stringToNumber);

        System.out.println(stringToNumber * 2);     // Ho moltiplicato l'intero (5) per 2 = 10

        String backToString = String.valueOf(stringToNumber * 2);   // Conversione al contrario: da intero a stringa
        System.out.println(backToString + 10);      // e concatenazione con lo stesso numero + (10) = 1010

        double stringToDouble = Double.valueOf(backToString + 10);  // Conversione dalla stringa precedente al decimale, mantenendo la concatenazione
        System.out.println(stringToDouble / 3.5);   // Divisione di 1010 per 3.5 = 288.57142857142856

        double removeDecimal = stringToDouble / 3.5;
        System.out.println(Math.floor(removeDecimal));  // Rimozione della parte decimale dopo aver memorizzato nella variabile 'removeDecimal'
                                                        // stringToDouble / 3.5


    }
}