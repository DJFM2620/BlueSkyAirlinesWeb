package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.FabricanteAvion;
import pe.blueskyairlines.Repository.FabricanteRepository;
import pe.blueskyairlines.Service.FabricanteAvionService;

@Service
public class FabricanteAvionServiceImpl implements FabricanteAvionService{

	@Autowired
	private FabricanteRepository repository;

	@Override
	@Transactional
	public void Insert(FabricanteAvion fabricanteAvion) {
		
		repository.save(fabricanteAvion);
	}

	@Override
	@Transactional
	public void Update(FabricanteAvion fabricanteAvion) {
		
		repository.save(fabricanteAvion);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {
		
		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public FabricanteAvion FindByID(Integer ID) {

		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<FabricanteAvion> FindAll() {

		return repository.findAll();
	}
	
	
}