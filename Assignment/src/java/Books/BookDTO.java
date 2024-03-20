/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;

/**
 *
 * @author sang
 */
public class BookDTO {
    int BookID;
    String Title;
    String Author;
    String coverImage;
    String Genre;
    String Descriptions;
    int Chapter;
    String Status;
    int Liked;

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getDescriptions() {
        return Descriptions;
    }

    public void setDescription(String Description) {
        this.Descriptions = Description;
    }

    public int getChapter() {
        return Chapter;
    }

    public void setChapter(int Chapter) {
        this.Chapter = Chapter;
    }

    public int getLiked() {
        return Liked;
    }

    public void setLiked(int Liked) {
        this.Liked = Liked;
    }

    

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }
    
}
