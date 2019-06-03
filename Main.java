package Lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Please! Enter a new book! ");

        System.out.print("Name of book: ");
        String nameBook = new Scanner(System.in).nextLine();
        book.setNameBook(nameBook);

        System.out.print("Name of author: ");
        String nameAuthor = new Scanner(System.in).nextLine();
        book.setNameAuthor(nameAuthor);

        System.out.print("Name of publisher: ");
        String namePublisher = new Scanner(System.in).nextLine();
        book.setNamePublisher(namePublisher);

        System.out.print("Name of speciality: \n1. Information technology\n2. Science - Life\n3. Literature - Art\nIt's: ");
        int selection = new Scanner(System.in).nextInt();
        if (selection == 1){
            book.setSpeciality("Information technology");
        }
        if (selection == 2){
            book.setSpeciality("Science - Life");
        }
        if (selection == 3){
            book.setSpeciality("Literature - Art");
        }

        System.out.print("Page number: ");
        int pageNumber = new Scanner(System.in).nextInt();
        book.setPageNumber(pageNumber);

        System.out.println(book);
    }
}
