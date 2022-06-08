package com.example.cityguideapp.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.cityguideapp.R
import com.bumptech.glide.Glide
import com.example.cityguideapp.AllPlacesActivity
import com.example.cityguideapp.model.Categories
import kotlinx.android.synthetic.main.categories_card_design.view.*

class CategorieAdapter: RecyclerView.Adapter<CategorieAdapter.MyViewHolder>() {

    lateinit var context: Context

    private var categoryList = emptyList<Categories>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.categories_card_design, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = categoryList[position]
        holder.itemView.categories_title.text = currentItem.name.toString()
        holder.itemView.background_gradient.setBackgroundColor(Color.parseColor(currentItem.color.toString()))
        var image = currentItem.uimage.toString()

        if(image == "park_image"){
            holder.itemView.categories_image.setImageResource(R.drawable.park)
        } else if(image == "parking_image"){
            holder.itemView.categories_image.setImageResource(R.drawable.parking)
        } else if(image == "library_image"){
            holder.itemView.categories_image.setImageResource(R.drawable.library)
        } else if(image == "hotel_image"){
            holder.itemView.categories_image.setImageResource(R.drawable.hotel)
        } else if(image == "prayerRoom_image"){
            holder.itemView.categories_image.setImageResource(R.drawable.prayerroom)
        }else if(image == "historical_image"){
            holder.itemView.categories_image.setImageResource(R.drawable.historical)
        }else if(image == "supermarket_image"){
            holder.itemView.categories_image.setImageResource(R.drawable.supermarket)
        }
        else {
            val urlImage = "https://cdn.discordapp.com/attachments/772764979803717652/982649738421760010/travelers.png"
            //Glide.with(context).load(urlImage).centerCrop().into(holder.itemView.categories_image)
            Glide.with(holder.itemView.context).load(urlImage).into(holder.itemView.categories_image)
        }

        holder.itemView.background_gradient.setOnClickListener {
            val categoryId = currentItem.uid
            var intent = Intent(holder.itemView.context, AllPlacesActivity::class.java)
            intent.putExtra("CALL_FROM_CATEGORY", "call_from_category")
            intent.putExtra("CATEOGRY_ID", categoryId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    fun setData(category: List<Categories>){
        this.categoryList = category
        notifyDataSetChanged()
    }
}




