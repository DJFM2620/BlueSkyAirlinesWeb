package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Asiento_Avion;
import pe.blueskyairlines.Repository.Asiento_AvionRepository;
import pe.blueskyairlines.Service.Asiento_AvionService;

@Service
public class Asiento_AvionServiceImpl implements Asiento_AvionService{

	@Autowired
	private Asiento_AvionRepository repository;

	@Override
	@Transactional
	public void Insert(Asiento_Avion asiento_Avion) {

		repository.save(asiento_Avion);
	}

	@Override
	@Transactional
	public void Update(Asiento_Avion asiento_Avion) {

		repository.save(asiento_Avion);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {

		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Asiento_Avion FindByID(Integer ID) {
		
		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Asiento_Avion> FindAll() {
	
		return repository.findAll();
	}
}