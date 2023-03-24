public class HighScore {
    public static void main(String[] args) {

        int highScore = 0;
        int[] score = { 10000, 20000, 3000, 4000 };
        // System.out.println(score);
        for (int i = 0; i < score.length; i++) {
            System.out.print("Here are the scores1:" + score[i]);
            if (score[i] > highScore) {
                // System.out.println(score[i+1]);
                // System.out.println("HI");
                highScore = score[i];

                // System.out.println(highScore);
            }

        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        // }    System.out.println(highScore);}
    }
}

    // public static int getMaxValue(int score1, int score2) {
    //     if (score1 > score2) {
    //         return score2;
    //     }
    // }



