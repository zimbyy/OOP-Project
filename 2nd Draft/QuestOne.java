import java.util.Random;
import java.util.Scanner;

public class QuestOne {
    public void startQuest() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Kamadan kamadan = new Kamadan();
        
        Enemy[] enemies = {
            new Enemy("Boozy", 100, "Syntax Scramble (0-20 damage)"),
            new Enemy("Sloshed", 80, "Logic Freeze (0-40 damage)"),
            new Enemy("Jager", 70, "Loop Abyss (0-35 damage)")
        };

        for (int i = 0; i < enemies.length; i++) {
            Enemy enemy = enemies[i];
            while (enemy.getHealth() > 0 && kamadan.getHealth() > 0) {
                System.out.println("\nKamadan's HP: " + kamadan.getHealth() + " | Mana: " + kamadan.getMana());
                System.out.println(enemy.getName() + "'s HP: " + enemy.getHealth());
                System.out.println("\nChoose your attack:");
                System.out.println("1. Syntax Sleuth (30 damage, 20 mana)");
                System.out.println("2. Logic Master (40 damage, 30 mana)");
                System.out.println("3. Loop Ninja (30 damage, 20 mana)");

                int choice = scanner.nextInt();
                int kamadDamage;
                int kamadManaCost;

                switch (choice) {
                    case 1:
                        kamadDamage = 30;
                        kamadManaCost = 20;
                        simulateTyping("Kamadan uses Syntax Sleuth! She spots the syntax errors in " + enemy.getName() + "'s wild party code.");
                        break;
                    case 2:
                        kamadDamage = 40;
                        kamadManaCost = 30;
                        simulateTyping("Kamadan uses Logic Master! Her sharp thinking pierces through " + enemy.getName() + "'s chaotic logic.");
                        break;
                    case 3:
                        kamadDamage = 30;
                        kamadManaCost = 20;
                        simulateTyping("Kamadan uses Loop Ninja! She elegantly handles " + enemy.getName() + "'s infinite loops, dodging every trap.");
                        break;
                    default:
                        simulateTyping("Invalid choice! No damage dealt, and " + enemy.getName() + " takes the chance to attack.");
                        continue;
                }

                if (kamadan.getMana() >= kamadManaCost) {
                    enemy.setHealth(enemy.getHealth() - kamadDamage);
                    kamadan.setMana(kamadan.getMana() - kamadManaCost);
                    System.out.println("You deal " + kamadDamage + " damage to " + enemy.getName() + "!");
                } else {
                    System.out.println("Not enough mana! " + enemy.getName() + " takes the chance to attack.");
                }

                if (enemy.getHealth() > 0) {
                    int enemyDamage = random.nextInt((i == 0 ? 21 : (i == 1 ? 41 : 36))); 
                    simulateTyping(enemy.getName() + " uses " + enemy.getSkill() + "! It deals " + enemyDamage + " damage.");
                    kamadan.setHealth(kamadan.getHealth() - enemyDamage);
                }

                // Check if Kamadan is defeated
                if (kamadan.getHealth() <= 0) {
                    simulateTyping("Kamadan collapses to the ground, her vision fading. The laughter of her foes echoes as the screen fades to black...");
                    simulateTyping("GAME OVER.");
                    System.exit(0);
                }
            }

            // After defeating an enemy
            simulateTyping("\nWith one final strike, Kamadan defeats " + enemy.getName() + ". They stagger back, muttering in defeat...");

            // Level-up choice
            System.out.println("You have leveled up! Choose an upgrade:");
            System.out.println("1. Increase MAXIMUM HEALTH (+50)");
            System.out.println("2. Increase MAXIMUM MANA (+50)");

            int upgradeChoice = scanner.nextInt();
            switch (upgradeChoice) {
                case 1:
                    kamadan.setHealth(Math.min(kamadan.getHealth() + 50, 250)); 
                    simulateTyping("Kamadan increases her HEALTH! UPDATED HEALTH: " + kamadan.getHealth());
                    break;
                case 2:
                    kamadan.setMana(Math.min(kamadan.getMana() + 50, 200)); 
                    simulateTyping("Kamadan increases her MANA! UPDATED MANA: " + kamadan.getMana());
                    break;
                default:
                    simulateTyping("Invalid choice! No upgrades applied.");
            }

            if (i < enemies.length - 1) {
                simulateTyping("'You have defeated " + enemy.getName() + ",' a voice announces. 'Prepare for your next challenge: " + enemies[i + 1].getName() + ".'");
            }
        }

        simulateTyping("\nKamadan stands victorious. The streets are quiet now.");
        simulateTyping("She takes a deep breath and prepares for the next trial.");
        scanner.close();
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
