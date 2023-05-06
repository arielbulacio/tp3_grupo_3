package UTNFRGP.tp3_grupo_3.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Genero")
public class Genero implements Serializable {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int id;
	
	@Column
	private String descripción;
	
	public Genero()
	{
		
	}

	
	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}


	@Override
	public String toString() {
		return "Genero [id=" + id + ", descripción=" + descripción + "]";
	}
	
	
	
}


