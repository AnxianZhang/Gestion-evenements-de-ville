package model.ville.evenements;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author ouziri
 * @version 0.1
 *
 */

@Entity
@Table(name = "Tville")
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nomVille;

	@OneToMany(mappedBy = "ville", fetch = FetchType.EAGER)
	private List<Evenement> evenements = new ArrayList<>();
	
	public Ville() {
		
	}
	
	public Ville(String nomVille) {	
		this.nomVille = nomVille;
		// les évènements suivants sont ajoutés en dur dans ce constructeur pour vous faciliter les tests (manuels)
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public List<Evenement> getEvenements() {
		return evenements;
	}

	public void setEvenements(List<Evenement> evenements) {
		this.evenements = evenements;
	}
	
	public Evenement saveEvent(String nomEvt, String descEvt, String typeEvt) {
		return new Evenement(nomEvt, descEvt, typeEvt, this);
	}
}
