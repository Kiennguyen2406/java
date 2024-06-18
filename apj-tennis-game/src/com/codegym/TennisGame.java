package com.codegym;

public class TennisGame {

    public static final int LOVE_SCORE = 0;
    public static final int FIFTEEN_SCORE = 1;
    public static final int THIRTY_SCORE = 2;
    public static final int FORTY_SCORE = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore;
        if (player1Score == player2Score) {
            score = getScoreForDeuce(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String getScoreForDeuce(int player1Score) {
        String score;
        switch (player1Score) {
            case LOVE_SCORE:
                score = "Love-All";
                break;
            case FIFTEEN_SCORE:
                score = "Fifteen-All";
                break;
            case THIRTY_SCORE:
                score = "Thirty-All";
                break;
            case FORTY_SCORE:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}