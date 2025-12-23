import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Collections;


public class  deck {
 private repertoir_card repertoir;
private Stack<card> drawpile;
private Stack<card> discardpile;
private card carte;
private card top;
private List<card> deck;





public Deck() {
    repertoir = new repertoir_card();
    drawpile = new Stack<>();
    discardpile = new Stack<>();
    deck = new ArrayList<>();
    initDeck();
    initDISCARD();



// crrer pile draw 
Stack<card> initDeck(){
  
   deck = repertoir.getcartes();
   Collections.shuffle(deck);
 
  for (card carte : deck)
  {
  drawpile.push(carte);
}
 
     return this;
}


 public void  drawplus(int n,Stack<card> Hand){//n c le nmbr de cartes a piocher
  for (int i=0;i<n;i++){
        if (drawpile.isEmpty()) {
       refile();
         }
         
    Hand.push(drawpile.pop());
    // ajouter carte a la main du joueur
  }

 }


//creer pile discard
public Deck  initDISCARD(){
  // faut prendre en compte que card = sizeof drawpile- n*7
  discardpile = new Stack<card>();
//discardpile.push(drawpile.pop());
return this;
// retourne le stack
}




// quand pile draw empty
public void refile(){
  if (drawpile.isEmpty() ){
       top=discardpile.pop();// sauvegarder la carte du dessus de discard pile
       List<card> deck =new ArrayList<Card>();

        while (!discardpile.isEmpty()){// vider la discard pile
          deck.add(discardpile.pop());
            }

    Collections.shuffle(deck);

        for(card carte:deck){
      drawpile.push(carte);
       }
  
}
discardpile.push(top);// remettre le top dans discard pile pour continuer le jeu 
}
  
}
}






