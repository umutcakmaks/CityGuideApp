package com.example.cityguideapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cityguideapp.AllPlacesActivity
import com.example.cityguideapp.R
import com.example.cityguideapp.model.Categories
import kotlinx.android.synthetic.main.card_categorie_and_icon.view.*

class CategoriesCardIconAdapter: RecyclerView.Adapter<CategoriesCardIconAdapter.MyViewHolder>() {

    lateinit var context: Context

    private var categoryList = emptyList<Categories>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_categorie_and_icon, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = categoryList[position]
        holder.itemView.card_category_title.text = currentItem.name.toString()
        val image = currentItem.uimage.toString()
        if(image == "historical_image"){
            holder.itemView.card_categories_image.setImageResource(R.drawable.historical)
            holder.itemView.card_cateory_icon.setBackgroundResource(R.drawable.card_1)
        } else if(image == "parking_image"){
            holder.itemView.card_categories_image.setImageResource(R.drawable.parking)
            holder.itemView.card_cateory_icon.setBackgroundResource(R.drawable.card_2)
        } else if(image == "hotel_image"){
            holder.itemView.card_categories_image.setImageResource(R.drawable.hotel)
            holder.itemView.card_cateory_icon.setBackgroundResource(R.drawable.card_3)
        } else if(image == "library_image"){
            holder.itemView.card_categories_image.setImageResource(R.drawable.library)
            holder.itemView.card_cateory_icon.setBackgroundResource(R.drawable.card_4)
        } else if(image == "prayerRoom_image"){
            holder.itemView.card_categories_image.setImageResource(R.drawable.prayerroom)
            holder.itemView.card_cateory_icon.setBackgroundResource(R.drawable.card_2)
        } else if(image == "park_image"){
            holder.itemView.card_categories_image.setImageResource(R.drawable.park)
            holder.itemView.card_cateory_icon.setBackgroundResource(R.drawable.card_1)
        }else if(image == "supermarket_image"){
            holder.itemView.card_categories_image.setImageResource(R.drawable.supermarket)
            holder.itemView.card_cateory_icon.setBackgroundResource(R.drawable.card_3)
        }

        holder.itemView.card_cateory_icon.setOnClickListener {
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