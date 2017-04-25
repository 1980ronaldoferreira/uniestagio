/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entityBean.Users;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author alefsilva
 */
public class userDAO {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction et;

    private void startTransaction() {
        emf = Persistence.createEntityManagerFactory("uniestagiosPU");
        em = emf.createEntityManager();
        et = em.getTransaction();
        et.begin();
    }

    private void endTransaction() {

        et.commit();
        em.close();

    }

    private String insertUser(User user) {

        String status;
        startTransaction();
        User userInsert = em.find(User.Class, User.getid());
        if (userInsert == null) {
            status = "Sucess";
            em.persist(userInsert);
        } else {
            status = "Duplicate_key";
        }

        endTransaction();
        return status;
    }

    public List searchUser() {
        startTransaction();
        Query q = em.createNativeQuery(query, User.class);
        List UserList = q.getResultList();
        endTransaction();
        return UserList;
    }

    public List<User> list() {
        startTransaction();
        Query q = em.createNativeQuery("User.findAll");
        List UserList = q.getResultList();
        endTransaction();
        return UserList;
    }

}
