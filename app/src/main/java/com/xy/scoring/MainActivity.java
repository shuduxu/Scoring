package com.xy.scoring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamA_AddScore(View view) {
        /*
         * Team A加score分
         * @Param oldScore 原成绩
         * @Param score  要加的成绩
         * */
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        int oldScore = Integer.parseInt(teamAScore.getText().toString());
        int score = Integer.parseInt(view.getTag().toString());
        teamAScore.setText("" + (score + oldScore));
    }

    public void reset(View view) {
        /*
         * 重置比分
         * */
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAScore.setText("0");
    }
}