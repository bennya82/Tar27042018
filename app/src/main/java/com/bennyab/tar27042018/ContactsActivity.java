package com.bennyab.tar27042018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bennyab.tar27042018.Data.Contact;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {

    private final String DEFAULT_IMAGE_URL = "http://www.smileysymbol.com/2012/05/smileys-smileys-smileys.html";
    private final int NUM_OF_CONTACTS = 10;
    private ArrayList<Contact> contactsData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        setTitle(R.string.ContactsTitle);
    }

    private void generateStubData(){
        contactsData = new ArrayList<>();
        for (int i =0;i<NUM_OF_CONTACTS;i++){
            Contact contact = new Contact("Name" +i,"LastName" +i,DEFAULT_IMAGE_URL);
            contactsData.add(contact);
        }
    }
}
