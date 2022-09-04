package pe.blueskyairlines.ServiceImplements;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.blueskyairlines.Model.Ticket;
import pe.blueskyairlines.Repository.TicketRepository;
import pe.blueskyairlines.Service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketRepository repository;

	@Override
	@Transactional(readOnly = true)
	public void Insert(Ticket ticket) {

		repository.save(ticket);
	}

	@Override
	@Transactional
	public void Update(Ticket ticket) {
		
		repository.save(ticket);
	}

	@Override
	@Transactional
	public void Delete(Integer ID) {
		
		repository.deleteById(ID);
	}

	@Override
	@Transactional(readOnly = true)
	public Ticket FindByID(Integer ID) {
		
		return repository.findById(ID).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Ticket> FindAll() {
		
		return repository.findAll();
	}
}