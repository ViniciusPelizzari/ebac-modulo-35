/**
 * 
 */
package br.com.vpelizzarisilva.dao.jpa;

import br.com.vpelizzarisilva.dao.generic.jpa.GenericJpaDAO;
import br.com.vpelizzarisilva.domain.jpa.ClienteJpa;

/**
 * @author Vinícius Pelizzari
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
