package com.neka;

class A{
    public void show(){
        System.out.println("in A");
    }
}

/*class B extends A{
    public void show(){
        System.out.printf("I am the cutest");
    }*/

public class Main {

    public static void main(String[] args) {

        //A obj = new A();
        //obj.show();
        //now "in A" is printed but if you want to change the
        // sout without actaully chnaging you override

       //B obj1 = new B();
       //obj1.show();

        //the only purpose of classB was to override so use anonymous class
        //just one time use
        A obj1 = new A() {
            public void show() {
                System.out.printf("I am the best");
            }
        };
        obj1.show();


    }
}
//ANONYMOUS CLASS WITH INTERFACE
/*Note : we know if a class is abstarct we can't create object for it BUT
using anonymous class we can create obj for interface

Ex: interface Abc{
void show();
//in abs you can only call methods but not define it
}
public static void Main(String[] args){
    Abc obj = new Abc(){
        public void show(){
        System.out.println("You can instantiate interface with anonymous object");
        }
}
obj.show();
}

//anonymous class will not take up lot of memory space
//and use this only if you wont resue again


 */