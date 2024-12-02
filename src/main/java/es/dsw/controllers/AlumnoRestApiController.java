package es.dsw.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.dsw.models.Alumno;

@Controller
@RestController
public class AlumnoRestApiController {
 
	@GetMapping(value = "/getAll", produces="application/json") 
	public ArrayList<Alumno> getAll(){
		
		ArrayList<Alumno> objResultado = new ArrayList<Alumno>();
		
		objResultado.add(new Alumno("55665544A", "Alfredo", "Martín Pérez", 34, true));
		objResultado.add(new Alumno("55665543B", "Carlos", "Gutierrez Bueno", 22, true));
		objResultado.add(new Alumno("55665542B", "Susana", "Hernandez Martín", 45, true));
		objResultado.add(new Alumno("55665541C", "Beatriz", "Bueno Pérez", 50, false));
		objResultado.add(new Alumno("55665549C", "Alejandro", "Sanchez Montesdeoca", 38, true));
		objResultado.add(new Alumno("55662544D", "Abian", "Pérez Pérez", 76, false));
		objResultado.add(new Alumno("55664544E", "Gustavo", "Ortega Dorta", 28, true));
		objResultado.add(new Alumno("55665564F", "Hector", "Dorta Pérez", 30, true));
		objResultado.add(new Alumno("55665554G", "Begoña", "Betancort Hernandez", 31, true));
		objResultado.add(new Alumno("15665144H", "Sara", "Martín Pérez", 39, true));
		objResultado.add(new Alumno("25665544T", "Kilian", "Bueno Jimenez", 42, false));
		objResultado.add(new Alumno("35665544N", "Kevin", "Montesdeoca Betancort", 40, true));
		
		return objResultado;
	}
	
	@PostMapping(value = "/getOne", produces="application/json")
	public Alumno getOne(@RequestParam(defaultValue="") String nif) {
		
		if (nif.trim().equals("")) {
			return null;
		} else {
			return new Alumno(nif, "Alfredo", "Martín Pérez", 34, true);
		}
		
	}
	
    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> agregarAlumno(@RequestBody Alumno alumno) {

        return new ResponseEntity<>("Alumno recibido correctamente", HttpStatus.CREATED);
    }
}
