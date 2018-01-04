/**
 * MainActivity.java
 * By : ChocolateCharlie
 * Last Updates : 04 - 01 - 2018
 */

package com.example.courtcounter;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

import com.example.courtcounter.R;



/**
 * MainActivity class
 * @author ChocolateCharlie
 *
 * React to button pressing.
 */
public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;     /* score of the team A */
    int scoreTeamB = 0;     /* score of the team B */

/**
 * onCreate
 * @param savedInstanceState
 *
 * This method is called at the creation of the class.
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        /* ************************************ */
        /*          DISPLAY METHODS             */
        /* ************************************ */

/**
 * displayForTeamA
 * @param score
 *
 * Displays the given score for Team A.
 */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

/**
 * displayForTeamB
 * @param score
 *
 * Displays the given score for Team B.
 */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

        /* ************************************ */
        /*          SCORE TEAM A METHODS        */
        /* ************************************ */

/**
 * addOneForTeamA
 * @param view
 *
 * Add 1 point to team A
 */
    public void addOneForTeamA (View view) {
        scoreTeamA = scoreTeamA + 1;

        displayForTeamA(scoreTeamA);
    }

/**
 * addTwoForTeamA
 * @param view
 *
 * Add 2 points to team A
 */
    public void addTwoForTeamA (View view) {
        scoreTeamA = scoreTeamA + 2;

        displayForTeamA(scoreTeamA);
    }


/**
 * addThreeForTeamA
 * @param view
 *
 * Add 3 points to team A
 */
    public void addThreeForTeamA (View view) {
        scoreTeamA = scoreTeamA + 3;

        displayForTeamA(scoreTeamA);
    }

        /* ************************************ */
        /*          SCORE TEAM B METHODS        */
        /* ************************************ */

/**
 * addOneForTeamB
 * @param view
 *
 * Add 1 point to team B
 */
    public void addOneForTeamB (View view) {
        scoreTeamB = scoreTeamB + 1;

        displayForTeamB(scoreTeamB);
    }

/**
 * addTwoForTeamB
 * @param view
 *
 * Add 2 points to team B
 */
    public void addTwoForTeamB (View view) {
        scoreTeamB = scoreTeamB + 2;

        displayForTeamB(scoreTeamB);
    }

/**
 * addThreeForTeamB
 * @param view
 *
 * Add 3 points to team B
 */
    public void addThreeForTeamB (View view) {
        scoreTeamB = scoreTeamB + 3;

        displayForTeamB(scoreTeamB);
    }
}
