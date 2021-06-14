package com.example.prm.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prm.model.Imc;

@RestController
@RequestMapping("/test")
public class ImcController {
	
	@GetMapping
	public ResponseEntity<String> CalcularIMC(@RequestBody Imc imc) {
		imc.setIMC(imc.getPeso(), imc.getAltura());
		return ResponseEntity.ok(imc.getconta_final());
	}
}