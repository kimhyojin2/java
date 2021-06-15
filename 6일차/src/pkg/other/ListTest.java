package pkg.other;

import java.util.ArrayList;

/*
 * ArrayList에 데이터를 저장하고 조회하는 기능을 구현
 */
//1건의 메모에는 어떤 정보를 입력
//기능 = 메소드 : 동작 - 전체조회, 제목검색, 내용검색, 등록
class Memo {
	String title;     //필드 = 데이터
	String content;

public Memo(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
public class ListTest {
	ArrayList<Memo> list = new ArrayList<Memo>();

	//전체조회
	public void selectAll() {
		for(int i = 0; i<list.size(); i++) {
			Memo memo = list.get(i);
			System.out.println(memo.title + ":" + memo.content);
	}
	}
	//제목검색
	public void findTitle(String title) {
		for(int i = 0; i<list.size(); i++) {
			Memo memo = list.get(i);
			if(memo.title.equals(title)) {
				System.out.println(title);
			}
	}
		
	}
	//내용검색
	public void findContent(String content) {
		for(int i = 0; i<list.size(); i++) {
			Memo memo = list.get(i);
			if(memo.content.contains(content)) {
				System.out.println(content);
			}
	}
	}
	//등록
	public void insert() {
		//키보드로 입력받아서
		Memo memo = new Memo();
		memo.title = ;
		memo.content =
		list.add(memo);
	}
	
}	
public static void main(String[] args) {
	ListTest listTest =  new ListTest();
//	listTest.list.add(new Memo("자바 공부", "열공합시다"));
//	listTest.list.add(new Memo("자바 시험", "월요일에"));
//	listTest.list.add(new Memo("자바 프로젝트", "멋지게"));
	
	listTest.insert();
	listTest.insert();
	
//	listTest.selectAll();
//	listTest.findTitle("자바공부");
	
}
}

