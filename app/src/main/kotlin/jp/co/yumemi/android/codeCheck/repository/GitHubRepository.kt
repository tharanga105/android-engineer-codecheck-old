package jp.co.yumemi.android.codeCheck.repository

import jp.co.yumemi.android.codeCheck.model.GitHubRepositoryItem


interface GitHubRepository {
    suspend fun searchRepository(query: String): Result<List<GitHubRepositoryItem>>
}