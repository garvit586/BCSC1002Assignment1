/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] availableBooks;

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Library() {
        this.availableBooks = new Book[10];
        for (int index = 0; index < availableBooks.length; index++) {
            availableBooks[index] = new Book();
        }
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }
}
