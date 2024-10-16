import java.util.*;
import java.util.Random;

class QuestOne {
    public void startQuest() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int kamadHealth = 250;
        int kamadMana = 200;


        int[][] enemies = {
            {100, 0, 0},
            {80, 0, 0},
            {70, 0, 0}
        };

        String[] enemyNames = {"Boozy", "Sloshed", "Jager"};
        String[] enemySkills = {
            "Syntax Scramble (0-20 damage)",
            "Logic Freeze (0-40 damage)",
            "Loop Abyss (0-35 damage)"
        };

        for (int i = 0; i < enemies.length; i++) {
            while (enemies[i][0] > 0 && kamadHealth > 0) {
                System.out.println("\nKamadan's HP: " + kamadHealth + " | Mana: " + kamadMana);
                System.out.println(enemyNames[i] + "'s HP: " + enemies[i][0]);
                System.out.println("\nChoose your attack:");
                System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                System.out.println("2. Logic Master (40 damage, 30 mana)");
                System.out.println("3. Loop Ninja (30 damage, 20 mana)");

                int choice = scanner.nextInt();
                int kamadDamage = 0;
                int kamadManaCost = 0;

                switch (choice) {
                    case 1:
                        kamadDamage = 30;
                        kamadManaCost = 20;
                        simulateTyping("Kamadan uses Syntax Sleuth! She spots the syntax errors in " + enemyNames[i] + "'s wild party code.");
                        break;
                    case 2:
                        kamadDamage = 40;
                        kamadManaCost = 30;
                        simulateTyping("Kamadan uses Logic Master! Her sharp thinking pierces through " + enemyNames[i] + "'s chaotic logic.");
                        break;
                    case 3:
                        kamadDamage = 30;
                        kamadManaCost = 20;
                        simulateTyping("Kamadan uses Loop Ninja! She elegantly handles " + enemyNames[i] + "'s infinite loops, dodging every trap.");
                        break;
                    default:
                        simulateTyping("Invalid choice! No damage dealt, and " + enemyNames[i] + " takes the chance to attack.");
                        continue;
                }

                if (kamadMana >= kamadManaCost) {
                    enemies[i][0] -= kamadDamage;
                    kamadMana -= kamadManaCost;
                    System.out.println("You deal " + kamadDamage + " damage to " + enemyNames[i] + "!");
                } else {
                    System.out.println("Not enough mana! " + enemyNames[i] + " takes the chance to attack.");
                }

                if (enemies[i][0] > 0) {
                    int enemyDamage = random.nextInt((i == 0 ? 21 : (i == 1 ? 41 : 36)));
                    simulateTyping(enemyNames[i] + " uses " + enemySkills[i] + "! It deals " + enemyDamage + " damage.");
                    kamadHealth -= enemyDamage;
                }

                if (kamadHealth <= 0) {
                    simulateTyping("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                    simulateTyping("GAME OVER.");
                    System.exit(0);
                }
            }

            simulateTyping("\nWith one final strike, Kamadan defeats " + enemyNames[i] + ". They stagger back, muttering in defeat...");

            System.out.println("You have leveled up! Choose an upgrade:");
            System.out.println("1. Increase MAXIMUM HEALTH (+50)");
            System.out.println("2. Increase MAXIMUM MANA (+50)");

            int upgradeChoice = scanner.nextInt();
            switch (upgradeChoice) {
                case 1:
                    kamadHealth += 50;
                    if(kamadHealth > 250){
                        kamadHealth = 250;
                    }
                    simulateTyping("Kamadan increases her HEALTH! UPDATED HEALTH: " + kamadHealth + " ");
                    break;
                case 2:
                    kamadMana += 50;
                    if(kamadMana > 250){
                        kamadMana = 250;
                    }
                    simulateTyping("Kamadan increases her  MANA! UPDATED MANA: " + kamadMana + " ");
                    break;
                default:
                    simulateTyping("Invalid choice! No upgrades applied.");
            }

            if (i < enemies.length - 1) {
                simulateTyping("'You have defeated " + enemyNames[i] + ",' a voice announces. 'Prepare for your next challenge: " + enemyNames[i + 1] + ".'");
            }
        }

        simulateTyping("\nKamadan stands victorious. The streets are quiet now.");
        simulateTyping("She takes a deep breath and prepares for the next trial.");
    }

    private void simulateTyping(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.err.println("An error occurred during the delay.");
            }
        }
        System.out.println();
    }
}
