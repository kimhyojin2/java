package co.memo.access;

import java.util.ArrayList;

import co.memo.model.Memo;

public interface MemoAccess {
	public void insert(Memo memo);
	public void update(Memo memo);
	public void delete(String title);
	public ArrayList<Memo> selectAll();
	public Memo FindByDate(String date);
	public Memo FindByContent(String content);
}
