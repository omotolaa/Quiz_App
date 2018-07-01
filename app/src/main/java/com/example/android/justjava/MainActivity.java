package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.Toast;
import android.os.CountDownTimer;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

/**
 * This app displays the total score after answering the questions in the quiz.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    float score = 0;

    public void onCheckBoxClicked(View view) {
        // Is the view now checked?
        CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkbox3 = (CheckBox) findViewById(R.id.checkbox1);

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox1:
                if (checkbox1.isChecked()) {
                    score += 0.5;
                }
                break;
            case R.id.checkbox2:
                if (checkbox2.isChecked())
                    score += 0.5;
                break;
            // TODO: Check Question
        }
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question1_c:
                if (checked)
                    score += 1;
                break;
            case R.id.question2_c:
                if (checked)
                    score +=1;

                break;
            case R.id.question3_c:
                if (checked)
                    score +=1;
                break;

            case R.id.question4_c:
                if (checked)
                    score +=1;
                break;
        }

    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void reset(View view) {
        score = 0;
        CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkbox3 = (CheckBox) findViewById(R.id.checkbox1);
        RadioButton question1_a = (RadioButton) findViewById(R.id.question1_a);
        RadioButton question1_b = (RadioButton) findViewById(R.id.question1_b);
        RadioButton question1_c = (RadioButton) findViewById(R.id.question1_c);
        RadioButton question1_d = (RadioButton) findViewById(R.id.question1_d);
        RadioButton question2_a = (RadioButton) findViewById(R.id.question2_a);
        RadioButton question2_b = (RadioButton) findViewById(R.id.question2_b);
        RadioButton question2_c = (RadioButton) findViewById(R.id.question2_c);
        RadioButton question2_d = (RadioButton) findViewById(R.id.question2_d);
        RadioButton question3_a = (RadioButton) findViewById(R.id.question3_a);
        RadioButton question3_b = (RadioButton) findViewById(R.id.question3_b);
        RadioButton question3_c = (RadioButton) findViewById(R.id.question3_c);
        RadioButton question4_a = (RadioButton) findViewById(R.id.question4_a);
        RadioButton question4_b = (RadioButton) findViewById(R.id.question4_b);
        RadioButton question4_c = (RadioButton) findViewById(R.id.question4_c);
        RadioButton question4_d = (RadioButton) findViewById(R.id.question4_d);
        EditText nameInput= (EditText)findViewById(R.id.name);
        nameInput.setText("");
        if (checkbox1.isChecked()) {
            checkbox1.setChecked(false);
        }
        if (checkbox2.isChecked()) {
            checkbox2.setChecked(false);
        }
        if (checkbox3.isChecked()) {
            checkbox3.setChecked(false);
        }
        if(question1_a.isChecked() || question1_b.isChecked() || question1_c.isChecked() || question1_d.isChecked()){
            question1_a.setChecked(false);
            question1_b.setChecked(false);
            question1_c.setChecked(false);
            question1_d.setChecked(false);
        }
        if(question2_a.isChecked() || question2_b.isChecked() || question2_c.isChecked() || question2_d.isChecked()){
            question2_a.setChecked(false);
            question2_b.setChecked(false);
            question2_c.setChecked(false);
            question2_d.setChecked(false);
        }
        if(question3_a.isChecked() || question3_b.isChecked() || question3_c.isChecked() ){
            question3_a.setChecked(false);
            question3_b.setChecked(false);
            question3_c.setChecked(false);
        }
        if(question4_a.isChecked() || question4_b.isChecked() || question4_c.isChecked() || question4_d.isChecked()){
            question4_a.setChecked(false);
            question4_b.setChecked(false);
            question4_c.setChecked(false);
            question4_d.setChecked(false);
        }


    }

    private Toast myToast;
    public void showToast(View view) {
        // Set the toast and duration
        int toastDurationInMilliSeconds = 10000;
        String finalScore = Float.toString(score);
        EditText nameInput= (EditText)findViewById(R.id.name);
        String name = nameInput.getText().toString();
        myToast = Toast.makeText(this, "Congratulations " +name + " Your final score is: "+ finalScore, Toast.LENGTH_LONG);

        // Set the countdown to display the toast
        CountDownTimer toastCountDown;
        toastCountDown = new CountDownTimer(toastDurationInMilliSeconds, 1000 /*Tick duration*/) {
            public void onTick(long millisUntilFinished) {
                myToast.show();
            }
            public void onFinish() {
                myToast.cancel();
            }
        };

        // Show the toast and starts the countdown
        myToast.show();
        toastCountDown.start();
    }

//    /**
//     * This method displays the given quantity value on the screen.
//     */
//    private void display(int number) {
//        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
//        quantityTextView.setText("" + number);
//    }
//

}