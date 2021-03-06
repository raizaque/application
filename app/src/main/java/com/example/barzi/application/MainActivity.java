package com.example.barzi.application;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email =(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.motdepasse);
    }
    public void hello(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void inscription(View view) {
        Intent intent_loging=new Intent(this,inscription.class);
        startActivity(intent_loging);
        overridePendingTransition(R.anim.fadeout, R.anim.fadein);
        finish();
    }

    public void connexion(View view) {
        if(email.getText().toString().equals("") && password.getText().toString().equals("")) {
            Toast msg = Toast.makeText(getApplicationContext(), "Un des champs est vide", Toast.LENGTH_LONG);
            msg.show();
        }else{
            Toast msg = Toast.makeText(getApplicationContext(), "Connection ...", Toast.LENGTH_LONG);
            msg.show();

        }



        /*
        Intent intent_loging=new Intent(this,loggin_bar.class);
        startActivity(intent_loging);
        overridePendingTransition(R.anim.fadeout,R.anim.fadein);*/
    }
}
