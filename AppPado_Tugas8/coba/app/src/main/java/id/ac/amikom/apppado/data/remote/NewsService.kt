package id.ac.amikom.apppado.data.remote

import android.telecom.Call
import id.ac.amikom.apppado.data.model.NewsList
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("/")
    fun listNews() : retrofit2.Call<NewsList>

    @GET("detail/")
    fun detailNews(@Query("url") url: String) : retrofit2.Call<NewsList>

    @GET("search/")
    fun searchNews(@Query("q") query: String) : retrofit2.Call<NewsList>
}