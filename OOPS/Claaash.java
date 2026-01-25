/*
Classes and Objects:
    Class: A class is a blueprint or a prototype for an object. 
    Set of properties or methods that are common to all objects of one type.
    ***We can create multiple objects of same type instead of writing their code multiple times.***
    Syntax: 
    Modifiers - class 'class-name' - { 
        (Body)
    } 

    Objects: Objects are real world- entities that represent instance of a class.
    They contain data and behaviour(methods).
    Syntax:  class-name object-reference = new keyword class-constructor('parameters if any')
        eg: Person p = new Person();
    ***Interaction between objects: Objects interact with invoking methods***
*/

class Cars{
    String carName;
    String carPY;
    String carColor;
    Cars(   String carName,String carPY,String carColor){
        this.carName=carName;
        this.carPY=carPY;
        this.carColor=carColor;
    }
    void display(){
        System.out.println("Car Name: " +carName);
        System.out.println("Car Purchase Date: "+carPY);
        System.out.println("Car color: "+carColor);
        System.out.println();
    }
}
class Person{
    void speak(){
        System.out.println("the person is speaking");
    }
}
class Phone{
    void call(Person p){
        p.speak();
    }
}
public class Claaash{
    public static void main(String[] args){
        Cars c = new Cars("Swift","20-07-2008","Red");
        Cars c1 = new Cars("Ferrari","11-09-2018","Blue");
        Cars c2 = new Cars("Porshe","09-12-2016","Gray");
        Cars c3 = new Cars("Maruthi Suzuki","12-06-2021","White");
        Cars c4 = new Cars("Creta","29-11-2025","Red");
        Person person = new Person();
        Phone phone=new Phone();
        phone.call(person);          //interaction between 2 objects
        c.display();
        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}