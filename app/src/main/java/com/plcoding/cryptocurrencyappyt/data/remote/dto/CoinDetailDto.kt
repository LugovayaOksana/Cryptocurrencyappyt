package com.plcoding.cryptocurrencyappyt.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.plcoding.cryptocurrencyappyt.domain.model.CoinDetail

data class CoinDetailDto(
    val description: String,
    @SerializedName("development_status")
    val developmentStatus: String,
    @SerializedName("first_data_at")
    val firstDataAt: String,
    @SerializedName("hardware_wallet")
    val hardwareWallet: Boolean,
    @SerializedName("hash_algorithm")
    val hashAlgorithm: String,
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    @SerializedName("last_data_at")
    val lastDataAt: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("links_extended")
    val linksExtended: List<LinksExtended>,
    val message: String,
    val name: String,
    @SerializedName("open_source")
    val openSource: Boolean,
    @SerializedName("org_structure")
    val orgStructure: String,
    @SerializedName("proof_type")
    val proofType: String,
    val rank: Int,
    @SerializedName("started_at")
    val startedAt: String,
    val symbol: String,
    val tags: List<Tag>,
    val team: List<TeamMember>,
    val type: String,
    val whitepaper: Whitepaper
) {
    data class Links(
        val explorer: List<String>,
        val facebook: List<String>,
        val reddit: List<String>,
        @SerializedName("source_code")
        val sourceCode: List<String>,
        val website: List<String>,
        val youtube: List<String>
    )

    data class LinksExtended(
        val stats: Stats,
        val type: String,
        val url: String
    ) {
        data class Stats(
            val contributors: Int,
            val followers: Int,
            val stars: Int,
            val subscribers: Int
        )
    }

    data class Tag(
        @SerializedName("coin_counter")
        val coinCounter: Int,
        @SerializedName("ico_counter")
        val icoCounter: Int,
        val id: String,
        val name: String
    )

    data class TeamMember(
        val id: String,
        val name: String,
        val position: String
    )

    data class Whitepaper(
        val link: String,
        val thumbnail: String
    )
}

fun CoinDetailDto.toCoinDetail(): CoinDetail{
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags.map { it.name },
        team = team
    )
}