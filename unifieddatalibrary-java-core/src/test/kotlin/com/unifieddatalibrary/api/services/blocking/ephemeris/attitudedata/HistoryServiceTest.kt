// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.ephemeris.attitudedata

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.history.HistoryCountParams
import com.unifieddatalibrary.api.models.ephemeris.attitudedata.history.HistoryRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HistoryServiceTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyService = client.ephemeris().attitudeData().history()

        val attitudedataFulls =
            historyService.retrieve(
                HistoryRetrieveParams.builder()
                    .asId("asId")
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        attitudedataFulls.forEach { it.validate() }
    }

    @Test
    fun aodr() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyService = client.ephemeris().attitudeData().history()

        historyService.aodr(
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
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyService = client.ephemeris().attitudeData().history()

        historyService.count(
            HistoryCountParams.builder().asId("asId").firstResult(0L).maxResults(0L).build()
        )
    }
}
