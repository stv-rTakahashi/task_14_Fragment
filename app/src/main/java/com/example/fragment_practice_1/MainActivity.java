package com.example.fragment_practice_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);


        if (savedInstanceState == null){
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    EditText editText = (EditText)findViewById(R.id.editText);
                    final String text = editText.getText().toString();

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                    fragmentTransaction.addToBackStack(null);

                    fragmentTransaction.replace(R.id.container,TestFragment.newInstance(text));
                    fragmentTransaction.commit();
                }
            });
        }
    }
}
