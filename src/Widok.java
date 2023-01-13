import java.util.Scanner;

import Zaplata.Platnosc;
import bilet_package.*;

import java.util.Scanner;

public class Widok {
	Aplikacja aplikacja;
	Filtry filtry;

	public void wybierzOperacje(int operacja) {
		if(operacja==0){
			System.out.println(aplikacja.szukajBilet());
		}
		else if(operacja==1){
			wybierzFiltry();
		}
		else if(operacja==2){
			Aplikacja.kupBilet(Bilet bilet, Wlasciciel wlasciciel);
		}
		else if(operacja==3){
			Aplikacja.zarezerwujBilet(Bilet bilet, Wlasciciel wlasciciel);
		}
		else if(operacja==4){
			Aplikacja.czyMoznaZwrocic(Bilet bilet);
		}
	}

	public Filtry wybierzFiltry() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ktory filtr chcesz zmienic?");
		int option  = in.nextInt();
		System.out.println("Na jaka wartosc?");
		String setting  = in.nextLine();

		switch(option) {
			case 1:
				filtry.setPoDacie(setting);
			break;
			case 2:
				filtry.setPoCenie(setting);
			break;
			case 3:
				filtry.setCenaMin(setting);
			break;
			case 4:
				filtry.setCenaMax(setting);
			break;
			case 5:
				filtry.setPoRegionie(setting);
			break;
			case 6:
				filtry.setPoKlasie(setting);
			break;
			default:
		}
		
		System.out.println(aplikacja.szukajBiletZFiltrami(filtry));
	}

	public Platnosc platnosc(Platnosc platnosc){
return new Platnosc();
	}

}