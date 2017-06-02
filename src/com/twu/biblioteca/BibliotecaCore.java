package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;
import java.util.List;


public class BibliotecaCore {

    private List<Book> bookList;

    public BibliotecaCore() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("jlan,jiang","2014.08","ASP.NET MVC"));
        bookList.add(new Book("Keith,J","2011.04","JavaScript DOM"));
        bookList.add(new Book("dbo,lin","2013.12"," HTML5+CSS3"));
        bookList.add(new Book("qsepng","2017.06","testBook"));
    }

    public String getWelcomeMessage() {
        return "Welcome to the Bibliteca!";
    }

    public List<Book> getListBooks() {
        return bookList;
    }

    public List<String> getMenu() {
        return null;
    }
}
