package com.example.selikor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Nama>()
    val listNama = arrayOf(
        "Setya Neng Rahayu",
        "Siti Agnia Amalia",
        "Tiara Bintang Liswanda",
        "Wahyu Eka Prasetya",
        "Zahrotun Niswah",
        "Zuliana",
        "Adinda Widia Choirunnisa",
        "Andreas Adi Minarso",
        "Anita Sari",
        "Ardian Muhammad Iqbal",
        "Bagas Saputra",
    )
    lateinit var namaView: RecyclerView
    lateinit var namaAdapter: NamaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaView = findViewById(R.id.namaView)
        namaView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Nama(listNama[i]))
        }

        namaAdapter = NamaAdapter(list)
        namaAdapter.notifyDataSetChanged()
        namaView.adapter = namaAdapter
    }
}