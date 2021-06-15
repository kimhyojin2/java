package co.vendingmachine.access;

public interface MachineAccess {
	// 동전투입
	public void insert_Coin();

	// 잔돈 반환
	public void return_Coin();

	// 메뉴 등록
	public void enter_Menu();

	// 메뉴 삭제
	public void delete_Menu();

	// 메뉴 수정
	public void update_Menu();

	// 재고 등록
	public void enter_Stock();

	// 메뉴 보기
	public void print_Menu();

	// 메뉴 선택
	public void choice_Menu();
}
