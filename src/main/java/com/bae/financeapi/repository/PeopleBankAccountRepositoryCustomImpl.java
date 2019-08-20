package com.bae.financeapi.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bae.financeapi.model.PeopleBankAccount;

@Repository
public class PeopleBankAccountRepositoryCustomImpl implements PeopleBankAccountRepositoryCustom {

	private EntityManager entityManager;

	@Autowired
	public PeopleBankAccountRepositoryCustomImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<PeopleBankAccount> findFinance(String forenames, String surname, String homeAddress, Date dateOfBirth) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<PeopleBankAccount> cq = cb.createQuery(PeopleBankAccount.class);

		Root<PeopleBankAccount> citizen = cq.from(PeopleBankAccount.class);
		List<Predicate> predicates = new ArrayList<Predicate>();

		if (forenames != null && !forenames.trim().contentEquals("")) {
			predicates.add(cb.equal(cb.lower(citizen.get("forenames")), forenames.toLowerCase()));
		}

		if (surname != null && !surname.trim().contentEquals("")) {
			predicates.add(cb.equal(cb.lower(citizen.get("surname")), surname.toLowerCase()));
		}

		if (homeAddress != null && !homeAddress.trim().contentEquals("")) {
			predicates.add(cb.equal(cb.lower(citizen.get("homeAddress")), homeAddress.toLowerCase()));
		}

		if (dateOfBirth != null && !dateOfBirth.toString().contentEquals("")) {
			predicates.add(cb.equal(cb.lower(citizen.get("dateOfBirth")), dateOfBirth));
		}

		if (predicates.isEmpty()) {
			return new ArrayList<PeopleBankAccount>();
		}

		cq.where(predicates.toArray(new Predicate[0]));

		TypedQuery<PeopleBankAccount> query = entityManager.createQuery(cq);

		return query.getResultList();
	}
}