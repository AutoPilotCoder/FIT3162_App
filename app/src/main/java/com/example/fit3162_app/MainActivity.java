package com.example.fit3162_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String query_input;

    EditText input_multiline_view;

    Button input_query_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //input query search textview setup
        Input_query_search();

    }

    public void Input_query_search(){
        input_multiline_view=(EditText) findViewById(R.id.Input_query_text);
        input_multiline_view.setMovementMethod(new ScrollingMovementMethod());

        input_query_button=(Button) findViewById(R.id.Input_query_button);
        input_query_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                query_input=input_multiline_view.getText().toString();

                showToast(query_input);
            }
        });
    }

    public void showToast(String toast_text){
        Toast.makeText(MainActivity.this, toast_text, Toast.LENGTH_SHORT).show();
    }
}