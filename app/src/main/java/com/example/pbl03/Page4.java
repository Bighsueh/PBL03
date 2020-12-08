package com.example.pbl03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Page4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Page4 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private View view;
    private Button button7, button8;
    private EditText editText4, editText5, editText6;
    private TextView textView13, textView14;

    public Page4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Page4.
     */
    // TODO: Rename and change types and number of parameters
    public static Page4 newInstance(String param1, String param2) {
        Page4 fragment = new Page4();
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
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_page4, container, false);
        editText4 = (EditText) view.findViewById(R.id.editText4);
        editText5 = (EditText) view.findViewById(R.id.editText5);
        editText6 = (EditText) view.findViewById(R.id.editText6);
        textView13 = (TextView) view.findViewById(R.id.textView13);
        textView14 = (TextView) view.findViewById(R.id.textView14);
        button7 = (Button) view.findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            String s = "";

            public void onClick(View v) {
                Integer low = Integer.parseInt(editText4.getText().toString());
                Integer upp = Integer.parseInt(editText5.getText().toString());
                Integer quan = Integer.parseInt(editText6.getText().toString());
                String result = "";
                for (int i = 0; i <= quan; i++) {
                    if (i == quan) {
                        result += Ran(low, upp).toString();
                    } else {
                        result += Ran(low, upp).toString() + ",";
                    }
                }
                s += "輸入最小為：" + low + " ,輸入最大為：" + upp + " ,輸入範圍為：" + quan + ", 結果為：" + result + "\n ";
                textView13.setText(result);
                textView14.setText(s);
            }
        });

        return view;
    }

    private String Ran(int lower, int upper) {
        int r = 0;
        Random ran = new Random(42);
        r = (int) (Math.random() * (upper - lower + 1) + lower);
//        r =(int)(ran.nextInt(upper-lower)+lower);
        return String.valueOf(r);
    }
}