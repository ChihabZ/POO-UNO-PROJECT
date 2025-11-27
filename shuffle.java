import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class shuffle {
 private Card temp;
    public void shuffledeck(List<Card> deck){
       
for (int i=107;i>0;i--){
    int j = (int) (Math.random() * i);
    temp= deck.get(i);
    deck.set(i, deck.get(j));
    deck.set(j, temp);
    // echanger les cartes entre i et j
}
    }
}
