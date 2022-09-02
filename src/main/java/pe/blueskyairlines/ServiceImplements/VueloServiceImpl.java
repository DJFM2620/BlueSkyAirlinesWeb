package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Vuelo;
import pe.blueskyairlines.Repository.VueloRepository;
import pe.blueskyairlines.Service.VueloService;

@Service
public class VueloServiceImpl implements VueloService{

	@Autowired
	private VueloRepository repository;

	@Override
	@Transactional
	public void Insert(Vuelo vuelo) {
		
		repository.save(vuelo);
	}

	@Override
	@Transactional
	public void Update(Vuelo vuelo) {

		repository.save(vuelo);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {

		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Vuelo FindByID(Integer ID) {
		
		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Vuelo> FindAll() {
		
		return repository.findAll();
	}
}