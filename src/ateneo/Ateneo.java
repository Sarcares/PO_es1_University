package ateneo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ateneo {

	private String universityName;
	private String rectorName;
	private String rectorSurname;
	
	private int nextID;		//the ID numbers must start from 10000
	private Map<Integer, Studente> studenti;

/* -.-.-.-.-.- Constructor Methods -.-.-.-.-.- */
	public Ateneo(String universityName) {
		this.universityName = universityName;
		
		this.nextID = 9999;
		this.studenti = new HashMap<Integer, Studente>();
	}
	public Ateneo(String universityName, String rectorName, String rectorSurname) {
		this.universityName = universityName;
		this.rectorName = rectorName;
		this.rectorSurname = rectorSurname;
		
		this.nextID = 9999;
		this.studenti = new HashMap<Integer, Studente>();
	}

/* -.-.-.-.-.- Getter and Setter Methods -.-.-.-.-.- */
	public void setRettore(String name, String surname) {
		this.rectorName = name;
		this.rectorSurname = surname;
	}

	public String getRettore() {
		return rectorName+" "+rectorSurname;
	}

	public String getNome() {
		return this.universityName;
	}

/* -.-.-.-.-.- Logic Methods -.-.-.-.-.- */
	public int immatricola(String studentName, String studentSurname) {
		if(studenti.size() > 1000)
			return -1;

		nextID++;
		Studente s = new Studente(nextID, studentName, studentSurname);
		studenti.put(nextID, s);
		return nextID;
	}

	public String studente(int studentID) {
		return studenti.get(studentID).toString();
	}

	public int attiva(String string, String string2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String insegnamento(int codice){
		// TODO Auto-generated method stub
		return null;
	}

	public void iscrivi(int s1, int macro) {
		// TODO Auto-generated method stub
		
	}

	public char[] elencoIscritti(int macro) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String pianoStudi(int matricolaStudente){
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return "University: "+universityName+"\nRector: "+getRettore();
	}

}
