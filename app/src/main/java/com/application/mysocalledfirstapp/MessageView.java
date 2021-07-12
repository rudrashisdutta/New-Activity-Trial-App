package com.application.mysocalledfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_view);
        Intent intentForThisActivity = getIntent();
        String message = intentForThisActivity.getStringExtra(MainActivity.KEY_FOR_MESSAGE);
        TextView messageDisplay = findViewById(R.id.messageDisplay);
        messageDisplay.setText(message);
    }

    public void onExitButtonClick(View view){
        this.finish();
    }
}