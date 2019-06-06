package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getExamScores() {
        // Given
        ArrayList<Double> testSc3 = new ArrayList<>();

        Student s = new Student("bob", "r", testSc3 );
        s.addExamScore(0.0);
        s.addExamScore(0.0);

        // When
        Double expected = 0.0;
        Double actual = s.getAverageExamScore();


        // Then
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void getNumberOFExamsTaken() {
        ArrayList<Double> testSc3 = new ArrayList<>();

        Student s = new Student("bob", "r", testSc3 );
        s.addExamScore(5.0);
        s.addExamScore(0.0);

        // When
        int expected = 2;
        int actual = s.getNumberOFExamsTaken();


        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void addExamScore() {
        ArrayList<Double> testSc3 = new ArrayList<>();

        Student s = new Student("bob", "r", testSc3 );
        s.addExamScore(0.0);
        s.addExamScore(0.0);

        // When
        int expected = 2;
        int actual = s.getNumberOFExamsTaken();


        // Then
        Assert.assertEquals(expected,actual);
    }
    
    @Test
    public void setExamScore() {
        ArrayList<Double> testSc3 = new ArrayList<>();

        Student s = new Student("bob", "r", testSc3 );
        s.addExamScore(0.0);
        s.addExamScore(0.0);

        // When
        s.setExamScore(0,100.0);

        Double expected = 100.0;
        Double actual = s.getExamScore(0);


        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAverageExamScore() {
        ArrayList<Double> testSc3 = new ArrayList<>();

        Student s = new Student("bob", "r", testSc3 );
        s.addExamScore(10.0);
        s.addExamScore(20.0);

        // When
        Double expected = 15.0;
        Double actual = s.getAverageExamScore();


        // Then
        Assert.assertEquals(expected,actual);
    }


}