/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentName;
    private long studentRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfBooksIssued;

    public Student(String studentName, long studentRollNumber, int numberOfBooksIssuedByStudent) {
        this.studentName = "garvit gupta";
        this.studentRollNumber = 191500222;
        numberOfBooksIssued = 5;
        this.namesOfBooksIssued = new Book[10];
        for (int index = 0; index < namesOfBooksIssued.length; index++) {
            namesOfBooksIssued[index] = new Book("book" + (index + 1) + "");
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

    public void printNamesOfBooksIssued() {
        for (Book bookName : namesOfBooksIssued) {
            System.out.println(bookName);
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentRollNumber() == student.getStudentRollNumber() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Arrays.equals(getNamesOfBooksIssued(), student.getNamesOfBooksIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getStudentRollNumber(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getNamesOfBooksIssued());
        return result;
    }
}
