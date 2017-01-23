package com.tom.checkview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckView cv = (CheckView) findViewById(R.id.ck);
        Button btnCheck = (Button) findViewById(R.id.btn_check);
        Button btnUncheck = (Button) findViewById(R.id.btn_uncheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv.check();
            }
        });
        btnUncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv.unCheck();
            }
        });
    }
}
