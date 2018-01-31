package com.example.a4_cse_a.alertsandpickers;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {
    int c_month,c_date,c_year;
    int c_hour,c_minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAlertDialog(View view) {
        AlertDialog.Builder myAlert=new AlertDialog.Builder(this);
        myAlert.setIcon(R.mipmap.ic_launcher);
        myAlert.setTitle("Alert");
        myAlert.setMessage("Are you sure want to exit");
        myAlert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        myAlert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        myAlert.show();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void openDataPickerDialog(View view) {
        Calendar c=Calendar.getInstance();
        c_year=c.get(Calendar.YEAR);
        c_month=c.get(Calendar.MONTH);
        c_date=c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog date=
                new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                    }
                },c_year,c_month,c_date);
        date.show();
    }

    public void openTimePicker(View view) {
    }
}
