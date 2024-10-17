public class ThirdStreet extends Kingdom {
    public ThirdStreet() {
        super("Third Street");
    }

    @Override
    public void enter() {
        System.out.println("Welcome to " + name + ", the land of coding challenges!");
        QuestOne quest = new QuestOne();
        quest.startQuest(); // Start the first quest here
    }
}
