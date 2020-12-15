//package hashmap;
import java.util.HashMap;
import java.util.Scanner;
import edu.princeton.cs.algs4.*;


public class hashmap { 
    
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

        // Paragraph exhibits
        String entrancePara = "'The Entrance to the Totally Real Zoo is a massive stone archway, clearly visible even through the massive crowds milling in and out of it’s gates. You have to cross a bridge painted with animal murals to reach it. There’s multiple children crying somewhere.  What a normal day at the zoo.''";
        String baboonPara = "'The Baboons have their own exhibit in the baboon house. You usually save it for last, since no amount of deep cleaning can make it smell like anything less than the collective crap of two dozen monkeys. You end up getting into a staring contest with a baboon, who laughs and claps his hands when you break eye contact first.''";
        String elephantPara = "'You think the Elephants look sad. Their pen is relatively small and dusty, sparsely vegetated and with a lake barely big enough for two of them. You used to like to think that the only two elephants at this zoo were lovers, because that way they would always keep the company of someone they love. Then you read the signs and found out they were brothers. They trumpet to let you know they still appreciate the thought'";
        String rhinoPara = "'Rhinos are weird animals, kept in dusty old pens like the Elephant’s. A few Onyx’s mill around with them. You wonder what it’d be like to have a toenail growing on your forehead. Then you stop because that’s gross. The rhino makes a sound and you startle. You’ve never heard the noises they make before. It somehow sounds like a dolphin imitating a dog.'";
        String lionsPara = "'The lions laze about in the large series of enclosures commonly called the Big Cat House. Two cubs fight with one another, only torn away from biting at each others tails when their father lets out a roar. A pride of lionesses sits and watches. You don’t like thinking about lion prides.'";
        String leavingPara = "'“You say goodbye to the Baboons and the Apes and the Orangutang sitting in a corner who refuses to turn around. You say goodbye to the Elephants and Rhinos and Hippos who clearly don’t want to make any appearances today. You give a quick wave to the lions, because they’re cats and couldn’t care less. You say goodbye to the stone archway as you rejoin the massive, milling crowds, headed back to a parking lot where you’ll surely get lost for 15 minutes trying to find your car. What a normal day at the zoo!'";

        // object declaration
        Exhibits animalExhibitInformation = new Exhibits();
        
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
                System.out.println(entrancePara);
            } else if(currentRoom.equals("exhibit1")){
                System.out.println(baboonPara);
            } else if(currentRoom.equals("exhibit2")){
                System.out.println(elephantPara);
            } else if(currentRoom.equals("exhibit3")){
                System.out.println(rhinoPara);
            } else if(currentRoom.equals("exhibit4")){
                System.out.println(lionsPara);
            } else if(currentRoom.equals("end")){
                System.out.println(leavingPara);
            } else {
                System.out.println("No information on this exhibit.");
            }

            // New line for organziation
            System.out.println();
        }
        }
}

