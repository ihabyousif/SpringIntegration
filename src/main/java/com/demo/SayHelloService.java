package com.demo;

import org.springframework.stereotype.Service;

@Service
public class SayHelloService {
    public void sayHello(String name){
        System.out.println("################################");
        System.out.println("################################");
        System.out.println("################################");
        System.out.println("##  Hello " + name + "!!!" );
        System.out.println("################################");
        System.out.println("################################");
        System.out.println("################################");
    }
    
    public void sayHello(org.springframework.util.LinkedMultiValueMap map){
    	 System.out.println("################################");
         System.out.println("################################");
         System.out.println("################################");
         System.out.println("##  Hello HTTP!!!" );
         System.out.println("################################");
         System.out.println("################################");
         System.out.println("################################");
    }

}
