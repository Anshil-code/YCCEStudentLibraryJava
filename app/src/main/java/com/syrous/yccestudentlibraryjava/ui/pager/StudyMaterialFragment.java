package com.syrous.yccestudentlibraryjava.ui.pager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.syrous.yccestudentlibraryjava.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudyMaterialFragment extends Fragment {


    public StudyMaterialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_study_material, container, false);
    }

}
