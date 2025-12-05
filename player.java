
import java.util.*;
import java.util.jar.Attributes;

import javax.smartcardio.Card;

//donc hna tbda la classe player
public class player {

private String name;
private List<Card> hand;
private Scanner scan = new Scanner(System.in);
private deck = new Deck();

//constructeur
public player(String name){

this.name = name;
this.hand = new ArrayList<>();


}

//now the methods

public void draw(int n){

    card c = deck.drawplus(n);
    hand.add(c);

}


public void showcards(Deck deck){

System.out.println("\n" + name + " hand :");
for(int i = 0 ; i < hand.size() ; i++){

System.out.println((i+1) + ": " + hand.get(i));

}
System.out.println("choose a card to play, or press 0 to draw");
int index = scan.nextInt();
if(index == 0){

draw(1);

}else{

index--;// for machine array

if(index < 0 || index >= hand.size()){

System.out.println("invalid");
return;

}else{
card c = hand.get(index);

if(!c.allowplay(deck.discadpile(0))){

System.out.println("you cant play this card");
return;

}else{
    deck.discadpile.add(c);
    hand.remove(index);
    System.out.println(name + " played " + c);
}

}



}







//and from here nroho to the main(),
//not sure if all classes are here so ill be working au fur et a mesure
}


