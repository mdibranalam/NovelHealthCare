package com.nt.dao;

import java.util.List;

import org.hibernate.Session;

import com.nt.domain.Admin;
import com.nt.utility.HibernateUtility;

public class AdminDaoImpl implements AdminDao {

	public Admin addAdmin(Admin admin) {
		Session ses = HibernateUtility.getInstance().openSession();
		ses.save(admin);
		ses.beginTransaction().commit();
		ses.close();
		return admin;
	}

	public Admin getAdminById(int admId) {
		Session ses = HibernateUtility.getInstance().openSession();
		Admin adm = (Admin) ses.get(Admin.class, admId);
		ses.close();
		return adm;
	}

	public boolean deleteAdmin(int hospId) {
		Session ses = HibernateUtility.getInstance().openSession();
		Admin adm = getAdminById(hospId);
		ses.delete(adm);
		ses.beginTransaction().commit();
		adm = getAdminById(hospId);
		if(adm ==null) {
			return true;
		}
		ses.close();
		return false;
	}

	public List<Admin> searchAllAdmins(String fname, String email, String userId) {
	
		return null;
	}

	public List<Admin> getAllAdminsByPaging(int currPage, int noOfRecPage) {
		
		return null;
	}

}
