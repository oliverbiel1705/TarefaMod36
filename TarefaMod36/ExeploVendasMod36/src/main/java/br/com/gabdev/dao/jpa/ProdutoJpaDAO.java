package br.com.gabdev.dao.jpa;

import br.com.gabdev.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gabdev.domain.jpa.ProdutoJpa;

/**
 * @author gabdev
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
