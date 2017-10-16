package com.example.maqso.a02application;

/**
 * Created by maqso on 10/12/2017.
 */

public class Contacts {
    private int id;
    private String name;
    private String profilePic;
    private String email;
    private int phoneNo;

    public Contacts(int id, String name, String profilePic, String email, int phoneNo) {
        this.id = id;
        this.name = name;
        this.profilePic = profilePic;
        this.email = email;
        this.phoneNo = phoneNo;
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

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
}
