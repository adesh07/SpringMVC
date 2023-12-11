package com.rays.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOHibImpl implements UserDAOInt {

	@Autowired
	private SessionFactory sessionFactory = null;

	public long add(UserDTO dto) {
		Long pk = (Long) sessionFactory.getCurrentSession().save(dto);
		return pk;
	}

	public void update(UserDTO dto) {
		sessionFactory.getCurrentSession().merge(dto);
	}

	public UserDTO findByPk(Long pk) {
		UserDTO dto = sessionFactory.getCurrentSession().find(UserDTO.class, pk);
		return dto;
	}

}
