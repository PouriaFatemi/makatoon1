package m.ebdaat.makatoon1;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.ArrayList;

@Entity
public class Book {
    @PrimaryKey
    private int id;

    @ColumnInfo(name = "username")
    private String username;

    @ColumnInfo(name = "field")
    private String field;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "cost")
    private int cost;

    @ColumnInfo(name = "type")
    private String tabaghe;

    @ColumnInfo(name = "image1")
    private int imageid1;

    @ColumnInfo(name = "image2")
    private int imageid2;

    @ColumnInfo(name = "image3")
    private int imageid3;

    public Book(int id, String username, String field, String title, int cost, String tabaghe, int imageid1, int imageid2, int imageid3) {
        this.id = id;
        this.username = username;
        this.field = field;
        this.title = title;
        this.cost = cost;
        this.tabaghe = tabaghe;
        this.imageid1 = imageid1;
        this.imageid2 = imageid2;
        this.imageid3 = imageid3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTabaghe() {
        return tabaghe;
    }

    public void setTabaghe(String tabaghe) {
        this.tabaghe = tabaghe;
    }

    public int getImageid1() {
        return imageid1;
    }

    public void setImageid1(int imageid1) {
        this.imageid1 = imageid1;
    }

    public int getImageid2() {
        return imageid2;
    }

    public void setImageid2(int imageid2) {
        this.imageid2 = imageid2;
    }

    public int getImageid3() {
        return imageid3;
    }

    public void setImageid3(int imageid3) {
        this.imageid3 = imageid3;
    }
}
