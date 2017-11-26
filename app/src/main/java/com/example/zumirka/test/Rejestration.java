package com.example.zumirka.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Rejestration extends AppCompatActivity {

    EditText login, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejestration);
        login=findViewById(R.id.UserName);
        password=findViewById(R.id.UserPassword);


    }
    public void OnRegistration(View view)
    {
        String str_login= login.getText().toString();
        String str_password = password.getText().toString();
        String type= "register";
        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type,str_login,str_password);
    }
}
