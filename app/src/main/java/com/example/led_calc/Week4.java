package com.example.led_calc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Week4 extends AppCompatActivity {
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.num0).setOnClickListener(view -> inputNumber(0));
        findViewById(R.id.num1).setOnClickListener(view -> inputNumber(1));
        findViewById(R.id.num2).setOnClickListener(view -> inputNumber(2));
        findViewById(R.id.num3).setOnClickListener(view -> inputNumber(3));
        findViewById(R.id.num4).setOnClickListener(view -> inputNumber(4));
        findViewById(R.id.num5).setOnClickListener(view -> inputNumber(5));
        findViewById(R.id.num6).setOnClickListener(view -> inputNumber(6));
        findViewById(R.id.num7).setOnClickListener(view -> inputNumber(7));
        findViewById(R.id.num8).setOnClickListener(view -> inputNumber(8));
        findViewById(R.id.num9).setOnClickListener(view -> inputNumber(9));
        findViewById(R.id.clear).setOnClickListener(view -> clearNumber());

        showNumber();
    }

    void clearNumber() {
        this.number = 0;
        showNumber();
    }

    void inputNumber(int number) {
        this.number = this.number * 10 + number;
        showNumber();
    }

    void showNumber() {
        setNumber(findViewById(R.id.led0), ' ');
        setNumber(findViewById(R.id.led1), ' ');
        setNumber(findViewById(R.id.led2), ' ');
        setNumber(findViewById(R.id.led3), ' ');
        setNumber(findViewById(R.id.led4), ' ');
        int index = 0;
        String number_str = Integer.toString(this.number);
        for (int i = number_str.length() - 1; i >= 0; --i) {
            if (index == 0) {
                setNumber(findViewById(R.id.led0), number_str.charAt(i));
            } else if (index == 1) {
                setNumber(findViewById(R.id.led1), number_str.charAt(i));
            } else if (index == 2) {
                setNumber(findViewById(R.id.led2), number_str.charAt(i));
            } else if (index == 3) {
                setNumber(findViewById(R.id.led3), number_str.charAt(i));
            } else if (index == 4) {
                setNumber(findViewById(R.id.led4), number_str.charAt(i));
            }
            index++;
        }
    }

    void setNumber(LEDView led, char number) {
        if (number == ' ') {
            led.turn(false, false, false, false, false, false, false);
        } else if (number == '0') {
            led.turn(true, true, true, true, true, true, false);
        } else if (number == '1') {
            led.turn(false, true, true, false, false, false, false);
        } else if (number == '2') {
            led.turn(true, true, false, true, true, false, true);
        } else if (number == '3') {
            led.turn(true, true, true, true, false, false, true);
        } else if (number == '4') {
            led.turn(false, true, true, false, false, true, true);
        } else if (number == '5') {
            led.turn(true, false, true, true, false, true, true);
        } else if (number == '6') {
            led.turn(true, false, true, true, true, true, true);
        } else if (number == '7') {
            led.turn(true, true, true, false, false, false, false);
        } else if (number == '8') {
            led.turn(true, true, true, true, true, true, true);
        } else if (number == '9') {
            led.turn(true, true, true, true, false, true, true);
        }
    }
}