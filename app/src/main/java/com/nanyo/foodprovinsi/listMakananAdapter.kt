package com.nanyo.foodprovinsi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listMakananAdapter(val listMakanan: ArrayList<Makanan>): RecyclerView.Adapter<listMakananAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_food_idn, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: listMakananAdapter.ListViewHolder, position: Int) {
        val makanan = listMakanan[position]
        Glide.with(holder.itemView.context)
            .load(makanan.photo)
            .into(holder.imgPhoto)

        holder.tvName.text = makanan.name
        holder.tvDetail.text = makanan.detail


        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveTo = Intent(mContext, moveDetail::class.java)
            moveTo.putExtra(moveDetail.EXTRA_NAME, makanan.name)
            moveTo.putExtra(moveDetail.EXTRA_DETAIL, makanan.detail)
            moveTo.putExtra(moveDetail.EXTRA_FOTO.toString(), makanan.photo)
            moveTo.putExtra(moveDetail.EXTRA_JENIS, makanan.jenis)
            moveTo.putExtra(moveDetail.EXTRA_KHAS, makanan.khas)

            mContext.startActivity(moveTo)
        }


    }



    override fun getItemCount(): Int {
        return listMakanan.size
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}


