import java.util.concurrent.TimeUnit;

public class StoryLine {

    public void simulateTyping(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(5); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void prologue() {

        simulateTyping("\t==============================================================\n");
        simulateTyping("\t||     You have successfully entered the game as \"KAMADA\".   ||\n");
        simulateTyping("\t==============================================================\n\n");

        simulateTyping("No Way Out: The Final Test\n");

        simulateTyping(
            "\tIn the stillness of the night, Kamadan, a diligent student struggling with her OOP\n" +
            "studies, sat in a cluttered room, illuminated only by the soft glow of her computer screen\n" +
            "as fatigue weighed heavily on her eyelids at midnight. Desperate for a brief distraction,\n" +
            "she searched for online games and found one titled 'No Way Out: The Final Test,' which promised\n" +
            "adventure and escape. Intrigued, she clicked the link, and suddenly, her screen burst into\n" +
            "blinding white light, causing her heart to race with confusion and fear.\n\n"
        );

        simulateTyping(
            "Minutes passed in eerie silence, and when her screen showed no signs of life, she\n" +
            "instinctively pressed the \"Esc\" key, only to see a chilling message flicker: \"There is no\n" +
            "escaping now.\" Panic surged as she tried to turn off the AVR, but it was too late. The light\n" +
            "from her monitor enveloped her, sucking her into the game. \"Welcome to CIT-U, player 5!\"\n" +
            "the screen announced, marking the start of Kamadan's challenging journey through three\n" +
            "connected kingdoms, each filled with secrets and trials that would test her coding skills,\n" +
            "problem-solving abilities, and resilience.\n\n"
        );

        simulateTyping(
            "Kamadan found herself in the dimly lit alleys of Third Street, where the smell of alcohol\n" +
            "and sadness filled the air. Due to her curiosity, she started to wander around the place and\n" +
            "saw a big piece of vandalism on the wall with the saying, \"Study hard, party harder!\"\n" +
            "Here, she will encounter her first challenge: the Drunkard Minions—three chaotic foes who\n" +
            "were once students like her, now trapped in a cycle of partying and regret.\n\n"
        );

        simulateTyping(
            "As Kamadan navigated the dim streets of Third Street, her heart raced with nervousness amid\n" +
            "the thick air of alcohol and regret. She spotted three familiar figures: Boozy, Sloshed, and\n" +
            "Jager. Once fellow students, now trapped in a cycle of nightlife and despair. Just as she\n" +
            "approached, a large holographic screen lit up, presenting her first quest: \"Escape the Haze of Regret.\"\n\n"
        );
    }

    public void questOne() {
        simulateTyping("==========================================================================================\n");
        simulateTyping("||                            Quest #1: Escape the Haze of Regret.                       ||\n");
        simulateTyping("||        Objective: You must defeat the three minions by tackling coding challenges.    ||\n");
        simulateTyping("||                Each minion represents a coding struggle from your past.               ||\n");
        simulateTyping("==========================================================================================\n\n");

        simulateTyping("Success would not only mean overcoming challenges but also offer a chance to escape this strange game world.\n\n");
    }
}
