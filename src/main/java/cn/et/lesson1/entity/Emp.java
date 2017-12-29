package cn.et.lesson1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	@Column(name = "ename")
	private String ename;
	@Column
	private Double esal;
	@Column
	private Integer did;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsal() {
		return esal;
	}

	public void setEsal(Double esal) {
		this.esal = esal;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}
}