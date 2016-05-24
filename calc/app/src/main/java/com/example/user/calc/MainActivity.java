package com.example.user.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2,e3;
    int n1,n2,n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 =(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st,st2;
                st=e1.getText().toString();
                n1=Integer.parseInt(st);
                st2 =e2.getText().toString();
                n2=Integer.parseInt(st2);
                n3=n1+n2;
                st=Integer.toString(n3);
                e3.setText(st);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st,st2;
                st=e1.getText().toString();
                n1=Integer.parseInt(st);
                st2 =e2.getText().toString();
                n2=Integer.parseInt(st2);
                n3=n1-n2;
                st=Integer.toString(n3);
                e3.setText(st);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st,st2;
                st=e1.getText().toString();
                n1=Integer.parseInt(st);
                st2 =e2.getText().toString();
                n2=Integer.parseInt(st2);
                n3=n1*n2;
                st=Integer.toString(n3);
                e3.setText(st);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st,st2;
                st=e1.getText().toString();
                n1=Integer.parseInt(st);
                st2 =e2.getText().toString();
                n2=Integer.parseInt(st2);
                if(n1==0||n2==0)
                {
                    n3=0;
                }else{
                n3=n1/n2;}
                st=Integer.toString(n3);
                e3.setText(st);
            }
        });
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
