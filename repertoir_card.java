import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class repertoir_card   {
    private color colour;
    private type type;
    private int number;
    


private  List<card> cartes = new ArrayList<card>();
public repertoir_card() {
    initCard();

}//-----------------------------------------------------
 


public ArrayList<card> initCard() {
    cartes = new ArrayList<>();

   

    // Regular cards 
    //enum colour
    color[] colours = {color.red, color.blue, color.yellow, color.green, color.WILD};
    type[] types = {type.REVERSE,type.SKIP, type.PLUS2,type.wild_4_plus,type.wild};
    for (colour c : colour ) {
        if (c!= color.WILD){
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
          if (c !=color.WILD && t !=type.regular){
        
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

public List<card>getcartes()
{
    return cartes;
}

}  




