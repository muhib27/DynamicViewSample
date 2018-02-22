package com.champs21.dynamicviewsample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);

        // Parent layout
        LinearLayout parentLayout = (LinearLayout)findViewById(R.id.layout);

        // Layout inflater
        LayoutInflater layoutInflater = getLayoutInflater();
        View view;

        for (int i = 1; i < 101; i++){
            // Add the text layout to the parent layout
            view = layoutInflater.inflate(R.layout.compound_view, parentLayout, false);

            // In order to get the view we have to use the new view with text_layout in it
            TextView textView = (TextView)view.findViewById(R.id.text);
            textView.setText("Row " + i);
            EditText editText = (EditText)view.findViewById(R.id.et);
            LinearLayout ll = (LinearLayout)view.findViewById(R.id.ll);
            ll.addView(textView);
            ll.addView(editText);

            // Add the text view to the parent layout
            parentLayout.addView(ll);
        }


////        LayoutInflater inflater = getLayoutInflater();
////        View view = inflater.inflate(R.layout.my_view, null);
//        ViewGroup layout = (ViewGroup) findViewById(R.id.monthlyPlanListLayout);
////        main.addView(view, 0);
//
////        LinearLayout layout = (LinearLayout)findViewById(R.id.monthlyPlanListLayout);
//        int numberOfDays = 31;
//
//        for (int i = 0; i < numberOfDays; i++) {
//            LinearLayout linearLayout = new LinearLayout(this);
//            linearLayout.setBackgroundColor(Color.parseColor("#CDFDED"));
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//            params.setMargins(3, 5, 3, 5);
//            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
//            linearLayout.setLayoutParams(params);
//
//
//            TextView textView = new TextView(this);
//            LinearLayout.LayoutParams childParam1 = new LinearLayout.LayoutParams(0,LinearLayout.LayoutParams.WRAP_CONTENT);
//            childParam1.weight = 0.2f;
//            textView.setText("Date");
//            textView.setTextSize(15);
//            textView.setLayoutParams(childParam1);
//
//
//            EditText editText = new EditText(this);
//            LinearLayout.LayoutParams childParam2 = new LinearLayout.LayoutParams(0,LinearLayout.LayoutParams.WRAP_CONTENT);
//            childParam2.weight = 0.8f;
//            editText.setText("plan");
//            editText.setLayoutParams(childParam2);
//
//            linearLayout.setWeightSum(1.0f);
//            linearLayout.addView(textView);
//            linearLayout.addView(editText);
//            //linearLayout.addView(view);
//
//            layout.addView(linearLayout);
//        }
    }
}
