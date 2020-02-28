package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int value1 = 12;
    int value2 = 64;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Number1 = findViewById(R.id.Number1);
        Number1.setText("" + value1);

        TextView Number2 = findViewById(R.id.Number2);
        Number2.setText("" + value2);
    }

    public void onSubmitClick (View view){
        TextView Answer = findViewById(R.id.Answer);
        EditText Attempt = findViewById(R.id.Attempt);
        int userAnswer = Integer.parseInt(Attempt.getText().toString());
        if(userAnswer == value1+value2) {
            Answer.setText("Correct!");

        } else {
            Answer.setText("Wrong, the correct answer was: " + (value1+value2));
        }

    }

}

