package pk.geekyacademy.freelancingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Thread background = new Thread() {
            public void run() {

                try {
                    sleep(5*1000);
                    Intent i=new Intent(getBaseContext(),FirstActivity.class);
                    startActivity(i);
                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();
    }
}