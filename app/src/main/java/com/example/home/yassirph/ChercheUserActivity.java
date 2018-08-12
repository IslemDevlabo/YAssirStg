package com.example.home.yassirph;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class ChercheUserActivity extends AppCompatActivity {
    AutoCompleteTextView actv = null;
    String[] nom_Chauffeur = {"Neddar Islem","Gherbi Hichem","Mekki Mohammed","Harzallah Abdllah","louhim asam"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cherche_user);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nom_Chauffeur);
        actv = (AutoCompleteTextView) findViewById(R.id.nom_chauffeur_actv);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.BLUE);
        actv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"clicked "+adapterView.getItemAtPosition(i),Toast.LENGTH_LONG).show();

            }
        });

        }


    public void changeView(View view) {
        Intent intent = new Intent(this,ChauffeurPhoto.class);
        startActivity(intent);
    }
}
