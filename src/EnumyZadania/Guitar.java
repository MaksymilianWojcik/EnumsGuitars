package EnumyZadania;

import java.util.ArrayList;
import java.util.List;

public class Guitar {
	/*
	 * Napisz klas�, kt�ra b�dzie przechowywa� typ gitary, cen�, nazw� i
	 * producenta. Stw�rz w niej gettery, settery i konstruktor. Stw�rz list�
	 * losowych gitar, a nast�pnie stw�rz metod� do sortowania ich wzgl�dem
	 * �rednicy b�bna.
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
