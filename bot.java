
Card top = deck.discardpile.get(deck.discardpile.size() - 1);

boolean played = false;

for (int i = 0; i < hand.size(); i++) {

    Card current = hand.get(i);

    if (current.allowplay(top)) {

    
        deck.discardpile.add(current);
        hand.remove(i);

        System.out.println("BOT played: " + current);
        played = true;
        break; 
    }
}

if (!played) {
    deck.drawCard(this); 
}

if (hand.size() == 1) {
    System.out.println("BOT says UNO!");
}
