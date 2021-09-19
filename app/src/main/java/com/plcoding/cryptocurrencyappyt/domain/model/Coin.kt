package com.plcoding.cryptocurrencyappyt.domain.model

import com.google.gson.annotations.SerializedName

//будем использовать в ui
data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)