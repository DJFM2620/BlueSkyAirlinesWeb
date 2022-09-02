package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Aeropuerto;
import pe.blueskyairlines.Repository.AeropuertoRepository;
import pe.blueskyairlines.Service.AeropuertoService;

@Service
public class AeropuertoServiceImpl implements AeropuertoService{

	@Autowired
	private AeropuertoRepository repository;

	@Override
	@Transactional
	public void Insert(Aeropuerto aeropuerto) {
		
		repository.save(aeropuerto);
	}

	@Override
	@Transactional
	public void Update(Aeropuerto aeropuerto) {
		
		repository.save(aeropuerto);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {
		
		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Aeropuerto FindByID(Integer ID) {
		
		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Aeropuerto> FindAll() {
		
		return repository.findAll();
	}
}