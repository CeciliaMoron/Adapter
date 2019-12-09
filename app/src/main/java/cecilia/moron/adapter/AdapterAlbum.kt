package cecilia.moron.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class AdapterAlbum(var list: AbstractList<Album>): RecyclerView.Adapter<AdapterAlbum.ViewHolder>(){
    override fun getItemCount(): Int {
        return Adapter!!.size
    }
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v= LayoutInflater.from(partent?.context).inflate(R.layout.content_item,parent, false)

        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder:AdapterAlbum.ViewHolder, position: Int) {
        holder.bindItems(Adapter!![position])
        holder.descripcion!!.text = lugares!![position].descripcion

        Picasso.get().load(lugares!![position].foto).into(holder.imagen)

    }

    class ViewHolder(view:View): RecyclerView.ViewHolder(view){
        fun bindItems(data:Album){
            val titulo:TextView=itemView.findViewById(R.id.txtTitulo)
            val count:TextView=itemView.findViewById(R.id.txtCount)
            val thumbnail:ImageView=itemView.findViewById(R.id.thumbnail)

            titulo.text=data.name
            count.text=data.numOfSongs.toString()

            Glide.with(itemView.context).load(data.thumbnail).into(thumbnail)

            itemView.setOnClickListener{
                Toast.makeText(itemView.context,"Album de ${data.name}",Toast.LENGTH_LONG).show()
            }
        }

    }

}