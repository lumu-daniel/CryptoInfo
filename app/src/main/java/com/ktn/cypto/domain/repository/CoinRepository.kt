package com.ktn.cypto.domain.repository

import com.ktn.cypto.data.remote.dto.CoinDetailDto
import com.ktn.cypto.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}