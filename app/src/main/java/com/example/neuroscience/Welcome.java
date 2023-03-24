package com.example.neuroscience;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity implements View.OnClickListener {

    TextView exitWButton, nextWButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //Get rid of action bar in this Class/Activity
        getSupportActionBar().hide();

        exitWButton = findViewById(R.id.exit_text);
        nextWButton = findViewById(R.id.next_text);


        exitWButton.setOnClickListener(this);
        nextWButton.setOnClickListener(this);


    }//End of onCreate

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.exit_text:
                Intent backIntent = new Intent(Welcome.this, homepage.class);
                startActivity(backIntent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.next_text:
                Intent page1Intent = new Intent(Welcome.this, aboutAppPage1.class);
                startActivity(page1Intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;

        }//end of switch

    }//End of onClick
}//End of aboutAppPage1