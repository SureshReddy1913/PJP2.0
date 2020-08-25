package com.sapient.transaction;

import java.util.Date;
import java.util.Objects;

public class OutputTransaction {
	
	private String client_id;
	private String trans_type;
	private Date trans_date;
	private String priority;
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public Date getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
	@Override
	public int hashCode()
	   {
	      return Objects.hash(this.getClient_id(),this.getTrans_type(),this.getTrans_date(),this.getPriority());
	   }
	@Override
	public boolean equals(Object o) {
		if (this == o) { 
            return true; 
        } 
        if (o == null) { 
            return false; 
        } 
        if (this.getClass() != o.getClass()) { 
            return false; 
        } 
        OutputTransaction ot=(OutputTransaction) o;
        if(ot.getClient_id()!=this.getClient_id()||ot.getTrans_type()!=this.getTrans_type()
        		||ot.getTrans_date()!=this.getTrans_date()||ot.getPriority()!=this.getPriority())
        	return false;
        
        return true;
		
	}
	
}
