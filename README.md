# Day-6
oops

Explain about class and object.

Class:
------
    *Class is a blueprint for creating an object.
    *It defines variables and Functions.
    *It does not occurs memory until an object is created.
    *class is declared using the class keyword.

Example:
  class Student 
  {
       int id;
       String name;
 void study() 
 {
   System.out.println("student is studying");
 } 
 }
 
      Field: Variable that can store data for the object.
      Methods:Functions that define the actions or behaviour of the object.  
            id & name -----> variables 
            study()   -----> methods
            Student   -----> class

Object:
-------
    *Object is an instance of the class.
    *It occupies memory to store the data. It can access the class variable and methods.
    *Objects are created from the class using the new keyword.
    *Access an objects field and method by using (.) dot operator.

Example:
  public class Room
  { 
   public static voi main(String[] args) 
   {
      Student stud=new Student();
      stud.id=51;
      stud.name="john";
      stud.study();
    } 
    }
    

        stud         ------> Object
        new Student  ------> creates memory
        stud.study() ------> calling method
    




    
    
