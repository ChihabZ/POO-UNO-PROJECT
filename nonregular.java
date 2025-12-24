

public class nonregular extends card implements drawable  {
	private type type;
	private String t[][]; //SHYRAZ


	public nonregular(color color , type type ,int number ) {
		super(color);
		 t = new String [9][8];//SHYRAZ
		for(int i=0;i<9;i++) for(int j=0;j<8;j++) t[i][j] = "   ";

		this.type = type ; 
	}
	public  type gettype() {
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
    		if(this.gettype()==type.wild ) {
    			return true ;
    		}
    		//wild +4
    		if(this.gettype()==type.wild_4_plus) {
    			return true ;
    		}
    	}
    	//they have the same symbol 
    	if(this instanceof nonregular && topcard instanceof nonregular) {
    		if(this.gettype()==((nonregular) topcard).gettype()) {
    			return true ;
    		}
        return false;
    	}
		return false;
	}
	/*public String toString() {
        return color + " " + type;
    }*/


	//shyraazzzz
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


  switch(gettype()){

        case REVERSE:
        t[1][2]=" X ";t[1][3]=" X ";t[1][4]=" X ";t[1][5]=" X ";t[2][5]=" X ";t[3][4]=" X ";t[3][5]=" X ";t[3][6]=" X";t[4][5]=" X ";
        t[4][2]=" X ";t[5][1]=" X ";t[5][2]=" X ";t[5][3]= " X ";t[6][2]=" X ";t[6][2]=" X ";t[7][2]=" X ";
        t[7][3]=" X ";t[7][4]=" X ";t[7][5]=" X ";
        
        break;

        case SKIP:
         t[1][1]=" X ";t[1][6]=" X ";t[2][2]=" X ";t[2][5]=" X ";t[3][3]=" X ";t[3][4]=" X ";t[4][3]=" X ";t[4][4]=" X";t[5][3]=" X ";
        t[5][4]=" X ";t[6][2]=" X ";t[6][5]=" X ";t[7][1]= " X ";t[7][6]=" X ";
        break;

        case PLUS2:
        t[1][2]=" + ";t[2][1]=" + ";t[2][2]=" + ";t[2][3]=" + ";t[3][2]=" + ";
        t[3][5]=" $ ";t[4][4]=" $ ";t[4][6]=" $ ";t[5][5]=" $ ";
        t[6][4]=" $ ";t[7][3]=" $ ";t[7][4]=" $ ";t[7][5]= " $ ";t[7][6]=" $ ";
        break;
 //FIN CARTES ACTIONS---------------------------------------------------------------------------------

 case wild_4_plus:
      t[1][2]=" + ";t[2][1]=" + ";t[2][2]=" + ";t[2][3]=" + ";t[3][2]=" + ";
        t[3][5]=" $ ";t[4][4]=" $ ";t[4][5]=" $ ";t[5][3]=" $ ";t[5][5]=" $ ";
        t[6][2]=" $ ";t[6][3]=" $ ";t[6][4]=" $ ";t[6][5]= " $ ";t[6][6]=" $ ";t[7][5]=" $ ";
        break;
case wild:
      
        t[2][1]=" R ";t[2][2]=" R ";t[2][3]=" R ";t[2][4]=" G ";t[2][5]=" G ";t[2][6]=" G ";
        t[3][1]=" R ";t[3][2]=" R ";t[3][3]=" R "; t[3][4]=" G ";t[3][5]=" G ";t[3][6]=" G ";
       t[5][1]=" B ";t[5][2]=" B ";t[5][3]=" B "; t[5][4]=" Y ";t[5][5]=" Y ";t[5][6]=" Y ";
       t[6][1]= " B ";t[6][2]=" B ";t[6][3]=" B ";t[6][4]= " Y ";t[6][6]=" Y ";t[6][5]=" Y ";
       
        break;
  }
// FIN CARTES WILD--------------------------------------------------------------------------------
//AFFICHAGE DES CARTES SUR LE TERMINAL---------------------------------------------------------------
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
              case WILD:
              System.out.print( RED +t[i][j] + reset);
               System.out.print( RED +t[i][j] + reset);
                System.out.print( RED +t[i][j] + reset);
                 System.out.print( GREEN +t[i][j] + reset);
                  System.out.print( GREEN +t[i][j] + reset);
                   System.out.print( GREEN +t[i][j] + reset);
                    System.out.print( RED +t[i][j] + reset);
                     System.out.print( RED +t[i][j] + reset);
                      System.out.print( RED+t[i][j] + reset);
                       System.out.print( GREEN+t[i][j] + reset);
                        System.out.print( GREEN +t[i][j] + reset);
                         System.out.print( GREEN+t[i][j] + reset);
                          System.out.print( BLUE +t[i][j] + reset);
                           System.out.print( BLUE+t[i][j]  + reset);
                            System.out.print( BLUE+t[i][j]  + reset);
                             System.out.print( YELLOW+t[i][j] + reset);
                              System.out.print( YELLOW+t[i][j]  + reset);
                               System.out.print( YELLOW+t[i][j]  + reset);
                                System.out.print( BLUE+t[i][j]  + reset);
                                 System.out.print( BLUE+t[i][j] + reset);
                                  System.out.print( BLUE+t[i][j]  + reset);
                                   System.out.print( YELLOW+t[i][j] + reset);
                                    System.out.print( YELLOW+t[i][j] + reset);
                                     System.out.print( YELLOW+t[i][j] + reset);

              break;  

          }
          
  }
}

    }
   
	}

