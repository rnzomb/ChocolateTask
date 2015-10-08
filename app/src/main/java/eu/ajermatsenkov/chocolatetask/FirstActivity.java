package eu.ajermatsenkov.chocolatetask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void sendText(View v) {
        Intent iNewScreen = new Intent(this, SecondScreen.class);
        EditText firstName = (EditText) findViewById(R.id.first_name_field);
        EditText lastName = (EditText) findViewById(R.id.last_name_field);

        String fName = firstName.getText().toString();
        String lName = lastName.getText().toString();
        iNewScreen.putExtra("FIRST_NAME", fName);
        iNewScreen.putExtra("LAST_NAME", lName);
        startActivity(iNewScreen);
    }
}
