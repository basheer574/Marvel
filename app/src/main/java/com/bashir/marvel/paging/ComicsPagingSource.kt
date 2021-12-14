package com.bashir.marvel.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.bashir.marvel.data.network.MarvelApiService
import com.bashir.marvel.data.remote.response.comics.ComicsDto
import retrofit2.HttpException
import java.io.IOException

class ComicsPagingSource(private val marvelApiService: MarvelApiService) :
    PagingSource<Int, ComicsDto>() {
    private val currentPage = 1

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ComicsDto> {
        val page = params.key ?: currentPage
        return try {
            val response = marvelApiService.getComicsWithPaging(page)
            val responseDataList = mutableListOf<ComicsDto>()
            val data = response.body()?.data?.results?: mutableListOf()
            responseDataList.addAll(data)

            LoadResult.Page(
                data = responseDataList,
                prevKey = if(currentPage==1) null else -1,
                nextKey = currentPage.plus(1)
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ComicsDto>): Int? {
        return null
    }
}