package com.example.maqso.a02application;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewFragment extends Fragment {


    public ViewFragment() {
        // Required empty public constructor
    }


    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_view, container, false);

        RecyclerView recyclerViewiew = (RecyclerView) view.findViewById(R.id.recyclerView);

        ArrayList<Contacts> list = new ArrayList<Contacts>();
        for (int i = 0; i < 1000; i++) {

            list.add(new Contacts(654 + i, "Ali Hassan" + i, "http://lorempixel.com/400/200/people/" + i, "x" + i + "yx@email.com", 03017666777 + i));
        }

        recyclerViewiew.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerViewiew.setAdapter(new ContactAdapter(view.getContext(), list));

        return view;
    }

}
