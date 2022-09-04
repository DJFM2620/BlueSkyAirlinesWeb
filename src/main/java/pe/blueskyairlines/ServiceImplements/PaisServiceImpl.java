package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Pais;
import pe.blueskyairlines.Repository.PaisRepository;
import pe.blueskyairlines.Service.PaisService;

@Service
public class PaisServiceImpl implements PaisService{

	@Autowired
	private PaisRepository repository;

	@Override
	@Transactional
	public void Insert(Pais pais) {
		
		repository.save(pais);
	}

	@Override
	@Transactional
	public void Update(Pais pais) {
		
		repository.save(pais);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {
		
		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Pais FindByID(Integer ID) {
		
		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Pais> FindAll() {
		
		return repository.findAll();
	}
}