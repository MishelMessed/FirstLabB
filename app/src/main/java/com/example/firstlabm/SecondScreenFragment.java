package com.example.firstlabm;

import static com.example.firstlabm.Constants.KEY_MESSAGE;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class SecondScreenFragment extends Fragment {

    TextView txView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txView = view.findViewById(R.id.textFragment);
        String message = requireActivity().getIntent().getStringExtra(KEY_MESSAGE);
        txView.setText(message);
        Log.d("MES", message);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_second_screen, container, false);
    }


}