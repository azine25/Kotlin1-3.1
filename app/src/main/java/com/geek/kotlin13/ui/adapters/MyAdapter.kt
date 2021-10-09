package com.geek.kotlin13.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geek.kotlin13.databinding.ItemBinding

class MyAdapter(
    private var list: List<String>
) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var binding: ItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class MyViewHolder(itemView: ItemBinding) : RecyclerView.ViewHolder(itemView.root) {

        fun onBind(i: String) {
            binding.result.text = i
        }

    }
}