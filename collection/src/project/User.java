package project;

import java.util.Set;

public class User {
//    private int id;
    private String name;
    private Set<String> role;
    private Boolean status;

    public User(Boolean status, Set<String> role, String name) {
        this.status = status;
        this.role = role;
        this.name = name;
    }

    //    @Override
//    public String toString() {
//        return "User{id=" + id + ", name='" + name + "', role='" + role + "', status='" + status + "'}";
//    }

    public static void main(String[] args) {
        User u = new User(1, "Alice", "admin", "active");
        System.out.println(u);
    }
}
