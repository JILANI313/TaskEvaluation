package com.example.taskprob

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.taskprob.databinding.AllItemsBinding


class all_items  : Fragment(), itemAdaptor.OnItemClickListener {
    private lateinit var mAdapter: itemAdaptor
    var mItems=itemModel.getItem()
    private lateinit var binding:AllItemsBinding
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          binding= AllItemsBinding.inflate(layoutInflater)
          var recyclerView =binding.allItemList
          val  itemList = ArrayList<item>()
          itemList.add(item(1,"w",false))
          itemList.add(item(2,"j",false))
          itemList.add(item(3,"j",false))
          itemList.add(item(4,"j",false))
          itemList.add(item(5,"j",false))
          itemList.add(item(7,"j",false))
          itemList.add(item(8,"j",false))
          itemList.add(item(10,"j",false))
          itemList.add(item(11,"j",false))
          itemList.add(item(12,"j",false))
          mAdapter = itemAdaptor(itemList)
          val layout=LinearLayoutManager(requireContext())
          recyclerView.layoutManager=layout
          recyclerView.adapter = mAdapter
      }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        return inflater.inflate(R.layout.all_items, container, false)
    }


    override fun onItemClick(position: Int) {
        TODO("Not yet implemented")
    }

    override fun itemAdaptor(itemList: ArrayList<item>, fragmentFavarite: FragmentFavarite): itemAdaptor {
        TODO("Not yet implemented")
    }

}