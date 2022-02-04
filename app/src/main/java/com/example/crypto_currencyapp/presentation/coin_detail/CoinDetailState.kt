package com.example.crypto_currencyapp.presentation.coin_detail

import com.example.crypto_currencyapp.domain.model.Coin
import com.example.crypto_currencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
