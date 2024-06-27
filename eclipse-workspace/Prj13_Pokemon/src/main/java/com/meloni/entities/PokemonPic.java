package com.meloni.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // annotazione hibernate che dice a spring che la classe corrisponde a una tabella del DB
@Table(name = "pokemon_pics")
public class PokemonPic {
	
	@Id
	private String name;
	private String img;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}
