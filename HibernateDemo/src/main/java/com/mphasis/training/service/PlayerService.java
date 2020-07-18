package com.mphasis.training.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.mphasis.training.dao.PlayerDao;
import com.mphasis.training.entities.Playera;

public class PlayerService {
	PlayerDao playerRepo = new PlayerDao();
	
	public List<Playera> retrievePlayer() throws Exception {
		List<Playera> players=playerRepo.retrievePlayer();
		if(players.isEmpty()) {
			throw new Exception("No Players present");
		}
		return players;
	}
	public Playera retrievePlayerById(int id) throws Exception {
		Playera p=playerRepo.retrievePlayerById(id);
		if(id<1 && id>16) {
			throw new Exception("NO employee for requested id");
		}
		return p;
	}
public List<Playera> retrievePlayerByName(String name) throws Exception {
		
		if(name.matches("[A-Z]{1}[a-z]{4,15}")) {
		return playerRepo.retrievePlayerByName(name);
				
		}else {
			throw new Exception("Invalid name");
		}
	}
public List<Playera> retrievePlayerByGender(String gender) throws Exception {
	if(gender.matches("[FMfm]")) {
	return playerRepo.retrievePlayerByGender(gender);
			
	}else {
		throw new Exception("Invalid entry");
	}
}
public Playera retrievePlayerByContact(String contact) throws Exception {
	if(contact.matches("[+]{1}[9]{1}[1]{1}[0-9]{10}")) {
		return playerRepo.retrievePlayerByContact(contact);
				
		}else {
			throw new Exception("Invalid entry");
		}
}

public Playera retrieveProducByEmail(String email) throws Exception {
	if(email.matches("[a-z]{1}[A-Z]{1}[0-9]{1}@gmail.com")) {
		return playerRepo.retrieveProducByEmail(email);
				
		}else {
			throw new Exception("Invalid entry");
		}
}

public List<Playera> retrievePlayerByTeamname(String teamName) throws Exception {
	if(teamName.matches("[a-z]{5,10}")) {
		return playerRepo.retrievePlayerByTeamname(teamName);
				
		}else {
			throw new Exception("Invalid entry");
		}
}

public List<Playera> retrievePlayerByAge(int age) throws Exception {
	if(age>17 && age<31) {
		return playerRepo.retrievePlayerByAge(age);
				
		}else {
			throw new Exception("Invalid entry");
		}
}
public List<Playera> retrievePlayerByDOB(Date dob) throws Exception {
	//Date d1  = new Date(2000-02-05);
	Date d2 = new Date(2020-07-02);
	
	if(dob.equals(LocalDate.now()) && dob.before(new Date()) && dob.after(d2)) {
		throw new Exception("Invalid entry");
	}else {
		
		return playerRepo.retrievePlayerByDOB(dob);
	}
}

public List<Playera> retrievePlayerByScore(long score) throws Exception {
	if(score>=80) {
		return playerRepo.retrievePlayerByScore(score);
				
		}else {
			throw new Exception("Invalid entry");
		}
}


}
