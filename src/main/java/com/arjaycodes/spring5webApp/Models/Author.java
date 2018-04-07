package com.arjaycodes.spring5webApp.Models;

import javax.persistence.*;
import java.util.HashSet;
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
        Author() {
        }
        //| Without Books
        Author(String firstName, String lastName) {
            this .setFirstName (firstName);
            this .setLastName  (lastName );
        }
        //| With Books
        Author(String firstName, String lastName, Set<Book> books) {
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
}
