package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private TextView information;
    private Button submitButton;
    private Button bonusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.user_input);
        information = findViewById(R.id.information_TextView);
        submitButton = findViewById(R.id.button_submit);
        onClick();
    }

    private void onClick() {
        submitButton.setOnClickListener(this,new View.OnClickListener()e);
        bonusButton.setOnClickListener();
        TextView textInput = userInput;
        TextView information = textInput;
        userInput.setText("");
        Toast.makeText(this, "Android is fun!", Toast.LENGTH_SHORT).show();
    }
}
