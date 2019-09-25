package com.androidlime.parcentangeapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    private EditText editText1,editText2;

    private Button button;

    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editText1= (EditText) findViewById(R.id.present);

        editText2= (EditText) findViewById(R.id.totalclass);

        button= (Button) findViewById(R.id.calculate);

        textView= (TextView) findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



              float present=Float.parseFloat(editText1.getText().toString());


                float multi=present*100;



              float totalclass=Float.parseFloat( editText2.getText().toString());


                float num=multi/totalclass;




                textView.setText("Result: "+Float.toString(num));


            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.about:

                Intent intent=new Intent(MainActivity.this,Mithun.class);
                startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }


}
