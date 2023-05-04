package com.kemc.lab05.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.google.android.material.textfield.TextInputEditText
import com.kemc.lab05.R
import androidx.navigation.fragment.findNavController
import com.kemc.lab05.data.model.MovieModel
import com.kemc.lab05.databinding.FragmentNewMovieBinding

class NewMovieFragment : Fragment() {
    private val viewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }

    private lateinit var binding: FragmentNewMovieBinding

//    private lateinit var name: TextInputEditText
//    private lateinit var category: TextInputEditText
//    private lateinit var description: TextInputEditText
//    private lateinit var calification: TextInputEditText
//    private lateinit var action: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
    binding = FragmentNewMovieBinding.inflate(inflater, container, false)
        return binding.root

//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
        observeStatus()
//        bind(view)
//
//        action.setOnClickListener{
//            createMovie()
//        }
    }

    private fun setViewModel() {
        binding.viewmodel = viewModel
    }

    private fun observeStatus(){
        viewModel.status.observe(viewLifecycleOwner) { status ->
            when{
                status.equals(MovieViewModel.MOVIE_CREATED) -> {
                    Log.d("APP_TAG", status)
                    Log.d("APP_TAG", viewModel.getMovies().toString())
                    viewModel.clearData()
                    viewModel.clearStatus()
                    findNavController().popBackStack()
                }
                status.equals(MovieViewModel.WRONG_DATA) -> {
                    Log.d("APP_TAG", status)
                    viewModel.clearStatus()
                    //findNavController().popBackStack()
                }
            }
        }
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