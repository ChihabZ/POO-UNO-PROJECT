import java.util.ArrayList;
import java.util.List;


public class repertoir_card {
    private Colour colour;
    private Type type;
    private int number;
    


private  List<card> cartes = new ArrayList<card>();
public repertoir_card() {
    initCard();

}
 
public void initCard() {
    cartes = new ArrayList<>();

   

    // Regular cards 
    //enum colour
    Colour[] colours = {Colour.red, Colour.blue, Colour.yellow, Colour.green, Colour.WILD};
     Type[] types = {Type.number,Type.skip, Type.reverse, Type.plus2,Type.plus4,Type.chng};
    for (Colour c : colours ) {
        if (c!= Colour.WILD){
        for (int i = 0; i <= 9; i++) {
         if (i==0){
            cartes.add(new card(c, Type.number, i));}
            else {
            cartes.add(new card(c, Type.number, i));
            cartes.add(new card(c, Type.number, i));
                
        }
    }}
    
    // Not regular cards 
    //enum types
   
    
    for (Colour c : colors) {

if (c !=Colour.WILD){
        for (Type t : types) {
            cartes.add(new card(c, t, -1));
             cartes.add(new card(c, t, -1));
        }}
    }
    
    // Wild cards
    for (int i = 0; i < 4; i++) {
        cartes.add(new card(Colour.WILD, Type.chng, -1));
        cartes.add(new card(Colour.WILD, Type.plus4, -1));
    }
}

public List<Card>getcartes()
{
    return cartes;
}


    
}
}


