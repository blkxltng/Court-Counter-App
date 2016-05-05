package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 to Team A's score and displays it
     */
    public void addThreeForTeamA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds 2 to Team A's score and displays it
     */
    public void addTwoForTeamA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds 1 to Team A's score and displays it
     */
    public void addOneForTeamA(View view) {
        teamAScore++;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 to Team B's score and displays it
     */
    public void addThreeForTeamB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    /**
     * Adds 2 to Team B's score and displays it
     */
    public void addTwoForTeamB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    /**
     * Adds 1 to Team B's score and displays it
     */
    public void addOneForTeamB(View view) {
        teamBScore++;
        displayForTeamB(teamBScore);
    }

    /**
     * Resets the scores and displays them
     */
    public void resetScores(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
