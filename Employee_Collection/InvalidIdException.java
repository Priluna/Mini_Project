package com.qsp.collection;

public class InvalidIdException extends RuntimeException {
private String msg;
InvalidIdException(String msg){
	this.msg=msg;
}
public String getMsg() {
	return msg;
}

}
