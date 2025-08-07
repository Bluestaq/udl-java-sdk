// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.ephemeris

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.ephemeris.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.ephemeris.history.HistoryCountParams
import com.unifieddatalibrary.api.models.ephemeris.history.HistoryListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HistoryServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyService = client.ephemeris().history()

        val page = historyService.list(HistoryListParams.builder().esId("esId").build())

        page.items().forEach { it.validate() }
    }

    @Test
    fun aodr() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyService = client.ephemeris().history()

        historyService.aodr(
            HistoryAodrParams.builder()
                .esId("esId")
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
        val historyService = client.ephemeris().history()

        historyService.count(
            HistoryCountParams.builder().esId("esId").firstResult(0L).maxResults(0L).build()
        )
    }
}
