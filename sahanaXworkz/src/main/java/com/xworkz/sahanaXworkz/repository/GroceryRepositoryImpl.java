package com.xworkz.sahanaXworkz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.sahanaXworkz.entity.GroceryEntity;

@Repository
public class GroceryRepositoryImpl implements GroceryRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public GroceryRepositoryImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(GroceryEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("Running save in Repo");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}

	@Override
	public GroceryEntity findById(int id) {
		System.out.println("find by id in repo" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		GroceryEntity db = entityManager.find(GroceryEntity.class, id);
		entityManager.close();
		return db;
	}
	
	@Override
	public List<GroceryEntity> findByShopName(String shopName){
		
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		
		try {
			Query query = manager.createNamedQuery("findByShopName");
			query.setParameter("shopName", shopName);
			List<GroceryEntity> list = query.getResultList();
			System.out.println("Total list found in repo" +list.size());
			return list;
		
	}finally {
		manager.close();
	}

}
}
