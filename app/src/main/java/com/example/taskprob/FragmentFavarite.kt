package com.example.taskprob

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.taskprob.databinding.FragmentFragmentFavariteBinding


class FragmentFavarite : Fragment() {
    lateinit var mViewModel: FragmentFavariteViewModel
    lateinit var binding: FragmentFragmentFavariteBinding
    private lateinit var mAdapter: itemAdaptor
    var mitem = itemModel.getItem()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentFragmentFavariteBinding.inflate(layoutInflater,container,false)
        val layout = LinearLayoutManager(requireContext())
        var recyclerView = binding.allItemList
        mitem=itemModel.getItem()
        val itemList = ArrayList<item>()

        itemList.add(item(1, "k", false))
        itemList.add(item(2, "j", false))
        itemList.add(item(3, "j", false))
        itemList.add(item(4, "j", false))
        itemList.add(item(5, "j", false))
        itemList.add(item(7, "j", false))
        itemList.add(item(8, "j", false))
        itemList.add(item(10, "j", false))
        itemList.add(item(11, "j", false))
        itemList.add(item(12, "j", false))

        mAdapter = itemAdaptor(itemList)
        recyclerView.layoutManager = layout
        recyclerView.adapter = mAdapter

        return binding.root


    }


}



