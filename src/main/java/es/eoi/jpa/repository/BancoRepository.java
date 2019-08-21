package es.eoi.jpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.eoi.jpa.entity.Banco;

public class BancoRepository {
	
	private EntityManager em;
	
	public BancoRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		em = emf.createEntityManager();
	}

	public boolean create(Banco banco) {
		try {
			em.getTransaction().begin();
			em.persist(banco);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public Banco read(Integer id) {
		return em.find(Banco.class, id);
	}
	
	public boolean update(Integer id) {
		return false;
	}
	
	public boolean delete(Integer id) {
		return false;
	}
	
	public List<Banco> readAll(){
		return null;
	}
	
}
