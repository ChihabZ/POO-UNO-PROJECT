import java.util.Scanner;

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

        
        //menu switch 
        System.out.println("Welcome to the UNO card game!");
        System.out.print("=====menu======: \n1.multiplayer\n2.singleplayer\nChoose an option: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice){
            case 1:
            GameManagement multiplayerGame = new GameManagement();
            multiplayerGame.startGame();
            break;
            
    }
//im gonna create a single player mode.

    }

}
