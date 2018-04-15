package com.arjaycodes.spring5webApp.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author
{
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   id;
    private String firstName;
    private String lastName;

    // Init Properties
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    // Constructors
        //| Void
        public Author() {
        }
        //| Without Books
        public Author(String lastName, String firstName) {
            this .setFirstName (firstName);
            this .setLastName  (lastName );
        }
        //| With Books
        public Author(String lastName, String firstName, Set<Book> books) {
            this .setFirstName     (firstName);
            this .setLastName      (lastName );
            this .getBooks().addAll(books    );
        }

    // Private Methods

    // Public Methods

    // Getters
    public Long          getId() {
        return        id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String  getLastName() {
        return  lastName;
    }
    public Set<Book>  getBooks() {
        return     books;
    }

    // Setters
    private void        setId(Long          id) {
        this.id        =        id;
    }
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private void  setLastName(String  lastName) {
        this.lastName  =  lastName;
    }

    // Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id);
    }
    @Override
    public int     hashCode() {
        return Objects.hash(id);
    }

    // Pretty output
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }
}
