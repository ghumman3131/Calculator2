package example.demo7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstEditText , secondEditText;

    private Button addBox , minusbox , multiplybox , dividebox ;

    private TextView textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEditText = (EditText) findViewById(R.id.firstNumberEt);

        secondEditText = (EditText) findViewById(R.id.secondNumberEt);

        addBox = (Button) findViewById(R.id.add_btn);

        textBox = (TextView) findViewById(R.id.resultText);

        minusbox = (Button) findViewById(R.id.minus_btn);

        multiplybox = (Button) findViewById(R.id.multiply_btn);

        dividebox = (Button) findViewById(R.id.divide_btn);

        View.OnClickListener add_btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.getId() == R.id.add_btn) {

                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());

                    double result = firstInt + secondInt;

                    textBox.setText(String.valueOf(result));
                }

                if(v.getId() == R.id.multiply_btn)
                {
                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());

                    double result = firstInt * secondInt;

                    textBox.setText(String.valueOf(result));

                }
                if(v.getId() == R.id.minus_btn)
                {
                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());

                    double result = firstInt - secondInt;

                    textBox.setText(String.valueOf(result));
                }

                if(v.getId() == R.id.divide_btn)
                {
                    double firstInt = Integer.parseInt(firstEditText.getText().toString());
                    double secondInt = Integer.parseInt(secondEditText.getText().toString());

                    double result = firstInt / secondInt;

                    textBox.setText(String.valueOf(result));
                }
            }
        };
        addBox.setOnClickListener(add_btn_click);
        multiplybox.setOnClickListener(add_btn_click);
        dividebox.setOnClickListener(add_btn_click);
        minusbox.setOnClickListener(add_btn_click);

    }
}
