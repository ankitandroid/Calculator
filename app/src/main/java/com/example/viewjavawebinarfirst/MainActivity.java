package com.example.viewjavawebinarfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnclear,btnAdd,btnSub,btnMulti,btnEqual,btnDivide,btnDot;
    float res1,res2;
    boolean add,sub,divide,multi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=findViewById(R.id.edit1);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnclear=findViewById(R.id.btnClear);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMulti=findViewById(R.id.btnMulti);
        btnEqual=findViewById(R.id.btnEqual);
        btnDivide=findViewById(R.id.btnDivide);
        btnDot=findViewById(R.id.btnDot);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1==null)
                {
                    edit1.setText("");
                }
                else
                {
                    res1=Float.parseFloat(edit1.getText()+"");
                    add=true;
                    edit1.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1==null)
                {
                    edit1.setText("");
                }
                else
                {
                    res1=Float.parseFloat(edit1.getText()+"");
                    sub=true;
                    edit1.setText(null);
                }
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1==null)
                {
                    edit1.setText("");
                }
                else
                {
                    res1=Float.parseFloat(edit1.getText()+"");
                    multi=true;
                    edit1.setText(null);
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1==null)
                {
                    edit1.setText("");
                }
                else
                {
                    res1=Float.parseFloat(edit1.getText()+"");
                    divide=true;
                    edit1.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2=Float.parseFloat(edit1.getText()+"");
                if(add==true)
                {
                    edit1.setText(res1+res2+"");
                    add=false;
                }
                else if(multi==true)
                {
                    edit1.setText(res1*res2+"");
                    multi=false;
                }
                else if(sub==true)
                {
                    edit1.setText(res1-res2+"");
                    sub=false;
                }
                else if(divide==true)
                {
                    edit1.setText(res1/res2+"");
                    divide=false;
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText("");
            }
        });
    }
}