package com.syrous.yccestudentlibraryjava.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.syrous.yccestudentlibraryjava.ui.login.ActivityLogin;
import com.syrous.yccestudentlibraryjava.R;

import static com.syrous.yccestudentlibraryjava.Constants.GlobalConstants.TAG;

/**
 * Created By : Syrous
 * date : 6/2/20
 */

public class FragmentSplash extends Fragment {


    public static FragmentSplash newInstance(){
        return new FragmentSplash();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_splashfirst,container, false);


        new Handler().postDelayed(() -> {
           Intent intent = ActivityLogin.newIntent(getActivity());
            Log.d(TAG,"ActivityLogin Called !");
            startActivity(intent);
            getActivity().finish();
        },3000);


        return v;
    }
}
