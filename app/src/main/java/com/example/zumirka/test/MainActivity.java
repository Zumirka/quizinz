package com.example.zumirka.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText UserName,UserPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName=findViewById(R.id.UserName);
        UserPassword=findViewById(R.id.UserPassword);

    }
public void OnLogin(View view){
        String Name= UserName.getText().toString();
        String Password = UserPassword.getText().toString();
        String type= "register";
        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type,Name,Password);
}
public void OpenReg(View view)
{
    startActivity(new Intent(this,Rejestration.class));
}

}
