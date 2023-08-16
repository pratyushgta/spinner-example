/**
 * This class contains methods for the main menu of the spinner app
 * MAD-E3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.example.mad_e2_spinner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private ImageView home_page_image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        home_page_image = findViewById(R.id.home_page_image);

        String[] monke = {
                "Select \uD83D\uDC12",
                "Proboscis Monkey",
                "Cotton-top Tamarin",
                "Celebes Crested Macaque",
                "Chacma Baboon"
        }; //populate dropdown/ spinner

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item, monke);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        home_page_image.setImageResource(android.R.color.transparent);
                        break;

                    case 1:
                        home_page_image.setImageResource(R.drawable.fire);
                        Intent monke1 = new Intent(MainActivity.this, monke1_info.class);
                        startActivity(monke1);
                        break;
                    case 2:
                        home_page_image.setImageResource(R.drawable.fire);
                        Intent monke2 = new Intent(MainActivity.this, monke2_info.class);
                        startActivity(monke2);
                        break;
                    case 3:
                        home_page_image.setImageResource(R.drawable.fire);
                        Intent monke3 = new Intent(MainActivity.this, monke3_info.class);
                        startActivity(monke3);
                        break;
                    case 4:
                        home_page_image.setImageResource(R.drawable.fire);
                        Intent monke4 = new Intent(MainActivity.this, monke4_info.class);
                        startActivity(monke4);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();

        // Reset the Spinner selection to the first item
        spinner.setSelection(0); // Change the index as needed
    }
}



/*package com.example.mad_e2_spinner

        import androidx.appcompat.app.AppCompatActivity
        import android.os.Bundle

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
        }*/
