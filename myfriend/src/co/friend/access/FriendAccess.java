package co.friend.access;

import java.util.ArrayList;

import co.friend.model.Friend;

public interface FriendAccess {
	String model = "ddd";
	/*
	 * 인터페이스 : 상수필드 +추상메서드({}바디 없는 메서드~)
	 * 상수필드: public static final 이 생략되어 있다. 
	 * 메서드: public abstract
	 */

		//등록
	   public void insert(Friend Friend) ;
	   
	   //수정
	   public void update(Friend Friend) ;
	   
	   //삭제
	   public void delete(String name) ;
	   
	   //전체조회
	   public ArrayList<Friend> selectAll() ;
		
	   //단건조회
	   public Friend selectOne(String name) ;
	   
	   //전화번호로 찾기
	   public Friend findTel(String tel);
	
	
	   
	}

