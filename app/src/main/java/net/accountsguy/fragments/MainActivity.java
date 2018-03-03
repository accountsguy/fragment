package net.accountsguy.fragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int addone = 0;
    private String fieldvalue = "";
    private TextView inputdata, displayresult;
    private FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputdata = (TextView) findViewById(R.id.number);
        displayresult =(TextView) findViewById(R.id.result);

    }

    public void show(View view) {
        simpleaddition sa = new simpleaddition();
        fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment_container, sa);

        if(inputdata.getText().length()>0)
        {
            addone = Integer.valueOf(String.valueOf(inputdata.getText()));
//            addone = addone + 1;
            fieldvalue = Integer.toString(addone);
            displayresult.setTextSize(25);
            displayresult.setText(fieldvalue);
        }
        else
        {
            Toast.makeText(this, "Plase Enter Number",Toast.LENGTH_LONG).show();
        }
    }
}
