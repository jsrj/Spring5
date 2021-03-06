package com.arjaycodes.spring5webApp.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book
{
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long          id;
    private String     title;
    private String      isbn;
    private String publisher;

    // Init Properties
    @ManyToMany
    @JoinTable(
                name               = "author_book",
                joinColumns        = @JoinColumn(name =   "book_id"),
                inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private Set<Author> authors = new HashSet<>();

    // Constructors
        //| void
        public Book() {
        }
        //| Without authors
        public Book(String title, String isbn, String publisher){
            this .setTitle    (title    );
            this .setIsbn     (isbn     );
            this .setPublisher(publisher);
        }
        //| With authors
        public Book(String title, String isbn, String publisher, Set<Author> authors) {
            this .setTitle           (title    );
            this .setIsbn            (isbn     );
            this .setPublisher       (publisher);
            this .getAuthors().addAll(authors  );
        }

    // Private Methods

    // Public  Methods

    // Getters
    public Long             getId() {
        return        id;
    }
    public String        getTitle() {
        return     title;
    }
    public String         getIsbn() {
        return      isbn;
    }
    public String    getPublisher() {
        return publisher;
    }
    public Set<Author> getAuthors() {
        return   authors;
    }

    // Setters
    private void        setId(Long          id) {
        this.id        =        id;
    }
    private void     setTitle(String     title) {
        this.title     =     title;
    }
    private void      setIsbn(String      isbn) {
        this.isbn      =      isbn;
    }
    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Pretty output
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", authors=" + authors +
                '}';
    }
}
