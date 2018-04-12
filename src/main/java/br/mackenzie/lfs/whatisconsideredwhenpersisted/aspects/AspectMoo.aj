package br.mackenzie.lfs.whatisconsideredwhenpersisted.aspects;

public aspect AspectMoo {

    pointcut callSayMessage() : call(public static void AspectTest.say*(..));

    before() : callSayMessage() {
        System.out.println("Good day!");
    }
    after() : callSayMessage() {
        System.out.println("Thank you!");
    }
}
