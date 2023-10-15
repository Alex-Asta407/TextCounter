package com.example.myapplication2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText etInput;
    private TextView tvMain;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.etInput = findViewById(R.id.etInput);
        this.tvMain = findViewById(R.id.tvMain);
        this.spinner = (Spinner) findViewById(R.id.spSelectOptions);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.wrd_char, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinner.setAdapter(adapter);
    }

    public void onButtonClick(View view) {
        if (spinner.getSelectedItem().toString().equalsIgnoreCase("Words")) {
            String userInput = this.etInput.getText().toString();
            Log.i("UserText", userInput);

            int count = WordCounter.countWords(userInput);
            Log.i("UserTextCount", String.valueOf(count));

            if (count == 0) {
                Toast.makeText(this, "The text bar is empty", Toast.LENGTH_SHORT).show();
            } else {
                if (count == 1)
                    this.tvMain.setText("There is: " + String.valueOf(count) + " word");
                else
                    this.tvMain.setText("There are: " + String.valueOf(count) + " words");
            }
        } else {
            String userInput = this.etInput.getText().toString();
            Log.i("UserText", userInput);

            int count = WordCounter.countCharacters(userInput);
            Log.i("UserTextCount", String.valueOf(count));

            if (count == 0) {
                Toast.makeText(this, "The text bar is empty", Toast.LENGTH_SHORT).show();
            } else {
                if (count == 1)
                    this.tvMain.setText("There is: " + String.valueOf(count) + " char");
                else
                    this.tvMain.setText("There are: " + String.valueOf(count) + " chars");
            }

        }
    }
}