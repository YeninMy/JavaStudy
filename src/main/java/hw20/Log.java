package hw20;

import java.util.Date;

public class Log {
    private String name;
    private Level level;
    private String message;
    private Date date;
    private String stacktrace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStacktrace() {
        return stacktrace;
    }

    public void setStacktrace(String stacktrace) {
        this.stacktrace = stacktrace;
    }

    public Log() {
    }

    @Override
    public String toString() {
        return "Log{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
