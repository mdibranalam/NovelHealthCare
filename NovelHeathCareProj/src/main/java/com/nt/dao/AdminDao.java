package com.nt.dao;

import java.util.List;

import com.nt.domain.Admin;

public interface AdminDao {
	public Admin addAdmin(Admin admin);

	public Admin getAdminById(int adminId);

	public boolean deleteAdmin(int adminId);

	public List<Admin> searchAllAdmins(String fname, String email, String userId);

	public List<Admin> getAllAdminsByPaging(int currPage, int noOfRecPage);

}
