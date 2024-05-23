public class Utente{
    private String username;
    private String password;
    private double budget;
    private int persone;

    public Utente(String username, String password, double budget, int persone){
        this.username = username;
        this.password = password;
        this.budget = budget;
        this.persone = persone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBudget() {
        return budget;
    }

    public int getPersone() {
        return persone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setPersone(int persone) {
        this.persone = persone;
    }

}