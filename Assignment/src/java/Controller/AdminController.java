package Controller;

import Books.BookDAO;
import Books.BookDTO;
import User.UserDAO;
import User.UserDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AdminController", urlPatterns = {"/AdminController"})
public class AdminController extends HttpServlet {

    // Define a logger for this class
    private static final Logger logger = Logger.getLogger(AdminController.class.getName());

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        String keyword = request.getParameter("keyword");
        if (keyword == null) {
            keyword = "";
        }
        String sortCol = request.getParameter("colSort");
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("usersession") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        if (action != null && action.equals("list")) {
            BookDAO dao = new BookDAO();
            List<BookDTO> list = dao.list(keyword, sortCol);

            logger.log(Level.INFO, "Number of books retrieved from the database: {0}", list.size());

            request.setAttribute("BooksList", list);
            request.getRequestDispatcher("/BookList.jsp").forward(request, response);
        } else if (action != null && action.equals("details")) {
            Integer bookID = null;
            try {
                bookID = Integer.parseInt(request.getParameter("id"));
            } catch (NumberFormatException ex) {
                logger.log(Level.WARNING, "Parameter id has the wrong format.");
            }

            BookDTO book = null;
            if (bookID != null) {
                BookDAO dao = new BookDAO();
                book = dao.load(bookID);
            }

            logger.log(Level.INFO, "Book attribute set: {0}", book);
            request.setAttribute("book", book);

            request.getRequestDispatcher("Detail.jsp").forward(request, response);
        } else if (action.equals("edit")) {
            Integer bookID = null;
            try {
                bookID = Integer.parseInt(request.getParameter("id"));
            } catch (NumberFormatException ex) {
                logger.log(Level.WARNING, "Parameter id has the wrong format.");
            }

            BookDTO book = null;
            if (bookID != null) {
                BookDAO dao = new BookDAO();
                book = dao.load(bookID);
            }

            logger.log(Level.INFO, "Book attribute set: {0}", book);
            request.setAttribute("book", book);
            request.setAttribute("nextAction", "update");

            request.getRequestDispatcher("Edit.jsp").forward(request, response);
        } else if (action.equals("update")) {
            Integer bookID = null;
            try {
                bookID = Integer.parseInt(request.getParameter("id"));
            } catch (NumberFormatException ex) {
                logger.log(Level.WARNING, "Parameter id has wrong format.");
            }

            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String coverImage = request.getParameter("coverImage");
            String genre = request.getParameter("genre");
            String description = request.getParameter("description");
            String chapterStr = request.getParameter("chapter");
            String likedStr = request.getParameter("liked");
            String status = request.getParameter("status");

            int chapter = 0;
            int liked = 0;

            try {
                chapter = Integer.parseInt(chapterStr);
                liked = Integer.parseInt(likedStr);
            } catch (NumberFormatException ex) {
                logger.log(Level.WARNING, "Parameter chapter or liked has wrong format.");
            }

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

            BookDAO dao = new BookDAO();
            dao.update(book);

            request.setAttribute("book", book);

            RequestDispatcher rd = request.getRequestDispatcher("Detail.jsp");
            rd.forward(request, response);
        } else if (action.equals("add")) {
            BookDTO book = new BookDTO();
            request.setAttribute("book", book);
            request.setAttribute("nextAction", "insert");
            RequestDispatcher rd = request.getRequestDispatcher("Edit.jsp");
            rd.forward(request, response);
        } else if (action.equals("insert")) {
            Integer bookID = null;
            try {
                bookID = Integer.parseInt(request.getParameter("id"));
            } catch (NumberFormatException ex) {
                log("Parameter id has wrong format.");
            }

            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String coverImage = request.getParameter("coverImage");
            String genre = request.getParameter("genre");
            String description = request.getParameter("description");
            String chapterStr = request.getParameter("chapter");
            String likedStr = request.getParameter("liked");
            String status = request.getParameter("status");

            int chapter = 0;
            int liked = 0;

            try {
                chapter = Integer.parseInt(chapterStr);
                liked = Integer.parseInt(likedStr);
            } catch (NumberFormatException ex) {
                log("Parameter chapter or liked has wrong format.");
            }

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

            BookDAO dao = new BookDAO();
            dao.insert(book);

            request.setAttribute("book", book);

            RequestDispatcher rd = request.getRequestDispatcher("Detail.jsp");
            rd.forward(request, response);
        } else if (action != null && action.equals("listu")) {
            UserDAO userDao = new UserDAO();
            List<UserDTO> userList = userDao.list(keyword, sortCol);

            logger.log(Level.INFO, "Number of users retrieved from the database: {0}", userList.size());

            request.setAttribute("UserList", userList);
            request.getRequestDispatcher("/UserList.jsp").forward(request, response);
        } else if (action.equals("ban")) {
            Integer userID = null;
            try {
                userID = Integer.parseInt(request.getParameter("id"));
            } catch (NumberFormatException ex) {
                logger.log(Level.WARNING, "Parameter id has the wrong format.");
            }

            if (userID != null) {
                UserDAO userDao = new UserDAO();
                boolean success = userDao.banUser(userID);
                if (success) {
                    logger.log(Level.INFO, "User with ID {0} banned successfully.", userID);
                    
                    response.sendRedirect("AdminController?action=listu");
                    return;
                } else {
                    logger.log(Level.WARNING, "Failed to ban user with ID {0}.", userID);
                }
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
