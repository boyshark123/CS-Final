//package hashmap;
import java.util.HashMap;
import java.util.Scanner;

public class hashmap { 
    
    public static void main(String[] args) {
        
        HashMap<String, String> places = new HashMap<String, String>();
        HashMap<String, String[]> moves = new HashMap<String, String[]>();

        // List the rooms
<<<<<<< HEAD
    
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
        moves.put("exhibit 1", room1moves);
        
        // Chose exhibit 2
        String[] room2moves = {"exhibit1", "exhibit3"}; 
        moves.put("exhibit 2", room2moves);
        
        // Chose exhibit 3
        String[] room3moves = {"exhibit2", "exhibit4"}; 
        moves.put("exhibit 3", room3moves);
        
        // Chose exhibit 4
        String[] room4moves = {"exhibit3", "end"}; 
        moves.put("exhibit 4", room4moves);

        // Starting of zoo
        String currentRoom = "start";
        
        // Loop that takes locations until they reach the end

        while(!currentRoom.equals("end")){
            String story = places.get(currentRoom);
            String[] nextSteps = moves.get(currentRoom);

            // Prompt user input
            System.out.println("LOCATION: " + currentRoom);
            System.out.println("What room will you enter?");

            // Display room options
            for (int i = 0; i < nextSteps.length; i++){
                System.out.println("- " + nextSteps[i]);
            }

            // Accept user input
            Scanner currentRoomLocation = new Scanner(System.in);
            System.out.println("Where do you wish to go?");
            currentRoom = currentRoomLocation.nextLine();

            if (currentRoom.equals("start")){
                System.out.println();
            } else if(currentRoom.equals("exhibit1")){
                System.out.println();
            } else if(currentRoom.equals("exhibit2")){
                System.out.println();
            } else if(currentRoom.equals("exhibit3")){
                System.out.println();
            } else if(currentRoom.equals("exhibit4")){
                System.out.println();
            } else {
                System.out.println("No information on this exhibit.");
            }

            // New line for organziation
            System.out.println();

            // If the current room is end
            if(currentRoom.equals("end")){
                System.out.println("You have reached the end of the zoo");
            }
        }
        }
}

