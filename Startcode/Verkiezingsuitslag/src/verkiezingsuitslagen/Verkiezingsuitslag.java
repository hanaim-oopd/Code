package verkiezingsuitslagen;
import java.util.*;

public class Verkiezingsuitslag {
	private ArrayList<Partijuitslag> Partijuitslagen;
	private int totaalStemmen;
	private int TKTOTAAL = 150;
	private int kiesdeler;
	private int totaalBasiszetels;
	private int totaalRestzetels;

	public Verkiezingsuitslag() {
		// kies hier de te berekenen verkiezing
		maakTK2010();
	}

	public void maakTK2010() {
		Partijuitslagen = new ArrayList<>();
		Partijuitslagen.add(new Partijuitslag("CDA", 1281886));
		Partijuitslagen.add(new Partijuitslag("ChristenUnie", 305094));
		Partijuitslagen.add(new Partijuitslag("D66", 654167));
		Partijuitslagen.add(new Partijuitslag("EPN", 924));
		Partijuitslagen.add(new Partijuitslag("GroenLinks", 628096));
		Partijuitslagen.add(new Partijuitslag("Heel NL", 1255));
		Partijuitslagen.add(new Partijuitslag("Lijst 17", 7456));
		Partijuitslagen.add(new Partijuitslag("Mens en Spirit", 26196));
		Partijuitslagen.add(new Partijuitslag("Nieuw NL", 2010));
		Partijuitslagen.add(new Partijuitslag("Partij een", 2042));
		Partijuitslagen.add(new Partijuitslag("Piratenpartij", 10471));
		Partijuitslagen.add(new Partijuitslag("PvdA", 1848805));
		Partijuitslagen.add(new Partijuitslag("PvdD", 122317));
		Partijuitslagen.add(new Partijuitslag("PVV", 1454493));
		Partijuitslagen.add(new Partijuitslag("SGP", 163581));
		Partijuitslagen.add(new Partijuitslag("SP", 924696));
		Partijuitslagen.add(new Partijuitslag("Trots op NL", 52937));
		Partijuitslagen.add(new Partijuitslag("VVD", 1929575));
		totaalStemmen = 0;
		kiesdeler = 0;
		totaalBasiszetels = 0;
	}

	public void maakTK2006() {
		Partijuitslagen = new ArrayList<Partijuitslag>();
		Partijuitslagen.add(new Partijuitslag("CDA", 2608573));
		Partijuitslagen.add(new Partijuitslag("PvdA", 2085077));
		Partijuitslagen.add(new Partijuitslag("SP", 1630803));
		Partijuitslagen.add(new Partijuitslag("VVD", 1443312));
		Partijuitslagen.add(new Partijuitslag("PVV", 579490));
		Partijuitslagen.add(new Partijuitslag("GL", 453054));
		Partijuitslagen.add(new Partijuitslag("CU", 390969));
		Partijuitslagen.add(new Partijuitslag("D66", 193232));
		Partijuitslagen.add(new Partijuitslag("PvdD", 179988));
		Partijuitslagen.add(new Partijuitslag("SGP", 153266));
		Partijuitslagen.add(new Partijuitslag("EenNL", 62829));
		Partijuitslagen.add(new Partijuitslag("Fortuyn", 20956));
		Partijuitslagen.add(new Partijuitslag("Verenigde Senioren Partij", 12522));
		Partijuitslagen.add(new Partijuitslag("Ad Bos Collectief", 5149));
		Partijuitslagen.add(new Partijuitslag("Partij voor Nederland", 5010));
		Partijuitslagen.add(new Partijuitslag("Lijst Potmis", 4339));
		Partijuitslagen.add(new Partijuitslag("Nederland Transparant", 2318));
		Partijuitslagen.add(new Partijuitslag("Groen Vrij Internet Partij", 2297));
		Partijuitslagen.add(new Partijuitslag("Liberaal Democratische Partij", 2276));
		Partijuitslagen.add(new Partijuitslag("Lijst Poortman", 2181));
		Partijuitslagen.add(new Partijuitslag("Continue Directe Democratie Partij", 559));
		Partijuitslagen.add(new Partijuitslag("LRVP - het Zeteltje", 185));
		Partijuitslagen.add(new Partijuitslag("Solide Multiculturele Partij", 184));
		Partijuitslagen.add(new Partijuitslag("Tamara's Open Partij", 114));
		totaalStemmen = 0;
		kiesdeler = 0;
		totaalBasiszetels = 0;
	}

