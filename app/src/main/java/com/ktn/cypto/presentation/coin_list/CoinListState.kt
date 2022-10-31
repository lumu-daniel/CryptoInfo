package com.ktn.cypto.presentation.coin_list

import com.ktn.cypto.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
