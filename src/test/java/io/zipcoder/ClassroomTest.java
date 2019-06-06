package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {
    @Test
    public void getStudents() {

    }

    @Test
    public void getAverageExamScore() {
        Classroom classroom = new Classroom();

        ArrayList<Double> testSc = new ArrayList<>();

        Student s1 = new Student("bob", "r", testSc );

        s1.addExamScore(100.0);

        String expected =  "\texam" + 1 + " -->" + 100.0 + "} \n";
        String actual = s1.getExamScores();

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void addStudent() {
        ArrayList<Double> testSc = new ArrayList<>();

        Classroom classroom = new Classroom();

        Student s1 = new Student("bob", "r", testSc );
        s1.addExamScore(10.0);
        s1.addExamScore(0.0);

        classroom.addStudent(s1);

        int expected =1;
        int actual = classroom.getStudents().size();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void removeStudent() {
        ArrayList<Double> testSc = new ArrayList<>();

        Classroom classroom = new Classroom();

        Student s1 = new Student("bob", "r", testSc );
        s1.addExamScore(10.0);
        s1.addExamScore(0.0);

        classroom.removeStudent("bob", "r");

        int expected =0;
        int actual = classroom.getStudents().size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getStudentsByScore() {

        ArrayList<Double> testSc = new ArrayList<>();
        ArrayList<Double> testSc2 = new ArrayList<>();
        ArrayList<Double> testSc3 = new ArrayList<>();

        Classroom classroom = new Classroom();

        Student s1 = new Student("bob", "r", testSc );
        s1.addExamScore(100.0);
        s1.addExamScore(100.0);

        Student s2 = new Student("a", "r", testSc3 );
        s2.addExamScore(0.0);
        s2.addExamScore(0.0);

        Student s3 = new Student("john", "r", testSc2);
        s3.addExamScore(50.0);
        s3.addExamScore(50.0);

        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);

        classroom.getStudentsByScore();

        String expected = "a";
        String actual = classroom.getStudents().get(0).getFirstName();

        Assert.assertEquals(expected,actual);



    }

    @Test
    public void getGradeBook() {

        ArrayList<Double> testSc3 = new ArrayList<>();

        Classroom classroom = new Classroom();

        Student s2 = new Student("aggbgtg", "r", testSc3 );

        s2.addExamScore(100.0);
        s2.addExamScore(100.0);

        classroom.addStudent(s2);


        Boolean expected = true;
        Boolean actual = classroom.getGradeBook().containsValue("A");

        Assert.assertEquals(expected,actual);


    }
}
