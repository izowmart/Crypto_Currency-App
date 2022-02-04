package com.example.crypto_currencyapp.presentation.coin_list

import com.example.crypto_currencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
