/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap3.Bai2on;

/**
 *
 * @author sonnlh
 */
public class Book {
    String boCode;
    String boTitle;
    String boAuthor;
    
    public Book(){
    }

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
    
    public Book(Book bo) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }
}
