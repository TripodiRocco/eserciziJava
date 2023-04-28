package javaoop.exercises._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    boolean isMyTutorTheBestTeacher;
    char InitialsNameOfTutor;
    String courseName;
    int maxStudents;
    double qualityRatingOutOf10;


    public static void calcoloEtaMedia(){

     List<String> students = Arrays.asList("Alice", "Aragon", "Alex");
     List<Integer> studentAges = Arrays.asList(23, 31, 38);

     double sommaEtaTotale = 0;


    for(int i = 0; i < studentAges.size(); i++){
        sommaEtaTotale = sommaEtaTotale + studentAges.get(i);
    }
        double etaMedia = sommaEtaTotale / studentAges.size();
        System.out.println(Math.round(etaMedia));
    }

}
