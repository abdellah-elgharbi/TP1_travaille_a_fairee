package com.example.tp1_travaille_a_faire;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   private EditText nom ,prenom,adresse,mail;
   private Spinner ville;
   private EditText phone;
   private Button button1,button2;
   @SuppressLint("WrongViewCast")
   public void initialisation (){
       nom=findViewById(R.id.nom);
       prenom=findViewById(R.id.prenom);
       adresse=findViewById(R.id.adresse);
       mail=findViewById(R.id.mail);
       phone=findViewById(R.id.phone);
       button1=findViewById(R.id.button1);
       ville=findViewById(R.id.spinner);
       button2=findViewById(R.id.button2);
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       initialisation();
      button2.setOnClickListener(btnSuivant);
      button1.setOnClickListener(btnQ);

    }
    View.OnClickListener btnSuivant=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);

            if(nom.getText().toString().equals("")|| nom.getText().toString().equals("") || prenom.getText().toString().equals("")|| adresse.getText().toString().equals("")|| phone.getText().toString().equals("")|| ville.getSelectedItem().toString().equals("") || mail.getText().toString().equals("")){
                AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
                  alert.setMessage("replire tout les champ SVP");
                  alert.setNegativeButton("ok", new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialog, int which) {

                      }
                  });
                  alert.create();
                  alert.show();
            }else{
            intent.putExtra("nom",nom.getText().toString());
            intent.putExtra("prenom",prenom.getText().toString());
            intent.putExtra("adresse",adresse.getText().toString());
            intent.putExtra("phone",phone.getText().toString());
            intent.putExtra("mail",mail.getText().toString());
            intent.putExtra("ville",ville.getSelectedItem().toString());
            System.out.println(nom.getText());

            startActivity(intent);}
        }
    };
    View.OnClickListener btnQ=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);

           finishAffinity();
        }
    };
}