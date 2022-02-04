package com.example.crypto_currencyapp.presentation

sealed class Screen(val route: String) {
    object CoinListScreen : Screen("coin_List_Screen")
    object CoinDetailScreen : Screen("coin_detail_Screen")
}
