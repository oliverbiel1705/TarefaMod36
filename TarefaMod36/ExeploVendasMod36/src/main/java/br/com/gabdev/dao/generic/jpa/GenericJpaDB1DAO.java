package br.com.gabdev.dao.generic.jpa;

import br.com.gabdev.domain.jpa.Persistente;

import java.io.Serializable;

/**
 * @author gabdev
 *
 */
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
