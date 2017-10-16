package com.example.maqso.a02application;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;

/**
 * Created by maqso on 10/12/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    ArrayList<Contacts> list;
    Context contex;
    DetailFragment detailFragment;


    public ContactAdapter(Context context, ArrayList<Contacts> list) {
        this.contex = context;
        this.list = list;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ContactViewHolder holder, final int position) {
        final Contacts item = list.get(position);
        holder.name.setText(item.getName());
        Picasso.with(contex).load("http://fakeimg.pl/300").error(R.drawable.dummyimage).placeholder(R.drawable.dummyimage).into(holder.profile);

        // button on click event
        holder.remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(contex, "" + item.getName() + " removed", Toast.LENGTH_SHORT).show();
                list.remove(item);
                notifyDataSetChanged();
            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        ImageView profile;
        TextView name;
        Button remove;


        public ContactViewHolder(View view) {

            super(view);
            profile = (ImageView) view.findViewById(R.id.imageContact);
            name = (TextView) view.findViewById(R.id.nameContact);
            remove = (Button) view.findViewById(R.id.btnRemove);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ContactEventsHandling obj = new ContactEventsHandling(list.get(getLayoutPosition()));
                    EventBus.getDefault().post(obj);

                }
            });
        }

    }
}