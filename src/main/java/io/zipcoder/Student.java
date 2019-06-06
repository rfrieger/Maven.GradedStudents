package io.zipcoder;

import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private ArrayList<Double>examScores;
    private String letterGrade;

    public String getLetterGrade() {
        return letterGrade;
    }


    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }



    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    @Override
    public int compareTo(Student o) {
        //asending

        if(this.getAverageExamScore() > o.getAverageExamScore()) {
            return 1;
        } else if (this.getAverageExamScore() < o.getAverageExamScore()) {
            return -1;
        } else return 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getExamScores() {
        String testString = "";
        int counter = 1;
        for (Double score : this.examScores){
            testString += "\texam" + counter + " -->" + score + "} \n";
            counter++;
        }
        return testString;
    }

    public void addExamScore(Double x) {
        this.examScores.add(x);
    }
    public Double getExamScore(int i) {
        return this.examScores.get(i);
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber, newScore);
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        for (Double x: examScores) {
            sum += x;
        }
        return sum /examScores.size();
    }

    public int getNumberOFExamsTaken() {
        return examScores.size();
    }

    @Override
    public String toString() {
        return "Student:" +
                "firstName='" + firstName +  ", lastName='" + lastName + "\n" +
                "> Average Score: " + getAverageExamScore() +"\n" +
                "> Exam Scores: \n" +
                "     " + getExamScores();

    }


}
