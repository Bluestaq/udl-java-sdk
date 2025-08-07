// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.launchevent

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.launchevent.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.launchevent.history.HistoryCountParams
import com.unifieddatalibrary.api.models.launchevent.history.HistoryListParams
import java.time.OffsetDateTime
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
        val historyServiceAsync = client.launchEvent().history()

        val pageFuture =
            historyServiceAsync.list(
                HistoryListParams.builder()
                    .msgCreateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun aodr() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyServiceAsync = client.launchEvent().history()

        val future =
            historyServiceAsync.aodr(
                HistoryAodrParams.builder()
                    .msgCreateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .notification("notification")
                    .outputDelimiter("outputDelimiter")
                    .outputFormat("outputFormat")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyServiceAsync = client.launchEvent().history()

        val responseFuture =
            historyServiceAsync.count(
                HistoryCountParams.builder()
                    .msgCreateDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }
}
