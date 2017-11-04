package com.example.taha.afkar.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.taha.afkar.R;

/**
 * Created by Taha on 11/1/2017.
 */

public class About extends Fragment implements View.OnClickListener
{


    Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"fragment home starts",Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_about,container,false);
        btn = (Button)view.findViewById(R.id.ggg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tryy();
            }
        });
        return view;

    }

    @Override
    public void onClick(View v)
    {
       if(v.getId()==R.id.ggg)
       {
            tryy();
       }

        }

    public void tryy()
    {
        Toast.makeText(getActivity(),"clicked try ",Toast.LENGTH_LONG).show();
    }

}

