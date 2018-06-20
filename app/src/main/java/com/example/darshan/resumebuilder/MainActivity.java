package com.example.darshan.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText resume_name,resume_address,resume_mono,resume_dob,resume_email,resume_ssc_marks,resume_hsc_marks,resume_degree_marks,resume_ssc_year,resume_hsc_year,resume_degree_year,resume_area_of_interest,resume_co_activity,resume_skills;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resume_name = findViewById(R.id.resume_name);
        resume_address = findViewById(R.id.resume_address);
        resume_mono = findViewById(R.id.resume_mono);
        resume_email = findViewById(R.id.resume_email);
        resume_dob = findViewById(R.id.resume_dob);
        resume_ssc_marks = findViewById(R.id.resume_ssc_marks);
        resume_hsc_marks = findViewById(R.id.resume_hsc_marks);
        resume_degree_marks = findViewById(R.id.resume_degree_marks);
        resume_ssc_year = findViewById(R.id.resume_ssc_year);
        resume_hsc_year = findViewById(R.id.resume_hsc_year);
        resume_degree_year = findViewById(R.id.resume_Degree_year);
        resume_area_of_interest = findViewById(R.id.resume_area_of_interest);
        resume_co_activity =findViewById(R.id.resume_co_activity);
        resume_skills = findViewById(R.id.resume_skills);
        submit = findViewById(R.id.resume_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(resume_name.getText().toString().isEmpty() || resume_address.getText().toString().isEmpty()
                        || resume_mono.getText().toString().isEmpty() || resume_email.getText().toString().isEmpty()
                        || resume_dob.getText().toString().isEmpty() || resume_ssc_marks.getText().toString().isEmpty()
                        || resume_hsc_marks.getText().toString().isEmpty() || resume_degree_marks.getText().toString().isEmpty()
                        || resume_ssc_year.getText().toString().isEmpty() || resume_hsc_year.getText().toString().isEmpty()
                        || resume_area_of_interest.getText().toString().isEmpty() || resume_co_activity.getText().toString().isEmpty()
                        || resume_skills.getText().toString().isEmpty() || resume_degree_year.getText().toString().isEmpty()) {

                    Toast.makeText(getApplicationContext(),"Enter Input to TextBox",Toast.LENGTH_SHORT).show();
                }else{

                    Intent intent = new Intent(MainActivity.this, DisplayResume.class);
                    intent.putExtra("name", resume_name.getText().toString());
                    intent.putExtra("address", resume_address.getText().toString());
                    intent.putExtra("mono", resume_mono.getText().toString());
                    intent.putExtra("email", resume_email.getText().toString());
                    intent.putExtra("dob", resume_dob.getText().toString());
                    intent.putExtra("ssc_mark", resume_ssc_marks.getText().toString());
                    intent.putExtra("hsc_mark", resume_hsc_marks.getText().toString());
                    intent.putExtra("degree_mark", resume_degree_marks.getText().toString());
                    intent.putExtra("ssc_year", resume_ssc_year.getText().toString());
                    intent.putExtra("hsc_year", resume_hsc_year.getText().toString());
                    intent.putExtra("degree_year", resume_degree_year.getText().toString());
                    intent.putExtra("interest", resume_area_of_interest.getText().toString());
                    intent.putExtra("skills", resume_skills.getText().toString());
                    intent.putExtra("co_activity", resume_co_activity.getText().toString());
                    startActivity(intent);

                }
            }
        });

    }
}
