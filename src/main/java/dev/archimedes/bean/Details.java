package dev.archimedes.bean;

import java.util.Map;

public class Details {
    private String name;
    private String msg;
    private Map<String, String> frameworks;

    public Details() {
    }

    public Details(String name, String msg, Map<String, String> frameworks) {
        this.name = name;
        this.msg = msg;
        this.frameworks = frameworks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, String> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(Map<String, String> frameworks) {
        this.frameworks = frameworks;
    }

    @Override
    public String toString() {
        return "Details{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                ", frameworks=" + frameworks +
                '}';
    }
}
