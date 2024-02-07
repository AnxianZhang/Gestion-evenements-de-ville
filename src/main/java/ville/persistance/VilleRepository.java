package ville.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.ville.evenements.Ville;

@Repository
public interface VilleRepository extends JpaRepository<Ville, Long>{

}
