package com.example.foodylounge.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodylounge.R
import kotlinx.android.synthetic.main.fragment_recipes.view.*

class RecipesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_recipes, container, false)
        rootView.recyclerview.showShimmer()
//        val shimmerRecyclerview = rootView.findViewById(R.id.recyclerview) as ShimmerRecyclerView // Add this
//        shimmerRecyclerview.showShimmer()
        return rootView
    }

}