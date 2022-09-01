package pe.blueskyairlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.blueskyairlines.Model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
