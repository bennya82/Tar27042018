package com.bennyab.tar27042018.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import com.bennyab.tar27042018.Data.Contact;
import com.bennyab.tar27042018.R;

import java.util.ArrayList;

/**
 * Created by bennya on 27/04/2018.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder>{

    private ArrayList<Contact> data;

    public ContactsAdapter(ArrayList<Contact> data){
        this.data = data;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView firstName,lastName;
        public ImageView iconView,iconStar;

        public MyViewHolder(View view) {
            super(view);
            firstName = (TextView) view.findViewById(R.id.txt_firstName);
            lastName = (TextView) view.findViewById(R.id.txt_lastName);
            iconView = (ImageView) view.findViewById(R.id.imageViewContact);
            iconStar = (ImageView) view.findViewById(R.id.imageViewStar);
        }
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contacts_cell, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Contact contact = data.get(position);
        holder.firstName.setText(contact.getFirstName());
        holder.lastName.setText(contact.getLastName());
        //get image from web
        //contact.getImageUrl()
        //holder.iconView.setImageBitmap();
    }

    @Override
    public int getItemCount() {
        if (data == null)
            return  0;
        return data.size();
    }
}
