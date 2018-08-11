package m.ebdaat.makatoon1;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout container = findViewById(R.id.container);

        final AppDatabase db = Room.databaseBuilder(this,
                AppDatabase.class,
                "books").build();

        new Thread(new Runnable() {
            @Override
            public void run() {

                Book book1 =new Book(1 ,
                        "pouria",
                        "khariat" ,
                        "elec" ,
                        6000 ,
                        "konkori",
                        R.mipmap.img1,
                        R.mipmap.img2,
                        R.mipmap.img1);

                Book book2 =new Book(2 ,
                        "pouria1",
                        "khariat1" ,
                        "elec1" ,
                        7000 ,
                        "konkdori",
                        R.mipmap.img2,
                        R.mipmap.img1,
                        R.mipmap.img2);

                BookDao bookDao = db.bookDao();
                bookDao.insertAll(book1 , book2);

                List<Book> books = bookDao.getBooks();

                ArrayList<Image> list = getList(books);

                for (int i = 0; i < list.size(); i++) {
                    final Image image = list.get(i);
                    View card = getLayoutInflater().inflate(R.layout.bookcard, null);

                    ImageView imageview = card.findViewById(R.id.imageview);
                    TextView titleTextView = card.findViewById(R.id.image_title);
                    TextView costTextView = card.findViewById(R.id.image_cost);
                    imageview.setImageResource(image.getImageId());
                    titleTextView.setText(image.getTitle());
                    costTextView.setText(image.getCost());

                    card.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            goToBookDetail(image);
                        }
                    });

                    container.addView(card);
                }


            }
        }).start();


    }

    private void goToBookDetail(Image image) {
        Intent intent = new Intent(this, BookDetail.class);
        intent.putExtra(MyConstant.KEY_IMAGE_ID, image.getImageId());
        intent.putExtra(MyConstant.KEY_IMAGE_TITLE, image.getTitle());
        intent.putExtra(MyConstant.KEY_IMAGE_cost, image.getCost());
        startActivity(intent);
    }

        public ArrayList<Image> getList(List<Book> books) {
            ArrayList<Image> list = new ArrayList<>();
            list.add(new Image(books.get(0).getImageid1(), books.get(0).getTitle(), Integer.toString(books.get(0).getCost())));
            list.add(new Image(books.get(1).getImageid1(), books.get(1).getTitle(), Integer.toString(books.get(1).getCost())));
            return list;
    }
}
