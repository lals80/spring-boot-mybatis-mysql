package com.innerwave.ai.domain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BoardDomain {
	protected static final String NAMESPACE = "com.express.magarine.api"; //query.xml namespace
	
	@Autowired
	private SqlSession sqlSession;

	public List<Object> selectName(){
		return sqlSession.selectList(NAMESPACE + ".selectName"); //selectList:여러개의 결과물, selectOne:한개의 결과만을 출력할 때
	}															 //namespace의 query mapper에서 selectName 아이디의 쿼리문을 실행
}