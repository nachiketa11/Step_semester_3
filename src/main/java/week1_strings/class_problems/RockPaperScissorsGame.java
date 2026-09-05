package week1_strings.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static String playRound(String playerMove, String computerMove) {
        String p = playerMove.trim().substring(0, 1).toUpperCase() + playerMove.trim().substring(1).toLowerCase();
        String c = computerMove.trim().substring(0, 1).toUpperCase() + computerMove.trim().substring(1).toLowerCase();

        if (p.equals(c)) {
            return "Draw";
        }

        if ((p.equals("Rock") && c.equals("Scissors")) ||
            (p.equals("Paper") && c.equals("Rock")) ||
            (p.equals("Scissors") && c.equals("Paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random(42); // fixed seed for reproducible test demo
        String[] predefinedPlayerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};

        int wins = 0;
        int losses = 0;
        int draws = 0;
        int rounds = 5;

        System.out.println("=== Rock-Paper-Scissors Game ===");
        System.out.printf("%-10s | %-12s | %-14s | %-15s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < rounds; i++) {
            String playerMove = predefinedPlayerMoves[i];
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMove, computerMove);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.printf("Round %-4d | %-12s | %-14s | %-15s%n", (i + 1), playerMove, computerMove, result);
        }

        double winPct = ((double) wins / rounds) * 100.0;
        System.out.println("---------------------------------------------------------");
        System.out.printf("Final Summary: Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, winPct);
    }
}
