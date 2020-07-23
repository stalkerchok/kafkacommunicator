package com.reunico.domain;

import lombok.Data;

import java.util.Arrays;
import java.util.Objects;

public class Message {
    private String channel;
    private String[] recipients;
    private String subject;
    private String message;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String[] getRecipients() {
        return recipients;
    }

    public void setRecipients(String[] recipients) {
        this.recipients = recipients;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return Objects.equals(channel, message1.channel) &&
            Arrays.equals(recipients, message1.recipients) &&
            Objects.equals(subject, message1.subject) &&
            Objects.equals(message, message1.message);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(channel, subject, message);
        result = 31 * result + Arrays.hashCode(recipients);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
            "channel='" + channel + '\'' +
            ", recipients=" + Arrays.toString(recipients) +
            ", subject='" + subject + '\'' +
            ", message='" + message + '\'' +
            '}';
    }
}
