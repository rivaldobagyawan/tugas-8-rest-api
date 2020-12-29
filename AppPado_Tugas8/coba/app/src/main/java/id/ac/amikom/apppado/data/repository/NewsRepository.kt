package id.ac.amikom.apppado.data.repository

import id.ac.amikom.apppado.data.model.ActionState
import id.ac.amikom.apppado.data.model.News
import id.ac.amikom.apppado.data.remote.NewsService
import id.ac.amikom.apppado.data.remote.RetrofitApi
import retrofit2.await
import retrofit2.http.Query
import java.lang.Exception

class NewsRepository {
    private val newsService : NewsService by lazy { RetrofitApi.newsService() }

    suspend fun listNews() : ActionState<List<News>> {
        return try {
            val list = newsService.listNews().await()
            ActionState(list.data)
        } catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)

        }
    }

    suspend fun detailNews(url: String) : ActionState<News> {
        return try {
            val list = newsService.detailNews(url).await()
            ActionState(list.data.first())
        } catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)
        }
    }

    suspend fun searchNews(query: String) : ActionState<List<News>> {
        return try {
            val list = newsService.searchNews(query).await()
            ActionState(list.data)
        } catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)
        }
    }
}