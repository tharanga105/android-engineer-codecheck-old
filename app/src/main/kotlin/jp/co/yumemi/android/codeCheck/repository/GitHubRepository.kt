package jp.co.yumemi.android.codeCheck.repository


interface GitHubRepository {
    suspend fun searchRepository(query: String): Result<List<GitHubRepositoryItem>>
}