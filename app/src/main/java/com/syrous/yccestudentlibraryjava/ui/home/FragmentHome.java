package com.syrous.yccestudentlibraryjava.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.syrous.yccestudentlibraryjava.R;
import com.syrous.yccestudentlibraryjava.ui.departments.ModelDepartments;
import com.syrous.yccestudentlibraryjava.ui.departments.DepartmentsAdapter;
import com.syrous.yccestudentlibraryjava.ui.other_features.OFAdapter;
import com.syrous.yccestudentlibraryjava.ui.other_features.ModelOF;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By : Syrous
 * date : 6/2/20
 */

public class FragmentHome extends Fragment {

    private List<ModelDepartments> oneDept;
    private List<ModelOF> modelOF;
    private OFAdapter ofAdapter;
    private RecyclerView OfRecycler;

    public static FragmentHome newInstance(){
        return new FragmentHome();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_scroll, container, false);


        oneDept= new ArrayList<>();
        oneDept.add(new ModelDepartments("First Year", R.drawable.baby));
        oneDept.add(new ModelDepartments("C.Tech", R.drawable.api));
        oneDept.add(new ModelDepartments("Civil", R.drawable.crane));
        oneDept.add(new ModelDepartments("Electrical", R.drawable.electricmotor));
        oneDept.add(new ModelDepartments("ETC", R.drawable.tower));
        oneDept.add(new ModelDepartments("Electronics", R.drawable.cpu));
        oneDept.add(new ModelDepartments("Mechanical", R.drawable.work));
        oneDept.add(new ModelDepartments("IT", R.drawable.tv));

        RecyclerView mrv= v.findViewById(R.id.home_recycler);

        DepartmentsAdapter myAdapter = new DepartmentsAdapter(getActivity(), oneDept);
        mrv.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        mrv.setAdapter(myAdapter);

        OfRecycler = v.findViewById(R.id.recycler_other_features);

        Integer[] feature_logos = {R.drawable.baby, R.drawable.api,
                R.drawable.tower, R.drawable.tv,
                R.drawable.crane, R.drawable.work, R.drawable.cpu};

        String[] feature_name = { "Upload Resources", "Attendance", "Online Fee Payment", "ESE Answer sheets", "Exam Dorm Acceptance", "Class Schedule", "Logout"};

        modelOF = new ArrayList<>();

        for( int i= 0; i<feature_logos.length; i++){
            ModelOF oFeatures = new ModelOF(feature_logos[i], feature_name[i], "https://www.ycce.edu/");
            modelOF.add(oFeatures);
        }

        LinearLayoutManager oLayoutManager= new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);
        OfRecycler.setLayoutManager(oLayoutManager);
        OfRecycler.setItemAnimator(new DefaultItemAnimator());

        ofAdapter = new OFAdapter(getActivity(), modelOF);
        OfRecycler.setAdapter(ofAdapter);

        return v;
    }
}
