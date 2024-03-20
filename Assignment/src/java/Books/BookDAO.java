/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;

import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sang
 */
public class BookDAO {

    public List<BookDTO> list(String keyword, String sortCol) {
        List<BookDTO> list = new ArrayList<>();

        try {
            Connection con = DBUtils.getConnection();
            String sql = "SELECT BookID, Title, Author, CoverImage, Genre, Descriptions, Chapter, Status, Liked FROM Books ";

            if (keyword != null && !keyword.isEmpty()) {
                sql += " WHERE Title LIKE ? OR Author LIKE ? OR Genre LIKE ? OR Description LIKE ? ";
            }

            if (sortCol != null && !sortCol.isEmpty()) {
                sql += " ORDER BY " + sortCol + " ASC ";
            }

            PreparedStatement stmt = con.prepareStatement(sql);

            if (keyword != null && !keyword.isEmpty()) {
                String searchKeyword = "%" + keyword + "%";
                stmt.setString(1, searchKeyword);
                stmt.setString(2, searchKeyword);
                stmt.setString(3, searchKeyword);
                stmt.setString(4, searchKeyword);
            }

            ResultSet rs = stmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    int bookID = rs.getInt("BookID");
                    String title = rs.getString("Title");
                    String author = rs.getString("Author");
                    String genre = rs.getString("Genre");
                    String description = rs.getString("Descriptions");
                    int chapter = rs.getInt("Chapter");
                    String status = rs.getString("Status");
                    String coverImage = rs.getString("CoverImage");
                    int liked = rs.getInt("Liked");

                    BookDTO book = new BookDTO();
                    book.setBookID(bookID);
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setGenre(genre);
                    book.setDescription(description);
                    book.setChapter(chapter);
                    book.setLiked(liked);
                    book.setStatus(status);
                    book.setCoverImage(coverImage);

                    list.add(book);
                }

                // Log statement to check if the list is populated
                if (!list.isEmpty()) {
                    System.out.println("List is populated. Size: " + list.size());
                } else {
                    System.out.println("List is empty.");
                }
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error in BookDAO.list method. Details:" + ex.getMessage());
            ex.printStackTrace();
        }

        return list;
    }

    public BookDTO load(int bookID) {
        String sql = "SELECT BookID, Title, Author, CoverImage, Genre, Descriptions, Chapter, Status, Liked FROM Books WHERE BookID = ?";

        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, bookID);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String title = rs.getString("Title");
                String author = rs.getString("Author");
                String coverImage = rs.getString("CoverImage");
                String genre = rs.getString("Genre");
                String description = rs.getString("Descriptions");
                int chapter = rs.getInt("Chapter");
                int liked = rs.getInt("Liked");
                String status = rs.getString("Status");

                BookDTO book = new BookDTO();
                book.setBookID(bookID);
                book.setTitle(title);
                book.setAuthor(author);
                book.setCoverImage(coverImage);
                book.setGenre(genre);
                book.setDescription(description);
                book.setChapter(chapter);
                book.setLiked(liked);
                book.setStatus(status);

                return book;
            }
        } catch (SQLException ex) {
            System.out.println("Query Books error! " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }

    public boolean update(BookDTO book) {
        String sql = "UPDATE Books SET Title = ?, Author = ?, CoverImage = ?, Genre = ?, Descriptions = ?, Chapter = ?, Liked = ?, Status = ? WHERE BookID = ?";

        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getCoverImage());
            ps.setString(4, book.getGenre());
            ps.setString(5, book.getDescriptions());
            ps.setInt(6, book.getChapter());
            ps.setInt(7, book.getLiked());
            ps.setString(8, book.getStatus());
            ps.setInt(9, book.getBookID());

            int rowsUpdated = ps.executeUpdate();
            conn.close();

            return rowsUpdated > 0;
        } catch (SQLException ex) {
            System.out.println("Update book error!" + ex.getMessage());
            ex.printStackTrace();
        }

        return false;
    }

    public Integer insert(BookDTO book) {
        String sql = "INSERT INTO Books(BookID, Title, Author, CoverImage, Genre, Descriptions, Chapter, Status, Liked) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, book.getBookID());
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getAuthor());
            ps.setString(4, book.getCoverImage());
            ps.setString(5, book.getGenre());
            ps.setString(6, book.getDescriptions());
            ps.setInt(7, book.getChapter());
            ps.setString(8, book.getStatus());
            ps.setInt(9, book.getLiked());

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    int generatedID = rs.getInt(1);
                    conn.close();
                    return generatedID;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Insert Book error!" + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }

}
