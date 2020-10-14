package com.example.trackdem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         class Person {
            final int x = 10;
            private String firstName; // Person First Name
            private String lastName; // Person Last Name
            private String dateOfBirth; // Person Date of birthday
            private String id;
            private String password;
            public Person(String fName, String lName, String dob,String id,String password) {
                this.setFirstName(fName);
                this.setLastName(lName);
                this.setDobOfBith(dob);
                this.setId(id);
                this.setPassword(password);
            }

            public String getFirstName() {
                return this.firstName;
            }

            public String getLastName() {
                return this.lastName;
            }

            public String getDateOfBirth() {
                return this.dateOfBirth;
            }
            public String getId() {
                return this.id;
            }
            public String getPassword() {
                return this.password;
            }
            public void setFirstName(String fName) {
                this.firstName = fName;
            }
            public void setId(String i) {
                this.id = i;
            }
            public void setPassword(String pass) {
                this.password = pass;
            }
            public void setLastName(String lName) {
                this.lastName = lName;
            }

            public void setDobOfBith(String dob) {
                this.dateOfBirth = dob;
            }}
            final ArrayList<Person> myPeople=new ArrayList();

       Person p1=new Person("karam","Thebian","1999","1","1111");
        myPeople.add(p1);
        Person p2=new Person("khaled","Atallah","1999","2","2222");
        myPeople.add(p2);
        Person p3=new Person("Ayad","Nasr","1999","3","3333");
        myPeople.add(p3);
        Button loginBtn = (Button) findViewById(R.id.loginBtn);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText idField=(EditText) findViewById(R.id.idField);
                EditText passField=(EditText) findViewById(R.id.passField);
                TextView resultField=(TextView) findViewById(R.id.resultField);
                String id= idField.getText().toString();
                String pass= passField.getText().toString();
                int incorrect=1;
                for(int i=0; i<myPeople.size(); i++) {

                    if(myPeople.get(i).getId().equalsIgnoreCase(id) && myPeople.get(i).getPassword().equalsIgnoreCase(pass)) {

                        Toast.makeText(MainActivity.this,"Welcome Mr."+myPeople.get(i).getFirstName()+"!",Toast.LENGTH_SHORT).show();
                        incorrect=0;
                        Intent startIntent =new Intent(getApplicationContext(),AvailableMissions.class);
                        startIntent.putExtra("id",myPeople.get(i).getId());
                        startIntent.putExtra("password",myPeople.get(i).getPassword());
                        startActivity(startIntent);
                    }

                }
                if(incorrect==1){


                        Toast.makeText(MainActivity.this,"Incorrect ID or Pass",Toast.LENGTH_SHORT).show();


                }


            }
        });
    }
}
