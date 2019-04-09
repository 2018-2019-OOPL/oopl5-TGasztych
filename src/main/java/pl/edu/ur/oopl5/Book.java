/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author student
 */
public class Book {

    public final int pages, year;
    public final String title, author;
    public int price;

    public Book(String xtitle, String xauthor, int xpages, int xyear, int xprice) {
        pages = xpages;
        year = xyear;
        title = xtitle;
        author = xauthor;
        price = xprice;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    //public int setPrice(){}
}
