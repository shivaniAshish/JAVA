package com.iqstudent.queries;

public interface StudentQueries {
	
    final String SELECT_QUERY = "select * from std";
	final String INSERT_QUERY = "insert into std "
			+ "values (?,?,?,?,?)";
	final String UPDATE_QUERY = "update std set "
			+ "std_name=?,  std_course=?, std_phn=?, doj=? where std_id=?";
	final String DELETE_QUERY = "delete from std "
			+ "where std_id=?";
	final String SELECT_BY_ID_QUERY = "select * from std "
			+ "where std_id=?";
	final String SELECT_BY_NAME_QUERY = "select  * from std "
			+ "where std_name=?";
	final String INSERT_DATE = "insert into std  values (?)";
	}


