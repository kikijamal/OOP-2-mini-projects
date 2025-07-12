package ClassesInJava;

public class CreatingAClass {

}

// Define a class named Book
public class Book {
  // Fields (attributes)
  String title;
  String author;

  // Constructor
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  // Method to display book details
  public void displayInfo() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
  }
}
