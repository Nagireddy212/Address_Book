package Bridgelabzs;

import java.util.Scanner;

public interface IAddressBook{

    void displayBook(AddressBook book1);
    void addContact (Scanner sc);
    void modifyContact (Scanner sc, AddressBook book1);
    void deleteContact (Scanner sc, AddressBook book1);

}