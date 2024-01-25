package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Alumno;

@RestController
public class AlumnoController {
	
	List<Alumno> alumnos = new ArrayList<Alumno>(
				List.of(new Alumno(1,"Bob","Ross",9.5),
						new Alumno(2,"Ana","Lopez",4.5),
						new Alumno(3,"Troy","McLure",2.1),
						new Alumno(4,"Edna","Clavados",5.5))
			);
	
	@GetMapping("/alumnos")
	public List<Alumno> listAlumnos() {
		
		return this.alumnos;
	}
	
	@GetMapping("/alumnos/{id}")
	public Alumno getAlumnoById(@PathVariable int id) {
		Alumno alumnoById = null;
		
		for(Alumno al:alumnos) {
			if(al.getId()==id) {
				alumnoById = al;
			}
		}
		
		return alumnoById;
	}
	
	@DeleteMapping("/alumnos/{id}")
	public String deleteAlumnoById(@PathVariable int id) {
		return "Eliminando el alumno "+id;
	}
	
	@PostMapping(value = "/alumnos/add",consumes ="application/json", produces = "application/json")
	public String addAlumno(@RequestBody Alumno alumno) {
		this.alumnos.add(alumno);
		return "Alumno agregado correctamente";
	}
	
	@PutMapping(value = "/alumnos/update/{id}",consumes ="application/json", produces = "application/json")
	public String updateAlumno(@PathVariable int id, @RequestBody Alumno alumno) {
		int count = 0;
		for(Alumno al:alumnos) {
			
			if(al.getId()==id) {
				this.alumnos.get(count).update(alumno);
			}
			count++;
		}
		
		return "Alumno actualizado.";
	}
}