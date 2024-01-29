package com.example.database;

import androidx.appcompat.app.AppCompatActivity;
public class konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
//Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
//dimana File PHP tersebut berada
//PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA public static final String URL_ADD="http://10.105.1.231/androiddb/tambahPgw.php";
//Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP public static final String KEY_EMP_ID = "id";

    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJI = "salary"; //salary itu variabel untuk gaji
    //JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJI = "salary";
    public static final  String URL_ADD="http://10.107.242.154/android/tambahPgw.php";
    //ID karyawan
//emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}