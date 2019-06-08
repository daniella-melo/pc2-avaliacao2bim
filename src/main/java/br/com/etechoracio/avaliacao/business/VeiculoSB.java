package br.com.etechoracio.avaliacao.business;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.dao.VeiculoDAO;
import br.com.etechoracio.avaliacao.model.Veiculo;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class VeiculoSB extends BaseSB {
	
	private VeiculoDAO veiculoDAO;
	
	@Override
	protected void postConstructImpl() {
		veiculoDAO = getDAO(VeiculoDAO.class);
	
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Veiculo veiculo) {
		veiculoDAO.save(veiculo);
	}

}
