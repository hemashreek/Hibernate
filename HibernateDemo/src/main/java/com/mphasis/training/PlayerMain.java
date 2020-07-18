package com.mphasis.training;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.mphasis.training.dao.PlayerDao;
import com.mphasis.training.entities.Playera;
import com.mphasis.training.exception.BusinessException;
import com.mphasis.training.service.PlayerService;


public class PlayerMain {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PlayerService pdao = new PlayerService();
		do {
			System.out.println("1.all players  2.Player by id  3.Player by name  4.Player by gender  5.Player by contact  6.Player by email 7.Player by teamname  8.Player by age  9.Player by score  10.Player by dob" );
					
			switch (sc.nextInt()) {
			
			case 1: System.out.println("List of Players");
					try {
            		pdao.retrievePlayer().forEach(p1->System.out.println(p1));
					}catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
            		break;
			case 2:System.out.println("Enter the player ID:");
			try {
				Playera p2=new Playera();
            		p2=pdao.retrievePlayerById(sc.nextInt());
            		System.out.println(p2);
			}catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
            		break;
			case 3:System.out.println("Enter the name");
			try {
            		pdao.retrievePlayerByName(sc.next()).forEach(p3->System.out.println(p3));
			}catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
            		break;
			case 4:System.out.println("enter gender");
			try {
					pdao.retrievePlayerByGender(sc.next()).forEach(p3->System.out.println(p3));
			}catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
					break;
			case 5:System.out.println("enter contact");
			try {
				Playera p4=new Playera();
					p4=pdao.retrievePlayerByContact(sc.next());
					System.out.println(p4);
			}catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
					break;
			case 6:System.out.println("enter email");
			try {
				Playera p5=new Playera();
					p5=pdao.retrievePlayerByContact(sc.next());
					System.out.println(p5);
			}catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
					break;
			
			case 7:System.out.println("enter teamname");
			try {
					pdao.retrievePlayerByName(sc.next()).forEach(p3->System.out.println(p3));
			}catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
					break;
			case 8:System.out.println("enter age");
			try {
					pdao.retrievePlayerByAge(sc.nextInt()).forEach(p3->System.out.println(p3));
			}catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
					break;
			
			case 9:System.out.println("enter score");
			try {
					pdao.retrievePlayerByScore(sc.nextLong()).forEach(p3->System.out.println(p3));
			}catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
					break;
			case 10:System.out.println("enter dob");
					java.lang.String dob = sc.next();
					java.util.Date d1 = new SimpleDateFormat("dd-MM-yyyy").parse(dob);
					pdao.retrievePlayerByDOB(d1).forEach(p3->System.out.println(p3));
					break;
			}
		} while (true);

	}

	}


