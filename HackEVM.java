import java.util.Scanner;

public class HackEVM {
    private static int votesA = 0;
    private static int votesB = 0;
    private static int votesC = 0;
    private static int totalVotes = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cast Vote");
            System.out.println("2. Count Votes of Individual");
            System.out.println("3. Count All Votes");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    castVote();
                    break;
                case 2:
                    countVotesOfIndividual();
                    break;
                case 3:
                    countAllVotes();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void castVote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the candidate (A/B/C): ");
        String candidate = scanner.nextLine().toUpperCase();

        if (!candidate.equals("A") && !candidate.equals("B") && !candidate.equals("C")) {
            System.out.println("Invalid candidate.");
            return;
        }

        if ((totalVotes + 1) % 5 == 0 || (totalVotes + 1) % 7 == 0) {
            votesB++;
        } else {
            switch (candidate) {
                case "A":
                    votesA++;
                    break;
                case "B":
                    votesB++;
                    break;
                case "C":
                    votesC++;
                    break;
            }
        }

        totalVotes++;
        System.out.println("Vote casted for candidate " + candidate);
    }

    private static void countVotesOfIndividual() {
        System.out.println("Candidate A has " + votesA + " votes.");
        System.out.println("Candidate B has " + votesB + " votes.");
        System.out.println("Candidate C has " + votesC + " votes.");
    }

    private static void countAllVotes() {
        System.out.println("Total votes casted: " + totalVotes);
    }

    private static void generateReport() {
        System.out.println("Candidates\t|\tVotes\t|\tTotal Votes");
        System.out.println("---------------------------------------------");
        System.out.println("A\t\t|\t" + votesA + "\t|\t" + totalVotes);
        System.out.println("B\t\t|\t" + votesB + "\t|\t" + totalVotes);
        System.out.println("C\t\t|\t" + votesC + "\t|\t" + totalVotes);
        System.out.println("---------------------------------------------");
        System.out.println("Total: " + totalVotes);
        String winner = getWinner();
        System.out.println("Winner: " + winner);
    }

    private static String getWinner() {
        return (votesA > votesB && votesA > votesC) ? "A" :
         (votesB > votesA && votesB > votesC) ? "B" : "C";
    }
}
