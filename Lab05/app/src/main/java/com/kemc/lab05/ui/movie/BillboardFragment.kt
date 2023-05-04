package com.kemc.lab05.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.kemc.lab05.R
import com.kemc.lab05.databinding.FragmentBillboardBinding
import com.kemc.lab05.databinding.FragmentNewMovieBinding
import com.kemc.lab05.ui.movie.MovieViewModel

class BillboardFragment : Fragment() {
    private lateinit var actionToMovie: CardView
    private lateinit var actionToNewMovie: FloatingActionButton


    private lateinit var binding: FragmentBillboardBinding

//    private lateinit var name: TextInputEditText
//    private lateinit var category: TextInputEditText
//    private lateinit var description: TextInputEditText
//    private lateinit var calification: TextInputEditText
//    private lateinit var action: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBillboardBinding.inflate(inflater, container, false)
        return binding.root

//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        actionToMovie = view.findViewById(R.id.movie_1_card)
        actionToNewMovie = view.findViewById(R.id.action_to_new_moview)

        actionToMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }

        actionToNewMovie.setOnClickListener{
            it.findNavController().navigate(R.id.newMovieFragment)
        }
    }


}