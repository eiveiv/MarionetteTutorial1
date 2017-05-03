package domain;

/**
 * Created by Eivind on 03.05.2017.
 */
public class User {
    private String email;
    private String name;
    private String phonenbr;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenbr() {
        return phonenbr;
    }

    public void setPhonenbr(String phonenbr) {
        this.phonenbr = phonenbr;
    }
}
