package MapAndFlatMapExample;

import java.util.List;

public class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phonenumber;

    public Customer() {
    }

    public Customer(int id, String name, String email, List<String> phonenumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(List<String> phonenumber) {
        this.phonenumber = phonenumber;
    }
}
