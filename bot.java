public class bot extends player {

        public bot(String name) {
            super("BOT");
        }
        
        public bot(String name, deck d) {
            super("BOT", d);
        }
        
        @Override
        public card showcards(deck Deck){ 
            // lazam njoz 3la ga3 cards ta3o hata ji allowplay true ida majatch draw 1 
            for (int i = 0; i < getHandSize(); i++) {
                card c = getHand().get(i);
                if (c.allowplay(Deck.getTopDiscard())) {
                    Deck.addtodiscard(c);
                    getHand().remove(i);
                    if (c instanceof nonregular){
                    System.out.println( "\n"+toString(c)+((nonregular)c).gettype());}
                    else {
                        System.out.println( toString(c)+ ((regular)c).getnumber()+" "+((regular)c).getColor());
                    }
                    if (getHandSize() == 1){
                        System.out.println(getName() + " says: UNO!");
                    }
                    return c ;
                    
                }
            }
            //ida ma3andoch 
            System.out.println(getName() + " drew a card");
            draw(1);
            return null;
        }

public String toString(card c) {
    String RED = "\u001B[31m";
String GREEN = "\u001B[32m";
String YELLOW = "\u001B[33m";
String BLUE = "\u001B[34m";
  
    switch(c.getColor()){
     
        case red :
          return RED + "\n BOT played "  ;
        case blue :
         return BLUE + "\n BOT played " ;
        case green :
         return GREEN + "\n BOT played " ;
        case yellow :
         return YELLOW + "BOT played ";
         default:
            return "\n BOT played " ;}
    }

}
