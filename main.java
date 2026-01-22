import java.util.ArrayList;
import java.util.List;
//      private static String[][] backofcard = new String[9][8];

// static {
//     // Haut et bas
//     for (int i = 0; i < 8; i++) {
//         backofcard[0][i] = " - ";
//         backofcard[8][i] = " - ";
//     }

//     // Côtés
//     for (int j = 0; j < 9; j++) {
//         backofcard[j][0] = "|";
//         backofcard[j][7] = "|";
//     }
//     for (int i = 1; i <= 7; i++) {
//     backofcard[i][2] = "U";
//     backofcard[i][3] = "N";
//     backofcard[i][4] = "N";
//     backofcard[i][5] = "O";
// }
// }
// public static void displaybackofcard(){
//     for (int i = 0; i < 9; i++) {
//         for (int j = 0; j < 8; j++) {
//             System.out.print(backofcard[i][j]);
//         }
//         System.out.println();
//     }
// }
public class main {


// public class WelcomeUno {

    // ANSI colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";

    public static void showWelcome() {

        System.out.println("                    ╔════════════════════════════════════════════╗");
        System.out.println("                    ║                                            ║");
        System.out.println("                    ║        ██    ██ ███    ██  ██████          ║");
        System.out.println("                    ║        ██    ██ ████   ██ ██    ██         ║");
        System.out.println("                    ║        ██    ██ ██ ██  ██ ██    ██         ║");
        System.out.println("                    ║        ██    ██ ██  ██ ██ ██    ██         ║");
        System.out.println("                    ║         ██████  ██   ████  ██████          ║");
        System.out.println("                    ║                                            ║");
        System.out.println("                    ║                                            ║");
        System.out.println("                    ║ "         +RED+ "           W E L C O M E"+ BLUE+"   T O " +WHITE+"            ║");
        System.out.println("                    ║             " +GREEN+ " T H E   G A M E" +WHITE+"               ║");
        System.out.println("                    ║                                            ║");
        System.out.println("                    "+WHITE+"║"+"    " + RED + "■■" + GREEN + "■■" + YELLOW + "■■" + BLUE + "■■" + YELLOW + "   LET'S PLAY!   " +
                           BLUE + "■■" + YELLOW + "■■" + GREEN + "■■" + RED + "■■" + WHITE + "       ║");
                          
        System.out.println("                    ║                                            ║");
        System.out.println("                    ╚════════════════════════════════════════════╝" + RESET);
    }

    
    public static void main(String[] args) {

     List<String> players = new ArrayList<>();



        showWelcome();
        //menu switch 
        //System.out.println("                          WELCOME TO THE UNO CARD CONSOLE GAME!");
        System.out.print("                            ==========  MENU  ===========        \n                                    1.Multiplayer\n                                    2.Singleplayer\n  Choose an option: ");
        
        int option;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        option = scanner.nextInt(); 
        switch(option) {
            case 1:
                System.out.println("Multiplayer mode selected.");
            System.out.println("How many players ? ");
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
        
          case 2:
    System.out.println("Singleplayer mode selected.");
    
    gameManagement game2 = new gameManagement();
    
    // n7ato la 1ere carte f discard pile
    card firstCard2 = game2.getDeck().drawplus(1);
    game2.getDeck().addtodiscard(firstCard2);
    System.out.println("First card on discard:");
    firstCard2.logo();
    if (firstCard2 instanceof nonregular) {
        nonregular nr = (nonregular) firstCard2;
        if (nr.gettype() == type.wild || nr.gettype() == type.wild_4_plus) {
            game2.chooseWildColor(firstCard2);
        }
    }
    
    // Game loop where players take turns w kda
    while (!game2.isGameOver()) {
        player current = game2.getCurrentPlayer();
        System.out.println("\n--- " + current.getName() + "'s turn ---");
        
        // Show top discard
        card topDiscard2 = game2.getTopDiscard();
        System.out.println("Top discard:");
        topDiscard2.logo();
        
        // hna on controle le tour pour chaque joueur
        card playedCard2 = current.showcards(game2.getDeck());
        if (playedCard2 != null) {
            game2.applyEffect(playedCard2);
        }
        
        game2.nextPlayer();
    }
    
    game2.announceWinner();
    break;  
}
    }

}// ya khawti rni khaletha, zdt bzaf 3fays hhhhhh mais mzal ma drt bot 

