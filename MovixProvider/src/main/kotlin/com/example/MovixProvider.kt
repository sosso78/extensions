package com.example

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*
import org.jsoup.nodes.Element

class MovixProvider : MainAPI() {
    override var mainUrl = "https://movix.cloud"
    override var name = "Movix"
    override var lang = "fr"
    override val hasMainPage = true
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        // à compléter
    }

    override suspend fun search(query: String): List<SearchResponse> {
        // à compléter
    }

    override suspend fun load(url: String): LoadResponse {
        // à compléter
    }
}
