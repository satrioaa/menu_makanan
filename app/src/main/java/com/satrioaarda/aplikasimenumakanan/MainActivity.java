package com.satrioaarda.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MenuAdapter(listMakanan,this));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Gudeg",
                "Rp. 15.000",
                 "Gudeg merupakan makanan khas Yogyakarta yang terbuat dari nangka muda yang dimasak dengan santan.",
                 R.drawable.gudeg));

        listMakanan.add(new Makanan("Tahu Gimbal",
                " Rp. 12.000",
                 "Tahu gimbal adalah makanan khas Kota Semarang.Makanan ini terdiri dari tahu goreng, rajangan kol mentah, lontong, taoge, telur, dan gimbal (udang yang digoreng dengan tepung) dan dicampur dengan bumbu kacang yang khas karena menggunakan petis udang.",
                 R.drawable.tahu));

        listMakanan.add(new Makanan("Lentog Tanjung",
                "Rp. 16.000",
                 "Lentog Tanjung merupakan salah satu makanan tradisional khas Kota Kudus yang patut diperhitungkan. Komponen yang ada dalam Lentog Tanjung yaitu Lontong berbentuk sebesar betis manusia, lodeh tahu, serta sayur gori.",
                 R.drawable.lentog));

        listMakanan.add(new Makanan("Pecel",
                "Rp. 10.000",
                 "Pecel adalah salah satu warisan kuliner Indonesia, khususnya seni kuliner Jawa yang berbahan landasan sayur-sayuran rebus yang dihidangkan dengan bumbu kacang. Hidangan pecel mampu dikategorikan sebagai hidangan salad tradisional Jawa dengan bumbu kacang.",
                 R.drawable.pecel)) ;
    }
}