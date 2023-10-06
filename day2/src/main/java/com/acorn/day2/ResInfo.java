package com.acorn.day2;

public class ResInfo {

	String nm;
	int open;
	int close;
	
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getClose() {
		return close;
	}
	public void setClose(int close) {
		this.close = close;
	}
	
	@Override
	public String toString() {
		return "가게정보 [nm=" + nm + ", open=" + open + ", close=" + close + "]";
	}
	
	public ResInfo(String nm, int open, int close) {
		super();
		this.nm = nm;
		this.open = open;
		this.close = close;
	}
	
	public ResInfo() {
		// TODO Auto-generated constructor stub
	}
}
