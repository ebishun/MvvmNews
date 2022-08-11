package com.nabilla.mvvmnews.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.nabilla.mvvmnews.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert_update(article: Article):Long

    @Query("SELECT * FROM articles")
    fun getAllArticles():LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)

}