package com.example.theplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        String htmlText = getResources().getString(R.string.aboutText);
        textView.setText(Html.fromHtml(htmlText));

        textView = (TextView) findViewById(R.id.location);
        String locationText = getResources().getString(R.string.location);
        textView.setText(Html.fromHtml(locationText));

        textView = (TextView) findViewById(R.id.aboutUs);
        String aboutText = getResources().getString(R.string.rights);
        textView.setText(Html.fromHtml(aboutText));

    }
}
