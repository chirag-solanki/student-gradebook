package ca.sheridancollege.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="GradeBook")
public class GradeBookModel {
	@Id
	private String gradeBookName;
	private String semester;
	
	public String getGradeBookName() {
		return gradeBookName;
	}
	public void setGradeBookName(String gradeBookName) {
		this.gradeBookName = gradeBookName;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	@Override
	public String toString() {
		return "GradeBookModel [gradeBookName=" + gradeBookName + ", semester=" + semester + "]";
	}
}
