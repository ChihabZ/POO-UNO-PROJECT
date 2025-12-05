



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManagement {

    private List<Player> players;
    private Deck deck;
    private int direction = 1;   
    private int current = 0;     
    private Scanner scan = new Scanner(System.in);






    
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
       // 7cards each(tserbi)
for (int i = 0; i < 7; i++) {
    


}

  }

  
  
     private void flipFirstCard() {
        




    
     }

        





    }

    
   
   
   
   
   
   
   
   
   
   
   
   

    
   
   
   
   
   
   
   
   
    // the effect ta3na sma ya effet 3la le prochain ya effet ela jeu g3
    private void applyEffect(repertoir_card card) {

       
    }


   
    // choix de couleur pour wild+4
    private void chooseWildColor(repertoir_card card) {
       
       
    }


    private void nextPlayer() {

       

    }

   
    public Player getCurrentPlayer() {

       
    }







    public RepertoireCard getTopDiscard() {
       

    }







    public boolean isGameOver() {
        


    }







    public void announceWinner() {
       


    }



}








