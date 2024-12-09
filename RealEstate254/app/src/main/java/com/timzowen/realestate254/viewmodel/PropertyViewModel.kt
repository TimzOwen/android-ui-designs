package com.timzowen.realestate254.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timzowen.realestate254.model.Property
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PropertyViewModel : ViewModel(){

    private val _recommendedProperties = MutableStateFlow<List<Property>>(emptyList())
    val recommendedProperty: StateFlow<List<Property>> = _recommendedProperties

    private val _nearbyProperties = MutableStateFlow<List<Property>>(emptyList())
    val nearbyProperties: StateFlow<List<Property>> = _nearbyProperties


    private fun loadProperties(){
        viewModelScope.launch {
            _recommendedProperties.value = listOf(
                Property(1, "Apartment", "Woodland Apartments", "New York, USA", "$1500/month", 4.5, ""),
                Property(2, "Home", "Oakleaf Cottage", "New York, USA", "$900/month", 4.0, "")
            )
            _nearbyProperties.value = listOf(
                Property(3, "Villa", "BlissView Villa", "New York, USA", "$1200/month", 4.9, "")
            )
        }
    }
}