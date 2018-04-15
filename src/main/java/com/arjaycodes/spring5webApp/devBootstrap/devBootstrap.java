package com.arjaycodes.spring5webApp.devBootstrap;

import com.arjaycodes.spring5webApp.Models.Author;
import com.arjaycodes.spring5webApp.Models.Book;

public class devBootstrap {

    private void initData() {

        // Ready Player One
        Author earnestCline = new Author("Cline", "Earnest");
        Book readyPlayerOne = new Book("Ready Player One", "978-0804190138", "Broadway Books");
        pairBookAndAuthor(readyPlayerOne, earnestCline);

        // Good Omens
        Author terryPratchett = new Author("Pratchett", "Terry");
        Author neilGaiman     = new Author("gaiman", "Neil");
        Book goodOmens        = new Book
        (
                "Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch",
                "978-0060853976",
                "William Morrow Paperbacks"
        );
        pairBookAndAuthor(goodOmens, terryPratchett);
        pairBookAndAuthor(goodOmens, neilGaiman);

        // Liber Null
        Author peterCarroll = new Author("Carroll", "Peter");
        Book liberNull = new Book(
                "Liber Null & Psychonaut: An Introduction to Chaos Magick",
                "978-0877286394",
                "Weiser Books"
        );
        addBook(liberNull, peterCarroll);

        // Altered Carbon
        Author richardMorgan = new Author("Morgan", "Richard");
        Book alteredCarbon = new Book("Altered Carbon", "978-0345457684", "Del Rey");
        pairBookAndAuthor(alteredCarbon, richardMorgan);

        // Snow Crash
        Author nealStephenson = new Author("Stephenson", "Neal");
        Book snowCrash = new Book("Snow Crash", "978-0553380958", "Del Rey");
        addBook(snowCrash, nealStephenson);

        // Neuromancer
        Author williamGibson = new Author("Gibson", "William");
        Book neuromancer = new Book("Neuromancer","78-0441007462","Ace");
        pairBookAndAuthor(neuromancer, williamGibson);

        // Initiation into Hermetics
        Author franzBardon = new Author("Bardon", "Franz");
        Book initiationIntoHermetics = new Book
        (
                "Initiation Into Hermetics",
                "978-1885928122",
                "Merkur Publishing"
        );
        pairBookAndAuthor(initiationIntoHermetics, franzBardon);

        // The Seven Laws of Influence
        Author brianCagneey = new Author("Cagneey", "Brian");
        Book sevenLaws = new Book
        (
                "The Seven Laws of Influence",
                "978-1539165309",
                "CreateSpace Independent Publishing"
        );
        addBook(sevenLaws, brianCagneey);

    }

    // Adds book to an Author's list of books
    public void addBook(Book book, Author author) {
        author.getBooks().add(book);
    }
    // Adds author to a Book's list of authors
    public void addAuthor(Book book, Author author) {
        book.getAuthors().add(author);
    }
    // Pairs book and author together
    public void pairBookAndAuthor(Book book, Author author) {
        addBook  (book, author);
        addAuthor(book, author);
    }
}
