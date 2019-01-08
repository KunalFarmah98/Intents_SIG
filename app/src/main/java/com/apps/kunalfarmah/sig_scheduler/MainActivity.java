package com.apps.kunalfarmah.sig_scheduler;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.content.Intent.EXTRA_EMAIL;
import static android.content.Intent.EXTRA_SUBJECT;
import static android.content.Intent.EXTRA_TEXT;

public class MainActivity extends AppCompatActivity {

    Button buy;

    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buy = findViewById(R.id.button);

        t1= findViewById(R.id.kfnum);
        t2 = findViewById(R.id.sknum);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent newAct = new Intent(getApplicationContext(),intent_act.class);
//                newAct.putExtra("data","In second Activity");
//                startActivity(newAct);
//                Intent amazon = getPackageManager().getLaunchIntentForPackage("in.amazon.mShop.android.shopping");
//                startActivity(amazon);

                Intent fb = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(fb);
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    String number = "9654211634";
                    call.setData(Uri.parse("tel:"+number));
                    startActivity(call);
            }
        });



        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mail = new Intent(Intent.ACTION_SENDTO);
                String id = "shivam.kumard107@gmail.com";
                mail.setType("text/html");
                mail.setData(Uri.parse("mailto:"+id));
               // mail.putExtra(EXTRA_EMAIL,id);
                mail.putExtra(EXTRA_SUBJECT,"sub");
                mail.putExtra(EXTRA_TEXT,"Mailing you via app");
                startActivity(mail);

            }
        });




    }
}
