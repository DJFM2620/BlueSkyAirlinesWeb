package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Ciudad;
import pe.blueskyairlines.Repository.CiudadRepository;
import pe.blueskyairlines.Service.CiudadService;

@Service
public class CiudadServiceImpl implements CiudadService{

	@Autowired
	private CiudadRepository repository;

	@Override
	@Transactional
	public void Insert(Ciudad ciudad) {
		
		repository.save(ciudad);
	}

	@Override
	@Transactional
	public void Update(Ciudad ciudad) {

		repository.save(ciudad);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {
		
		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Ciudad FindByID(Integer ID) {
		
		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Ciudad> FindAll() {
	
		return repository.findAll();
	}
}