package com.wtho.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private TextView tv_score_a, tv_score_b;
   private Button btnTeamATouchDown, btnTeamAExtra, btnTeamATwoPoints, btnTeamAGoal, btnTeamASafety;
   private Button btnTeamBTouchDown, btnTeamBExtra, btnTeamBTwoPoints, btnTeamBGoal, btnTeamBSafety;
   private int scoreA = 0;
   private int scoreB = 0;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      tv_score_a = (TextView) findViewById(R.id.tv_team_a_score);
      tv_score_b = (TextView) findViewById(R.id.tv_team_b_score);

      btnTeamATouchDown = (Button) findViewById(R.id.btn_touchdown_team_a);
      btnTeamAExtra = (Button) findViewById(R.id.btn_extra_point_team_a);
      btnTeamATwoPoints = (Button) findViewById(R.id.btn_two_point_team_a);
      btnTeamAGoal = (Button) findViewById(R.id.btn_goal_team_a);
      btnTeamASafety = (Button) findViewById(R.id.btn_safety_team_a);

      btnTeamBTouchDown = (Button) findViewById(R.id.btn_touchdown_team_b);
      btnTeamBExtra = (Button) findViewById(R.id.btn_extra_point_team_b);
      btnTeamBTwoPoints = (Button) findViewById(R.id.btn_two_point_team_b);
      btnTeamBGoal = (Button) findViewById(R.id.btn_goal_team_b);
      btnTeamBSafety = (Button) findViewById(R.id.btn_safety_team_b);
   }

   private void displayTeamAScore(int score) {
      tv_score_a.setText(String.valueOf(score));
   }

   private void displayTeamBScore(int score) {
      tv_score_b.setText(String.valueOf(score));
   }

   public void TouchDownTeamA(View view) {
      scoreA += 6;
      displayTeamAScore(scoreA);
   }

   public void ExtraPointTeamA(View view) {
      scoreA += 1;
      displayTeamAScore(scoreA);
   }

   public void TwoPointsTeamA(View view) {
      scoreA += 2;
      displayTeamAScore(scoreA);
   }

   public void GoalTeamA(View view) {
      scoreA += 3;
      displayTeamAScore(scoreA);
   }

   public void SafetyTeamA(View view) {
      scoreA += 2;
      displayTeamAScore(scoreA);
   }


   public void TouchDownTeamB(View view) {
      scoreB += 6;
      displayTeamBScore(scoreB);
   }

   public void ExtraPointTeamB(View view) {
      scoreB += 1;
      displayTeamBScore(scoreB);
   }

   public void TwoPointsTeamB(View view) {
      scoreB += 2;
      displayTeamBScore(scoreB);
   }

   public void GoalTeamB(View view) {
      scoreB += 3;
      displayTeamBScore(scoreB);
   }

   public void SafetyTeamB(View view) {
      scoreB += 2;
      displayTeamBScore(scoreB);
   }

   public void ResetScore(View view) {
      scoreA = 0;
      scoreB = 0;
      displayTeamAScore(scoreA);
      displayTeamBScore(scoreB);
   }
}
