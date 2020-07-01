package br.com.etechoracio.rony;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeiculoController {
	
	@RequestMapping("/veiculos")
	public List<Veiculos> ListarTodos() {
		return Arrays.asList(
				new Veiculos
				(		"Monza GI",
						"Chevrolet",
						"2.0",
						"1994",
						"R$9.900"
				),
				new Veiculos
				(
						"Sprinter Van Executiva",
						"Mercedes-Benz",
						"2.2",
						"2020",
						"R$184.900"
				),
				new Veiculos
				(		"Biz 110i" ,
						"Honda",
						"110 cc",
						 "2019",
						 "R$9.490"
				)
		);
		
	}
}
