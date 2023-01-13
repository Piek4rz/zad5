import Zaplata.*;
import bilet_package.Bilet;
import bilet_package.Wlasciciel;

public class Aplikacja {

	private ArrayList<Bilet> bilety = new ArrayList<Bilet>();

	public String szukajBilet()                                         { return bilety.toString(); }
	public String szukajBiletZFiltrami(Filtry filtry)                   {
		ArrayList<Bilet> wynik = new ArrayList<Bilet>();
		for (Bilet bilet : bilety) {
			if(filtry.PoCenie&&(bilet.cena<filtry.cenaMin || bilet.cena>filtry.cenaMax))
				continue;
			if(filtry.PoDacie&&(bilet.lot.data != filtry.data))
				continue;
			if(filtry.poRegionie && bilet.lot.miejsce_wylotu!=filtry.region)
				continue;
			if(filtry.poKlasie && bilet.klasa != filtry.klasa)
				continue;
			wynik.append(bilet)
		}
		return wynik;
	}
	public boolean czyMoznaZwrocic(int bilet)                           {
		if(bilety.get(bilet).lot.data_wylotu > now()+600);
	}
	public Platnosc kupBilet(Bilet bilet, Wlasciciel wlasciciel)        { bilet.kup(wlasciciel);}
	public ArrayList<Bilet> getBilety()                                { return bilety; }
	public void zwrocBilet(int Bilet)                                   { bilet.wlasciciel = null; }
	public void zarezerwujBilet(int idBiletu, Wlasciciel wlasciciel){}
	public void wyslijBilet(Bilet bilet){}
	public void poprawnoscPlatnosci(Platnosc Platnosc){}
	public void main(){

	}

}