package es.eoi.jpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.eoi.jpa.entity.Cliente;
import es.eoi.jpa.entity.Cuenta;

public class CuentaRepository {
	
private EntityManager em;
	
	public CuentaRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesSucursalesPU");
		em = emf.createEntityManager();
	}
	
	public boolean create(Cuenta cuenta) {
		try {
			
			em.getTransaction().begin();
			em.persist(cuenta);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public Cuenta read(Integer id) {
		return em.find(Cuenta.class, id);
	}
	
	public boolean update(Integer id) {
		return false;
	}

	public boolean delete(Integer id) {
		return false;
	}

	public List<Cliente> readAll() {
		return null;
	}

}
