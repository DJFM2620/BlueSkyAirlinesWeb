package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Avion;
import pe.blueskyairlines.Repository.AvionRepository;
import pe.blueskyairlines.Service.AvionService;

@Service
public class AvionServiceImpl implements AvionService{
	
	@Autowired
	private AvionRepository repository;

	@Override
	@Transactional
	public void Insert(Avion avion) {
		
		repository.save(avion);
	}

	@Override
	@Transactional
	public void Update(Avion avion) {

		repository.save(avion);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {
		
		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Avion FindByID(Integer ID) {
		
		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Avion> FindAll() {
		
		return repository.findAll();
	}

}