package com.example.android.trivialquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    /* Question 1 */
    CheckBox question1_choice1;
    CheckBox question1_choice2;
    CheckBox question1_choice3;
    CheckBox question1_choice4;
    /* Question 2 */
    RadioButton question2_choice1;
    /* Question 3 */
    EditText question3_answer;
    /* Question 4 */
    RadioButton question4_choice2;
    /* Question 5 */
    RadioButton question5_choice2;
    /* Question 6 */
    RadioButton question6_choice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* Hide the keyboard*/
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    public void sumbitAnswers (View view){

        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int final_score;
        CharSequence resultsDisplay;

        /* Question 1 Check */
        Boolean answer1_choice1;
        Boolean answer1_choice2;
        Boolean answer1_choice3;
        Boolean answer1_choice4;
        question1_choice1 = (CheckBox) this.findViewById(R.id.A1);
        question1_choice2 = (CheckBox) this.findViewById(R.id.A2);
        question1_choice3 = (CheckBox) this.findViewById(R.id.A3);
        question1_choice4 = (CheckBox) this.findViewById(R.id.A4);
        answer1_choice1 = question1_choice1.isChecked();
        answer1_choice2 = question1_choice2.isChecked();
        answer1_choice3 = question1_choice3.isChecked();
        answer1_choice4 = question1_choice4.isChecked();
        if (answer1_choice1 && answer1_choice2 && !answer1_choice3 && answer1_choice4) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        /* Question 2 Check */
        boolean answer2;
        question2_choice1 = (RadioButton) this.findViewById(R.id.B1);
        answer2 = question2_choice1.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        /* Question 3 Check*/
        String answer3;
        question3_answer = (EditText) this.findViewById(R.id.question3);
        answer3 = question3_answer.getText().toString().toLowerCase();
        if (answer3.equals("Denmark")) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }


        /* Question 4 Check */
        boolean answer4;
        question4_choice2 = (RadioButton) this.findViewById(R.id.D2);
        answer4 = question4_choice2.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        /* Question 5 Check */
        boolean answer5;
        question5_choice2 = (RadioButton) this.findViewById(R.id.E2);
        answer5 = question5_choice2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        /* Question 6 Check */
        boolean answer6;
        question6_choice2 = (RadioButton) this.findViewById(R.id.F2);
        answer6 = question6_choice2.isChecked();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        /* Results */
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score + answer6_score;

        if (final_score == 5) {
            resultsDisplay = "Perfect! You scored 6 out of 6!";
        } else {
            resultsDisplay = "You scored " + final_score + " out of 6. You can try again!";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

         /* Question 2 Wrong Options */
        RadioButton Q2A2 = (RadioButton) findViewById(R.id.B2);
        boolean question2_choice2 = Q2A2.isChecked();
        RadioButton Q2A3 = (RadioButton) findViewById(R.id.B3);
        boolean question2_choice3 = Q2A3.isChecked();
        RadioButton Q2A4 = (RadioButton) findViewById(R.id.B4);
        boolean question2_choice4 = Q2A4.isChecked();

          /* Question 4 Wrong Options */
        RadioButton Q4A1 = (RadioButton) findViewById(R.id.D1);
        boolean question4_choice1 = Q4A1.isChecked();
        RadioButton Q4A3 = (RadioButton) findViewById(R.id.D3);
        boolean question4_choice3 = Q4A3.isChecked();
        RadioButton Q4A4 = (RadioButton) findViewById(R.id.D4);
        boolean question4_choice4 = Q4A4.isChecked();

          /* Question 5 Wrong Options */
        RadioButton Q5A1 = (RadioButton) findViewById(R.id.E1);
        boolean question5_choice1 = Q5A1.isChecked();
        RadioButton Q5A3 = (RadioButton) findViewById(R.id.E3);
        boolean question5_choice3 = Q5A3.isChecked();
        RadioButton Q5A4 = (RadioButton) findViewById(R.id.E4);
        boolean question5_choice4 = Q5A4.isChecked();

         /* Question 6 Wrong Option */
        RadioButton Q6A1 = (RadioButton) findViewById(R.id.F1);
        boolean question6_choice1 = Q6A1.isChecked();

         /* Resetting */
        question1_choice1.setChecked(false);
        question1_choice2.setChecked(false);
        question1_choice3.setChecked(false);
        question1_choice4.setChecked(false);
        question2_choice1.setChecked(false);
        question3_answer.setText("");
        question4_choice2.setChecked(false);
        question5_choice2.setChecked(false);
        question6_choice2.setChecked(false);

        Q2A2.setChecked(false);
        Q2A3.setChecked(false);
        Q2A4.setChecked(false);

        Q4A1.setChecked(false);
        Q4A3.setChecked(false);
        Q4A4.setChecked(false);

        Q5A1.setChecked(false);
        Q5A3.setChecked(false);
        Q5A4.setChecked(false);

        Q6A1.setChecked(false);

    }
}
