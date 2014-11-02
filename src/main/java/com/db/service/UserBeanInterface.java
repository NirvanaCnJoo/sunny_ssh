package com.db.service;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.db.entity.*;

@Service
public interface UserBeanInterface {

	public List<UserBean> findByName(String name);
	
	public UserBean findById(int id);
}
