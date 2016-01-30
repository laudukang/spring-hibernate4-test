package me.laudukang.hibernate;

import me.laudukang.spring.config.PersistenceConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Created with IDEA
 * Author: laudukang
 * Date: 2016/1/28
 * Time: 16:49
 * Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class}, loader = AnnotationConfigContextLoader.class)
public class UserDocTest {
    @Autowired
    private SessionFactory sessionFactory;

    private Session session;

    @Before
    public void before() {
        session = sessionFactory.openSession();

        session.beginTransaction();

        final InitDatabase initDatabase = new InitDatabase(sessionFactory);
        // initDatabase.createDoc();
        // initDatabase.createUser();
        initDatabase.createUserDoc();

    }

    @After
    public void after() {
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void getUser() {
        System.out.println("in getUser()");
    }

}
