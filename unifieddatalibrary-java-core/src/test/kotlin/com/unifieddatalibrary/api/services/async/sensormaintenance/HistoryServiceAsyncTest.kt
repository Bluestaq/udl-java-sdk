// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.sensormaintenance

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.sensormaintenance.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.sensormaintenance.history.HistoryCountParams
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
        val historyServiceAsync = client.sensorMaintenance().history()

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
        val historyServiceAsync = client.sensorMaintenance().history()

        val future =
            historyServiceAsync.aodr(
                HistoryAodrParams.builder()
                    .columns("columns")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .notification("notification")
                    .outputDelimiter("outputDelimiter")
                    .outputFormat("outputFormat")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val historyServiceAsync = client.sensorMaintenance().history()

        val responseFuture =
            historyServiceAsync.count(
                HistoryCountParams.builder()
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
    }
}
