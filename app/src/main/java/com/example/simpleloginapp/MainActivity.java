package com.example.simpleloginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static EditText username;
    private static EditText password;
    private static TextView attempts;
    private static Button login_btn;
    int count=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton();
    }
    public void loginButton(){
        username=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        attempts=(TextView)findViewById(R.id.textView5);
        login_btn=(Button)findViewById(R.id.button);
        attempts.setText(String.valueOf(count));
        login_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(username.getText().toString().equals("aniket")&&password.getText().toString().equals("verma"))
                        {
                            Toast.makeText(MainActivity.this,"User name and password is correct",Toast.LENGTH_LONG).show();
                            Intent intent =new Intent(".User");
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(MainActivity.this,"User name and password is not Correct",Toast.LENGTH_LONG).show();
                            count--;
                            attempts.setText(String.valueOf(count));;
                            if(count==0){
                                login_btn.setEnabled(false);
                            }
                        }
                    }
                }
        );
    }
}
