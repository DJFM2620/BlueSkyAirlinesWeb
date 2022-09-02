package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Asiento;
import pe.blueskyairlines.Repository.AsientoRepository;
import pe.blueskyairlines.Service.AsientoService;

@Service
public class AsientoServiceImpl implements AsientoService{

	@Autowired
	private AsientoRepository repository;

	@Override
	@Transactional
	public void Insert(Asiento asiento) {
	
		repository.save(asiento);
	}

	@Override
	@Transactional
	public void Update(Asiento asiento) {
		
		repository.save(asiento);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {
		
		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Asiento FindByID(Integer ID) {

		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Asiento> FindAll() {
		
		return repository.findAll();
	}
}