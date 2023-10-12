package com.acorn.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acorn.day5test.Member;
import com.acorn.day5test.MemberService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )
public class MemberServiceTest {

	MemberService service;
	@Test
	public void test() {
		//fail("Not yet implemented");
		ArrayList<Member> list = service.getMemberList();
		assertTrue(list.size()>=1);
	}

}
