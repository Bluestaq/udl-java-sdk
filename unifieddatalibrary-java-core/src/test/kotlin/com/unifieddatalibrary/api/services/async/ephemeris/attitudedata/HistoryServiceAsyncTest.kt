// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.ephemeris.attitudedata

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.history.HistoryCountParams
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.history.HistoryRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HistoryServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyServiceAsync = client.ephemeris().attitudeData().history()

        val attitudedataFullsFuture =
            historyServiceAsync.retrieve(
                HistoryRetrieveParams.builder()
                    .asId("asId")
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val attitudedataFulls = attitudedataFullsFuture.get()
        attitudedataFulls.forEach { it.validate() }
    }

    @Test
    fun aodr() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyServiceAsync = client.ephemeris().attitudeData().history()

        val future =
            historyServiceAsync.aodr(
                HistoryAodrParams.builder()
                    .asId("asId")
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
        val historyServiceAsync = client.ephemeris().attitudeData().history()

        val responseFuture =
            historyServiceAsync.count(
                HistoryCountParams.builder().asId("asId").firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }
}
