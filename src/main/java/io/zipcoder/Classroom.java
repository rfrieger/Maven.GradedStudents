package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class Classroom   {



    private ArrayList<Student> students;
    private Integer maxStudents;

    public Classroom() {
        this.maxStudents = 30;
        this.students = new ArrayList<>(30);
    }
    public Classroom(Integer maxStudents) {
        this.maxStudents = maxStudents;
    }

    public Classroom(ArrayList<Student> students) {

        this.students = students;
    }

    public ArrayList<Student> getStudents() {

        return students;
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;

        for (int i = 0; i < students.size() ; i++) {
            sum += students.get(i).getAverageExamScore();
        }
        return sum / students.size();
    }

    public void addStudent(Student student){

        students.add(student);
    }


    public void removeStudent(String firstName, String lastName) {
            int counter = 0;
        for (Student s : students) {
            if (s.getLastName().equals(lastName) && s.getFirstName().equals(firstName)) {
                students.remove(s);
            }
        }
    }

    public void getStudentsByScore()  {
        Collections.sort(students);
    }


    public HashMap getGradeBook() {

        HashMap<Student,String> hm = new HashMap<>();
        for (Student s : students) {
            Double percentile = ((s.getAverageExamScore() / 100) * (students.size() + 1));

            if(percentile < 10 ) {
                hm.put(s, "A");
            } else if (percentile < 30) {
                hm.put(s, "B");
            } else if (percentile < 51 ) {
                hm.put(s, "C");
            } else if (percentile < 90 ) {
                hm.put(s, "D");
            }else hm.put(s, "F");
        }
        return hm;
    }
}
