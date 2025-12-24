




public class regular extends card implements drawable {
       private final int number;
	private String t[][];//SHYRAZ
	
	public regular(color color , int number) {
    
		super(color);
		 t = new String [9][8];//SHYRAZ
		this.number= number ;
		for(int i=0;i<9;i++) for(int j=0;j<8;j++) t[i][j] = "   ";

	}
	
	public int getnumber() {

        return this.number;
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
	    		regular cardtop= (regular) topcard;
	    		if(this.getnumber()== cardtop.getnumber()) {
	    			return true ; 
	    		}
	    	return false ;
	    	}
        return false;
	}
	/*public String toString() {
        return color + " " + num;
    }*/


//SHYRAZZZZZ
@Override
  public void logo(){
String RED = "\u001B[31m";
String GREEN = "\u001B[32m";
String YELLOW = "\u001B[33m";
String BLUE = "\u001B[34m";
String reset = "\u001B[0m";
      for(int i=0;i<8;i++){
t[0][i]="-";
t[8][i]="-";
      }
      for(int j=0;j<9;j++){
t[j][0]="|";
t[j][7]="|";
      }
 //---------------------------------------------------------------------------
       
 
 
 
 switch (getnumber()){
            
            case 0:
           t[2][2]=" $ ";t[2][3]=" $ ";t[2][4]=" $ ";t[2][5]=" $ ";t[3][2]=" $ ";t[3][5]=" $ ";t[4][2]=" $ ";
            t[4][5]=" $ ";t[5][2]=" $ ";t[6][2]=" $ ";t[5][5]= "$ ";t[6][3]=" $ ";t[6][4]=" $ ";t[6][5]=" $ ";

           break;
          
            case(1):
           t[2][4]=" $ ";t[3][4]=" $ ";t[3][3]=" $ ";t[4][2]=" $ ";t[4][4]=" $ ";t[5][4]=" $ ";t[6][4]=" $ ";
           
            ;break;

            case(2):
            t[2][2]=" $ ";t[2][3]=" $ ";t[2][4]=" $ ";t[2][5]=" $ ";t[3][5]=" $ ";t[4][2]=" $ ";t[4][3]=" $ ";
            t[4][4]=" $ ";t[4][5]=" $ ";t[5][2]=" $ ";t[6][2]=" $ ";t[6][3]=" $ ";t[6][4]=" $ ";t[6][5]=" $ ";
            ;break;

            case(3): 
           t[2][2]=" $ ";t[2][3]=" $ ";t[2][4]=" $ ";t[2][5]=" $ ";t[3][5]=" $ ";t[4][2]=" $ ";t[4][3]=" $ ";
           t[4][4]=" $ ";t[4][5]=" $ ";t[5][5]=" $ ";t[6][2]=" $ ";t[6][3]=" $ ";t[6][4]=" $ ";t[6][5]=" $ ";

            break;

            case(4):
           t[2][3]=" $ ";t[2][4]="  $ ";t[3][2]=" $ ";t[3][4]=" $ ";t[4][2]=" $ ";t[4][3]=" $ ";t[4][4]=" $ ";
           t[4][5]=" $ ";t[5][4]=" $ ";t[6][4]=" $ ";
            break;

            case (5):
           t[2][2]=" $ ";t[2][3]=" $ ";t[2][4]=" $ ";t[2][5]=" $ ";t[3][2]=" $ ";t[4][2]=" $ ";t[4][3]=" $ ";
           t[4][5]=" $ ";t[4][4]=" $ ";t[5][5]=" $ ";t[6][2]=" $ ";t[6][2]=" $ ";t[6][3]=" $ ";t[6][4]=" $ ";
           t[6][5]=" $ ";
            break;

            case(6):
            t[2][2]=" $ ";t[2][3]=" $ ";t[2][4]=" $ ";t[2][5]=" $ ";t[3][2]=" $ ";t[4][2]=" $ ";t[4][3]=" $ ";
           t[4][5]=" $ ";t[4][4]=" $ ";t[5][5]=" $ ";t[6][2]=" $ ";t[6][2]=" $ ";t[6][3]=" $ ";t[6][4]=" $ ";
           t[6][5]=" $ ";t[5][2]=" $ ";
            break;

            case(7):
            t[2][2]=" $ ";t[2][3]=" $ ";t[2][4]=" $ ";t[2][5]=" $ ";t[3][5]=" $ ";
           t[4][5]=" $ ";t[5][5]=" $ ";t[6][5]=" $ ";
            break;

            case(8): 
            t[2][2]=" $ ";t[2][3]=" $ ";t[2][4]=" $ ";t[2][5]=" $ ";t[3][2]=" $ ";t[3][5]=" $ ";t[4][2]=" $ ";t[4][3]=" $";t[4][4]=" $ ";
            t[4][5]=" $ ";t[5][2]=" $ ";t[6][2]=" $ ";t[5][5]= "$ ";t[6][3]=" $ ";t[6][4]=" $ ";t[6][5]=" $ ";
            break;

            case(9):
            t[2][2]=" $ ";t[2][3]=" $ ";t[2][4]=" $ ";t[2][5]=" $ ";t[3][2]=" $ ";t[3][5]=" $ ";t[4][2]=" $ ";t[4][3]=" $";t[4][4]=" $ ";
            t[4][5]=" $ ";t[5][2]=" $ ";t[6][2]=" $ ";t[5][5]= "$ ";t[6][3]=" $ ";t[6][4]=" $ ";t[6][5]=" $ ";
            break;
 }
  for(int i=0;i<9;i++){
          for(int j=0;j<8;j++){
            switch(getColor()){
              case red:
              System.out.print( RED + t[i][j]+ reset );
              break;
              case green:
              System.out.print( GREEN + t[i][j]+ reset );
              break;
              case yellow:
              System.out.print( YELLOW + t[i][j]+ reset );    
              break;
              case blue:
              System.out.print(BLUE + t[i][j]+ reset );
              break;
               default:break;
               }

		  }
		}





        }

  
  //FIN DES CARTES NOMBRES ------------------------------------------------------------------

}

  

  
  