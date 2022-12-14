package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Cliente;
import pe.blueskyairlines.Repository.ClienteRepository;
import pe.blueskyairlines.Service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;

	@Override
	@Transactional
	public void Insert(Cliente cliente) {

		repository.save(cliente);
	}

	@Override
	@Transactional
	public void Update(Cliente cliente) {

		repository.save(cliente);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {

		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente FindByID(Integer ID) {

		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Cliente> FindAll() {

		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Integer CuentadeVuelos(Integer ID) {
		
		return repository.CuentadeVuelos(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Object[]> DestinosRecurrentes(Integer ID) {
		
		return repository.DestinosRecurrentes(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Object[]> HistorialVuelos(Integer ID) {
		
		return repository.HistorialVuelos(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Integer CantidadClientes() {
		
		return repository.CantidadClientes();
	}
}