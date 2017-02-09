package EnumyZadania;

public enum GuitarEnum {
	
	KLASYCZNA(2, 23), AKUSTYCZNA(3, 25), ELEKTROAKUSTYCZNA(6, 10), ELEKTRYCZNA(5, 0), BASOWA(4, 0); 
	
	private int iloscStrun;
	private int srednicaBebna;
	
	GuitarEnum(int iloscStrun, int srednicaBebna){
		this.iloscStrun = iloscStrun;
		this.srednicaBebna = srednicaBebna;
	}
	
	
	public int getIloscStrun(){
		return iloscStrun;
	}
	
	public int getSrednicaBebna(){
		return srednicaBebna;
	}
	
	
}
