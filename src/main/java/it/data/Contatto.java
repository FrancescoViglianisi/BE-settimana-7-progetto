package it.data;
//gitHub
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@NamedQuery(name="contatti.getAllContatti", query="SELECT c FROM contatti c")

@Entity
@Table (name="contatti")

public class Contatto implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nome;
	private String cognome;
	private String email;
	private List<NumTelefono> numTelefoni;
	
	
	//Getters
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="id")
	public int getId() { return id; }
	@Column (name="nome")
	public String getNome() { return nome; }
	@Column (name="cognome")
	public String getCognome() { return cognome; }
	@Column (name="e-mail")
	public String getEmail() { return email; }
	@OneToMany (mappedBy = "contatto", cascade = CascadeType.PERSIST)
	public List<NumTelefono> getNumTelefoni() { return numTelefoni; }
	
	//Setters
	public void setId(int id) { this.id = id; }
	public void setNome(String nome) { this.nome = nome; }
	public void setCognome(String cognome) { this.cognome = cognome; }
	public void setEmail(String email) { this.email = email; }
	public void setNumTelefoni(List<NumTelefono> numTelefoni) { this.numTelefoni = numTelefoni; }
	
	
	
	


}
