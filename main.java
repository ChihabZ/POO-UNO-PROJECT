public class main {
    
    
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
            case 2:
            SinglePlayerGame singlePlayerGame = new SinglePlayerGame();
            singlePlayerGame.startSingleGame();
            break;
            default:
            System.out.println("invalid choice.");
            return;

    }
//im gonna create a single player mode.

    }

}
