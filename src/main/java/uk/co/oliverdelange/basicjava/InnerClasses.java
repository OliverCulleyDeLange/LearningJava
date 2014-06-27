package uk.co.oliverdelange.basicjava;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class InnerClasses {

    public InnerClasses() {
        InnerClass innerClass = new InnerClass();
        innerClass.doSomething();

        AnotherInnerClass anotherInnerClass = new AnotherInnerClass();
        anotherInnerClass.doSomething();
    }

    public static void main(String[] args) {
        InnerClasses innerClasses = new InnerClasses(); //Calls constructor of InnerClasses which creates an instance of InnerClass and AnotherInnerClass
        innerClasses.doSomething(); // Normal call to the method below
    }

    private void doSomething() {
        print("Printed from InnerClasses method");
    }

    public class InnerClass {
        public void doSomething() {
            print("Printed from InnerClass, which is an inner class of InnerClasses");
        }
    }

    public class AnotherInnerClass { //You can have multiple inner classes
        public void doSomething() {
            print("Printed from AnotherInnerClass, which is an inner class of InnerClasses");
        }
    }
}
