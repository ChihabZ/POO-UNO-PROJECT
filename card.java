package unoProject;

public abstract class card  {
	private color  color;

    public card (color color) {
        this.color = color;
    }

    public color  getColor() {
        return color;
    }
    public abstract boolean allowplay (card topcard);
   
}
