package com.example.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rmascotas {
@Id
	private long Cod;
	private String Raza;
	private String Estado;
	private String Peso;
	private String Edad;
	private String Color;
	public long getCod() {
		return Cod;
	}
	public void setCod(long cod) {
		Cod = cod;
	}
	public String getRaza() {
		return Raza;
	}
	public void setRaza(String raza) {
		Raza = raza;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getPeso() {
		return Peso;
	}
	public void setPeso(String peso) {
		Peso = peso;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}




}
