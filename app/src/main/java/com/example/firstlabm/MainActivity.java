package com.example.firstlabm;

import static com.example.firstlabm.Constants.KEY_MESSAGE;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView dateTextView;
    TextView timeTextView;
    Button getDateBtn;
    Button sendMessage;
    EditText edText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTextView = findViewById(R.id.dataTextView);
        getDateBtn = findViewById(R.id.getDateBtn);
        timeTextView = findViewById(R.id.timeTextView);
        sendMessage = findViewById(R.id.sendMessageBtn);
        edText = findViewById(R.id.editText);
        getDateBtn.setOnClickListener(v -> getDate());
        sendMessage.setOnClickListener(v -> {
            sendMessage();

        });

    }


    private void sendMessage() {
        Intent intent = new Intent(this, SecondActivityScreen.class);
        String message = edText.getText().toString();
        intent.putExtra(KEY_MESSAGE, message);
        startActivity(intent);

    }

    private void getDate() {
        // Текущее время
        Date currentDate = new Date();
// Форматирование времени как "день.месяц.год"
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String dateText = dateFormat.format(currentDate);
// Форматирование времени как "часы:минуты:секунды"
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String timeText = timeFormat.format(currentDate);
        dateTextView.setText(dateText);
        timeTextView.setText(timeText);
    }


}