package com.ktn.cypto.domain.use_case.get_coin

import com.ktn.cypto.common.Resource
import com.ktn.cypto.common.Resource.Loading
import com.ktn.cypto.data.remote.dto.toCoin
import com.ktn.cypto.data.remote.dto.toCoinDetail
import com.ktn.cypto.domain.model.Coin
import com.ktn.cypto.domain.model.CoinDetail
import com.ktn.cypto.domain.repository.CoinRepository
import com.ktn.cypto.domain.use_case.get_coins.GetCoinsUseCase
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Loading())
            val coins = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coins))
        }catch (e: Exception){
            emit(Resource.Error(e.localizedMessage?:"An Error Occurred"))
        }
    }
}