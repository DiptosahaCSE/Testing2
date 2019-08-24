package com.example.diptosaha.buttonlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


int count = 0;
int a,b,i,j,k,c=0;
    private Button bt1,bt2;
    private TextView tex1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.but1);
        bt2= (Button) findViewById(R.id.but2);
        tex1 = findViewById(R.id.tes);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.but1){
            c++;
            for(i=1;i<=10;i++)
            {
                b=i*c;
                tex1.setText("hi how are you "+b);


            }
            Toast.makeText(MainActivity.this,"hello hello heklo",Toast.LENGTH_SHORT).show();

        }
        if(view.getId()==R.id.but2){
            tex1.setText("i am fine");
        }
    }
}
