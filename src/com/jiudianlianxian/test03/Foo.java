package com.jiudianlianxian.test03;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Foo {
	
	private String vString = "vStringhehhehe"; 
    private char vchar = 'x'; 

    private byte vbyte = 64; 
    private short vshort = 128; 
    private int vint = 65535; 
    private long vlong = 9999999L; 

    private float vfloat = 12.1f; 
    private double vdouble = 22.203d; 

    private boolean vboolean = false; 

//    private Date vdate = new Date(); 
    private Date dddd = new Date(); 
    private Date vDate = new Date(); 
    private Date v_Date = new Date(); 
    private Object vnull = null; 

//    private String[] avString = {"aaa", "bbb", "ccc"}; 
//    private int[] avint = {1, 2, 3, 4}; 
//    private boolean[] avboolean = {true, false, true, true}; 
//
//    private List<String> listString = new ArrayList<String>(); 
//    private Map<String, String> map = new HashMap<String, String>(); 

    private Bar bar = new Bar();
//    private Bar[] avBar = {new Bar(), new Bar()}; 
//    private List<Bar> listBar = new ArrayList<Bar>(); 

//    { 
//            listString.add("listString1"); 
//            listString.add("listString2"); 
//            listString.add("listString3"); 

//            map.put("x", "s11111x"); 
//            map.put("y", "s22222y"); 
//            map.put("z", "s33333z"); 

//            listBar.add(new Bar()); 
//            listBar.add(new Bar()); 
//            listBar.add(new Bar()); 
//    }

	public String getvString() {
		return vString;
	}

	public void setvString(String vString) {
		this.vString = vString;
	}

	public char getVchar() {
		return vchar;
	}

	public void setVchar(char vchar) {
		this.vchar = vchar;
	}

	public byte getVbyte() {
		return vbyte;
	}

	public void setVbyte(byte vbyte) {
		this.vbyte = vbyte;
	}

	public short getVshort() {
		return vshort;
	}

	public void setVshort(short vshort) {
		this.vshort = vshort;
	}

	public int getVint() {
		return vint;
	}

	public void setVint(int vint) {
		this.vint = vint;
	}

	public long getVlong() {
		return vlong;
	}

	public void setVlong(long vlong) {
		this.vlong = vlong;
	}

	public float getVfloat() {
		return vfloat;
	}

	public void setVfloat(float vfloat) {
		this.vfloat = vfloat;
	}

	public double getVdouble() {
		return vdouble;
	}

	public void setVdouble(double vdouble) {
		this.vdouble = vdouble;
	}

	public boolean isVboolean() {
		return vboolean;
	}

	public void setVboolean(boolean vboolean) {
		this.vboolean = vboolean;
	}

	public Date getDddd() {
		return dddd;
	}

	public void setDddd(Date dddd) {
		this.dddd = dddd;
	}

	public Date getvDate() {
		return vDate;
	}

	public void setvDate(Date vDate) {
		this.vDate = vDate;
	}

	public Date getV_Date() {
		return v_Date;
	}

	public void setV_Date(Date v_Date) {
		this.v_Date = v_Date;
	}

	public Object getVnull() {
		return vnull;
	}

	public void setVnull(Object vnull) {
		this.vnull = vnull;
	}

	
	
	
	
	
	
	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}
 
    
    

}
