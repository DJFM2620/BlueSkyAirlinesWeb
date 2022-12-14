package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Estado;
import pe.blueskyairlines.Repository.EstadoRepository;
import pe.blueskyairlines.Service.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService {
	
	@Autowired
	private EstadoRepository repository;

	@Override
	@Transactional
	public void Insert(Estado estado) {
		
		repository.save(estado);
	}

	@Override
	@Transactional
	public void Update(Estado estado) {

		repository.save(estado);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {

		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Estado FindByID(Integer ID) {
		
		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Estado> FindAll() {
		
		return repository.findAll();
	}
}