package com.example.akash.alberts_calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {



    //string num is used to take numbers as input
    String num="",calc="";


    //pre and val stores two values as operands
    double val,pre;

    //op stores operator
    char op;

    int n=0;

    //num_check checks for syntax errors in the input expression
    int num_check=0;

    //view to show result
    TextView result_view;


    //view to show calculations
    TextView calc_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result_view = (TextView) findViewById(R.id.result);
        calc_view = (TextView) findViewById(R.id.calcs);
    }

    public void button1(View view){
        //concatinating digit to the input number
        num+="1";

        //displaying calculations
        calc_view.setText(calc+="1");
        num_check=1;

    }

    public void button2(View view){
        num+="2";
        calc_view.setText(calc+="2");
        num_check=1;
    }

    public void button3(View view){
        num+="3";
        calc_view.setText(calc+="3");
        num_check=1;
    }

    public void button4(View view){
        num+="4";
        calc_view.setText(calc+="4");
        num_check=1;
    }


    public void button5(View view){
        num+="5";
        calc_view.setText(calc+="5");
        num_check=1;
    }

    public void button6(View view){
        num+="6";
        calc_view.setText(calc+="6");
        num_check=1;
    }


    public void button7(View view){
        num+="7";
        calc_view.setText(calc+="7");
        num_check=1;
    }


    public void button8(View view){
        num+="8";
        calc_view.setText(calc+="8");
        num_check=1;
    }

    public void button9(View view){
        num+="9";
        calc_view.setText(calc+="9");
        num_check=1;
    }

    public void button0(View view){
        num+="0";
        calc_view.setText(calc+="0");
        num_check=1;
    }


    public void buttonadd(View view){
        //do operation does the operation
        do_op();
        op='+';
        calc_view.setText(calc+="+");
    }

    public void buttonsub(View view){
        do_op();
        op='-';
        calc_view.setText(calc+="-");
    }

    public void buttonmul(View view){

        do_op();
        op='*';
        calc_view.setText(calc+="*");
    }

    public void buttondiv(View view){

        do_op();
        op='/';
        calc_view.setText(calc+="/");
    }

    public void buttonequ(View view){

        do_op();
        num_check=1;
        String message = String.valueOf(pre);
        result_view.setText("Result : "+message);
        num="";
        calc="";
        n=0;
        calc_view.setText("");


    }

    //resetting everything
    public void buttonc(View view){

        n=0;
        num="";
        result_view.setText("Result : ");
        calc_view.setText("");
        calc="";
    }


    public void buttondot(View view){
        num+=".";
        calc_view.setText(calc+=".");
        num_check=1;
    }


    //each time new operator is found previous operation is done
    public void do_op(){

        if(num_check==0){
            Toast myToast = Toast.makeText(getApplicationContext(), "wrong entry", Toast.LENGTH_LONG);
            myToast.show();
            return;
        }

        n++;
        if(n>1){
            val = Double.parseDouble(num);
            switch(op){

                case '+': pre = pre + val;
                    break;

                case '-': pre = pre - val;
                    break;

                case '*': pre = pre * val;
                    break;

                case '/': pre = pre / val;
                    break;

            }
            calc=String.valueOf(pre);
            calc_view.setText(calc);
        }
        else
            pre= Double.parseDouble(num);

        num="";
        num_check=0;



    }
}
