package m.ebdaat.makatoon1;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import m.ebdaat.makatoon1.Book;

import java.util.List;

@Dao
public interface BookDao {

    @Query("SELECT * From Book")
    List<Book> getBooks();

    @Query("SELECT * FROM Book WHERE title  LIKE :name")
    List<Book> getBooksBytitle(String name);

    @Query("SELECT * FROM Book WHERE field  LIKE :name ")
    List<Book> getBooksByfield(String name);

    @Query("SELECT * FROM Book WHERE type  LIKE :name")
    List<Book> getBooksBytype(String name);

    @Query("SELECT * FROM Book WHERE type  LIKE :type OR title LIKE :title OR field LIKE :field")
    List<Book> getBooksForSearch(String type , String title , String field);

    @Update
    void update(Book book);

    @Delete
    void delete(Book book);

    @Insert
    void insertAll(Book... books);
}
