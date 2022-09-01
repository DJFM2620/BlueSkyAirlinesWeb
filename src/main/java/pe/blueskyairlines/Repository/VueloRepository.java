package pe.blueskyairlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.blueskyairlines.Model.Vuelo;

public interface VueloRepository extends JpaRepository<Vuelo, Integer> {

}
