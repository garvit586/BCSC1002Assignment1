/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your details : ");
        System.out.println("enter your name: ");
        String studentName = scanner.nextLine();
        System.out.println("enter your rollno.: ");
        long studentRollNumber = scanner.nextLong();
        System.out.println("enter number of book issued: ");
        int numberOfBooksIssuedByStudent = scanner.nextInt();
        Student studentDetails = new Student(studentName, studentRollNumber, numberOfBooksIssuedByStudent);
        Library detailsOfLibrary = new Library();
        int studentInput;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issued books.");
            System.out.println("4. Exit.");
            System.out.println("Enter Your Choice (1...4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case 1: {
                    detailsOfLibrary.getAvailableBooks();
                    scanner.nextLine();
                    System.out.println("enter the name of the book you want to add");
                    String bookName = scanner.nextLine();
                    System.out.println("your " + bookName + " book is successfully issued");
                }
                break;
                case 2: {
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    System.out.println("Your " + bookName + " book is successfully returned");
                    studentDetails.setNumberOfBooksIssued(studentDetails.getNumberOfBooksIssued() - 1);
                }
                break;
                case 3: {
                    System.out.println("Number Of Books Issued By You Currently = " + studentDetails.getNumberOfBooksIssued());
                    System.out.println("Names of Book Issued By You Up Till Now = ");
                    studentDetails.printNamesOfBooksIssued();
                    break;
                }
                case 4: {
                    System.out.println("Thank You!");
                }
                break;
                default:
                    System.out.println("Wrong Choice");
            }
        } while (studentInput != 4);
        scanner.close();
    }
}
