package com.example.taskprob


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class itemAdaptor(private val itemList: ArrayList<item>) :

    RecyclerView.Adapter<itemAdaptor.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemAdaptor.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.favourat, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: itemAdaptor.ViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener {

        fun bind(category: item) {
            val textView=itemView.findViewById<TextView>(R.id.Id)
            textView.text= category.id.toString()

            val Name=itemView.findViewById<TextView>(R.id.name)
            Name.text= category.name

        }

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
        }

    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
        fun itemAdaptor(itemList: ArrayList<item>, fragmentFavarite: FragmentFavarite): itemAdaptor
    }
}