package net.accountsguy.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by advic on 03/03/2018.
 */

public class simpleaddition extends Fragment {
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.simpleaddition,container,false);
            MainActivity mainActivity = new MainActivity();
//        mainActivity.addition(v);
            return v;
        }


//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        tv = getActivity().findViewById(R.id.result);
//        Log.d("LOG", "Framment Started");
//    }
//
    }