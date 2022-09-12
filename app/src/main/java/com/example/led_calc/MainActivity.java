package com.example.led_calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int memory = 0;
    int number = 0;

    int state = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0 = findViewById(R.id.num0);
        setupNumber(num0, 0);
        Button num1 = findViewById(R.id.num1);
        setupNumber(num1, 1);
        Button num2 = findViewById(R.id.num2);
        setupNumber(num2, 2);
        Button num3 = findViewById(R.id.num3);
        setupNumber(num3, 3);
        Button num4 = findViewById(R.id.num4);
        setupNumber(num4, 4);
        Button num5 = findViewById(R.id.num5);
        setupNumber(num5, 5);
        Button num6 = findViewById(R.id.num6);
        setupNumber(num6, 6);
        Button num7 = findViewById(R.id.num7);
        setupNumber(num7, 7);
        Button num8 = findViewById(R.id.num8);
        setupNumber(num8, 8);
        Button num9 = findViewById(R.id.num9);
        setupNumber(num9, 9);

        Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state = 0;
                number = 0;
                showNumber();
            }
        });
        Button plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resolve();
                MainActivity.this.memory = MainActivity.this.number;
                MainActivity.this.number = 0;
                state = 1;
            }
        });
        Button minus = findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resolve();
                MainActivity.this.memory = MainActivity.this.number;
                MainActivity.this.number = 0;
                state = 2;
            }
        });
        Button equal = findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resolve();
            }
        });

        showNumber();
    }

    void resolve() {
        if (state == 1) {
            MainActivity.this.number = MainActivity.this.memory + MainActivity.this.number;
        } else if (state == 2) {
            MainActivity.this.number = MainActivity.this.memory - MainActivity.this.number;
        }
        showNumber();
        state = 0;
    }

    void setupNumber(Button num, int number) {
        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNumber(number);
            }
        });
    }

    void showNumber() {
        clearNumber(findViewById(R.id.led0));
        clearNumber(findViewById(R.id.led1));
        clearNumber(findViewById(R.id.led2));
        clearNumber(findViewById(R.id.led3));
        clearNumber(findViewById(R.id.led4));
        if (number > 99999) {
            setNumber(findViewById(R.id.led4), 'E');
            setNumber(findViewById(R.id.led3), 'r');
            setNumber(findViewById(R.id.led2), 'r');
            setNumber(findViewById(R.id.led1), 'o');
            setNumber(findViewById(R.id.led0), 'r');
            return;
        }
        int index = 0;
        String number_str = Integer.toString(number);
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
            } else {
                // Handle error
            }
            index++;
        }
    }

    void clearNumber(LEDView led) {
        led.clearLED();
    }

    void setNumber(LEDView led, char number) {
        clearNumber(led);
        switch (number) {
            case '0':
                led.turnOnLED('a');
                led.turnOnLED('b');
                led.turnOnLED('f');
                led.turnOnLED('c');
                led.turnOnLED('e');
                led.turnOnLED('d');
                break;
            case '1':
                led.turnOnLED('b');
                led.turnOnLED('c');
                break;
            case '2':
                led.turnOnLED('a');
                led.turnOnLED('b');
                led.turnOnLED('g');
                led.turnOnLED('e');
                led.turnOnLED('d');
                break;
            case '3':
                led.turnOnLED('a');
                led.turnOnLED('b');
                led.turnOnLED('g');
                led.turnOnLED('c');
                led.turnOnLED('d');
                break;
            case '4':
                led.turnOnLED('f');
                led.turnOnLED('g');
                led.turnOnLED('b');
                led.turnOnLED('c');
                break;
            case '5':
                led.turnOnLED('a');
                led.turnOnLED('f');
                led.turnOnLED('g');
                led.turnOnLED('c');
                led.turnOnLED('d');
                break;
            case '6':
                led.turnOnLED('a');
                led.turnOnLED('f');
                led.turnOnLED('g');
                led.turnOnLED('e');
                led.turnOnLED('c');
                led.turnOnLED('d');
                break;
            case '7':
                led.turnOnLED('a');
                led.turnOnLED('b');
                led.turnOnLED('c');
                break;
            case '8':
                led.turnOnLED('a');
                led.turnOnLED('b');
                led.turnOnLED('c');
                led.turnOnLED('d');
                led.turnOnLED('e');
                led.turnOnLED('f');
                led.turnOnLED('g');
                break;
            case '9':
                led.turnOnLED('a');
                led.turnOnLED('b');
                led.turnOnLED('f');
                led.turnOnLED('g');
                led.turnOnLED('c');
                led.turnOnLED('d');
                break;
            case 'E':
                led.turnOnLED('a');
                led.turnOnLED('f');
                led.turnOnLED('g');
                led.turnOnLED('e');
                led.turnOnLED('d');
                break;
            case 'o':
                led.turnOnLED('g');
                led.turnOnLED('e');
                led.turnOnLED('c');
                led.turnOnLED('d');
                break;
            case 'r':
                led.turnOnLED('g');
                led.turnOnLED('e');
                break;
        }
    }

    void addNumber(int number) {
        this.number = this.number * 10 + number;
        showNumber();
    }
}