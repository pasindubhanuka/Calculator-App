package com.example.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAdd, buttonSub, buttonMul, buttonDiv;  // Sample Button Set
    EditText editNumber1, editNumber2;                  //  Edit Texts
    TextView finalAns;                                  //  Final Answer
    
    int num1, num2;                                     // Numbers Storing variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);         //  Layout

        buttonAdd = findViewById(R.id.addition);        //  Add button
        buttonSub = findViewById(R.id.subtraction);     //  Sub button
        buttonMul = findViewById(R.id.multiplication);  //  Multi button
        buttonDiv = findViewById(R.id.devision);        //  Div button

        editNumber1 = findViewById(R.id.number1);       //  text field 1
        editNumber2 = findViewById(R.id.number2);       //  text field 2

        finalAns = findViewById(R.id.answer);           //  final answer

        buttonAdd.setOnClickListener(this);             //  Add button on click listener
        buttonSub.setOnClickListener(this);             //  Sub button on click listener
        buttonMul.setOnClickListener(this);             //  Multiply button on click listener
        buttonDiv.setOnClickListener(this);             //  Div button on click listener
    }

    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText(this, "Enter Nmber", Toast.LENGTH_SHORT).show();     //
            return 0;                                                                       // Return 0
        }else {
            return Integer.parseInt(editText.getText().toString());                         // Return converted value as int
        }
    }


    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editNumber1);
        num2 = getIntFromEditText(editNumber2);

        if(R.id.addition == view.getId()){
            finalAns.setText("Answer = " + (num1 + num2));                  // Add numbers
        }else if(R.id.subtraction == view.getId()) {
            finalAns.setText("Answer = " + (num1 - num2));                  //  Subtract numbers
        }else if(R.id.multiplication == view.getId()) {
            finalAns.setText("Answer = " + (num1 * num2));                  //  Multiply numbers
        }else if(R.id.devision == view.getId()) {
            finalAns.setText("Answer = " + ((float)num1 / (float)num2));    //  Devide numbers
        }
    }
}