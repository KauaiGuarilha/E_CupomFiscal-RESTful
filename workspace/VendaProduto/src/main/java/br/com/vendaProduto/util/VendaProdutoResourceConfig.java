package br.com.vendaProduto.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
*
* @author Kauai Guarilha
*/
@ApplicationPath("rest")
public class VendaProdutoResourceConfig extends ResourceConfig {
	
	public VendaProdutoResourceConfig(){
		
		packages("br.com.vendaProduto.service");
	}
}
