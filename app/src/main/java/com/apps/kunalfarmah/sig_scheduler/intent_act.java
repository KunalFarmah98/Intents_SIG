package com.apps.kunalfarmah.sig_scheduler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class intent_act extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_act);
        tv = findViewById(R.id.tv);
        String text = getIntent().getStringExtra("data");
        tv.setText(text);
        Toast.makeText(this,"IN OTHER ACTIVITY",Toast.LENGTH_SHORT).show();
    }
}
