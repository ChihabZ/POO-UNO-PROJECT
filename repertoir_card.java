import java.util.ArrayList;
import java.util.List;


public class repertoir_card   {
    private colorr colour;
    private Type type;
    private int number;
    


private  List<card> cartes = new ArrayList<card>();
public repertoir_card() {
    initCard();

}//-----------------------------------------------------
 


public void initCard() {
    cartes = new ArrayList<>();

   

    // Regular cards 
    //enum colour
    Colour[] colours = {Colour.red, Colour.blue, Colour.yellow, Colour.green, Colour.WILD};
    Type[] types = {Type.regular,Type.skip, Type.reverse, Type.plus2,Type.wild_4_plus,Type.wild};
    for (Colour c : colours ) {
        if (c!= Colour.WILD){
          for (int i = 0; i <= 9; i++) {
              if (i==0){
            cartes.add(new card(c, Type.regular,i));
             } else {
            cartes.add(new card(c, Type.regular, i));
            cartes.add(new card(c, Type.regular, i));
                
               }
            }
           }
          }
    // Not regular cards 
    //enum types
   
    
    for (Colour c : colours) {
       for (Type t : types) {
          if (c !=Colour.WILD && t !=Type.regular){
        
            cartes.add(new card(c, t, -1));
             cartes.add(new card(c, t, -1));
           }
         }
     }
    
    // Wild cards
    for (int i = 0; i < 4; i++) {
        cartes.add(new card(Colour.WILD, Type.wild, -1));
        cartes.add(new card(Colour.WILD, Type.wild_4_plus, -1));
    }
}
//======================================================

public List<card>getcartes()
{
    return cartes;
}

}  




