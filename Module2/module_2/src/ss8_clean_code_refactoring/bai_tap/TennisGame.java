package ss8_clean_code_refactoring.bai_tap;

import java.util.ArrayList;

public class TennisGame {
    private static String score;
    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";

    public static String checkScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        if (scoreOfPlayer1 == scoreOfPlayer2) {
            switch (scoreOfPlayer1) {
                case 0:
                    score = LOVE + "-All";
                    break;
                case 1:
                    score = FIFTEEN + "-All";
                    break;
                case 2:
                    score = THIRTY + "-All";
                    break;
                case 3:
                    score = FORTY + "-All";
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
            } else {
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
        System.out.println(TennisGame.checkScore(3, 3));
        System.out.println(TennisGame.checkPlayerWin(6, 4));
        System.out.println(TennisGame.displayScore(2, 3));
    }

}


