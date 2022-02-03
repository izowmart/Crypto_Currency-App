package com.example.crypto_currencyapp.domain.repository

import com.example.crypto_currencyapp.data.remote.dto.CoinDetailDto
import com.example.crypto_currencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}