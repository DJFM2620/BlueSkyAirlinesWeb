package pe.blueskyairlines.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.blueskyairlines.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	@Query(value="select count(*) as 'Vuelos' from vuelo as v inner join reserva as r on r.vueloid=v.vueloid inner join cliente as c on c.clienteid=r.clienteid where c.clienteid=:clienteID",nativeQuery=true)
	public abstract Integer CuentadeVuelos(@Param("clienteID")Integer ID);

	@Query(value="SELECT count(Aeropuerto.aeropuertoid), Ciudad.nombre FROM Vuelo JOIN Reserva\r\n"
			+ "ON Vuelo.vueloid = Reserva.vueloid JOIN Cliente\r\n"
			+ "ON Reserva.clienteid = Cliente.clienteid JOIN Aeropuerto\r\n"
			+ "ON Aeropuerto.aeropuertoid = Vuelo.aeropuertoid JOIN Ciudad\r\n"
			+ "ON Aeropuerto.ciudadid = Ciudad.ciudadid\r\n"
			+ "WHERE Cliente.clienteid =:clienteID\r\n"
			+ "GROUP BY Aeropuerto.aeropuertoid having count(*) > 0 limit 10;",nativeQuery=true)
	public abstract List<Object[]> DestinosRecurrentes(@Param("clienteID")Integer ID);
	
	@Query(value="SELECT VUELO.vueloid, fechaida, horaida, horallegada, RESERVA.reservaid ,RESERVA.fecha, VUELO.aeropuertoid, CIUDAD.nombre estadoid FROM VUELO JOIN RESERVA\r\n"
			+ "ON VUELO.vueloid = RESERVA.vueloid JOIN CLIENTE\r\n"
			+ "ON RESERVA.clienteid = CLIENTE.clienteid JOIN AEROPUERTO\r\n"
			+ "ON VUELO.aeropuertoid = AEROPUERTO.aeropuertoid JOIN CIUDAD\r\n"
			+ "ON AEROPUERTO.ciudadid = CIUDAD.ciudadid\r\n"
			+ "WHERE CLIENTE.clienteid =:clienteID ORDER BY fechaida;",nativeQuery=true)
	public abstract List<Object[]> HistorialVuelos(@Param("clienteID")Integer ID);
}