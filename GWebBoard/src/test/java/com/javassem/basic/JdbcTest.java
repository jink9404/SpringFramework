package com.javassem.basic;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import lombok.extern.log4j.Log4j;

@Log4j//로그 출력
public class JdbcTest {
	//static 초기화 이 class를 읽을때 초기화
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try {
			Connection con = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.11:1521:orcl", 
					"MJ", "0413");
			System.out.println("[연결성공]");
			log.info("---------연결성공---------"+con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
