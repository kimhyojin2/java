package co.vendingmachine.access;

import java.util.ArrayList;

import co.vendingmachine.model.Machine;

public interface MachineAccess {
	// 동전투입
	public void insert_Coin(Machine machine);

	// 잔돈 반환
	public void return_Coin();

	// 메뉴 등록 (관리자)
	public void enter_Menu(Machine machine);

	// 메뉴 삭제 (관리자)
	public void delete_Menu(String drink_name);

	// 메뉴 수정 (관리자)
	public void update_Menu(Machine machine);

	// 재고 등록 (관리자)
	public void enter_Stock();

	// 메뉴 보기
	public ArrayList<Machine> print_Menu();

	// 메뉴 선택
	public Machine choice_Menu(String drink_name);
}
