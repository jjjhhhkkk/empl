package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service2")
public class EmployeeServiceImpl2 implements EmployeeService {
	
	@Autowired
	EmployeeDAO dao2;
	
	public void setDao(EmployeeDAO dao) {
		this.dao2 = dao;
	}

	@Autowired
	public EmployeeServiceImpl2(EmployeeDAO dao2){
		this.dao2 = dao2;
	}
	@Override
	public ArrayList<EmployeeVO> selectAll() {
		// TODO Auto-generated method stub
		return dao2.selectAll();
	}

	@Override
	public EmployeeVO selectByID(int empid) {
		// TODO Auto-generated method stub
		return dao2.selectByID(empid);
	}

	@Override
	public List<String> selectJobs() {
		// TODO Auto-generated method stub
		return dao2.selectJobs();
	}

	@Override
	public List<DeptVO> selectDepts() {
		// TODO Auto-generated method stub
		return dao2.selectDepts();
	}

	@Override
	public int updateEmp(EmpDTO empDTO) {
		// TODO Auto-generated method stub
		return dao2.updateEmp(empDTO);
	}

	@Override
	public int insertEmp(EmpDTO empDTO) {
		// TODO Auto-generated method stub
		return dao2.insertEmp(empDTO);
	}

	@Override
	public int deleteEmp(int employee_id) {
		// TODO Auto-generated method stub
		return dao2.deleteEmp(employee_id);
	}
	
	

}
