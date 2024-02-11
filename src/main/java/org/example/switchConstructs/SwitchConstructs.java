package org.example.switchConstructs;

public class SwitchConstructs {
    public static void run(){
        String html= """
                <h2>
                    Hello %s
                    Your weight is: %.2f
                    You are %d years old
                </h2>
                """.formatted("Med", 20.338, 25);
        Status gamerStatus=Status.DISABLED;
        boolean isGamerDisabledByDefault=false;
        int gamerScore= switch (gamerStatus){
            case OFFLINE -> {
                System.out.println("The Gamer Is offline for now");
                yield 10;
            }
            case ONLINE -> {
                System.out.println("The gamer is online for now");
                yield 234;

            }
            case DISABLED -> {
                if(isGamerDisabledByDefault) System.out.println("The gamer is disabled but it can be on");
                else System.out.println("The Gamer is disabled but it cannot be on for now");
                yield 223;
            }
            default -> 11;
        };
        System.out.println("The current score is: " + gamerScore);
        System.out.printf(html);
    }
}
