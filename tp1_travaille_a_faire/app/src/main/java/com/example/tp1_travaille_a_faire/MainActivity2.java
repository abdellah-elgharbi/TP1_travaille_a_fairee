package com.example.tp1_travaille_a_faire;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;


public class MainActivity2 extends AppCompatActivity {
    private TextView nom,prenom,mail,phone,adresse,ville;
    private ImageButton button;
    public void initialisation() {
        nom=findViewById(R.id.nom);
        prenom=findViewById(R.id.prenom);
        mail=findViewById(R.id.mail);
        phone=findViewById(R.id.phone);
        adresse=findViewById(R.id.adresse);
        ville=findViewById(R.id.ville);
        button=findViewById(R.id.imageButton2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        initialisation();
        nom.setText("nom :"+this.getIntent().getStringExtra("nom"));
        prenom.setText("prenom :"+this.getIntent().getStringExtra("prenom"));
        mail.setText("mail :"+this.getIntent().getStringExtra("mail"));
        phone.setText("phone :"+this.getIntent().getStringExtra("phone"));
        adresse.setText("adresse :"+this.getIntent().getStringExtra("adresse"));
        ville.setText("ville :"+this.getIntent().getStringExtra("ville"));
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity2.this,MainActivity.class));
           }
       });




    }
}