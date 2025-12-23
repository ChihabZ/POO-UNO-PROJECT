import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class repertoir_card   {
    private color colour;
<<<<<<< HEAD
    private Type type;
=======
    private type type;
>>>>>>> ae7d7c84a80714192c5827c22b2c8150bff8d7c8
    private int number;
    


private  List<card> cartes = new ArrayList<card>();
public repertoir_card() {
    initCard();

}//-----------------------------------------------------
 


public ArrayList<card> initCard() {
    cartes = new ArrayList<>();

   

    // Regular cards 
    //enum colour
<<<<<<< HEAD
    Color[] colours = {Color.red, Color.blue, Color.yellow, Color.green, Color.WILD};
    Type[] types = {Type.regular,Type.skip, Type.reverse, Type.plus2,Type.wild_4_plus,Type.wild};
    for (Colour c : colours ) {
        if (c!= Colour.WILD){
=======
    color[] colours = {color.red, color.blue, color.yellow, color.green, color.WILD};
    type[] types = { type.REVERSE,type.SKIP, type.PLUS2,type.wild_4_plus,type.wild};
    for (color c : colours ) {
        if (c!= color.WILD){
>>>>>>> ae7d7c84a80714192c5827c22b2c8150bff8d7c8
          for (int i = 0; i <= 9; i++) {
              if (i==0){
            cartes.add(new regular(c,i));
             } else {
            cartes.add(new regular(c, i));
            cartes.add(new regular(c, i));
                
               }
            }
           }
          }
    // Not regular cards 
    //enum types
   
    
    for (color c : colours) {
       for (type t : types) {
          if (c !=color.WILD && t !=type.wild && t !=type.wild_4_plus) {
        
            cartes.add(new nonregular(c, t));
             cartes.add(new nonregular(c, t));
           }
         }
     }
    
    // Wild cards
    for (int i = 0; i < 4; i++) {
        cartes.add(new nonregular(color.WILD, type.wild, -1));
        cartes.add(new nonregular(color.WILD, type.wild_4_plus, -1));
    }
    return (ArrayList<card>) cartes;
}
//======================================================
    }
public List<card>getcartes()
{
    return cartes;
}

}  




