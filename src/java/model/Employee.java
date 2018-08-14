/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bure Kabisa
 */
package model;
 
public class Employee {
    private int empId;
    private String empName;
    private String phone;
    private String email;
    private float salary;
    private String designation;

   public String getAge(){
      return phone;
   }

   public String getName(){
      return empName;
   }

   public int getIdNum(){
      return empId;
   }

    public String getEmail(){
      return email;
   }
     public String getDesignation(){
      return designation;
   }
      public float getSalary(){
      return salary;
   }
      
   public void setPhone( String newPhone){
      phone = newPhone;
   }

   public void setName(String newName){
      empName = newName;
   }

   public void setIdNum( int newId){
      empId = newId;
   }
   public void setSalary( float newSalary){
      salary = newSalary;
   }
    public void setDesignation( String newDesignation){
      designation = newDesignation;
   }
   public void setEmail( String newEmail){
    email = newEmail;
   }

    public void setEmpId(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEmpId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}

//...constructors, getters and setters
               
