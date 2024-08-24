/**
 * 
 */
package br.com.vpelizzarisilva.dao.jpa;

import br.com.vpelizzarisilva.dao.generic.jpa.GenericJpaDAO;
import br.com.vpelizzarisilva.domain.jpa.ProdutoJpa;

/**
 * @author Vinícius Pelizzari
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
