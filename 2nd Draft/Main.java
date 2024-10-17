import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StoryLine objStoryLine = new StoryLine();
        QuestOne objQuestOne = new QuestOne();

        System.out.println("\t\t============================================");
        System.out.println("\t\t|| Welcome to No Way Out: The Final Test  ||");
        System.out.println("\t\t============================================\n");

        while (true) {
            System.out.print("Do you want to enter the game? (Yes/No): ");
            String option = scan.nextLine().trim();

            if (option.equalsIgnoreCase("Yes")) {
                objStoryLine.prologue();
                objStoryLine.questOne();
                objQuestOne.startQuest();
                break;  
            } else if (option.equalsIgnoreCase("No")) {
                System.out.print("You've escaped the No Way Out World.");
                break;  
            } else {
                System.out.println("Invalid Input. Enter either YES/NO only.\n");
            }
        }

        scan.close();
    }
}








