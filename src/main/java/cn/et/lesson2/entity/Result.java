package cn.et.lesson2.entity;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Result {
	
	private int code;
	
	private String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		if(message!=null && message.length()>1000)
			return message.substring(0, 1000);
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * 
	 * @param msg
	 */
	public void setMessage(Exception msg) {
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		msg.printStackTrace(new PrintStream(baos));
		this.message = new String(baos.toByteArray());
	}
}
