package br.com.gabdev.dao.jpa;

import br.com.gabdev.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.gabdev.domain.jpa.ClienteJpa2;

/**
 * @author gabdev
 *
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
