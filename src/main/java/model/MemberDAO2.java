package model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("mdao")
public class MemberDAO2 {

	
	@Autowired
	SqlSession sqlSession;
		
	
	
	public List<MemberDTO> selectAll() {
		return sqlSession.selectList("javab.member.selectAll");
	}

	public MemberDTO selectById(int mno) {
		return sqlSession.selectOne("javab.member.selectByMno", mno);
	}


	
	public int insertEmp(MemberDTO empDTO) {
		return sqlSession.insert("javab.member.insertEmp" ,empDTO);
	}

	public int updateEmp(MemberDTO empDTO) {
		return sqlSession.update("javab.member.memUpdate",empDTO);
	}
	
	public int deleteEmp(int empid){
		return sqlSession.delete("javab.member.memDelete",empid);
	}
	

}
