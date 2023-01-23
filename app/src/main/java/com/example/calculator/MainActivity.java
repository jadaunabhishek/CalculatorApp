package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    String data;
    TextView output, input;
    MaterialButton c,mod,divide,seven,eight,nine,multiply;
    MaterialButton four,five,six,add,one,two,three,subtract,ac,zero,dot,equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output= findViewById(R.id.output);
        input= findViewById(R.id.input);
        one= findViewById(R.id.one);
        two= findViewById(R.id.two);
        three= findViewById(R.id.three);
        four= findViewById(R.id.four);
        five= findViewById(R.id.five);
        six= findViewById(R.id.six);
        seven= findViewById(R.id.seven);
        eight= findViewById(R.id.eight);
        nine= findViewById(R.id.nine);
        zero= findViewById(R.id.zero);
        ac= findViewById(R.id.ac);
        dot= findViewById(R.id.dot);
        mod= findViewById(R.id.mod);
        c= findViewById(R.id.c);
        divide= findViewById(R.id.divide);
        multiply= findViewById(R.id.multiply);
        add= findViewById(R.id.add);
        subtract= findViewById(R.id.subtract);
        equal= findViewById(R.id.equal);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+".");
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"+");
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"-");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"×");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"÷");
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data+"%");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                data = data.replace("÷","/");
                data = data.replace("×","*");
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String result="";
                Scriptable scriptable = rhino.initStandardObjects();
                result = rhino.evaluateString(scriptable,data,"JavaScript",1,null).toString();
                output.setText(result);

            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data.substring(0,data.length()-1));
            }
        });
    }

}