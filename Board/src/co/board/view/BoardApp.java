package co.board.view;

import java.util.ArrayList;
import java.util.Scanner;

import co.board.access.BoardAccess;
import co.board.access.BoardDAO;
import co.board.access.ScannerUtil;
import co.board.model.Board;

public class BoardApp {
	BoardAccess boardList = new BoardDAO();
	Scanner scn = new Scanner(System.in);

	// 프로그램시작
	public void start() {
		int menunum;
		do {
			menuTitle(); // 메뉴 출력
			System.out.println("입력");
			menunum = ScannerUtil.readInt(); // 메뉴 선택
			switch (menunum) { // 실행
			case 1:
				selectAll();
				break;
			case 2:
				insert();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				selectOne();
				break;
			case 6:
				comment();
				break;
			}
		} while (menunum != 0);
	}

	public void menuTitle() {
		System.out.println("========친구관리========");
		System.out.println("|    1.  전체 리스트   |");
		System.out.println("|      2. 글 등록     |");
		System.out.println("|      3. 글 수정     |");
		System.out.println("|      4. 글 삭제     |");
		System.out.println("| 5. 한건조회(상세보기) |");
		System.out.println("|       6. 댓글      |");
		System.out.println("|       7.로그인      |");
		System.out.println("========0. 종료========");
	}

	// 전체 리스트
	public void selectAll() {
		ArrayList<Board> list = boardList.selectAll();
		for (Board board : list) {
			System.out.println(board);
		}
	}

	// 글 등록
	public void insert() {
		Board board = ScannerUtil.readBoard();
		boardList.insert(board);
	}

	// 글 수정
	public void update() {
		Board board = new Board();
		System.out.println("수정할 글의 아이디를 입력하세요>");
		int id = scn.nextInt();
		board.setB_id(id);
		System.out.println("새 글을 입력해주세요.");
		board.setB_content(ScannerUtil.readStr());
		boardList.update(board);
	}

	// 글 삭제
	public void delete() {
		System.out.println("삭제할 글의 아이디를 입력하세요>");
		int b_id = ScannerUtil.readInt();
		boardList.delete(b_id);
	}

	// 한건조회(상세보기)
	public void selectOne() {
		System.out.println("조회할 글의 아이디를 입력하세요>");
		int id = ScannerUtil.readInt();
		Board board = boardList.selectOne(id);
		System.out.println(board);

	}

	// 댓글
	public void comment() {
		System.out.println("댓글을 입력하세요>");
		Board board = ScannerUtil.readBoard();
		boardList.comment(board);
	}

	// 로그인

}
