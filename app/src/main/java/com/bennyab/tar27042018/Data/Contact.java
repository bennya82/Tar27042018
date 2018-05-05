package com.bennyab.tar27042018.Data;

/**
 * Created by bennya on 27/04/2018.
 */

public class Contact {
    String firstName;

    public Contact(String firstName,String lastName,String imageUrl){
        this.firstName = firstName;
        this.lastName = lastName;
        this.imageUrl = imageUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    String lastName;
    String imageUrl;


}
