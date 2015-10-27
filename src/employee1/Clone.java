/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee1;

/**
 *
 * @author ADARSH
 */
public class Clone {
    int cloneAge;
    public Clone(String name) {
        System.out.println("Passed name is:  " +name);
        
    }
    
    public void setAge( int age) {
        cloneAge = age;
    }
    
    public int getAge( ) {
        System.out.println("Puppy's age is :" + cloneAge);
         return cloneAge;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clone myClone = new Clone( "tommy");
        
        myClone.setAge(2);
        myClone.getAge( );
        System.out.println("Variable value is :" +myClone.cloneAge);
                
        
        // TODO code application logic here
    }
    
}
