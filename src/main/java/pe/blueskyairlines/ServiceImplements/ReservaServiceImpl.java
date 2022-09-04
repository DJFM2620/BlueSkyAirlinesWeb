package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Reserva;
import pe.blueskyairlines.Repository.ReservaRepository;
import pe.blueskyairlines.Service.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{

	@Autowired
	private ReservaRepository repository;

	@Override
	public void Insert(Reserva reserva) {
	
		repository.save(reserva);
	}

	@Override
	public void Update(Reserva reserva) {

		repository.save(reserva);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {

		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Reserva FindByID(Integer ID) {

		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Reserva> FindAll() {
		
		return repository.findAll();
	}
	
	
}