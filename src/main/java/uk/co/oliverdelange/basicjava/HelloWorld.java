package uk.co.oliverdelange.basicjava;

public class HelloWorld {

    public static void main(String[] args) {  
        print("Hello World");
    }
    
    public static void print(Object whatToPrint) {
        System.out.println("Print: " + whatToPrint);
    }
}
