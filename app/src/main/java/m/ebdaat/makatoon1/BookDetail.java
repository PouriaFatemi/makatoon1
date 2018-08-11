package m.ebdaat.makatoon1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookdetial);

        ImageView imageview = findViewById(R.id.imageview);
        TextView titleTv = findViewById(R.id.title);
        TextView costTv = findViewById(R.id.cost);

        if (getIntent() != null && getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            int imageId = extras.getInt(MyConstant.KEY_IMAGE_ID);
            String title = extras.getString(MyConstant.KEY_IMAGE_TITLE);
            String cost = extras.getString(MyConstant.KEY_IMAGE_cost);

            imageview.setImageResource(imageId);
            titleTv.setText(title);
            costTv.setText(cost);

        }
    }
}