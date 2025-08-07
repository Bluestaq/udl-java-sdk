// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.effectrequests

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.effectrequests.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.effectrequests.history.HistoryCountParams
import com.unifieddatalibrary.api.models.effectrequests.history.HistoryListParams
import java.time.LocalDate
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
        val historyService = client.effectRequests().history()

        val page =
            historyService.list(
                HistoryListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
            )

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
        val historyService = client.effectRequests().history()

        historyService.aodr(
            HistoryAodrParams.builder()
                .createdAt(LocalDate.parse("2019-12-27"))
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
        val historyService = client.effectRequests().history()

        historyService.count(
            HistoryCountParams.builder()
                .createdAt(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }
}
