package com.db.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.db.entity.UserBean;
import com.db.service.UserBeanInterface;

@Service
public class UserBeanDao implements UserBeanInterface {
	
	@Resource
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<UserBean> findByName(String name) {
		Session s = sessionFactory.getCurrentSession();
		Query q = s.createQuery("from UserBean");
		
		return q.list();
	}
	
	@Override
	public UserBean findById(int id) {
		Session s = sessionFactory.getCurrentSession();
		Query q = s.createQuery("from UserBean b where b.userid=?");
		q.setParameter(0, id);
		if(q.list().size() == 0)
			return null;
		else
			return (UserBean) q.list().get(0);
	}
	
}
