package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.CategoriaAsiento;
import pe.blueskyairlines.Repository.CategoriaAsientoRepository;
import pe.blueskyairlines.Service.CategoriaAsientoService;

@Service
public class CategoriaAsientoServiceImpl implements CategoriaAsientoService{

	@Autowired
	private CategoriaAsientoRepository repository;

	@Override
	@Transactional
	public void Insert(CategoriaAsiento categoriaAsiento) {
		
		repository.save(categoriaAsiento);
	}

	@Override
	@Transactional
	public void Update(CategoriaAsiento categoriaAsiento) {

		repository.save(categoriaAsiento);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {

		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public CategoriaAsiento FindByID(Integer ID) {

		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<CategoriaAsiento> FindAll() {

		return repository.findAll();
	}
}