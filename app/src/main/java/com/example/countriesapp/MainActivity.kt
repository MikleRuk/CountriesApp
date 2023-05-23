package com.example.countriesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.countriesapp.databinding.ActivityMainBinding
import com.panevrn.countriesapp.formatNumber
import com.panevrn.countriesapp.languagesToString
//import com.panevrn.countriesapp.loadSvg
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.searchButton.setOnClickListener{

            val countryName = binding.countryNameEditText.text.toString()

            lifecycleScope.launch {
                val countries = restCountriesApi.getCountryByName(countryName)
                val country = countries[0]

                binding.countryNameTextView.text = country.name
                binding.capitalTextView.text = country.capitals
                binding.populationTextView.text = formatNumber(country.population)
                binding.areaTextView.text = formatNumber( country.area)
                binding.languageTextView.text = languagesToString(country.languages)


//                loadSvg(binding.imageView, country.flag)
            }


        }
    }
}