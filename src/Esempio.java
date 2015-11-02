import ateneo.*;

/**
 * Classe con un main di esempio.
 */
public class Esempio {

	public static void main(String[] args) {
		String nomeAteneo = "Politecnico di Torino";
		
		Ateneo poli = new Ateneo(nomeAteneo);
		
		poli.setRettore("Francesco", "Profumo");
		
		System.out.println("Rettore del " + poli.getNome() + " : " + poli.getRettore());
		
		int s1 = poli.immatricola("Mario","Rossi");
		int s2 = poli.immatricola("Giuseppe","Verdi");
		
		System.out.println("Inseriti studenti " + s1 + ", " + s2);
		System.out.println("s1 = " + poli.studente(s1));
		
		int macro = poli.attiva("Macro economia", "Paul Krugman");
		
		poli.iscrivi(s1, macro);
		poli.iscrivi(s2, macro);
		
		System.out.println(poli.elencoIscritti(macro));
		
	}
}
