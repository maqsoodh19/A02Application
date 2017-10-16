package com.example.maqso.a02application;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
    }

    @Subscribe
    public void DetailFragment(ContactEventsHandling obj) {
        Fragment fragment = new DetailFragment();
        Bundle bundle = new Bundle();
        ArrayList<String> ar  = new ArrayList<>();
        ar.add(obj.person.getName());
        ar.add(obj.person.getId() +"");
        ar.add(obj.person.getProfilePic());
        ar.add(obj.person.getPhoneNo()+ "");
        ar.add(obj.person.getEmail());

        bundle.putStringArrayList("value",ar);

        fragment.setArguments(bundle);
        FragmentManager fm  = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.addToBackStack(null);
        ft.replace(R.id.fragmentA,fragment);
        ft.commit();
    }

}