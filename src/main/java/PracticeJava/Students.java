package PracticeJava;

import java.util.List;

class Students {
    private String name;
    private List<String> friends;

    public Students(String name, List<String> friends) {
        this.name = name;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public List<String> getFriends() {
        return friends;
    }
}