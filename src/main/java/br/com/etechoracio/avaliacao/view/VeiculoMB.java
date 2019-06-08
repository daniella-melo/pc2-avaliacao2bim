package br.com.etechoracio.avaliacao.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.avaliacao.business.VeiculoSB;
import br.com.etechoracio.avaliacao.model.Veiculo;
import br.com.etechoracio.common.view.BaseMB;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")
public class VeiculoMB extends BaseMB {
	@Autowired
	private VeiculoSB veiculoSB;
	
	private Veiculo edit = new Veiculo();
	
	public void onSave() {
		veiculoSB.save(edit);
		showInsertMessage();
	}
	
	/*private List<Veiculo> registros;
	
	protected void postConstruct() {
		registros = veiculoSB.findAll();
	}*/
	
}
