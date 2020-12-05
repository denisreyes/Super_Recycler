package mx.udg.cuvalles.super_recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mx.udg.cuvalles.super_recycler.adapters.PaisAdapter
import mx.udg.cuvalles.super_recycler.modelo.Pais

class MainActivity : AppCompatActivity() {
    var miRecycler:RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler = findViewById(R.id.miRecycler)

        val listaPaises = ArrayList<Pais>()
        listaPaises.add(Pais("Mexico", "http://mappingmediafreedom.de/wp-content/uploads/2016/10/Mexico_flag-2.jpg"))
        listaPaises.add(Pais("Estados Unidos", "https://www.lifeder.com/wp-content/uploads/2018/11/bandera-1795-1818.png"))

        miRecycler!!.layoutManager = GridLayoutManager(this, 1)
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter = PaisAdapter(listaPaises, this)
    }
}