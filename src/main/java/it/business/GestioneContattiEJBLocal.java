package it.business;

import java.util.List;

import it.data.Contatto;
import jakarta.ejb.Local;

@Local
public interface GestioneContattiEJBLocal {

	public List<Contatto> getAllContatti();
}
