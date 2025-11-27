



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManagement {

    private List<Player> players;
    private Deck deck;
    private int direction = 1;   /
    private int current = 0;     
    private Scanner sc = new Scanner(System.in);

    
    // Constructeur t3 les joueues w g3 wch ys79o
    public GameManagement(List<String> names) {
        deck = new Deck();
        players = new ArrayList<>();

        for (String n : names) {
            players.add(new Player(n));
        }

        initialDeal();                 // distribuer 7 cartes q chaque player
        flipFirstCard();               // first card after initializing goes to the table, a part +4 ofc
    }

    // voila le methode de distribution elewla g3
    private void initialDeal() {
        for (Player p : players) {
            for (int i = 0; i < 7; i++) {
                p.drawCard(deck);
            }
        }
    }

   
    private void flipFirstCard() {
        repertoir_card first = deck.draw();

        // pour assurer bli manbdawch b +4
        while (first.getType() == Type.plus4) {
            deck.discard(first);
            first = deck.draw();
        }

        deck.discard(first);
    }

    
    // play ur turn sma fiha pioche w discard w effect
    public void playTurn(int cardIndex) {
        Player p = players.get(current);
        repertoir_card top = deck.topDiscard();

        repertoir_card played = p.playCard(cardIndex, top);

        if (played == null) {
            System.out.println(p.getName() + " pioche une carte");
            p.drawCard(deck);
        } else {
            deck.discard(played);
            applyEffect(played);
        }

        nextPlayer();
    }

    
    // the effect ta3na sma ya effet 3la le prochain ya effet ela jeu g3
    private void applyEffect(repertoir_card card) {

        switch (card.getType()) {
            case skip -> nextPlayer();
            case reverse -> direction *= -1;
            case plus2 -> {
                nextPlayer();// hdi sma 3ndna double nextplayer bch t3 +2 mayl3bch
                players.get(current).drawCard(deck);
                players.get(current).drawCard(deck);
            }
            case plus4 -> {
                nextPlayer();//same as +2, 7bibna mayl3bch
                for (int i = 0; i < 4; i++) players.get(current).drawCard(deck);
                chooseWildColor(card);
            }
            case chng -> chooseWildColor(card);  
            // hna c'est une peu speciale, nkhyro la couleur mor discard d'un wild 
            default -> {}
        }
    }

    // ----------------------------
    // Choix de couleur pour Wild / +4
    private void chooseWildColor(repertoir_card card) {
        System.out.println("played a wild card ! choose a color :");
        System.out.println("0 : RED, 1 : BLUE, 2 : YELLOW, 3 : GREEN");

        int colorChoice = sc.nextInt();
        switch (colorChoice) {
            case 0 -> card.setColour(Colour.red);
            case 1 -> card.setColour(Colour.blue);
            case 2 -> card.setColour(Colour.yellow);
            case 3 -> card.setColour(Colour.green);
            default -> card.setColour(Colour.red);
        }

        System.out.println("La couleur choisie est : " + card.getColour());
    }

   
    private void nextPlayer() {
        current = (current + direction + players.size()) % players.size();
    }

    // ----------------------------
    public Player getCurrentPlayer() {
        return players.get(current);
    }

    public RepertoireCard getTopDiscard() {
        return deck.topDiscard();
    }

    public boolean isGameOver() {
        for (Player p : players) {
            if (p.getHand().isEmpty()) return true;
        }
        return false;
    }

    public void announceWinner() {
        for (Player p : players) {
            if (p.getHand().isEmpty()) {
                System.out.println("and the winner is : " + p.getName() + " !");
                return;
            }
        }
    }
}








