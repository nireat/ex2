package com.choa.util;

public class PageMaker {
	private int perPage;
	private int perBlock;
	private int curPage;
	private MakePage makePage;
	private RowMaker rowMaker;
	
	public PageMaker(int curPage) {
		this(10, curPage);
	}
	public PageMaker(int perPage, int curPage) {
		this(perPage, 5, curPage);
	}
	public PageMaker(int perPage, int perBlock, int curPage) {
		this.perPage = perPage;
		this.perBlock = perBlock;
		this.curPage = curPage;
	}
	
	public MakePage getMakePage(int totalCount) {
		makePage = new MakePage();
		makePage.makePage(totalCount, curPage, perPage, perBlock);
		
		return makePage;
	}
	public RowMaker getRowMaker() {
		rowMaker = new RowMaker();
		rowMaker.setRow(curPage, perPage);
		
/*		rowMaker.setKind(kind);
		rowMaker.setSearch(search);*/
		
		return rowMaker;
	}
}
