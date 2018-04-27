package com.jp0517.onelinerprovider;

public class OneLinerProvider {
    private static final String[] JOKES = new String[] {
            "A pig stands in front of an electric socket: “Oh no, who put you into that wall?!”",
            "If a police office says “papers”, do i win if I say “scissors”?",
            "I put my root beer in a square glass. Now it's just beer"
    };

    public static String getJoke() {
        int jokeIndex = (int) (Math.random() * 3);
        return JOKES[jokeIndex];
    }
}
