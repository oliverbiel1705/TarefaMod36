package br.com.gabdev.dao.jpa;

import br.com.gabdev.dao.generic.jpa.IGenericJapDAO;
import br.com.gabdev.domain.jpa.Persistente;

/**
 * @author gabdev
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
