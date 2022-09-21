package com.example.led_calc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Week2 extends AppCompatActivity {
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

        clearNumber();
    }

    void clearNumber() {
        showNumber(0);
    }

    void inputNumber(int number) {
        showNumber(number);
    }

    void showNumber(int number) {
        LEDView led = findViewById(R.id.led0);
        setNumber(led, number);
    }

    void setNumber(LEDView led, int number) {
        if (number == 0) {
            led.turn(true, true, true, true, true, true, false);
        } else if (number == 1) {
            led.turn(false, true, true, false, false, false, false);
        } else if (number == 2) {
            led.turn(true, true, false, true, true, false, true);
        } else if (number == 3) {
            led.turn(true, true, true, true, false, false, true);
        } else if (number == 4) {
            led.turn(false, true, true, false, false, true, true);
        } else if (number == 5) {
            led.turn(true, false, true, true, false, true, true);
        } else if (number == 6) {
            led.turn(true, false, true, true, true, true, true);
        } else if (number == 7) {
            led.turn(true, true, true, false, false, false, false);
        } else if (number == 8) {
            led.turn(true, true, true, true, true, true, true);
        } else if (number == 9) {
            led.turn(true, true, true, true, false, true, true);
        }
    }
}