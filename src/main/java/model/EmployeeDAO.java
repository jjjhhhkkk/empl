package model;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeDAO {
	public ArrayList<EmployeeVO> selectAll();
	public EmployeeVO selectByID(int empid);
	public List<String> selectJobs();
	public List<DeptVO> selectDepts();
	public int updateEmp(EmpDTO empDTO);
	public int insertEmp(EmpDTO empDTO);
	public int deleteEmp(int employee_id);
}
