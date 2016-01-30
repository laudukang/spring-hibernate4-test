package me.laudukang.persistence.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IDEA
 * Author: laudukang
 * Date: 2016/1/30
 * Time: 15:49
 * Version: 1.0
 */
public class UserDocPK implements Serializable {
    private int userId;
    private int docId;

    @Column(name = "user_id", nullable = false)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "doc_id", nullable = false)
    @Id
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

        UserDocPK userDocPK = (UserDocPK) o;

        if (userId != userDocPK.userId) return false;
        if (docId != userDocPK.docId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + docId;
        return result;
    }
}
