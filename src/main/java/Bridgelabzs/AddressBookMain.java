package Bridgelabzs;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.printf("Welcome to AddressBook Program.\n\n");

        Scanner sc = new Scanner(System.in);


        AddressBook book1 = new AddressBook("Book1");
        book1.addContact(sc);
        book1.addContact(sc);
        book1.displayBook(book1);

        book1.modifyContact(sc, book1);
        book1.displayBook(book1);

        book1.deleteContact(sc, book1);
        book1.displayBook(book1);


        AddressBook book2 = new AddressBook("Book2");
        book2.addContact(sc);
        book2.addContact(sc);
        book2.displayBook(book2);

        book2.modifyContact(sc, book2);
        book2.displayBook(book2);

        book2.deleteContact(sc, book2);
        book2.displayBook(book2);

        sc.close();

    }

}