package com.example.puzzle;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class OnBoardingFragment2 extends Fragment {
    TextView txt_finish2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View   root2= inflater.inflate(R.layout.fragment_on_boarding2,container,false);
        txt_finish2=root2.findViewById(R.id.txt_finish2);

        txt_finish2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });


        return root2;
    }
}
