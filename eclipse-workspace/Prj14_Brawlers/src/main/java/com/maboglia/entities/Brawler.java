package com.maboglia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "brawlers")
public class Brawler {

	@Id
	private int id;
	
	private String nome;
	private String carattere;
	private String rarity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCarattere() {
		return carattere;
	}
	public void setCarattere(String carattere) {
		this.carattere = carattere;
	}
	public String getRarity() {
		return rarity;
	}
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
	
	
	
}
