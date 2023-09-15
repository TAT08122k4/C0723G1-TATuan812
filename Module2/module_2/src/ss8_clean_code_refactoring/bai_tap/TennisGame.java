package ss8_clean_code_refactoring.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class TennisGame {
    private static String score;
    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";
    private static final String ALL = "-All";

    public static String checkScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        if (scoreOfPlayer1 == scoreOfPlayer2) {
            switch (scoreOfPlayer1) {
                case 0:
                    score = LOVE + ALL;
                    break;
                case 1:
                    score = FIFTEEN + ALL;
                    break;
                case 2:
                    score = THIRTY + ALL;
                    break;
                case 3:
                    score = FORTY + ALL;
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else {
            score = "not Equal";
            return score;
        }
        return score;
    }

    public static String checkPlayerWin(String player1 , String player2 , int scoreOfPlayer1, int scoreOfPlayer2) {
        if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
            if (minusResult == 1) {
                score = "Advantage for " + player1   ;
            } else if (minusResult == -1) {
                score = "Advantage for " + player2 ;
            } else if (minusResult >= 2) {
                score = "Win for " + player1 ;
            }else if (minusResult == 0){
                checkScore(scoreOfPlayer1,scoreOfPlayer2);
            }
            else {
                score = "Win for " + player2;
            }
        }
        return score;
    }

    public static String displayScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        int tempScore;
        score = "";
        for (int i = 0; i <= 1; i++) {
            {
                if (i == 0) {
                    tempScore = scoreOfPlayer1;
                } else {
                    score += "-";
                    tempScore = scoreOfPlayer2;
                }
            }
            switch (tempScore) {
                case 0:
                    score += LOVE;
                    break;
                case 1:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case 3:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score of Player 1:");
        int scoreOfPlayer1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Score of Player 2:");
        int scoreOfPlayer2 = Integer.parseInt(sc.nextLine());
        if (scoreOfPlayer1 >= 4 && scoreOfPlayer2 >= 4){
            System.out.println(TennisGame.checkPlayerWin("Tuan","Tuan",scoreOfPlayer1, scoreOfPlayer2));
        }else if (scoreOfPlayer1 == scoreOfPlayer2){
            System.out.println(TennisGame.checkScore(scoreOfPlayer1, scoreOfPlayer2));
        }else {
            System.out.println(TennisGame.displayScore(scoreOfPlayer1, scoreOfPlayer2));
        }

    }

}


