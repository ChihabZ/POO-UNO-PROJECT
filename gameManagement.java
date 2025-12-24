



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gameManagement {

    private final List<player> players;
    private  deck deck;
    private int direction = 1;   
    private int current = 0;     
    private Scanner scan = new Scanner(System.in);






    
    // Constructeur t3 les joueues w g3 wch ys79o
   
    public gameManagement(List<String> names) {
       deck deck = new deck();
        players = new ArrayList<>();

        for (String n : names) {
            players.add(new player(n));
        }

        initialDeal();                 // distribuer 7 cartes q chaque player
                       // first card after initializing goes to the table, a part +4 ofc
    }

    // voila le methode de distribution elewla g3





   
   
   
    private void initialDeal() {
       // 7cards each(tserbi)

 for (int index = 0; index < players.size(); index++) {
    
 
       for (int i = 0; i < 7; i++) {
    
    players.get(index).draw(1);

       }
       }
        }//end class initialDeal


  
     

        

   
   
   
    // the effect ta3na sma ya effet 3la le prochain ya effet ela jeu g3
    private void applyEffect(card card) {

       if(card.gettype() == card.Type.SKIP){

           nextPlayer();
         }else if(card.gettype() == card.type.revers){
              direction *= -1;
            }else if(this.gettype()==card.type.plus2){
              nextPlayer();
              getCurrentPlayer().draw(2);
            }else if(card.gettype()==card.type.wild_4_plus){
              nextPlayer();
              getCurrentPlayer().draw(4);
              chooseWildColor(card);
            }else if(card.gettype() == card.type.wild){
              chooseWildColor(card); 
            } 
    
     }


   
    // choix de couleur pour wild+4
    private void chooseWildColor(card card) {
       
    System.out.println("choose a color: 1.RED 2.BLUE 3.GREEN 4.YELLOW");
    int choice = scan.nextInt();
    switch(choice){
        case 1:
        card.setColor(card.Color.red);
        break;
        case 2:
        card.setColor(card.Color.blue);
        break;
        case 3:
        card.setColor(card.Color.green);
        break;
        case 4:
        card.setColor(card.Color.yellow);
        break;
        default:
        System.out.println("invalid choice, color set to REDv by default");
        card.setColor(card.Color.red);
        break;
       
    }// end switch
    }// end choose wild color


    private void nextPlayer() {
        current = (current + direction + players.size()) % players.size();


       

    }// end next player

   
    public Player getCurrentPlayer() { 
        return players.get(current); 

       
    }// end get current player


    public deck getTopDiscard() { 
        return deck.discadpile.get(deck.discadpile.size() - 1);
       

    }// end get top discard


    public boolean isGameOver() { 
        for (Player p : players) {
            if (p.hand.isEmpty()) {
                return true;
            }
        }
        return false;
        


    }// end isGameOver







    public void announceWinner() { 
        for (Player p : players) {
            if (p.hand.isEmpty()) {
                System.out.println("The winner is " + p.getName() + "!");
                return;
            }
        }
       


    }//end announce winner



}



/*anyone checking this code should know that game management is not the main game,
we built gamemanagement to ease up the manipulation of the player table in the main 
so its as complementary as the deck and card classes, mostly manipiulating the deck and discard piles
and also initial deal and flipping the first card on the table, as well as initiating the components 
of the table management itself. */
//long story short, this is not the main class but a complementary one to help us manage the game better.



