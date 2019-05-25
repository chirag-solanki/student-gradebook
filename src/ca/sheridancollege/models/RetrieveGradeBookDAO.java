package ca.sheridancollege.models;

import java.util.List;

public class RetrieveGradeBookDAO {
	
	public List<GradeBookModel> getAllGradeBooks() {
		HibernateUtility hUtility = new HibernateUtility();
		@SuppressWarnings("unchecked")
		List<GradeBookModel> tempStudents = (List<GradeBookModel>)hUtility.getSession().createQuery("from GradeBookModel").list();
		hUtility.commitTransaction();
		hUtility.closeSession();
		return tempStudents;
	}
}
