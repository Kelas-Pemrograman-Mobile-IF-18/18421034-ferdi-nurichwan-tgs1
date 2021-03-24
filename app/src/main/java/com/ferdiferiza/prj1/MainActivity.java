package com.ferdiferiza.prj1;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{ "nnexus016@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Biodata from Android Studio");
        intent.putExtra(Intent.EXTRA_TEXT, "Hello from the other siiiiiiiidddeee!");

        try {
            startActivity(Intent.createChooser(intent, "Choose an Email :"));
        } catch (android.content.ActivityNotFoundException ex) {
        }
    }

}