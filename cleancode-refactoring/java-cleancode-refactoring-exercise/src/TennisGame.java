public class TennisGame {
    private static int player1Score;
    private static int player2Score;
    public static String getScore(String player1Name, String player2Name, int _player1Score, int _player2Score) {
        updatePlayerScores(_player1Score, _player2Score);
        if (isDraw())
            return getDrawScore();
        String score = "";
        final int LOVE_SCORE = 0;
        int tempScore= LOVE_SCORE;
        if (isWin())
        {
            int minusResult = player1Score-player2Score;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1Score;
                else { score+="-"; tempScore = player2Score;}
                switch(tempScore)
                {
                    case LOVE_SCORE:
                        score+="Love";
                        break;
                    case 1: 
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
    private static void updatePlayerScores(int _player1Score, int _player2Score) {
        player1Score = _player1Score;
        player2Score = _player2Score;
    }
    private static boolean isWin() {
        return player1Score >= 4 || player2Score >= 4;
    }
    private static String getDrawScore() {
        switch (player1Score)
        {
            case 0:
                return  "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }
    private static boolean isDraw() {
        return player1Score == player2Score;
    }
}