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
@Table(name = "T_service_contract")
@NamedQuery(name="T_service_contract.findAll", query="SELECT x FROM Contract x")
public class Contract {
    

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idT_service_contract")
    private long id;

    
    @Column(name = "start_date", length = 45, nullable = false)
    private String start_date;
    
    @Column(name = "end_date", length = 45, nullable = false)
    private String end_date;
    
    @Column(name = "ip1", length = 45, nullable = true)
    private String ip1;
    
    @Column(name = "ip2", length = 45, nullable = true)
    private String ip2;
    
    @Column(name = "ip3", length = 45, nullable = true)
    private String ip3;
    
    @Column(name = "numeric_feature_1", length = 45, nullable = true)
    private String numeric_feature_1;
    
    @Column(name = "numeric_feature_2", length = 45, nullable = true)
    private String numeric_feature_2;
    
    @Column(name = "numeric_feature_3", length = 45, nullable = true)
    private String numeric_feature_3;
    
    @Column(name = "idT_user1", nullable = false)
    private long idT_user1;
    
    @Column(name = "idT_user2")
    private long idT_user2;
    




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
    }    



    @Override
	public String toString() {
		//return "PersistedValue [id=" + id + "], [...] ...";
        return "PersistedValue [id = " + id + "], [start_date = " + start_date + "], [end_date = " + end_date + "], [ip1 = " + ip1 + "], [ip2 = " + ip2 + "], [ip3 = " + ip3 + "], [numeric_feature_1 = " + numeric_feature_1 + "], [numeric_feature_2 = " + numeric_feature_2 + "], [numeric_feature_3 = " + numeric_feature_3 + "], [idT_user1 = " + idT_user1 + "], [idT_user2 = " + idT_user2 + "]";
    }
}