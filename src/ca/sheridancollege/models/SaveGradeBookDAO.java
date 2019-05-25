package ca.sheridancollege.models;

public class SaveGradeBookDAO {
	public GradeBookModel insertData(String gradeBookName, String semester) {
		HibernateUtility hUtility = new HibernateUtility();
		GradeBookModel tempGradeBook = new GradeBookModel();
		tempGradeBook.setGradeBookName(gradeBookName);
		tempGradeBook.setSemester(semester);
		hUtility.getSession().save(new CreateGradeBookBean().getGradeBookBean(gradeBookName, semester));
		hUtility.commitTransaction();
		hUtility.closeSession();
		return tempGradeBook;
	}
}
