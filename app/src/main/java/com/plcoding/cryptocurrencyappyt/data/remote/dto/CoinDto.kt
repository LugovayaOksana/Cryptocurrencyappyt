package com.plcoding.cryptocurrencyappyt.data.remote.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import android.support.annotation.Keep
import androidx.annotation.Keep

@Keep
@Serializable
data class CoinDto(
    @SerialName("id")
    val id: String?,
    @SerialName("is_active")
    val isActive: Boolean?,
    @SerialName("is_new")
    val isNew: Boolean?,
    @SerialName("name")
    val name: String?,
    @SerialName("rank")
    val rank: Int?,
    @SerialName("symbol")
    val symbol: String?,
    @SerialName("type")
    val type: String?
)