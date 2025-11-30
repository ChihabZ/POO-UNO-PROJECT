import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class shuffle {
 private card temp;
    public void shuffledeck(List<card> deck){Collections.shuffle(deck);
       
for (int i=deck.size();i>0;i--){
    int j = (int) (Math.random() * i);
    temp= deck.get(i);
    deck.set(i, deck.get(j));
    deck.set(j, temp);
    // echanger les cartes entre i et j
}
    }
}
