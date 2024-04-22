package qlsmp.Model;

import java.io.Serializable;

public class Connect implements Serializable {

    String tenDA, user, pass;
    String maychu;

    public Connect() {
    }

    public Connect(String tenDA, String user, String pass, String maychu) {
        this.tenDA = tenDA;
        this.user = user;
        this.pass = pass;
        this.maychu = maychu;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMaychu() {
        return maychu;
    }

    public void setMaychu(String maychu) {
        this.maychu = maychu;
    }

    public String getTenDA() {
        return tenDA;
    }

    public void setTenDA(String tenDA) {
        this.tenDA = tenDA;
    }

}
