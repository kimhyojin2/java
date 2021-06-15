package co.memo.view;

import java.util.List;

import co.memo.access.MemoAccess;
import co.memo.access.MemoDAO;
import co.memo.access.ScannerUtil;
import co.memo.model.Memo;

public class MemoCliApp {

	MemoAccess memoList = new MemoDAO(); // 데이터베이스 입출력 처리하세요.
	

	public void start() {
		int menunum;
		do {
			menuTitle();
			menunum = ScannerUtil.readInt("입력");
			switch (menunum) {
			case 1:
				insert();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				selectAll();
				break;
			case 5:
				FindByDate();
				break;
			case 6:
				FindByContent();
				break;
			}
		} while (menunum != 0);
		System.out.println("프로그램 종료.");
	}

	public void insert() {
		Memo memo = ScannerUtil.readMemo();
		memoList.insert(memo);
	}

	public void update() {
		Memo memo = new Memo();
		System.out.println("수정할 제목을 입력해주세요.");
		memo.setTitle(ScannerUtil.readStr());
		System.out.println("새 내용을 입력해주세요.");
		memo.setContent(ScannerUtil.readStr());
		memoList.update(memo);

	}

	public void delete() {
		String title = ScannerUtil.readStr();
		memoList.delete(title);

	}

	public void selectAll() {
		List<Memo> list = memoList.selectAll();
		for (Memo memo : list) {
			System.out.println(memo);
		}

	}

	public void FindByDate() {
		String date = ScannerUtil.readStr();
		Memo memo = memoList.FindByDate(date);
		System.out.println(memo);

	}

	public void FindByContent() {
		String content = ScannerUtil.readStr();
		Memo memo = memoList.FindByContent(content);
		System.out.println(content);

	}

	public void menuTitle() {
		System.out.println("== 메모 관리 ==");
		System.out.println("=1. 메모 추가");
		System.out.println("=2. 메모 수정");
		System.out.println("=3. 메모 삭제");
		System.out.println("=4. 전체 조회");
		System.out.println("=5. 날짜로 조회");
		System.out.println("=6. 내용으로 조회");
		System.out.println("=0. 종료");
		System.out.println("===============");

	}

}
