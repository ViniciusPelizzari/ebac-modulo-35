/**
 * 
 */
package br.com.vpelizzarisilva.services;

import br.com.vpelizzarisilva.domain.Cliente;
import br.com.vpelizzarisilva.exceptions.DAOException;
import br.com.vpelizzarisilva.services.generic.IGenericService;

/**
 * @author Vinícius Pelizzari
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
