package com.ktn.cypto.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ktn.cypto.presentation.coin_detail.CoinDetailState
import com.ktn.cypto.presentation.coin_list.CoinListState

object Utils {

    @Composable
    fun <T>LoaderAndError( state: T, modifier: Modifier){
        when(state){
            is CoinDetailState->{
                if(state.error.isNotBlank()){
                    Text(
                        text = state.error,
                        color = MaterialTheme.colors.error,
                        textAlign = TextAlign.Center,
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                    )
                }
                if(state.isLoading){
                    CircularProgressIndicator(modifier = modifier)
                }
            }
            is CoinListState ->{
                if(state.error.isNotBlank()){
                    Text(
                        text = state.error,
                        color = MaterialTheme.colors.error,
                        textAlign = TextAlign.Center,
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                    )
                }
                if(state.isLoading){
                    CircularProgressIndicator(modifier = modifier)
                }
            }

        }
    }
}