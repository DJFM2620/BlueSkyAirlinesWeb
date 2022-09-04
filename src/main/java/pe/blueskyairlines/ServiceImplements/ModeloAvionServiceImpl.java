package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.ModeloAvion;
import pe.blueskyairlines.Repository.ModeloRepository;
import pe.blueskyairlines.Service.ModeloAvionService;

@Service
public class ModeloAvionServiceImpl implements ModeloAvionService{

	@Autowired
	private ModeloRepository repository;
	
	@Override
	@Transactional
	public void Insert(ModeloAvion modeloAvion) {
		
		repository.save(modeloAvion);
	}

	@Override
	@Transactional
	public void Update(ModeloAvion modeloAvion) {

		repository.save(modeloAvion);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {
		
		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public ModeloAvion FindByID(Integer ID) {
		
		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<ModeloAvion> FindAll() {

		return repository.findAll();
	}
}