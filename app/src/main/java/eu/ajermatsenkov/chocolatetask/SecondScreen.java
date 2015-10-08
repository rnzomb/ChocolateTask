package eu.ajermatsenkov.chocolatetask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        init();
    }

    private void init() {
        Intent parametrs = getIntent();
        String firstName = parametrs.getStringExtra("FIRST_NAME");
        String email = parametrs.getStringExtra("LAST_NAME");

        TextView firstNameView = (TextView) findViewById(R.id.firstNameView);
        TextView emailView = (TextView) findViewById(R.id.lastNameView);

        firstNameView.setText(firstName);
        emailView.setText(email);
    }

    public void goBack(View v) {
        Intent iBackScreen = new Intent(this, FirstActivity.class);
        startActivity(iBackScreen);
    }

}
