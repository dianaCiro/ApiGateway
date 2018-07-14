package comida.mexicana.comidamexicana.domain;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import comida.mexicana.comidamexicana.controller.Burritos;

@RestController
public class BurritosController {

	@RequestMapping(value = "/burrito", method = RequestMethod.GET)
	public ResponseEntity<Burritos> consultarPasta(){
		Burritos burritos = new Burritos();
		burritos.setIdBurrito(1);
		burritos.setNombre("Al Pastor");
		return ResponseEntity.ok(burritos);
	}
}
