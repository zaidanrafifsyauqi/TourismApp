package com.example.tourismapp.TourAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismapp.Model.Places
import com.example.tourismapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.tour_rv_layout.view.*
import java.security.AccessControlContext

class TourAdapter (val context:Context?,private  val places: ArrayList<Places>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v  = LayoutInflater.from(parent.context).inflate(R.layout.tour_rv_layout,parent,false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {

        return places.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        Picasso.get().load(places[position].url).into(holder.itemView.tourImage)

        //Start Kenburns animation
        holder.itemView.tourImage.resume()

        holder.itemView.tourTitle.text = places[position].title
        holder.itemView.tourDescription.text = places[position].description
        holder.itemView.tourRating.rating = places[position].rating!!

    }

    class ViewHolder(v:View?):RecyclerView.ViewHolder(v!!), View.OnClickListener {
        override fun onClick(p0: View?) {

            //OnClick fucition goes here...
        }

        init {
            itemView.setOnClickListener(this)
        }

    }

}