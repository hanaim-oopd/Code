package verkiezingsuitslagen;
public class Partijuitslag {
	private String partijnaam;
	private int aantalStemmen;
	private int aantalBasisZetels;
	private boolean haaltDrempel;
	private int aantalRestzetels;

	public Partijuitslag(String pn, int a) {
		partijnaam = pn;
		aantalStemmen = a;
		aantalBasisZetels = 0;
		haaltDrempel = false;
		aantalRestzetels = 0;
	}

	public String getNaam() {
		return partijnaam;
	}

	public int getStemmen() {
		return aantalStemmen;
	}

	public int getBasisZetels() {
		return aantalBasisZetels;
	}

	public boolean haaltKiesdrempel() {
		return haaltDrempel;
	}

	public void berekenBasiszetels(int kiesdeler) {
		// berekent de afronding naar beneden van de deling, dat is juist goed
		aantalBasisZetels = aantalStemmen / kiesdeler;
		haaltDrempel = (aantalBasisZetels > 0);
	}

	public int getStemmenPerPluszetel() {
		// returnt de afronding naar beneden van de deling, dat is juist goed
		if (haaltDrempel) {
			return aantalStemmen / (aantalBasisZetels + aantalRestzetels + 1);
		} else {
			return 0;
		}
	}

	public void ontvangRestzetel() {
		aantalRestzetels++;
	}

	public String getResultaat() {
		return partijnaam + ":  " + aantalStemmen + " stemmen, " + (aantalBasisZetels + aantalRestzetels) + " zetels";
	}
}