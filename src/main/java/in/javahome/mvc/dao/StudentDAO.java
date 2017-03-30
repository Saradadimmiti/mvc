package in.javahome.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.mvc.model.Student;

@Repository
public class StudentDAO implements IStudentDAO{
	@Autowired
	private HibernateTemplate template;
	@Transactional
	public void addStudent(Student std){
		template.save(std);
	}
}
