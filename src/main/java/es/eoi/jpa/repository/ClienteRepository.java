package es.eoi.jpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.eoi.jpa.entity.Cliente;

public class ClienteRepository {

	private EntityManager em;

	public ClienteRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		em = emf.createEntityManager();
	}

	public boolean create(Cliente cliente) {
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
			return false;
		}
	}

	public Cliente read(String dni) {
		return null;
	}

	public boolean update(String dni) {
		return false;
	}

	public boolean delete(String dni) {
		return false;
	}

	public List<Cliente> realAll() {
		return null;
	}

}
