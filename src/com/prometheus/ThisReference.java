package com.prometheus;

public class ThisReference {
    public void callProcess(int i, Process process){
        process.process(i);
    }

    interface Process {
        void process (int i);
    }

    public static void main(String[] args) {
        ThisReference thisReference =  new ThisReference();

        thisReference.callProcess(1, i -> {
            System.out.println(i);
//            System.out.println(this); - this nema naco ukazovat, nieje pripojena na ziadnu instanciu
        });

    }


}
