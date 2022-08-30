package pe.blueskyairlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.blueskyairlines.Model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {

}
