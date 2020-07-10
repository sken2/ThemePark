package com.example.themepark.demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView

class DummyAdapter : RecyclerView.Adapter<DummyAdapter.DummyViewHolder>() {

    val dummyList = listOf("Boo", "Foo", "Woo")

    inner class DummyViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DummyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_list, parent, false)
        view.findViewById<TextView>(R.id.item_click_me).apply {
            setOnClickListener {
                it.isActivated = !it.isActivated
            }
        }
        return DummyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dummyList.size
    }

    override fun onBindViewHolder(holder: DummyViewHolder, position: Int) {
        // beacouse its dummy
    }
}