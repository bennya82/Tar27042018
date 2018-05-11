package com.bennyab.tar27042018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;

import com.bennyab.tar27042018.Adapters.ContactsAdapter;
import com.bennyab.tar27042018.Data.Contact;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {

    private final String DEFAULT_IMAGE_URL = "http://www.smileysymbol.com/2012/05/smileys-smileys-smileys.html";
    private final int NUM_OF_CONTACTS = 10;
    private ArrayList<Contact> contactsData;

    private RecyclerView.LayoutManager mLayoutManager;
    private ContactsAdapter adapter;
    private RecyclerView recyclerView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        setTitle(R.string.ContactsTitle);
        bindView();
    }

    private void bindView(){
        recyclerView = findViewById(R.id.act_contacts_recycleViewList);
        editText = findViewById(R.id.act_contacts_et_search);

        generateStubData();
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new ContactsAdapter(contactsData);
        recyclerView.setAdapter(adapter);
        DividerItemDecoration itemDecor = new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL);
        recyclerView.addItemDecoration(itemDecor);


    }

    private void generateStubData(){
        contactsData = new ArrayList<>();
        for (int i =0;i<NUM_OF_CONTACTS;i++){
            Contact contact = new Contact("Name" +i,"LastName" +i,DEFAULT_IMAGE_URL);
            contactsData.add(contact);
        }
    }
}
