package com.biantech.spring4.hessian.api;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

import java.io.Serializable;
import java.util.Date;

/**
 * <code>User</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-08-29
 */
public class User implements Serializable {

    private Long id;
    private String name;
    private Date createTime;

    public User() {
    }

    public User(Long id, String name, Date createTime) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id",this.getId())
                .add("name",this.getName())
                .add("createTime",this.getCreateTime())
                .omitNullValues().toString();


    }
}
