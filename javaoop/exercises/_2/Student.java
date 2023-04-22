package javaoop.exercises._2;



public class Student {
    String name = "Rocco";
    int age = 29;




    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructing!");
        System.out.println("Constructed!");
    }


    // esercizio 2
    Student(int age){      // primo costruttore
        this.age = age;

    }

    Student(String name){      // secondo costruttore
        this.name = name;

    }

    Student(){      // terzo costruttore

    }

}
