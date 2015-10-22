package com.yaowen.datepickerandtimepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText startDateTime;
    private EditText endDateTime;

    private String initStartDateTime = "2015年9月7日 14:44"; // 初始化开始时间
    private String initEndDateTime = "2016年9月8日 17:44"; // 初始化结束时间

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 两个输入框
        startDateTime = (EditText) findViewById(R.id.inputDate);
        endDateTime = (EditText) findViewById(R.id.inputDate2);

        startDateTime.setText(initStartDateTime);
        endDateTime.setText(initEndDateTime);

        startDateTime.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                DateTimePickDialogUtil dateTimePicKDialog = new DateTimePickDialogUtil(
                        MainActivity.this, initEndDateTime);
                dateTimePicKDialog.dateTimePicKDialog(startDateTime);
            }
        });
        endDateTime.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                DateTimePickDialogUtil dateTimePicKDialog = new DateTimePickDialogUtil(
                        MainActivity.this, initEndDateTime);
                dateTimePicKDialog.dateTimePicKDialog(endDateTime);
            }
        });
    }
}
