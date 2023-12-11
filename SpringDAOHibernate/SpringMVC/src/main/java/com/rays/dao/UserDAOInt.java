package com.rays.dao;

import com.rays.dto.UserDTO;

public interface UserDAOInt {
	
	public long add(UserDTO dto);
	
	public void update(UserDTO dto);
	
	public UserDTO authenticate(String loginId, String password);
	
//	public UserDTO findByPk(Long pk);

}
