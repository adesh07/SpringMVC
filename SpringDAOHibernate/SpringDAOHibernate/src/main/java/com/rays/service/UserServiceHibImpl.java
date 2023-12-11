package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

@Service
//@Transactional
public class UserServiceHibImpl implements UserServiceInt {

	@Autowired
	private UserDAOInt dao = null;

	//@Transactional(propagation = Propagation.REQUIRED)
	public long add(UserDTO dto) {
		long pk = dao.add(dto);
		return pk;
	}

	//@Transactional(propagation = Propagation.REQUIRED)
	public void update(UserDTO dto) {
		dao.update(dto);
	}

	public UserDTO findByPk(Long pk) {
		UserDTO dto = dao.findByPk(pk);
		return dto;
	}

}
