package com.company.crosstabemulation.listener;

import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.company.crosstabemulation.entity.Operator;
import com.haulmont.cuba.core.listener.BeforeUpdateEntityListener;

@Component("matrix_NewEntityListener")
public class NewEntityListener implements BeforeInsertEntityListener<Operator>, BeforeUpdateEntityListener<Operator> {


    @Override
    public void onBeforeInsert(Operator entity, EntityManager entityManager) {

    }


    @Override
    public void onBeforeUpdate(Operator entity, EntityManager entityManager) {

    }


}