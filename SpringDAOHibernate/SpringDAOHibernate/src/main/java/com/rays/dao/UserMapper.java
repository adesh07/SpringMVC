package com.rays.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rays.dto.UserDTO;

public class UserMapper implements RowMapper<UserDTO>{

	public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return null;
	}


	
	
}
