package ca.sheridancollege.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Grade")
public class GradeItemModel {
	//@Id
	//private int id;
	@Id
	private String studentName;
	private double grade;
	private String gradeBookName;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getGradeBookName() {
		return gradeBookName;
	}
	public void setGradeBookName(String gradeBookName) {
		this.gradeBookName = gradeBookName;
	}
	
	@Override
	public String toString() {
		return "GradeItemModel [studentName=" + studentName + ", grade=" + grade + ", gradeBookName=" + gradeBookName
				+ "]";
	}

}
