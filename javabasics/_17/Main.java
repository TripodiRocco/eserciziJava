package javabasics._17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        long myBankBalanceEuro = 5_000_000_000l;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        int questionableFundsEuro = 0;

        //Add the questionable funds to your bank balance and print it out!
        System.out.println(myBankBalanceEuro);


        System.out.println();

    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age --> SHORT, perchè nessuno supera cifre simili
     *    2b: The age of a baby in months --> BYTE, poichè un neonato se supponessimo superi i 127 mesi, non lo è più
     *    2c: Money in a hedgefund in euros --> LONG, per la quantità immensa che possiamo memorizzare
     *    2d: Price of a good in euros on amazon.com --> FLOAT, non è necessario rappresentare il numero con più di 2 cifre decimali
     *    2e: The exact weight of an apple measured by scientific equipment --> DOUBLE, per la precisione della parte decimale
     *    2f: The number of kilometers from any 2 places in the world --> LONG, perchè si possono coprire distanze enormi sulla Terra
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        LocalDate currentDate = LocalDate.now();
        System.out.println("La data di oggi è: " + currentDate);    // data completa di oggi

        System.out.println();


        int myDate1 = LocalDate.now().getDayOfMonth();
        System.out.println("Oggi è il giorno: " + myDate1);   // giorno (odierno)

        System.out.println();


        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();     // giorno della settimana
        System.out.println("Is " + dayOfWeek);

        System.out.println();


        int myDate2 = LocalDate.now().getDayOfYear();
        System.out.println("Oggi siamo al: " + myDate2 + "esimo giorno dell'anno");     // n-esimo giorno dell'anno

        System.out.println();


        LocalDate month = LocalDate.now();
        Month month1 = month.getMonth();
        System.out.println("Current month is: " + month1);      // mese corrente

        System.out.println();


        int myDate4 = LocalDate.now().getMonthValue();
        System.out.println("Aprile è il mese n. " + myDate4 + " di 12");    // numero del mese

        System.out.println();


        LocalDate champagne = LocalDate.of(2024, Month.DECEMBER, 31);   // selezione di altri giorni
        System.out.println("Auguri!!!: " + champagne);

        System.out.println();


        LocalDate date1 = LocalDate.of(2023, Month.APRIL, 17);
        LocalDate date2 = LocalDate.of(2023, Month.APRIL, 18);

        boolean dateComparison = date1.isBefore(date2);
        System.out.println("" + dateComparison);

        boolean dateComparison2 = date1.isAfter(date2);
        System.out.println(dateComparison2);

    }
}
