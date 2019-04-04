package br.com.vendaProduto.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;

import br.com.vendaProduto.DAO.CupomDAO;
import br.com.vendaProduto.domain.Cupom;

/**
*
* @author Kauai Guarilha
*/
@Path("cupom")
public class CupomService {
	//http://localhost:8080/VendaProjeto/rest/cupom
	@GET
	public String listar() {
		
		CupomDAO cupomDao = new CupomDAO();
		
		List<Cupom> cupons = cupomDao.listagem("id_cupom");
		
		Gson gson = new Gson();
		
		String json = gson.toJson(cupons);
		
		return json;	
	}
	//http://localhost:8080/VendaProduto/rest/cupom/1
	@GET
	@Path("{codigo}")
	public String buscar(@PathParam("codigo") Long codigo) {
		
		CupomDAO cupomDao = new CupomDAO();
		Cupom cupom  = cupomDao.buscar(codigo);
		
		Gson gson = new Gson();
		
		String json = gson.toJson(cupom);
		
		return json;
	}
	
	@POST
	public String salvar(String json){
	
	    Gson gson = new Gson();
	 
	    Cupom cupom  = gson.fromJson(json, Cupom.class);
	
	    CupomDAO cupomDao = new CupomDAO();
	
	    cupomDao.inclusao(cupom);
	    
	    String jsonSaida = gson.toJson(cupom);
	    
	    return jsonSaida;
	}
	
	@PUT
	public String editar(String json){
		
		Gson gson = new Gson();
		
		Cupom cupom = gson.fromJson(json, Cupom.class);
		
		CupomDAO cupomDao = new CupomDAO();
		
		cupomDao.merge(cupom);
		
		String jsonSaida = gson.toJson(cupom);
		
		return jsonSaida;
	}
	
	@DELETE
	public String excluir(String json){
		
		Gson gson = new Gson();
		
		Cupom cupom = gson.fromJson(json, Cupom.class);
		
		CupomDAO cupomDao = new CupomDAO();
		
		cupomDao.exclusao(cupom);
		
		String jsonSaida = gson.toJson(cupom);
		
		return jsonSaida;
	}	
}
