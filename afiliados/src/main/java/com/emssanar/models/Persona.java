package com.emssanar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


import java.io.Serializable;

@Entity
@Data
@Table(name = "persona")
public class Persona implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String apellido;
	private int edad;
	
	@ManyToOne
	@JoinColumn(name="id_eps")
	private Eps eps;
	@ManyToOne
	@JoinColumn(name="id_eps")
	private Pais pais;
	@ManyToOne
	@JoinColumn (name="id_estado")
	private Departamento estado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Departamento getEstado() {
		return estado;
	}
	public void setEstado(Departamento estado) {
		this.estado = estado;
	}
	
	
}
