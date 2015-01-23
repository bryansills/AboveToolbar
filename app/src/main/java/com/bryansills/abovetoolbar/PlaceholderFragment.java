package com.bryansills.abovetoolbar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button renameButton = (Button) rootView.findViewById(R.id.rename_btn);
        Button hideButton = (Button) rootView.findViewById(R.id.hide_btn);

        renameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ActionBarActivity)getActivity()).getSupportActionBar().getTitle().equals("BLARRRRRRGGGGGGG")) {
                    ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("LLOOOOOOLLLLLLL");
                } else {
                    ((ActionBarActivity)getActivity()).getSupportActionBar().setTitle("BLARRRRRRGGGGGGG");
                }
            }
        });

        return rootView;
    }
}