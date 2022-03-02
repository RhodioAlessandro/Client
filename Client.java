/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author rhodio.alessandro
 */
public class Client {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        Socket Client = new Socket("", 5000);
        PrintWriter out = new PrintWriter(Client.getOutputStream(), true); 
                BufferedReader in = new BufferedReader(new InputStreamReader(Client.getInputStream()));
            boolean fine= false;
            boolean messaggio = false;
            String user,pwd;
           
            
            
            
            
       
            int x ;
            System.out.println("signup(1),login(2)");
            x=sc.nextInt();
          
           if(x==1){
               
               
                    System.out.println("Inserisci la tua email:");
             user = sc.next();
     
         
                    out.println(user);
                    
                    System.out.println("Inserisci una tua password:");
                
                    pwd= sc.next();
                    out.println(pwd);
                    
                    
                    
                        } else  {
                 
                       
                    System.out.println("Inserisci la tua email");
                    user =sc.next();
                       out.println(user) ;
                    System.out.println("Inserisci una tua password");
                    user =sc.next();
                       out.println(user) ;
               
                    }
                    System.out.println("Il server risponde: " + in.readLine());
                    in.close();
                    out.close();
                    Client.close();
            }
        }
    
    

