package com.demo;

import org.springframework.stereotype.Service;

@Service
public class ValidateOrderService {
    public void validateFileOrder(String name){
        System.out.println("################################");
        System.out.println("## New Order From File ");
        System.out.println("################################");
        System.out.println("##  Order File Name " + name + "!!!" );
        System.out.println("################################");
    }
    
    public void validateHttpOrder(org.springframework.util.LinkedMultiValueMap map){
    	 System.out.println("################################");
    	 System.out.println("##  new Order from HTTP " );
         System.out.println("################################");
         for(Object key : map.keySet() ){
        	 System.out.println(key +" = "+ map.get(key) );
         }
         System.out.println("################################");
    }
    
    public void validateJmsOrder(org.springframework.util.LinkedMultiValueMap map){
   	    System.out.println("################################");
        System.out.println("## New Order from JMS");
        System.out.println("################################");
        for(Object key : map.keySet() ){
       	 System.out.println(key +" = "+ map.get(key) );
        }
        System.out.println("################################");
   }
    

}
