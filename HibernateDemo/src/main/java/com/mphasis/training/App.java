package com.mphasis.training;

import java.util.Scanner;

import com.mphasis.training.dao.ProductDao;
import com.mphasis.training.entities.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	        
    	        Scanner sc=new Scanner(System.in);
    	        ProductDao pdao = new ProductDao();
    	       do {
    	        System.out.println("1.Add Product\n2.Update Product\n"
    	                + "3.Get All Products\n4.Get Product By Id\n"
    	                + "5.Get by Cost\n6.Delete Product\n7.Exit");
    	        switch(sc.nextInt()) {
    	        case 1:
    	            System.out.println("Enter Product ID\nName:\nCost\nQuantity");
    	            Product p=new Product(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
    	            pdao.insertProduct(p);
    	            System.out.println("Product added successfully");
    	            break;
    	        case 2:
    	            System.out.println("Enter the product id:");
    	            int pid=sc.nextInt();
    	            System.out.println("Enter cost");
    	            double cost=sc.nextDouble();
    	            Product prod=new Product();
    	            prod=pdao.retrieveProducById(pid);
    	            prod.setCost(cost);
    	            pdao.updateProduct(prod);
    	            System.out.println("Successfully updated");
    	            break;
    	        case 3:
    	            System.out.println("List of Products");
    	            pdao.retrieveProduct().forEach(p1->System.out.println(p1));
    	            break;
    	        case 4:
    	            System.out.println("Enter the product ID:");
    	            Product p2=new Product();
    	            p2=pdao.retrieveProducById(sc.nextInt());
    	            System.out.println(p2);
    	            break;
        
    	        case 5:
    	            System.out.println("Enter the cost");
    	            pdao.retrieveProducByCost(sc.nextDouble()).forEach(p3->System.out.println(p3));
    	            break;
    	        case 6:
    	            System.out.println("Enter the product Id");
    	            pdao.deleteProduct(sc.nextInt());
    	            System.out.println("Product deleted");
    	            break;
    	        case 7:
    	            sc.close();
    	            System.exit(0);
    	        }
    	       }while(true);
    	        }
    }

