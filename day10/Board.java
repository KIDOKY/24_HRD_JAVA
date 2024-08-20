package day10;

import java.sql.Blob;
import java.util.Date;

public class Board {
	
	private int bno;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private Date bdate;
	private String bfilename;
	private Blob bfiledata;
	
	public Board() {
		
	}
	
	public Board(String btitle, String bcontent, String bwriter, Date bdate) {
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bdate = bdate;
	}
	
	public Board(String btitle, String bcontent, String bwriter) {
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public String getBfilename() {
		return bfilename;
	}
	public void setBfilename(String bfilename) {
		this.bfilename = bfilename;
	}
	public Blob getBfiledata() {
		return bfiledata;
	}
	public void setBfiledata(Blob bfiledata) {
		this.bfiledata = bfiledata;
	}
}
