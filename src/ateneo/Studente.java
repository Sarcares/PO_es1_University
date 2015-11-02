package ateneo;

public class Studente {

	int ID;
	String name;
	String surname;
	
	public Studente(int studentID, String studentName, String studentSurname) {
		this.ID = studentID;
		this.name = studentName;
		this.surname = studentSurname;
	}
	
	public String toString() {
		return ID+" "+name+" "+surname;
	}

}
