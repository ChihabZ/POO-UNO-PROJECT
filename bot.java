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
                    System.out.println(getName() + " played " + c);
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




}
