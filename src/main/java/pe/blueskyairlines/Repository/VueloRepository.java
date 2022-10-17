package pe.blueskyairlines.Repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.blueskyairlines.Model.Vuelo;

public interface VueloRepository extends JpaRepository<Vuelo, Integer> {

	@Query(value = "SELECT vueloid, fechaida, horaida, horallegada, vuelo.aeropuertoid, avionid, estadoid FROM VUELO INNER JOIN AEROPUERTO\r\n"
			+ "	ON VUELO.aeropuertoid = AEROPUERTO.aeropuertoid JOIN CIUDAD\r\n"
			+ "	ON AEROPUERTO.ciudadid = CIUDAD.ciudadid WHERE CIUDAD.ciudadid =:ciudadid" , nativeQuery = true)
	public abstract Collection<Vuelo> VuelosPorCiudad(@Param("ciudadid") Integer ID);
	
	@Query(value = "SELECT count(Aeropuerto.aeropuertoid), Ciudad.nombre FROM Vuelo JOIN Reserva\r\n"
			+ "ON Vuelo.vueloid = Reserva.vueloid JOIN Cliente\r\n"
			+ "ON Reserva.clienteid = Cliente.clienteid JOIN Aeropuerto\r\n"
			+ "ON Aeropuerto.aeropuertoid = Vuelo.aeropuertoid JOIN Ciudad\r\n"
			+ "ON Aeropuerto.ciudadid = Ciudad.ciudadid\r\n"
			+ "WHERE YEAR(fechaida) =:Año AND MONTH(fechaida) = :Mes\r\n"
			+ "GROUP BY Aeropuerto.aeropuertoid having count(*) > 0 limit 10;", nativeQuery = true)
	public abstract List<Object[]> VuelosPorAñoMes(@Param("Año") Integer Año, @Param("Mes") Integer Mes);
	
	@Query(value = "SELECT count(*) FROM VUELO", nativeQuery = true)
	public abstract Integer CantidadVuelos();
}
