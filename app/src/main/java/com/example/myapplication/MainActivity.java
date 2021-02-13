package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Button btn;
    private EditText email,pass;


    private static final String email_txt ="example@mail.ru";
    private static final String pass_txt ="777";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login();
    }
    public  void Login(){
        img = (ImageView)findViewById(R.id.imageView4);
        btn =(Button)findViewById(R.id.button);
        email = (EditText)findViewById(R.id.editTextTextEmailAddress);
        email = (EditText)findViewById(R.id.editTextTextPassword);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(email_txt.equals(String.valueOf( email.getText()))  && pass_txt.equals(String.valueOf( pass.getText())))
                        img.setImageResource(R.drawable.rig);
                        else
                            img.setImageResource(R.drawable.krest);
                    }
                }
        );


    }
}