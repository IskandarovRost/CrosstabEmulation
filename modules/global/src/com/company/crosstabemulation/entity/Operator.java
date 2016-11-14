package com.company.crosstabemulation.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "MATRIX_OPERATOR")
@Entity(name = "matrix$Operator")
public class Operator extends StandardEntity {
    private static final long serialVersionUID = -7108686781726194535L;

    @Column(name = "NAME", length = 50)
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}