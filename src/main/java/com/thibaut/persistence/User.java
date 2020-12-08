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

//import io.quarkus.security.common.BcryptUtil;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;


@Entity
@Table(name = "T_user")
@NamedQuery(name="T_user.findAll", query="SELECT x FROM User x")
@UserDefinition
public class User {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idT_user")
    private long id;

    
    @Column(name = "first_name", length = 45, nullable = false)
    private String first_name;
    
    @Column(name = "last_name", length = 45, nullable = false)
    private String last_name;
	
	@Username
    @Column(name = "login_name", length = 45, nullable = false)
	private String login_name;

    @Column(name = "email", length = 45, nullable = false)
    private String email;
    
    @Column(name = "phone1", length = 45, nullable = true)
    private String phone1;
    
    @Column(name = "phone2", length = 45, nullable = true)
    private String phone2;
	
	@Roles
    @Column(name = "role", length = 45, nullable = true)
    private String role;
    
    @Column(name = "customer_id")
    private long customer_id;
	
	@Password
    @Column(name = "password", length = 45, nullable = false)
    private String password;


	public User(){

	}

	public User(String first_name, String last_name, String login_name, String email, String phone1, String phone2, long customer_id, String password){
		this.first_name = first_name;
		this.last_name = last_name;
		this.login_name = login_name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.role = "user";	//"admin"
		this.customer_id = customer_id;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
    }    
    

    public String get_first_name() {
		return first_name;
	}

	public void set_first_name(String first_name) {
		this.first_name = first_name;
    }
    

    public String get_last_name() {
		return last_name;
	}

	public void set_last_name(String last_name) {
		this.last_name = last_name;
    }
    

    public String get_login_name() {
		return login_name;
	}

	public void set_login_name(String login_name) {
		this.login_name = login_name;
    }
    

    public String get_email() {
		return email;
	}

	public void set_email(String email) {
		this.email = email;
    }
    

    public String get_phone1() {
		return phone1;
	}

	public void set_phone1(String phone1) {
		this.phone1 = phone1;
    }
    

    public String get_phone2() {
		return phone2;
	}

	public void set_phone2(String phone2) {
		this.phone2 = phone2;
    }
    

    public String get_role() {
		return role;
	}

	public void set_role(String role) {
		this.role = role;
    }
    
    public long get_customer_id() {
		return customer_id;
	}

	public void set_customer_id(long customer_id) {
		this.customer_id = customer_id;
    }
	
	public String get_password() {
		return password;
	}

	public void set_password(String password) {
		this.password = password;
    }

    @Override
	public String toString() {
		//return "PersistedValue [id=" + id + "], [...] ...";
		return "PersistedValue [id = " + id + "], [first_name = " + first_name + "], [last_name = " + last_name + "], [login_name = " + login_name + "], [email = " + email + "], [phone1 = " + phone1 + "], [phone2 = " + phone2 + "], [role = " + role + "], [customer_id = " + customer_id + "], [password = " + password + "]";
	}
	


}