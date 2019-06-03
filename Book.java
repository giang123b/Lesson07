package Lesson7;

public class Book {
    private String nameAuthor;
    private String nameBook;
    private String namePublisher;
    private String speciality;
    private int pageNumber;
    public Book(){
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public String toString() {
        return "Name of book: " + this.nameBook
                + "\nName of author: " + this.nameAuthor
                + "\nName of publisher: " + this.namePublisher
                + "\nName of speciality: " + this.speciality
                + "\nPage number: " + this.pageNumber + " pages" ;
    }
}
