import java.util.ArrayList;
import java.util.List;
import java.util.Stack;






public class  Deck {
  private repertoir_card repertoir;
private Stack<Card> drawpile;
private Stack<Card> discardpile;
private Card card;
private Card top;
private List<Card> deck;




public Deck() {
    repertoir = new repertoir_card();
    drawpile = new Stack<>();
    discardpile = new Stack<>();
    deck = new ArrayList<>();

}




// crrer pile draw 
public Deck  DRAW(){
  
   repertoir.initCard();
   deck = repertoir.getcartes();
  shuffle(deck);
  initStack(drawpile);
  for (Card card : deck)
  {
  drawpile.push(card);
  // hna lzm nzid } bsh mhbch y9blholi
     return this;
}
  
}
//creer pile discard
public Deck  DISCARD(){
  // faut prendre en compte que card = sizeof drawpile- n*7
initStack(discardpile);
discardpile.push(drawpile.pop());
return this;// retourne le stack
}




// quand pile draw empty
public void refile(){
  if (drawpile.isEmpty() ){
    Sauvegarde(discardpile);
    while (!discardpile.isEmpty()){
      discardpile.pop(card);
drawpile.push(card);}
  }
}



public void Sauvegarde(Stack<Card> discardpile)
{  this.top=TopStack(discardpile);
}


}
