package com.mphasis.training.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import com.mphasis.training.entities.Playera;

public class PlayerDao {
	
	SessionFactory sessionFactory=null;
	public PlayerDao() {
		Configuration con = new Configuration().configure().addAnnotatedClass(Playera.class);
		StandardServiceRegistryBuilder builder = 
				new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		sessionFactory = con.buildSessionFactory(builder.build());
	}
	
	public List<Playera> retrievePlayer() {
		List<Playera> players = new ArrayList<>();
		Session session = sessionFactory.openSession();
		players = session.createCriteria(Playera.class).list();
		return players;
	}
	public Playera retrievePlayerById(int pid) {
		Session session = sessionFactory.openSession();
		Playera p = (Playera)session.get(Playera.class, pid);
		return p;
	}
	public List<Playera> retrievePlayerByName(String name) {
		List<Playera> players = new ArrayList<>();
		Session session = sessionFactory.openSession();
		players = session.createCriteria(Playera.class).add(Restrictions.eq("pName", name)).list();
		return players;
	}
	public List<Playera> retrievePlayerByGender(String  gender) {
		List<Playera> players = new ArrayList<>();
		Session session = sessionFactory.openSession();
		players = session.createCriteria(Playera.class).add(Restrictions.eq("gender", gender)).list();
		return players;
	}
	public Playera retrievePlayerByContact(String  contact) {
		Playera players = new Playera();
		Session session = sessionFactory.openSession();
		players = (Playera) session.createCriteria(Playera.class).add(Restrictions.eq("contact", contact)).uniqueResult();
		return players;
	}
	public Playera retrieveProducByEmail(String  email) {
		Playera players = new Playera();
		Session session = sessionFactory.openSession();
		players = (Playera) session.createCriteria(Playera.class).add(Restrictions.eq("email", email)).uniqueResult();
		return players;
	}
	public List<Playera> retrievePlayerByTeamname(String  tname) {
		List<Playera> players = new ArrayList<>();
		Session session = sessionFactory.openSession();
		players = session.createCriteria(Playera.class).add(Restrictions.eq("teamname", tname)).list();
		return players;
	}
	public List<Playera> retrievePlayerByAge(int  age) {
		List<Playera> players = new ArrayList<>();
		Session session = sessionFactory.openSession();
		players = session.createCriteria(Playera.class).add(Restrictions.eq("age", age)).list();
		return players;
	}
	public List<Playera> retrievePlayerByDOB(Date  date) {
		List<Playera> players = new ArrayList<>();
		Session session = sessionFactory.openSession();
		players = session.createCriteria(Playera.class).add(Restrictions.eq("dob", date)).list();
		return players;
	}
	public List<Playera> retrievePlayerByScore(long  score) {
		List<Playera> players = new ArrayList<>();
		Session session = sessionFactory.openSession();
		players = session.createCriteria(Playera.class).add(Restrictions.eq("score", score)).list();
		return players;
	}


}
