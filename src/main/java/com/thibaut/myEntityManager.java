package com.thibaut;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.thibaut.persistence.*;


@ApplicationScoped
public class myEntityManager {
    @Inject
    private EntityManager em; 


    @Transactional 
    public void createUser(String first_name, String last_name, String login_name, String email, String phone1, String phone2, long customer_id, String password) {
        User user_tmp = new User();
        user_tmp.set_first_name(first_name);
        user_tmp.set_last_name(last_name);
        user_tmp.set_login_name(login_name);
        user_tmp.set_email(email);
        user_tmp.set_phone1(phone1);
        user_tmp.set_phone2(phone2);
        user_tmp.set_role("0");
        user_tmp.set_customer_id(customer_id);
        user_tmp.set_password(login_name);

        em.persist(user_tmp);
    }

    @Transactional 
    public void createUser_dummy(String login_name){
        User user_tmp = new User();
        user_tmp.set_first_name(login_name);
        user_tmp.set_last_name(login_name);
        user_tmp.set_login_name(login_name);
        user_tmp.set_email("a@a.com");
        user_tmp.set_phone1("+1-0123456789");
        user_tmp.set_phone2("+2-0123456789");
        user_tmp.set_role("0");
        user_tmp.set_customer_id(1);
        user_tmp.set_password(login_name);

        em.persist(user_tmp);
    }


}