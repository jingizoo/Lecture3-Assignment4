package com.jalaj.firstapp.loginpage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;
import static com.jalaj.firstapp.loginpage.R.id.text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtVwUserId, txtVwPassword;
    Button btnLogin;
Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_liner);
        txtVwPassword = (TextView) findViewById(R.id.txtPassword);
        txtVwUserId = (TextView) findViewById(R.id.txtUsername);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
        ctx = getApplicationContext();

    }


    @Override
    public void onClick(View v) {

        if (txtVwUserId.getText().length()==0){
            Toast toast = Toast.makeText(ctx, "Invalid UserId", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();
            Log.d("clicked", txtVwUserId.getText().length()+"");
        }
     if (txtVwUserId.getText().length()==0){

         Toast toast = Toast.makeText(ctx, "Invalid Password", Toast.LENGTH_SHORT);
         toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
         toast.setDuration(Toast.LENGTH_LONG);
         toast.show();
        }
    }
}
