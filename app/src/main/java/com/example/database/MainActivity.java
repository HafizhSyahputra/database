package com.example.database;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextName;
    private EditText editTextDesg;
    private EditText editTextSal;
    private Button buttonAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inisialisasi dari View
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextDesg = (EditText) findViewById(R.id.editTextDesg);
        editTextSal = (EditText) findViewById(R.id.editTextSalary);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        //Setting listeners to button
        buttonAdd.setOnClickListener((View.OnClickListener) this);
    }
    //Dibawah ini merupakan perintah untuk Menambahkan Pegawai (CREATE)
    private void addEmployee(){
        final String name = editTextName.getText().toString().trim();
        final String desg = editTextDesg.getText().toString().trim();
        final String sal = editTextSal.getText().toString().trim();
        class AddEmployee extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading =
                        ProgressDialog.show(MainActivity.this,"Menambahkan...","Tunggu...",false,false);
            }
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
            }
            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                Object konfigurasi;
                params.put(com.example.database.konfigurasi.KEY_EMP_NAMA,name);
                params.put(com.example.database.konfigurasi.KEY_EMP_POSISI,desg);
                params.put(com.example.database.konfigurasi.KEY_EMP_GAJI,sal);
                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(com.example.database.konfigurasi.URL_ADD, params);
                return res;
            }
        }
        AddEmployee ae = new AddEmployee();
        ae.execute();
    }
    @Override
    public void onClick(View v) {
        if(v == buttonAdd){
            addEmployee();
        }
    }
}