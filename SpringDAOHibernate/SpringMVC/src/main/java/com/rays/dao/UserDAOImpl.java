package com.rays.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAOInt {

	@Autowired
	private SessionFactory sessionFactory = null;

	public long add(UserDTO dto) {
		Long pk = (Long) sessionFactory.getCurrentSession().save(dto);
		return pk;
	}

	public void update(UserDTO dto) {
		sessionFactory.getCurrentSession().merge(dto);
	}

	@Override
	public UserDTO authenticate(String loginId, String password) {
		Query q = sessionFactory.getCurrentSession().createQuery("from UserDTO where LoginId=? and password=?");
		q.setString(0, loginId);
		q.setString(1, password);
		List list = q.list();
		UserDTO dto = null;
		if (list.size() > 0) {
			dto = (UserDTO) list.get(0);
		}
		return dto;
	}

//	public UserDTO findByPk(Long pk) {
//		UserDTO dto = sessionFactory.getCurrentSession().find(UserDTO.class, pk);
//		return dto;
//	}

}
