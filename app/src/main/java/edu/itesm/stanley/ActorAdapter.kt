package edu.itesm.stanley

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ActorAdapter(private val actors : List<Actors>)
    : RecyclerView.Adapter<ActorAdapter.ActorViewHolder>(){

    inner class ActorViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.actors)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorAdapter.ActorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_layout = inflater.inflate(R.layout.actors_layout,parent, false)
        return ActorViewHolder(renglon_layout)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val actor= actors[position]
        holder.nombre.text = actor.name
        holder.foto.setImageResource(actor.picture)
        holder.itemView.setOnClickListener {
        val action = ActorskFragmentDirections.actionActorskFragmentToActorFragment(actor)
            holder?.itemView.findNavController().navigate(action)

        }
    }

    override fun getItemCount(): Int {
        return actors.size
    }
}