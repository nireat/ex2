package com.choa.util;

public class RowMaker {
	private int startRow;
	private int lastRow;
	private String kind;
	private String search;
	
	public void setRow(int curPage, int perPage) {
		startRow = (curPage - 1) * perPage + 1;
		lastRow = curPage * perPage;
	}
	public int getStartRow() {
		return startRow;
	}
	public int getLastRow() {
		return lastRow;
	}
/*	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		if(kind == "" || kind == null) {
			kind = "title";
		}
		
		this.kind = kind;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		if(search == null){
			search = "%%";
		}else {
			search = "%" + search + "%";
		}
		
		this.search = search;
	}*/	
}