package EnumyZadania;

import java.util.ArrayList;
import java.util.List;

public class Guitar {
	/*
	 * Napisz klasê, która bêdzie przechowywaæ typ gitary, cenê, nazwê i
	 * producenta. Stwórz w niej gettery, settery i konstruktor. Stwórz listê
	 * losowych gitar, a nastêpnie stwórz metodê do sortowania ich wzglêdem
	 * œrednicy bêbna.
	 */
	
	private GuitarEnum gitara;
	private int cena;
	//private String nazwa;
	private String producent;
	
	public Guitar(GuitarEnum gitara, int cena, String producent) {
		this.gitara = gitara;
		this.cena = cena;
		this.producent = producent;
	}

	
	public int getStruny(){
		return gitara.getIloscStrun();
	}
	
	public int getSrednica(){
		return gitara.getSrednicaBebna();
	}

	public GuitarEnum getGitara() {
		return gitara;
	}

	public void setGitara(GuitarEnum gitara) {
		this.gitara = gitara;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}


	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}
	
	
	@Override
	
	public String toString(){
		return "Producent: " + getProducent()
		+ "\n" + "Cena; " + getCena() + "\n" 
		+ "Srednica bebna: " + getSrednica()
		+ "\n" + "Struny: " + getStruny()
		+ "\n" + "Typ: " + getGitara();
	}

}
