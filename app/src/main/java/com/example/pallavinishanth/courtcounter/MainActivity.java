package com.example.pallavinishanth.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA_score = 0;
    int teamB_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusthreeTeamA(View view){

        TextView scoreView = (TextView) findViewById(R.id.teamAscore);
        teamA_score += 3;
        scoreView.setText(String.valueOf(teamA_score));
    }

    public void plustwoTeamA(View view){

        TextView scoreView = (TextView) findViewById(R.id.teamAscore);
        teamA_score += 2;
        scoreView.setText(String.valueOf(teamA_score));
    }

    public void FreeThrowA(View view){

        TextView scoreView = (TextView) findViewById(R.id.teamAscore);
        teamA_score += 1;
        scoreView.setText(String.valueOf(teamA_score));
    }


    public void plusthreeTeamB(View view){

        TextView scoreView = (TextView) findViewById(R.id.teamBscore);
        teamB_score += 3;
        scoreView.setText(String.valueOf(teamB_score));
    }

    public void plustwoTeamB(View view){

        TextView scoreView = (TextView) findViewById(R.id.teamBscore);
        teamB_score += 2;
        scoreView.setText(String.valueOf(teamB_score));
    }

    public void FreeThrowB(View view){

        TextView scoreView = (TextView) findViewById(R.id.teamBscore);
        teamB_score += 1;
        scoreView.setText(String.valueOf(teamB_score));
    }
}
