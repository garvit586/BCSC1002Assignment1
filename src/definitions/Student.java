/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private String studentName;
    private long studentRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfBooksIssued;

    public Student() {
        studentName = "garvit gupta";
        studentRollNumber = 191500222;
        numberOfBooksIssued = 5;
        this.namesOfBooksIssued = new Book[10];
        for (int index = 0; index < namesOfBooksIssued.length; index++) {
            namesOfBooksIssued[index] = new Book();
        }
    }

    public Student(Book[] namesOfBooksIssued) {
        this.namesOfBooksIssued = namesOfBooksIssued;
        studentName = "bharat";
        studentRollNumber = 191500452;
        numberOfBooksIssued = 4;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(long studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNamesOfBooksIssued() {
        return namesOfBooksIssued;
    }

    public void setNamesOfBooksIssued(Book[] namesOfBooksIssued) {
        this.namesOfBooksIssued = namesOfBooksIssued;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNumber=" + studentRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", namesOfBooksIssued=" + Arrays.toString(namesOfBooksIssued) +
                '}';
    }
}
