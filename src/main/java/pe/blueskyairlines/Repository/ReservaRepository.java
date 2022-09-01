package pe.blueskyairlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.blueskyairlines.Model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
