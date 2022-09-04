package pe.blueskyairlines.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.blueskyairlines.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	@Query(value="select count(*) as 'Vuelos' from vuelo as v inner join reserva as r on r.vueloid=v.vueloid inner join cliente as c on c.clienteid=r.clienteid where c.clienteid=:clienteID",nativeQuery=true)
	public abstract Integer CuentadeVuelos(@Param("clienteID")Integer ID);

}