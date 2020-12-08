package com.thibaut.persistence;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


@Entity
@Table(name = "T_customer")
@NamedQuery(name="T_customer.findAll", query="SELECT x FROM Company x")
public class Company {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idT_customer")
    private long id;

    @Column(name = "name", length = 45, nullable = false)
    private String name;
    
    @Column(name = "department", length = 45, nullable = false)
    private String department;
    
    @Column(name = "address", length = 45, nullable = false)
	private String address;
   




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
    }    


    public String get_name() {
		return name;
	}

	public void set_name(String name) {
		this.name = name;
    }


    public String get_department() {
		return department;
	}

	public void set_department(String department) {
		this.department = department;
    }


    public String get_address() {
		return address;
	}

	public void set_address(String address) {
		this.address = address;
    }


    @Override
	public String toString() {
        return "PersistedValue [id = " + id + "], [name = " + name + "], [department = " + department + "], [address = " + address + "]";
    }

}