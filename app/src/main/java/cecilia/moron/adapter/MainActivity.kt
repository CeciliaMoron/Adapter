package cecilia.moron.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerViwe:RecyclerView=findViewById(R.id.miRecycler)
        recyclerViwe.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val albums=ArrayList<Album>()

        albums.add(Album("Ariana Grande", 23, R.drawable.album1))
        albums.add(Album("Greeicy", 23, R.drawable.album2))
        albums.add(Album("Super Bowl", 23, R.drawable.album3))

        val adapter=AdapterAlbum(albums)
        recyclerViwe.adapter=adapter

    }
}
