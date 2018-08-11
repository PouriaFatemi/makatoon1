package m.ebdaat.makatoon1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class enter extends AppCompatActivity {


    private Button Button1;
    private Button Button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter);

        Button1 =findViewById(R.id.button1);
        Button2 =findViewById(R.id.button2);
    }

    public void clickButton1(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void clickButton2(View view){
        Toast toast = Toast.makeText(this ,"khafe" , Toast.LENGTH_LONG);
        toast.show();

    }
}


