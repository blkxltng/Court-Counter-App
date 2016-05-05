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
        String scoreTeamA = String.valueOf(score);
        scoreView.setText(scoreTeamA);
        statusOfScores();
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
        String scoreTeamB = String.valueOf(score);
        scoreView.setText(scoreTeamB);
        statusOfScores();
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

    /**
     * Tells the user which team is winning the game
     */
    public void statusOfScores() {
        TextView scoreStatusView = (TextView) findViewById(R.id.scoreStatusView);
        if (teamAScore == teamBScore && teamAScore != 0) {
            String message = "Team A and Team B are tied.";
            scoreStatusView.setText(message);
        }

        else if (teamAScore == teamBScore && teamAScore == 0) {
            String message = "The game has just begun.";
            scoreStatusView.setText(message);
        }

        else if (teamAScore > teamBScore) {
            String message = "Team A is in the lead.";
            scoreStatusView.setText(message);
        }

        else {
            String message = "Team B is in the lead.";
            scoreStatusView.setText(message);
        }
    }

    /**
     * Tells the user who the winner of the game is
     */
    public void endGameSummary(View view) {
        TextView scoreStatusView = (TextView) findViewById(R.id.scoreStatusView);
        if(teamAScore > teamBScore) {
            String message = "Team A has won the game!";
            scoreStatusView.setText(message);
        }
        else if (teamAScore < teamBScore) {
            String message = "Team B has won the game!";
            scoreStatusView.setText(message);
        }
        else {
            String message = "Game cannot end in a tie. Please play until a team wins.";
            scoreStatusView.setText(message);
        }
    }
}
