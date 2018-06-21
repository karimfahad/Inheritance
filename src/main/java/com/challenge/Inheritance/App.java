package com.challenge.Inheritance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("Amimal", 1, 1, 5,5);
        Cat cat = new Cat("cat",8,10,2,4, 1, 32, "sliky");
        cat.move();
        cat.eat();
        
    }
}
