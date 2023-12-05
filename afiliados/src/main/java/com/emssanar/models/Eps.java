package com.emssanar.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

public class Eps {
	
	@Entity
	@Data
	@Table(name = "eps")
	public class Pais implements Serializable {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String nombre;
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
		
		

}
}