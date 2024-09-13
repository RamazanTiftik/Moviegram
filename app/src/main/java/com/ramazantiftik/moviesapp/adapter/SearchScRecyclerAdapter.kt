package com.ramazantiftik.moviesapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ramazantiftik.moviesapp.databinding.RowSearchScreenBinding

class SearchScRecyclerAdapter (val postList: List<String>): RecyclerView.Adapter<SearchScRecyclerAdapter.SearchScViewHolder>() {

    class SearchScViewHolder(val binding: RowSearchScreenBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchScViewHolder {
        val binding=RowSearchScreenBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SearchScViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: SearchScViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}