import java.util.ArrayList;
import java.util.List;

public class main {
     private static String[][] backofcard = new String[9][8];

static {
    // Haut et bas
    for (int i = 0; i < 8; i++) {
        backofcard[0][i] = "-";
        backofcard[8][i] = "-";
    }

    // Côtés
    for (int j = 0; j < 9; j++) {
        backofcard[j][0] = "|";
        backofcard[j][7] = "|";
    }
    for (int i = 1; i <= 7; i++) {
    backofcard[i][2] = "U";
    backofcard[i][3] = "N";
    backofcard[i][4] = "N";
    backofcard[i][5] = "O";
}
}
public static void displaybackofcard(){
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 8; j++) {
            System.out.print(backofcard[i][j]);
        }
        System.out.println();
    }
}



    
    public static void main(String[] args) {

     List<String> players = new ArrayList<>();




        //menu switch 
        System.out.println("Welcome to the UNO card game!");
        System.out.print("=====menu======: \n1.multiplayer\n2.singleplayer\nChoose an option: ");
        
        int option;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        option = scanner.nextInt(); 
        switch(option) {
            case 1:
                System.out.println("multiplayer mode selected.");
            System.out.println("how many players ? ");
            int numPlayers = scanner.nextInt();    
            for (int i = 1; i <= numPlayers; i++) {
                System.out.print("Enter name for Player " + i + ": ");
                String playerName = scanner.next();
                players.add(playerName);
            }
            gameManagement game = new gameManagement(players);
            
            // n7ato la 1ere carte f discard pile
            card firstCard = game.getDeck().drawplus(1);
            game.getDeck().addtodiscard(firstCard);
            System.out.println("First card on discard:");
            firstCard.logo();
            if (firstCard instanceof nonregular) {
                nonregular nr = (nonregular) firstCard;
                if (nr.gettype() == type.wild || nr.gettype() == type.wild_4_plus) {
                    game.chooseWildColor(firstCard);
                }
            }
            
            // Game loop where players take turns w kda
            while (!game.isGameOver()) {
                player current = game.getCurrentPlayer();
                System.out.println("\n--- " + current.getName() + "'s turn ---");
                
                // Show top discard
                card topDiscard = game.getTopDiscard();
                System.out.println("Top discard:");
                topDiscard.logo();
                
                // hna on controle le tour pour chaque joueur
                card playedCard = current.showcards(game.getDeck());
                if (playedCard != null) {
                    game.applyEffect(playedCard);
                }
                
                game.nextPlayer();
            }
            
            game.announceWinner();
            break;
        
            
}
}// ya khawti rni khaletha, zdt bzaf 3fays hhhhhh mais mzal ma drt bot 
}
