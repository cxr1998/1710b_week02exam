package com.cxr.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Colum {
	private Integer id;
	private String ckey;
	private String cdesc;
	private String cname;
	private String cproduce;
	private String location;
	private Double cprice;
	private String ctime;
	private String cdate;
	private String cbuff;
	private String cps;
	public Colum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Colum(Integer id, String ckey, String cdesc, String cname, String cproduce, String location, Double cprice,
			String ctime, String cdate, String cbuff, String cps) {
		super();
		this.id = id;
		this.ckey = ckey;
		this.cdesc = cdesc;
		this.cname = cname;
		this.cproduce = cproduce;
		this.location = location;
		this.cprice = cprice;
		this.ctime = ctime;
		this.cdate = cdate;
		this.cbuff = cbuff;
		this.cps = cps;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCkey() {
		return ckey;
	}
	public void setCkey(String ckey) {
		this.ckey = ckey;
	}
	public String getCdesc() {
		return cdesc;
	}
	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCproduce() {
		return cproduce;
	}
	public void setCproduce(String cproduce) {
		this.cproduce = cproduce;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getCprice() {
		return cprice;
	}
	public void setCprice(Double cprice) {
		this.cprice = cprice;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getCbuff() {
		return cbuff;
	}
	public void setCbuff(String cbuff) {
		this.cbuff = cbuff;
	}
	public String getCps() {
		return cps;
	}
	public void setCps(String cps) {
		this.cps = cps;
	}
	@Override
	public String toString() {
		return "Colum [id=" + id + ", ckey=" + ckey + ", cdesc=" + cdesc + ", cname=" + cname + ", cproduce=" + cproduce
				+ ", location=" + location + ", cprice=" + cprice + ", ctime=" + ctime + ", cdate=" + cdate + ", cbuff="
				+ cbuff + ", cps=" + cps + "]";
	}
	
	
}
