

public abstract class card implements drawable {
	private final color  color;

    public card (color color) {
        this.color = color;
    }

    public color  getColor() {
        return color;
    }
    public abstract boolean allowplay (card topcard);
   
}
