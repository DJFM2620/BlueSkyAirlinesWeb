package pe.blueskyairlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.blueskyairlines.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
