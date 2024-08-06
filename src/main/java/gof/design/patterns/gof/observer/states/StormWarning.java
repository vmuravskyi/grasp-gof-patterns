package gof.design.patterns.gof.observer.states;

import java.util.Objects;

public class StormWarning implements Message {

    final String messageContent;

    public StormWarning(String m) {
        this.messageContent = m;
    }

    @Override
    public String getMessageContent() {
        return messageContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StormWarning that = (StormWarning) o;
        return messageContent.equals(that.messageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageContent);
    }

}
