package it.data;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="num_telefono")
public class NumTelefono implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String numeroDiTelefono;
	private Contatto contatto;

	
	//Getters
	@Id
	@Column (name="numero")
	public String getNumeroDiTelefono() { return numeroDiTelefono; }
	@ManyToOne
	@JoinColumn (name="id")
	public Contatto getContatto() { return contatto; }
	
	
	//Setters
	public void setNumeroDiTelefono(String numeroDiTelefono) { this.numeroDiTelefono = numeroDiTelefono; }
	public void setContatto(Contatto contatto) { this.contatto = contatto; }

	

}
