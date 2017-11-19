package com.queenievatcha.tabbedapptest.menufragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.queenievatcha.tabbedapptest.R;

/**
 * Created by Queenievatcha on 19-Nov-17.
 */

public class Tab3Dessert extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3dessert, container, false);
        return rootView;
    }
}
