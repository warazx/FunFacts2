package com.example.kringlan.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FunFactsActivity extends AppCompatActivity {

    private TextView factTextTextView;
    private Button showFactButton;
    private RelativeLayout parentLayout;
    private static ColorWheel colorWheel = new ColorWheel();
    private static FactBook factBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the Views from the layout file to the corresponding variables
        factTextTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);
        parentLayout = (RelativeLayout) findViewById(R.id.activity_fun_facts);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = colorWheel.getColor();
                parentLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                factTextTextView.setText(factBook.getFact());
            }
        };
        showFactButton.setOnClickListener(listener);

        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
    }
}
