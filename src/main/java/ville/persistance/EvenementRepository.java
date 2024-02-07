package ville.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.ville.evenements.Evenement;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, String>{

}
