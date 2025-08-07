// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.linkstatus

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.linkstatus.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.linkstatus.history.HistoryCountParams
import java.time.LocalDate
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
        val historyServiceAsync = client.linkStatus().history()

        val pageFuture = historyServiceAsync.list()

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
        val historyServiceAsync = client.linkStatus().history()

        val future =
            historyServiceAsync.aodr(
                HistoryAodrParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .linkStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .linkStopTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val historyServiceAsync = client.linkStatus().history()

        val responseFuture =
            historyServiceAsync.count(
                HistoryCountParams.builder()
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .firstResult(0L)
                    .linkStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .linkStopTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }
}
