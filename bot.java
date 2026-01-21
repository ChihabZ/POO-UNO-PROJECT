public class bot extends player {

        public Bot(Deck deck) {
            super("BOT" , deck);
        }
        @Override
        public void showcards(Deck deck){ 
            // lazam njoz 3la ga3 cards ta3o hata ji allowplay true ida majatch draw 1 
            for (int i = 0; i < hand.size(); i++) {
                Card c = hand.get(i);
                if (c.allowplay(top)) {
                    deck.discadpile.add(c);
                    hand.remove(i);
                    return ;
                }
            }
            //ida ma3andoch 
            draw(1);
        }




}
