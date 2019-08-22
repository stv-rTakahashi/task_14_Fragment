package com.example.fragment_practice_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TestFragment extends Fragment {

    public static TestFragment newInstance(String str){
        TestFragment fragment = new TestFragment();

        Bundle barg = new Bundle();
        barg.putString("Message",str);
        fragment.setArguments(barg);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        Bundle args = getArguments();
        if (args != null){
            String str = args.getString("Message");
            TextView textView = view.findViewById(R.id.text_fragment);
            textView.setText(str);
        }
    }
}
