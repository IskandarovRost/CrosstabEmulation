package com.company.crosstabemulation.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|customer,operator")
@Table(name = "MATRIX_CALL")
@Entity(name = "matrix$Call")
public class Call extends StandardEntity {
    private static final long serialVersionUID = 8649544388637087341L;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_CALL")
    protected Date dateOfCall;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "CUSTOMER", length = 50)
    protected String customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OPERATOR_ID")
    protected Operator operator;

    public void setDateOfCall(Date dateOfCall) {
        this.dateOfCall = dateOfCall;
    }

    public Date getDateOfCall() {
        return dateOfCall;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }


}