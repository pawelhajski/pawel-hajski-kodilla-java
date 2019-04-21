package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textSample, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(textSample));
    }
}
