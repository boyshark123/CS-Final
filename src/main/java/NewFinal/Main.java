package NewFinal;
import java.util.HashMap;
import java.util.Scanner;
import edu.princeton.cs.algs4.*;
import exhibits.exhibits;

public class Main {
public static void main(String[] args) {
        
        HashMap<String, String> places = new HashMap<String, String>();
        HashMap<String, String[]> moves = new HashMap<String, String[]>();

        // List the room
        places.put("start", "Welcome to our Fantastic Zoo! Here are some of our newest exhibits!");
        places.put("exhibit1", "Witness our time-limited, Gelada Baboons! Week Only Event!");
        places.put("exhibit2", "Be careful! You are about to enter the rhino's territory! Observe this majestic creature, and stay on her good side!");
        places.put("exhibit3", "Behind the trees you may see the king of the jungle prowling, resist the urge to feel his mane, he scratches!");
        places.put("exhibit4", "Stand Clear! Some of the biggest animals are walking, but they're nice! Come pet an elephant today.");
        places.put("end", "This is a sneak peak to many of our many other exhibits. Come by Today!");
                
        // Establish moves
        String[] startMoves = {"start", "exhibit1"}; 
        moves.put("start", startMoves);
     
        // Chose exhibit 1
        String[] room1moves = {"start", "exhibit2"}; 
        moves.put("exhibit1", room1moves);
        
        // Chose exhibit 2
        String[] room2moves = {"exhibit1", "exhibit3"}; 
        moves.put("exhibit2", room2moves);
        
        // Chose exhibit 3
        String[] room3moves = {"exhibit2", "exhibit4"}; 
        moves.put("exhibit3", room3moves);
        
        // Chose exhibit 4
        String[] room4moves = {"exhibit3", "end"}; 
        moves.put("exhibit4", room4moves);

        // Starting of zoo
        String currentRoom = "start";
        
        // object declaration
        exhibits animalExhibitInformation = new exhibits();
        
        // Loop that takes locations until they reach the end
        while(!currentRoom.equals("end")){
            String story = places.get(currentRoom);
            String[] nextSteps = moves.get(currentRoom);

            // Prompt user input
            System.out.println("LOCATION: " + currentRoom);

            // Display room options
            for (int i = 0; i < nextSteps.length; i++){
                System.out.println("- " + nextSteps[i]);
            }

            // Accept user input
            System.out.println("Where do you wish to go?");
            Scanner currentRoomLocation = new Scanner(System.in);
            
            currentRoom = currentRoomLocation.nextLine();
            

            if (currentRoom.equals("start")){
               animalExhibitInformation.startPara();
                
            } else if(currentRoom.equals("exhibit1")){
               animalExhibitInformation.exhibit1Para();
                
            } else if(currentRoom.equals("exhibit2")){
                animalExhibitInformation.exhibit2Para();
           
                
            } else if(currentRoom.equals("exhibit3")){
                animalExhibitInformation.exhibit3Para();
               
                
            } else if(currentRoom.equals("exhibit4")){
               animalExhibitInformation.exhibit4Para();
                
                
            } else if(currentRoom.equals("end")){
                animalExhibitInformation.endPara();
                
                
            } else {
                System.out.println("No information on this exhibit.");
            }

            // New line for organziation
            System.out.println(currentRoom);
        }
        }
    
}
