package com.lyceum.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lyceum.dao.StudentRepository;
import com.lyceum.dao.mybatis.mappers.PersonMapper;
import com.lyceum.dao.mybatis.mappers.StudentMapper;
import com.lyceum.model.Student;

public class MybatisStudentRepository extends MybatisClient implements StudentRepository{

	public MybatisStudentRepository(MybatisConnectionManager connectionManager) {
		super(connectionManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		SqlSession session = getSqlSessionFactory().openSession();
		try{
			
			PersonMapper personMapper = session.getMapper(PersonMapper.class);
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			personMapper.insertName(student.getName());
			personMapper.insertPerson(student);
			student.setSkPerson(personMapper.getSkPerson(student));
			personMapper.insertAddress(student);
			personMapper.insertContactNo(student);
			personMapper.insertEmail(student);
			studentMapper.insertAccount(student);
			studentMapper.insertStudent(student);
			session.commit();
			return "successInSaving";
			
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		
		return "errorInSaving";
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		SqlSession session = getSqlSessionFactory().openSession();
		try{
			
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			return studentMapper.getAllStudentInfo();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

}
