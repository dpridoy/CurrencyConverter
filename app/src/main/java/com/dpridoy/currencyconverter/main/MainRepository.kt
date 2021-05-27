package com.dpridoy.currencyconverter.main

import com.dpridoy.currencyconverter.data.models.CurrencyResponse
import com.dpridoy.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}