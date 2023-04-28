package javaoop.exercises._3;

public class Student {
    private String name;
    private String surname;
    private int age;
    private boolean javaStudent;
    private char favouriteLetter;

    Student(String name, String surname, int age, boolean javaStudent, char favouriteLetter){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.javaStudent = javaStudent;
        this.favouriteLetter = favouriteLetter;
    }

    public String getName(){    // Get nome
        return name;
    }

    public void setName(String name){   // Set nome
        if (name.length() == 1){
            System.out.println("Name is too short!");
        } else
        this.name = name;
    }

    public String getSurname(){     // Get cognome
        return surname;
    }

    public void setSurname(String surname){     // Set cognome
      for (int i = 0; i < surname.length(); i++){
          if (Character.isDigit(surname.charAt(i))){
              System.out.println("Invalid");
          }

      }
          this.surname = surname;
    }

    public int getAge(){    // Get età
        return age;
    }

    public void setAge(int age){    // Set età
        if (age < 0){
            System.out.println("You can't have a negative age!");
        } else
            this.age = age;
    }

    public boolean getJavaStudent(){     // Get boolean
        return javaStudent;
    }

    public void setJavaStudent(boolean javaStudent){      // Set boolean
        this.javaStudent = javaStudent;
    }

    public char getFavouriteLetter(){       // Get lettera preferita
        return favouriteLetter;
    }

    public void setFavouriteLetter(char favouriteLetter){       // Set lettera preferita
        this.favouriteLetter = favouriteLetter;
    }

}
