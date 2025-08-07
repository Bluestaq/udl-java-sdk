// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.sortieppr

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.sortieppr.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.sortieppr.history.HistoryCountParams
import com.unifieddatalibrary.api.models.sortieppr.history.HistoryListParams
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
        val historyService = client.sortiePpr().history()

        val page = historyService.list(HistoryListParams.builder().idSortie("idSortie").build())

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
        val historyService = client.sortiePpr().history()

        historyService.aodr(
            HistoryAodrParams.builder()
                .idSortie("idSortie")
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
        val historyService = client.sortiePpr().history()

        historyService.count(
            HistoryCountParams.builder().idSortie("idSortie").firstResult(0L).maxResults(0L).build()
        )
    }
}
