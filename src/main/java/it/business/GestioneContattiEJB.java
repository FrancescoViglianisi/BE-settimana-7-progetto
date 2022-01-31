package it.business;
//aggiunto commento
//ciao mauro
import java.util.List;

import it.data.Contatto;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;



@Stateless
@LocalBean
public class GestioneContattiEJB implements GestioneContattiEJBLocal {

	@PersistenceContext(unitName = "rubricaPS")
	EntityManager em;
    
	
	public GestioneContattiEJB() {
    
    
		
    
    }

	@SuppressWarnings ("unchecked")
	public List<Contatto>getAllContatti() {
		
		Query q =em.createNamedQuery("contatti.getAllContatti");
   	  return q.getResultList();

	}

}
