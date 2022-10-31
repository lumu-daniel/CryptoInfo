package com.ktn.cypto.presentation.coin_detail

import com.ktn.cypto.domain.model.Coin
import com.ktn.cypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
