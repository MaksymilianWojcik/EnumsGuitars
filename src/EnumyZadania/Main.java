package EnumyZadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();

	}

	public Main() {

		List<Guitar> gitary = new ArrayList<Guitar>();
		gitary.add(new Guitar(GuitarEnum.AKUSTYCZNA, 500, "Ruboki.pl"));
		gitary.add(new Guitar(GuitarEnum.KLASYCZNA, 700, "Elektro.pl"));
		gitary.add(new Guitar(GuitarEnum.ELEKTRYCZNA, 1200, "gitarki.pl"));
		gitary.add(new Guitar(GuitarEnum.BASOWA, 350, "giaryny.pl"));
		gitary.add(new Guitar(GuitarEnum.ELEKTROAKUSTYCZNA, 770, "emuzik.pl"));

		Scanner sc = new Scanner(System.in);
		System.out.println("Wpisz srednice bebna: ");
		int srednica = sc.nextInt();

		for (Guitar k : gitary) {
			if (k.getSrednica() == srednica) {
				System.out.println(k);
			}
		}

		sc.close();

		sortAndPrint(gitary);
	}

	public void sortAndPrint(List<Guitar> list) {
		// TODO Auto-generated method stub
		Collections.sort(list, new CompareByDiameter());
		for (Guitar k : list) {
			System.out.println("");
			System.out.println(k);
		}
	}

	private class CompareByDiameter implements Comparator<Guitar> {

		@Override
		public int compare(Guitar arg0, Guitar arg1) {

			if (arg0.getSrednica() > arg1.getSrednica()) {
				return -1;
			} else if (arg0.getSrednica() < arg1.getSrednica()) {
				return 0;
			}

			return 1;
		}

	}
}
