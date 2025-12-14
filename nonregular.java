package unoProject;

public class nonregular extends card  {
	private type type;

	public nonregular(color color , type type) {
		super(color);
		this.type = type ; 
	}
	public type gettype() {
        return type;
    }
	@Override
	public boolean allowplay(card topcard) {
		//they have the same color
    	if(this.getColor() ==topcard.getColor()) {
    		return true ; 
    	}
		//if it was a wild card (that mean it will be true )
    	if(this instanceof nonregular) {
    		//wild card
    		if(this.gettype()==type.WILD ) {
    			return true ;
    		}
    		//wild +4
    		if(this.gettype()==type.wild_4_plus) {
    			return true ;
    		}
    	}
    	//they have the same symbol 
    	if(this instanceof nonregular && topcard instanceof nonregular) {
    		if(this.gettype()==topcard.gettype()) {
    			return true ;
    		}
    	}
		return false;
	}
	/*public String toString() {
        return color + " " + type;
    }*/
	
}
