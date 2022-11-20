package com.hibernate.UserDaoImp;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.Entity.User;
import com.hibernate.UserDao.UserDao;


	public class UserDaoImpl implements UserDao {

		//reference of HibernateTemplate class
		private HibernateTemplate ht;
		//method for inserting user details
		@Transactional
		public int insertUserDetails(User ud) {

			ht.save(ud);
			return 1;
		}
		//method for updating user details
		@Transactional
		public int updateUserDetails(User ud) {
			ht.update(ud);
			return 1;
		}
		//method for deleting user details
		@Transactional
		public int deleteUserDetails(User ud) {
			ht.delete(ud);
			return 1;
		}
		//method for getting specific user details
		public User getSpecificUserDetails(int uid)
		{
			User u=ht.get(User.class, uid);
			return u;

		}
		//method for getting all table data
		public List<User> getAllDetails() {
			List<User> u = ht.loadAll(User.class);
			return u;
		}
		//getter setter for HibernateTemplate class reference
		public HibernateTemplate getHt() {
			return ht;
		}

		public void setHt(HibernateTemplate ht) {
			this.ht = ht;
		}

	}

