import java.util.ArrayList;
import java.util.List;


public class repertoir_card( Colour colour, Type type, Int  val) {
    


private  List<Card> cartes = new List<Card>();


public void initCard() {
    cartes = new ArrayList<>();
    
    // Regular cards 
    //enum colour
    Colour[] colors = {Colour.red, Colour.blue, Colour.yellow, Colour.green, Colour.WILD};
    
    for (Colour c : colors ) {
        if (c!= Color.WILD){
        for (int i = 0; i <= 9; i++) {
         if (i=0){
            cartes.add(new Card(c, Type.NUMBER, i));}
            else {
            clone(cartes.add(new Card(c, Type.NUMBER, i))); // ou bien 2* jsp encore}
        }
    }}
    
    // Not regular cards 
    //enum types
    Type[] types = {Type.skip, Type.reverse, Type.plus2,Type.plus4,Type.chng};
    
    for (Color c : colors) {

if (c !=WILD){
        for (Type t : types) {
            clone(cartes.add(new Card(c, t, -1)));
        }}
    }
    
    // Wild cards
    for (int i = 0; i < 4; i++) {
        cartes.add(new Card(Color.WILD, Type.chng, -1));
        cartes.add(new Card(Color.WILD, Type.plus4, -1));
    }
}


public List<Card>getcartes()
{
    return cartes;
}











}


