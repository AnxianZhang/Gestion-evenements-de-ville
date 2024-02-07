package model.ville.evenements;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;

/**
 * @author ouziri
 * @version 0.1
 *
 */

@Entity
@Table(name = "TEvenement")
public class Evenement {
	
	@Id
	private String nom;			// nom court qui est uniqe (identifiant)
	
	@Column
	private String description;	// détail de l'évènement
	
	@Column(nullable = false)
	private String type;		// seuls les types : conference (sans accent !), sport et spectacle sont acceptés
	
	@ManyToOne
	@JoinColumn(name = "ville_id", nullable = false)
	private Ville ville;
	
	public Evenement() {
		
	}
	
	public Evenement(String id, String description, String type, Ville ville) {
		this.nom = id;
		this.description = description;
		this.type = type;
		this.ville = ville;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Ville getVille() {
		return ville;
	}
	
	public void setVille(Ville ville) {
		this.ville = ville;
	}
}
