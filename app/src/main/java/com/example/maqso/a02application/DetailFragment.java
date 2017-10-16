package com.example.maqso.a02application;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    TextView name, id, phoneNo, email;
    ImageView pic;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detail, container, false);

        Bundle bundle  = this.getArguments();
        ArrayList<String> ar  = bundle.getStringArrayList("value");

        name = (TextView) view.findViewById(R.id.detailName);
        id = (TextView) view.findViewById(R.id.detailId);
        phoneNo = (TextView) view.findViewById(R.id.detailPhoneNumber);
        email = (TextView) view.findViewById(R.id.detailEmail);

        name.setText(ar.get(0));
        id.setText(ar.get(1));
        phoneNo.setText(ar.get(3));
        email.setText(ar.get(4));

        return view;
    }


}
