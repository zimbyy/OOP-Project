import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String option;
    boolean isValid = true;
    StoryLine objStoryLine = new StoryLine();
    QuestOne objQuestOne = new QuestOne();
    


                System.out.println("\t\t============================================");
                System.out.println("\t\t||                                        ||");
                System.out.println("\t\t||                                        ||");
                System.out.println("\t\t|| Welcome to No Way Out: The Final Test  ||");
                System.out.println("\t\t||                                        ||");
                System.out.println("\t\t||                                        ||");
                System.out.println("\t\t============================================\n");
                            
   
    do{
        isValid = true;
         try{
    System.out.print("Do you want to enter the game? (Yes/No): ");
    option = scan.nextLine();

    if(option.equalsIgnoreCase("Yes")){
        objStoryLine.prologue();
        objStoryLine.questOne();
        objQuestOne.startQuest();
        
    }else if(option.equalsIgnoreCase("No")){
        System.out.print("You've escaped the No Way Out World");
        break;
    }else{
        System.out.println("Invalid Input. Enter either YES/NO only.\n");
        isValid = false;
    }
    
    }catch(Exception e){
            scan.nextLine();
    }
    
    }while(isValid == false);

    scan.close();
    
    }
}
        
