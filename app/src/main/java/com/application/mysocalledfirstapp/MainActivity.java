package com.application.mysocalledfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String KEY_FOR_MESSAGE = "MESSAGE_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendButtonClick(View view){
        Intent intentMessageView = new Intent(this, MessageView.class);
        EditText editTextMessage = findViewById(R.id.enterMessage);
        String message = editTextMessage.getText().toString();
        if(!message.equals("")){
            intentMessageView.putExtra(KEY_FOR_MESSAGE, message);
            startActivity(intentMessageView);
            editTextMessage.setText("");
        }
    }

    public void onExitButtonClick(View view){
        this.finish();
    }
}