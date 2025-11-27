package unoProject;

public class regular extends card  {
       private number number;
	
	
	public regular(color color , number number) {
		super(color);
		this.number= number ;
	}
	
	public number getnumber() {
        return number;
    }

	@Override
	public boolean allowplay(card topcard) {
	    	//they have the same color
	    	if(this.getColor() ==topcard.getColor()) {
	    		return true ; 
	    	}
	    	//they have the same number 
	    	//we need to check if they are both regular
	    	if(this instanceof regular && topcard instanceof regular) {
	    		if(this.getnumber()== topcard.getnumber()) {
	    			return true ; 
	    		}
	    	return false ;
	    	}
	}
	public String toString() {
        return color + " " + num;
    }
}
