package com.example.cardetails;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
private TextView scrolltxt;
private EditText maketxt, yeartxt, colortxt, purchasepricetxt, enginesizetxt;
private Button btncreatecar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItems();
    }
    private void initItems(){
        maketxt = findViewById(R.id.maketxt);
        yeartxt = findViewById(R.id.yeartxt);
        colortxt = findViewById(R.id.colortxt);
        purchasepricetxt = findViewById(R.id.pptxt);
        enginesizetxt = findViewById(R.id.engtxt);

        scrolltxt = findViewById(R.id.scrolltxt);
        scrolltxt.setMovementMethod(new ScrollingMovementMethod());

        btncreatecar = findViewById(R.id.createbtn);
        btncreatecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performAction();
            }
        });
    }
    private void performAction(){
        String data = "\r\n" +"Make:"+ maketxt.getText().toString()+"."+"\r\n"+ "Year:"+ yeartxt.getText().toString()
                +"."+"\r\n"+ "Color:"+ colortxt.getText().toString()+"."+"\r\n"
                + "Purchase Price:"+ purchasepricetxt.getText().toString()
                +"."+"\r\n"+ "Engine Size:"+ enginesizetxt.getText().toString();
            scrolltxt.setText(scrolltxt.getText().toString()+"\r\n"+data);
    }
}