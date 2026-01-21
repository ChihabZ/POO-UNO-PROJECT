
import java.util.*;



//donc hna tbda la classe player
public class player{
private card card;
private String name;
private List<card> hand;
private Scanner scan = new Scanner(System.in);
private deck   deck = new deck();

//constructeur
public player(String name){

this.name = name;
this.hand = new ArrayList<>();


}

//now the methods

public void draw(int n){

    for(int i = 0; i < n; i++) {
        card c = deck.drawplus(1);
        hand.add(c);
    }

}






// show cards and plat turn method

 public card showcards(deck deck){
    
 card paintcard; //for the drawable card

 System.out.println("\n" + name + " hand :");
 for(int i = 0 ; i < hand.size() ; i++){
     System.out.println((i+1) + ":");
     paintcard = hand.get(i);
     paintcard.logo();
 }


// public card showcards(deck deck) {

//     System.out.println("\n" + name + " hand :");

//     // numéros des cartes
//     for (int i = 0; i < hand.size(); i++) {
//         System.out.print("   " + (i + 1) + "       ");
//     }
//     System.out.println();
//     // 9 lignes de hauteur de carte
//     for (int row = 0; row < 9; row++) {
//         for (int i = 0; i < hand.size(); i++) {
//             hand.get(i).logo(row);
//             System.out.print("  "); // espace entre cartes
//         }
//         System.out.println();
//     }

    



while (true) {
    System.out.println(" \n choose a card to play, or press 0 to draw");//writing under the painted cards
    int index = scan.nextInt();
    if(index == 0){
        draw(1);
        return null;
    } else {
        index--;// for machine array for that it starts from 0,im making it user friendly
        //the draw method()
        if(index < 0 || index >= hand.size()){
            System.out.println("invalid index");
            continue;
        } else {
            card c = hand.get(index);
            if(!c.allowplay(deck.getTopDiscard())){
                System.out.println("you cant play this card");
                continue;
            } else {
                deck.addtodiscard(c);
                hand.remove(index);
                System.out.println(name + " played " + c); 
                if (hand.size() == 1){
                    System.out.println(name + " says: UNO!");
                }
                return c;
            }
        }
    }
}
 
//and from here nroho to the main() and gameManagement 
//not sure if all classes are here so ill be working au fur et a mesure
}// end showcards

public List<card> getHand() {
    return hand;
}
public boolean hasEmptyHand() {
    return hand.isEmpty();
}

public int getHandSize() {
    return hand.size();
}

public String getName() {
    return name;
}

} 


