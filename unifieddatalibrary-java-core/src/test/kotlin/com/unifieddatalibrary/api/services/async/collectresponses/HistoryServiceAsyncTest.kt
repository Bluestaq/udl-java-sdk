// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.collectresponses

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.collectresponses.history.HistoryCountParams
import com.unifieddatalibrary.api.models.collectresponses.history.HistoryListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HistoryServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyServiceAsync = client.collectResponses().history()

        val pageFuture =
            historyServiceAsync.list(
                HistoryListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyServiceAsync = client.collectResponses().history()

        val responseFuture =
            historyServiceAsync.count(
                HistoryCountParams.builder()
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }
}
