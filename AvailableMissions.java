package com.example.trackdem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AvailableMissions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_missions);
        if (getIntent().hasExtra("id")&&getIntent().hasExtra("password")){
            TextView idText=(TextView) findViewById(R.id.idText);
            TextView passText=(TextView) findViewById(R.id.passText);
            String id=getIntent().getExtras().getString("id");
            String pass=getIntent().getExtras().getString("password");
            idText.setText(id);
            passText.setText(pass);
        }
    }
}
