public class User {
    private String name;
    private String username;
    private Double balans;

    public User(String name, String username, Double balans) {
        this.name = name;
        this.username = username;
        this.balans = balans;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalans() {
        return balans;
    }

    public void setBalans(Double balans) {
        this.balans = balans;
    }
}
