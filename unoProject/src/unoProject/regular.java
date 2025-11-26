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
}
