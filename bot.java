public class bot extends player {

        public bot(deck Deck) {
            super("BOT");
        }
        @Override
        public card showcards(deck Deck){ 
            // lazam njoz 3la ga3 cards ta3o hata ji allowplay true ida majatch draw 1 
            for (int i = 0; i < getHandSize(); i++) {
                card c = getHand().get(i);
                if (c.allowplay(Deck.getTopDiscard())) {
                    Deck.addtodiscard(c);
                    getHand().remove(i);
                    return c ;
                    
                }
            }
            //ida ma3andoch 
            draw(1);
            return null;
        }




}
