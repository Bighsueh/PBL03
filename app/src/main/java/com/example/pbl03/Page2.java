package com.example.pbl03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Page2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Page2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private View view;
    private Button button3,button4;
    private EditText editText2;
    private TextView textView5,textView6;
    public Page2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Page2.
     */
    // TODO: Rename and change types and number of parameters
    public static Page2 newInstance(String param1, String param2) {
        Page2 fragment = new Page2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_page2,container,false);
        editText2=(EditText) view.findViewById(R.id.editText2);
        textView5=(TextView) view.findViewById(R.id.textView5);
        textView6=(TextView) view.findViewById(R.id.textView6);
        button3=(Button) view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            String s = "";
            public void onClick(View v) {
                Integer n=Integer.parseInt(editText2.getText().toString());
                String result=Fac(n);
                s += "輸入數值為：" + n + " ,結果為：" + result + "\n";
                textView5.setText(result);
                textView6.setText(s);
            }
        });

        return view;
    }
    private String Fac(int n){
        int fac=1;
        for (int i=1;i<=n;i++){
            fac*=i;
        }
        return  String.valueOf(fac);
    }
}