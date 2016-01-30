package me.laudukang.persistence.model;

import javax.persistence.*;

/**
 * Created with IDEA
 * Author: laudukang
 * Date: 2016/1/30
 * Time: 15:49
 * Version: 1.0
 */
@Entity
@Table(name = "user_doc", schema = "spring_hibernate4_test")
@IdClass(UserDocPK.class)
public class UserDoc {
    private int userId;
    private int docId;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "doc_id", nullable = false)
    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDoc userDoc = (UserDoc) o;

        if (userId != userDoc.userId) return false;
        if (docId != userDoc.docId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + docId;
        return result;
    }
}
