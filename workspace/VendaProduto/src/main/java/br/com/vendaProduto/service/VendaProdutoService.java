package br.com.vendaProduto.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
*
* @author Kauai Guarilha
*/
@Path("vendaproduto")
public class VendaProdutoService {

	@GET
	public String  exibir() {
		return "Teste da venda";
	}
}
