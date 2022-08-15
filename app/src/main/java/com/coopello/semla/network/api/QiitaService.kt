package com.coopello.semla.network.api

import com.coopello.semla.network.body.PostItemBody
import com.coopello.semla.network.response.PostItemResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface QiitaService {
    @Headers("Authorization: Bearer 499264c48bc2217b3df43dacaead11c78ba3b277")
    @POST("items")
    suspend fun postItem(@Body body: PostItemBody): Response<PostItemResponse>
}
