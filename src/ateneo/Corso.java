package ateneo;

public class Corso implements Comparable<Corso>{

	private int courseID;
	private String subject;
	private String teacher;
	
	public Corso(int courseID, String subject, String teacher) {
		this.courseID = courseID;
		this.subject = subject;
		this.teacher = teacher;
	}
	
	public void modifyCourse(int courseID, String subject, String teacher) {
		this.courseID = courseID;
		this.subject = subject;
		this.teacher = teacher;
	}
	
	public String toString() {
		return courseID+" "+subject+" "+teacher;
	}

	@Override
	public boolean equals(Object o) {
		Corso other = (Corso) o;
		
		if( this.courseID != other.getCourseID() )
			return false;
		if(!this.subject.equals(other.getSubject()))
			return false;
		if(!this.teacher.equals(other.getTeacher()))
			return false;
		
		return true;
	}

	@Override
	public int compareTo(Corso other) {
		int toRet = this.subject.compareTo(other.getSubject());
		
		if(toRet == 0) {
			toRet = this.teacher.compareTo(other.getTeacher());
			if(toRet == 0) {
				toRet = this.courseID - other.getCourseID();
			}
		}
		return toRet;
	}

/* -.-.-.-.-.- Getter and Setter Methods -.-.-.-.-.- */
	public int getCourseID() {
		return courseID;
	}

	public String getSubject() {
		return subject;
	}

	public String getTeacher() {
		return teacher;
	}
}
