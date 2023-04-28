package javaoop.exercises._3;



public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Getters
        Student studente = new Student("Rocco", "Tripodi", 29, true, 'r');
        System.out.println("Lo studente è: " + studente.getName() + " " + studente.getSurname() + " e ha " + studente.getAge() + " anni.");
        System.out.println("É vero che sta studiando Java? " + studente.getJavaStudent() + ".");
        System.out.println("La sua lettera preferita è: " + studente.getFavouriteLetter() + ".");

        System.out.println();

        // Setters
        System.out.println("Che ora cambia il suo nome in:");
        studente.setName("Tom");
        System.out.println(studente.getName());

        System.out.println("Con il cognome di:");
        studente.setSurname("Cruise");
        System.out.println(studente.getSurname());

        System.out.println("Avente età:");
        studente.setAge(60);
        System.out.println(studente.getAge());

        System.out.println("Studia Java?");
        studente.setJavaStudent(false);
        System.out.println(studente.getJavaStudent());

        System.out.println("E la sua lettera preferita è:");
        studente.setFavouriteLetter('t');
        System.out.println(studente.getFavouriteLetter());

    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        Student studente = new Student("Rocco", "Tripodi", 29, true, 'r');

        studente.setName("R");
        studente.setAge(-5);
        studente.setSurname("3podi");



    }

}
