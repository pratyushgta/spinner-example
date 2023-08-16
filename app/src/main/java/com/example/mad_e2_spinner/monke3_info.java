/**
 * This class contains methods for the 3rd intent/ activity triggered by selecting an item from the spinner
 * MAD-E3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.example.mad_e2_spinner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class monke3_info extends AppCompatActivity {
    private Button back;
    private TextView title;
    private TextView description;
    private ImageView img;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monke3_info);

        back = findViewById(R.id.backBtn);
        title = findViewById(R.id.monke3_name);
        description = findViewById(R.id.monke3_desc);
        img = findViewById(R.id.monke3_img);

        title.setText("Celebes Crested Macaque Monkey");

        img.setImageResource(R.drawable.monke3);

        description.setText(R.string.monke3_desc);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monke3_info.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}