package com.example.darshan.resumebuilder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayResume extends AppCompatActivity {

    String name,address,mono,email,dob,ssc_mark,hsc_mark,degree_mark,ssc_year,hsc_year,degree_year,interest,skills,co_activity;

    TextView txtName,txtAddress,txtMono,txtEmail,txtDob,txtSsc,txtSscyear,txtHsc,txtHscYear,txtDegree,txtDegreeYear,txtCoActivity,txtSign,txtInterest,txtSkills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_resume);

        txtName = findViewById(R.id.txtName);
        txtAddress = findViewById(R.id.txtAddress);
        txtMono = findViewById(R.id.txtMono);
        txtEmail = findViewById(R.id.txtEmail);
        txtDob = findViewById(R.id.txtDob);
        txtSsc = findViewById(R.id.txtSsc);
        txtSscyear = findViewById(R.id.txtSscYear);
        txtHsc = findViewById(R.id.txtHsc);
        txtHscYear = findViewById(R.id.txtHscYear);
        txtDegree = findViewById(R.id.txtDegree);
        txtDegreeYear = findViewById(R.id.txtDegreeYear);
        txtCoActivity = findViewById(R.id.txtCoActivity);
        txtInterest = findViewById(R.id.txtInterest);
        txtSkills = findViewById(R.id.txtSkills);
        txtSign = findViewById(R.id.txtSign);

        name =getIntent().getStringExtra("name");
        address = getIntent().getStringExtra("address");
        mono = getIntent().getStringExtra("mono");
        email = getIntent().getStringExtra("email");
        dob = getIntent().getStringExtra("dob"+"");
        ssc_mark = getIntent().getStringExtra("ssc_mark"+"");
        ssc_year = getIntent().getStringExtra("ssc_year"+"");
        hsc_mark = getIntent().getStringExtra("hsc_mark"+"");
        hsc_year = getIntent().getStringExtra("hsc_year"+"");
        degree_mark = getIntent().getStringExtra("degree_mark"+"");
        degree_year = getIntent().getStringExtra("degree_year"+"");
        interest = getIntent().getStringExtra("interest");
        skills = getIntent().getStringExtra("skills");
        co_activity = getIntent().getStringExtra("co_activity");

        txtName.setText(name);
        txtAddress.setText(address);
        txtMono.setText(mono);
        txtEmail.setText(email);
        txtDob.setText(dob);
        txtSsc.setText(ssc_mark);
        txtSscyear.setText(ssc_year);
        txtHsc.setText(hsc_mark);
        txtHscYear.setText(hsc_year);
        txtDegree.setText(degree_mark);
        txtDegreeYear.setText(degree_year);
        txtCoActivity.setText(co_activity);
        txtInterest.setText(interest);
        txtSkills.setText(skills);
        txtSign.setText(name);

    }
}