	public void maakTK2003() {
		Partijuitslagen = new ArrayList<Partijuitslag>();
		Partijuitslagen.add(new Partijuitslag("CDA", 2763480));
		Partijuitslagen.add(new Partijuitslag("PvdA", 2631363));
		Partijuitslagen.add(new Partijuitslag("VVD", 1728707));
		Partijuitslagen.add(new Partijuitslag("SP", 609723));
		Partijuitslagen.add(new Partijuitslag("LPF", 549975));
		Partijuitslagen.add(new Partijuitslag("GL", 495802));
		Partijuitslagen.add(new Partijuitslag("D66", 393333));
		Partijuitslagen.add(new Partijuitslag("CU", 204694));
		Partijuitslagen.add(new Partijuitslag("SGP", 150305));
		Partijuitslagen.add(new Partijuitslag("PvdD", 47754));
		Partijuitslagen.add(new Partijuitslag("LN", 38894));
		Partijuitslagen.add(new Partijuitslag("Partij van de Toekomst", 13845));
		Partijuitslagen.add(new Partijuitslag("Lijst Ratelband", 9045));
		Partijuitslagen.add(new Partijuitslag("Duurzaam Nederland", 7271));
		Partijuitslagen.add(new Partijuitslag("Nieuwe Communistische Partij", 4854));
		Partijuitslagen.add(new Partijuitslag("De Conservatieven.nl", 2521));
		Partijuitslagen.add(new Partijuitslag("VIP Vooruitstrevende Integratie Partij", 1623));
		Partijuitslagen.add(new Partijuitslag("Alliantie Vernieuwing en Democratie", 990));
		Partijuitslagen.add(new Partijuitslag("Lijst Veldhoen", 296));
		totaalStemmen = 0;
		kiesdeler = 0;
		totaalBasiszetels = 0;
	}

	public void maakTK2002() {
		Partijuitslagen = new ArrayList<Partijuitslag>();
		Partijuitslagen.add(new Partijuitslag("CDA", 2653723));
		Partijuitslagen.add(new Partijuitslag("LPF", 1614801));
		Partijuitslagen.add(new Partijuitslag("VVD", 1466722));
		Partijuitslagen.add(new Partijuitslag("PvdA", 1436023));
		Partijuitslagen.add(new Partijuitslag("GL", 660692));
		Partijuitslagen.add(new Partijuitslag("SP", 560447));
		Partijuitslagen.add(new Partijuitslag("D66", 484317));
		Partijuitslagen.add(new Partijuitslag("CU", 240953));
		Partijuitslagen.add(new Partijuitslag("SGP", 163562));
		Partijuitslagen.add(new Partijuitslag("LN", 153055));
		Partijuitslagen.add(new Partijuitslag("Verenigde Senioren Partij", 39005));
		Partijuitslagen.add(new Partijuitslag("Vrije Indische Partij & OuderenUnie", 10033));
		Partijuitslagen.add(new Partijuitslag("Duurzaam Nederland", 9058));
		Partijuitslagen.add(new Partijuitslag("Partij van de Toekomst", 6393));
		Partijuitslagen.add(new Partijuitslag("Nieuwe Midden Partij", 2305));
		Partijuitslagen.add(new Partijuitslag("Republikeinse Volkspartij", 63));
		totaalStemmen = 0;
		kiesdeler = 0;
		totaalBasiszetels = 0;
	}

	public void maakTK1998() {
		Partijuitslagen = new ArrayList<Partijuitslag>();
		Partijuitslagen.add(new Partijuitslag("PvdA", 2494555));
		Partijuitslagen.add(new Partijuitslag("VVD", 2124971));
		Partijuitslagen.add(new Partijuitslag("CDA", 1581053));
		Partijuitslagen.add(new Partijuitslag("D66", 773497));
		Partijuitslagen.add(new Partijuitslag("GL", 625968));
		Partijuitslagen.add(new Partijuitslag("SP", 303703));
		Partijuitslagen.add(new Partijuitslag("RPF", 174593));
		Partijuitslagen.add(new Partijuitslag("SGP", 153583));
		Partijuitslagen.add(new Partijuitslag("GPV", 108724));
		Partijuitslagen.add(new Partijuitslag("CD", 52226));
		Partijuitslagen.add(new Partijuitslag("AOV/Unie55+", 45994));
		Partijuitslagen.add(new Partijuitslag("Nederland Mobiel", 45219));
		Partijuitslagen.add(new Partijuitslag("Senioren 2000", 36157));
		Partijuitslagen.add(new Partijuitslag("Nederlandse Middenstands Partij", 23512));
		Partijuitslagen.add(new Partijuitslag("De Groenen", 16585));
		Partijuitslagen.add(new Partijuitslag("Natuurwetpartij", 15746));
		Partijuitslagen.add(new Partijuitslag("Katholiek Politieke Partij", 8233));
		Partijuitslagen.add(new Partijuitslag("Vrije Indische Partij", 7225));
		Partijuitslagen.add(new Partijuitslag("Nieuw Solidair Ouderen Verbond", 6455));
		Partijuitslagen.add(new Partijuitslag("Nieuwe Communistische Partij", 5620));
		Partijuitslagen.add(new Partijuitslag("Idealisten/Jij", 2500));
		Partijuitslagen.add(new Partijuitslag("Het Kiezers Collectief", 1668));
		totaalStemmen = 0;
		kiesdeler = 0;
		totaalBasiszetels = 0;
	}
}