package com.ust1.spring.springorm1.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ust1.spring.springorm1.product.dao.ProductDao;
import com.ust1.spring.springorm1.product.entity.Product;
@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernatetemplate;

	@Override
	/*@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernatetemplate.save(product);
		return result;
	}*/
	@Transactional
	public void update(Product product) {
		hibernatetemplate.update(product);
	}
	/*@Transactional
	public void delete(Product product) {
		hibernatetemplate.delete(product);
	}*/
	
	/*public Product find(int id) {
		// TODO Auto-generated method stub
		Product product = hibernatetemplate.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> findall() {
		// TODO Auto-generated method stub
		List<Product> allproducts = hibernatetemplate.loadAll(Product.class);
		return allproducts;
	}*/


}
