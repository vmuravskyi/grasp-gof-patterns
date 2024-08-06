package gof.design.patterns.gof.observer.subscribers;

import gof.design.patterns.gof.observer.states.Message;

import java.util.StringJoiner;

public class SchoolObserver implements Observer {

    private static final int MINIMUM_WARNING_LEVEL = 4;
    private String name;

    public SchoolObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println(new StringJoiner(": ")
                .add("name='" + this.name + "'")
                .add("message='" + message.getMessageContent() + "'")
                .toString());
    }

    @Override
    public int getMinimumWarningLevel() {
        return MINIMUM_WARNING_LEVEL;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SchoolObserver.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }

}
