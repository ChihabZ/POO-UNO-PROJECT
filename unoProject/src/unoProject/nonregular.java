package unoProject;

public class nonregular extends card  {
	private symbol symbol;

	public nonregular(color color , symbol symbol) {
		super(color);
		this.symbol = symbol ; 
	}
	public symbol getSymbol() {
        return symbol;
    }
}
