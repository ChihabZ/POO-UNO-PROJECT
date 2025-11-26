package unoProject;

public class card {
	private color  color;

    public card (color color) {
        this.color = color;
    }

    public color  getColor() {
        return color;
    }
    public boolean allowplay (card topcard) {
    	//they have the same color
    	if(this.color =topcard.color) {
    		return true ; 
    	}
    	//they have the same number 
    	//we need to check if they are both regular
    	if(this instanceof regular && topcard instanceof regular) {
    		if(this.getnumber()= topcard.getnumber) {
    			return true ; 
    		}
    	}
    	//if it was a wild card (that mean it will be true )
    	if(this instanceof nonregular) {
    		//wild card
    		if(this.getsymbol()=symbol.WILD ) {
    			return true ;
    		}
    		//wild +4
    		if(this.getsymbol()=symbol.wild_4_plus) {
    			return true ;
    		}
    	}
    	//they have the same symbol 
    	if(this instanceof nonregular && topcard instanceof nonregular) {
    		if(this.getsymbol()=topcard.getsymbol()) {
    			return true ;
    		}
    	}
    	return false ;
    }
}
