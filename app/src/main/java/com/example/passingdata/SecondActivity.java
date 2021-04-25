package com.example.passingdata;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //get data passed in using getStringExtra()
        Toast.makeText(this, getIntent().getStringExtra("str1"),Toast.LENGTH_SHORT).show();

        //get data passed in using getIntExtra()
        Toast.makeText(this,getIntent().getIntExtra("age1",0),Toast.LENGTH_SHORT).show();

        //get the bundle object passed in
        Bundle bundle = getIntent().getExtras();

        //get data using getString()
        Toast.makeText(this, bundle.getString("str2"),Toast.LENGTH_SHORT).show();

        //get data using the getInt() method
        Toast.makeText(this,Integer.toString(bundle.getInt("age2")),Toast.LENGTH_SHORT).show();
    }

    public void onclick(View view){
        //use an Intent Object to return data
        Intent i = new Intent();

        //use the putExtra() method to return some value
        i.putExtra("age3",45);

        //use the setData() method to return some value
        i.setData(Uri.parse("Something passed back to main activity"));

        //set the result with OK and the Intent object
        setResult(RESULT_OK, i);

        //destroy current activity
        finish();
    }
}
