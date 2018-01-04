/**
 * MainActivity.java
 * By : ChocolateCharlie
 * Last Updates : 04 - 01 - 2018
 */

package com.example.courtcounter;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
 * addOneForTeamA
 * @param view
 *
 * Display 1
 */
    public void addOneForTeamA (View view) {
        displayForTeamA(1);
    }

/**
 * addTwoForTeamA
 * @param view
 *
 * Display 2
 */
    public void addTwoForTeamA (View view) {
        displayForTeamA(2);
    }


/**
 * addThreeForTeamA
 * @param view
 * Display 3
 */
    public void addThreeForTeamA (View view) {
        displayForTeamA(3);
    }
}
