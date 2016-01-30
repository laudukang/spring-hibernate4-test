package me.laudukang.hibernate;

import me.laudukang.persistence.model.Doc;
import me.laudukang.persistence.model.User;
import me.laudukang.persistence.model.UserDoc;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created with IDEA
 * Author: laudukang
 * Date: 2016/1/27
 * Time: 23:23
 * Version: 1.0
 */
public class InitDatabase {
    private SessionFactory sessionFactory;

    public InitDatabase(final SessionFactory sessionFactory) {
        super();
        this.sessionFactory = sessionFactory;
    }

    public void createDoc() {
        Session session = null;
        Transaction tx = null;
        session = sessionFactory.openSession();
        tx = session.getTransaction();
        try {
            tx.begin();
            for (int i = 1; i < 5; i++) {
                final Doc doc = new Doc();
                doc.setTitle("title_" + i);
                session.save(doc);
            }
            tx.commit();
            session.flush();
        } catch (final HibernateException he) {
            if (tx != null)
                tx.rollback();
            System.out.println("Not able to open session");
            he.printStackTrace();
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null)
                session.close();
        }
    }

    public void createUser() {
        Session session = null;
        Transaction tx = null;
        session = sessionFactory.openSession();
        tx = session.getTransaction();
        try {
            tx.begin();
            for (int i = 1; i < 5; i++) {
                System.out.println("i=" + i);
                final User user = new User();
                user.setName("name_" + i);
                session.save(user);
                //session.merge(user);
            }
            tx.commit();
            session.flush();
        } catch (final HibernateException he) {
            if (tx != null)
                tx.rollback();
            System.out.println("Not able to open session");
            he.printStackTrace();
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null)
                session.close();
        }
    }

    public void createUserDoc() {
        Session session = null;
        Transaction tx = null;
        session = sessionFactory.openSession();
        tx = session.getTransaction();
        try {
            tx.begin();
            for (int i = 1; i < 5; i++) {
                final Doc doc = new Doc();
                doc.setTitle("title_user_doc_" + i);
                session.save(doc);
                final User user = new User();
                user.setName("name_user_doc_" + i);
                session.save(user);
                final UserDoc userDoc = new UserDoc();
                userDoc.setDocId(doc.getId());
                userDoc.setUserId(user.getId());
                session.save(userDoc);
            }
            tx.commit();
            session.flush();
        } catch (final HibernateException he) {
            if (tx != null)
                tx.rollback();
            System.out.println("Not able to open session");
            he.printStackTrace();
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null)
                session.close();
        }
    }

}
