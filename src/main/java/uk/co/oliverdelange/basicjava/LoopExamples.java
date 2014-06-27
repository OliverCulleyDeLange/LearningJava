package uk.co.oliverdelange.basicjava;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class LoopExamples {

    public static void main(String[] args) {
        loopExamples();
    }

    private static void loopExamples() {
        int a = 0;
        while(a < 5)
        {
            print(a);
            a++;
        }

        for(int b = 0; b < 5; b++)
        {
            print(b);
        }

        int c = 0;
        do {
            print(c);
            c++;
        }while(c < 5);
    }
}
