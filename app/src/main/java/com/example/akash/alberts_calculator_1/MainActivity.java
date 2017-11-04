package com.example.akash.alberts_calculator_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
    }

    public void loginbutton(View view){
        //checking username and password form the editText fileds
        if(username.getText().toString().equals("Username") && password.getText().toString().equals("password")){
            //welcome toast
            Toast myToast = Toast.makeText(getApplicationContext(), "welcome", Toast.LENGTH_LONG);
            myToast.show();

            //creating Intent
            Intent intent = new Intent(this, calculator.class);
            //starting activity calculator
            startActivity(intent);

        }
        else{
            //wrong username and password message
            Toast myToast = Toast.makeText(getApplicationContext(), "wrong username or password", Toast.LENGTH_LONG);
            myToast.show();
        }
    }
}
