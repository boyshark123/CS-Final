public class Main{
    public static void main (String args[]){
        //code 
    ublic static void main(String[] args) {
        // TODO code application logic here
        MIDIPlayer player = new MIDIPlayer();
        
        player.setInstrument (Instruments.GUITAR);
        
        player.playNote(Notes.NOTE_C4, Notes.NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        player.setInstrument(Instruments.TENOR_SAX);
        
        player.playNote(Notes.NOTE_A4, Notes.NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(Notes.NOTE_WHOLE);
        
        player.setInstrument(Instruments.VIOLIN);

        player.playNote(Notes.NOTE_A3, Notes.NOTE_WHOLE, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(Notes.NOTE_WHOLE);
    
    }
    
}
    
    }
}
