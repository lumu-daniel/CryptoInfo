package com.ktn.cypto.data.repository

import com.ktn.cypto.data.remote.CoinPaprikaApi
import com.ktn.cypto.data.remote.dto.CoinDetailDto
import com.ktn.cypto.data.remote.dto.CoinDto
import com.ktn.cypto.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}