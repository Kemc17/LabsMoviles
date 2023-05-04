package com.kemc.lab05.ui.movie

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
import com.kemc.lab05.databinding.FragmentMovieBinding
import com.kemc.lab05.databinding.FragmentNewMovieBinding
import com.kemc.lab05.ui.movie.MovieViewModel

class MovieFragment : Fragment() {
    private val viewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }

    private lateinit var binding: FragmentMovieBinding

//    private lateinit var name: TextInputEditText
//    private lateinit var category: TextInputEditText
//    private lateinit var description: TextInputEditText
//    private lateinit var calification: TextInputEditText
//    private lateinit var action: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root

//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


//    private fun bind(view: View){
//        name = view.findViewById(R.id.text_inputName)
//        category = view.findViewById(R.id.text_inputCategory)
//        description = view.findViewById(R.id.text_inputDescription)
//        calification = view.findViewById(R.id.text_inputCalification)
//        action = view.findViewById(R.id.button)
//    }
//
//    private fun createMovie(){
//        val newMoview = MovieModel(
//            name.text.toString(),
//            category.text.toString(),
//            description.text.toString(),
//            calification.text.toString()
//        )
//        viewModel.addMovies(newMoview)
//
//        Log.d("APP TAG", viewModel.getMovies().toString())
//
//        findNavController().popBackStack()
//    }
}