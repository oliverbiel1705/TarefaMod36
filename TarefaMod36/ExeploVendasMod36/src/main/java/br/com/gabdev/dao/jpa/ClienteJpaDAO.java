package br.com.gabdev.dao.jpa;

import br.com.gabdev.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gabdev.domain.jpa.ClienteJpa;

/**
 * @author gabdev
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
