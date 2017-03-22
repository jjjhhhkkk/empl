package model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class EmployeeDAOImpl4 implements EmployeeDAO {

	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public ArrayList<EmployeeVO> selectAll() {
		List<EmployeeVO> emp= sqlSession.selectList("javab.employee.selectAll2");
		return (ArrayList<EmployeeVO>)emp;
	}

	@Override
	public EmployeeVO selectByID(int empid) {
		return sqlSession.selectOne("javab.employee.selectByMno2", empid);
	}

	@Override
	public List<String> selectJobs() {
		return sqlSession.selectList("javab.employee.selectJobs");
	}

	@Override
	public List<DeptVO> selectDepts() {
		return sqlSession.selectList("javab.employee.selectDepts");
	}

	@Override
	public int updateEmp(EmpDTO empDTO) {
		return sqlSession.update("javab.employee.memUpdate2",empDTO);
	}

	@Override
	public int insertEmp(EmpDTO empDTO) {
		return sqlSession.insert("javab.employee.insertEmp2" ,empDTO);
	}
	
	@Override
	public int deleteEmp(int employee_id){
		return sqlSession.delete("javab.employee.memDelete2" ,employee_id);
	}

}
