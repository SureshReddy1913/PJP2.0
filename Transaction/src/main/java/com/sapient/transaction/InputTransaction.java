package com.sapient.transaction;

import java.util.Date;

public class InputTransaction {
	private String trans_id;
	private String client_id;
	private String security_id;
	private String transaction_type;
	private Date trans_date;
	private double market_value;
	private String priority_flag;
	public String getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getSecurity_id() {
		return security_id;
	}
	public void setSecurity_id(String security_id) {
		this.security_id = security_id;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public Date getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	public double getMarket_value() {
		return market_value;
	}
	public void setMarket_value(double market_value) {
		this.market_value = market_value;
	}
	public String getPriority_flag() {
		return priority_flag;
	}
	public void setPriority_flag(String priority_flag) {
		this.priority_flag = priority_flag;
	}
	
}
