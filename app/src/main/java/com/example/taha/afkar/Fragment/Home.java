package com.example.taha.afkar.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.taha.afkar.R;

/**
 * Created by Taha on 11/1/2017.
 */

public class Home extends Fragment implements View.OnClickListener
{


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"fragment home starts",Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.home,container,false);
    }

    @Override
    public void onClick(View v) {

    }
}
