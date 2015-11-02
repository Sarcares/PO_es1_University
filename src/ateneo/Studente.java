package ateneo;

public class Studente implements Comparable<Studente>{

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

	@Override
	public boolean equals(Object o) {
		Studente other = (Studente) o;
		
		if( this.ID != other.getStudentID() )
			return false;
		if(!this.surname.equals( other.getSurname()) )
			return false;
		if(!this.name.equals( other.getName()) )
			return false;
		
		return true;
	}

	@Override
	public int compareTo(Studente other) {
		int toRet = this.surname.compareTo( other.getSurname() );
		
		if(toRet == 0) {
			toRet = this.name.compareTo( other.getName() );
			if(toRet == 0) {
				toRet = this.ID - other.getStudentID();
			}
		}
		return toRet;
	}
	
	/* -.-.-.-.-.- Getter and Setter Methods -.-.-.-.-.- */
	public int getStudentID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
}
