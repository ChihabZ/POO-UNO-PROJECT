import java.util.ArrayList;
import java.util.List;
import java.util.Stack;






public class  Deck {
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
    drawplus();
    Sauvegarde();

}




// crrer pile draw 
public Deck  DRAW(){
  
   repertoir.initCard();
   deck = repertoir.getcartes();
  shuffle(deck);
  initStack(drawpile);
  for (card carte : deck)
  {
  drawpile.push(carte);
  // hna lzm nzid } bsh mhbch y9blholi
     return this;
}
 
}
 public void  drawplus(int n){//n c le nmbr de cartes a piocher
  for (int i=0;i<n;i++){
    Stack<card> Hand.push(drawpile.pop());
    // ajouter carte a la main du joueur
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
      discardpile.pop(carte);
drawpile.push(carte);}

  }discardpile.push(top);// remettre le top dans discard pile pour continuer le jeu 
}



public void Sauvegarde(Stack<card> discardpile)
{  this.top=TopStack(discardpile);
}


}
