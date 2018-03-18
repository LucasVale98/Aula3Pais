package service;

import dao.PaisDAO;
import model.Pais;

public class PaisService {

	PaisDAO dao = new PaisDAO();
	
	public int Criar(Pais pais) {
		
		return dao.criar(pais);
		
	}
	
	public void atulizar(Pais pais) {
		dao.atualizar(pais);
	}
	
	public void excluir(int id) {
		dao.excluir(id);
	}
	
	public Pais carregar(int id) {
		return dao.carrega(id);
	}
		
}
