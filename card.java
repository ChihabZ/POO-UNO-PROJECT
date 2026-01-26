

public abstract class card implements drawable {
	private color  color;
private type type;
    public card (color color) {
        this.color = color;
    }

    public color  getColor() {
        return color;
    }
    public void setColor(color color) {
        this.color = color;
    }

    
    public abstract boolean allowplay (card topcard);
   
}
