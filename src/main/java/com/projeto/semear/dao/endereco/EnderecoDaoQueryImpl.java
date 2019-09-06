package com.projeto.semear.dao.endereco;

import com.projeto.semear.model.Endereco;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDaoQueryImpl implements EnderecoDaoQuery {


    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<Endereco> buscarTodos(Pageable pageable) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Endereco> criteria = builder.createQuery(Endereco.class);
        Root<Endereco> root = criteria.from(Endereco.class);

        List<Predicate> predicates = new ArrayList<>();
        criteria.where(predicates.toArray(new Predicate[predicates.size()]));

        TypedQuery<Endereco> query = manager.createQuery(criteria);

        return new PageImpl<>(query.getResultList(), pageable, 50);
    }

}
