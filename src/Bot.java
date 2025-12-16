
	class bot extends player {

	    public bot(String name, Deck deck) {
	        super(name, deck); 
	    }

	    @Override
	    public void showcards() {
	        System.out.println("\n" + getName() + "'s turn:");
	        Card top = deck.getTopDiscard();
	        boolean played = false;

	        List<card> hand = new ArrayList<>(super.hand); 
	        for (int i = 0; i < hand.size(); i++) {
	            card current = hand.get(i);
	            if (current.allowplay(top)) {
	                deck.discard(current);
	                super.hand.remove(current); 
	                System.out.println(getName() + " played: " + current);
	                played = true;
	                break; 
	            }
	        }

	        if (!played) {
	            super.draw(1);
	            System.out.println(getName() + " drew a card.");
	        }

	        if (super.hand.size() == 1) {
	            System.out.println(getName() + " says UNO!");
	        }
	    }
	}

	

}
