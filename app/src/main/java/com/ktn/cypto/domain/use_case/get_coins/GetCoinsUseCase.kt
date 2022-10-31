package com.ktn.cypto.domain.use_case.get_coins

import com.ktn.cypto.common.Resource
import com.ktn.cypto.common.Resource.Loading
import com.ktn.cypto.data.remote.dto.toCoin
import com.ktn.cypto.domain.model.Coin
import com.ktn.cypto.domain.repository.CoinRepository
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        }catch (e: Exception){
            emit(Resource.Error(e.localizedMessage?:"An Error Occurred"))
        }
    }
}