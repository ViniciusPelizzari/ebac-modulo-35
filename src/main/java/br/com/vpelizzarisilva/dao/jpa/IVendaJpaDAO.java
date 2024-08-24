/**
 * 
 */
package br.com.vpelizzarisilva.dao.jpa;

import br.com.vpelizzarisilva.dao.generic.jpa.IGenericJapDAO;
import br.com.vpelizzarisilva.domain.jpa.VendaJpa;
import br.com.vpelizzarisilva.exceptions.DAOException;
import br.com.vpelizzarisilva.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Vinícius Pelizzari
 *
 */
public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	/**
	 * Usando este método para evitar a exception org.hibernate.LazyInitializationException
	 * Ele busca todos os dados de objetos que tenham colletion pois a mesma por default é lazy
	 * Mas você pode configurar a propriedade da collection como fetch = FetchType.EAGER na anotação @OneToMany e usar o consultar genérico normal
	 * 
	 * OBS: Não é uma boa prática utiliar FetchType.EAGER pois ele sempre irá trazer todos os objetos da collection
	 * mesmo sem precisar utilizar.
	 * 
	 * 
	 * @see VendaJpa produtos
	 * 
	 * @param id
	 * @return
	 */
	public VendaJpa consultarComCollection(Long id);
}
