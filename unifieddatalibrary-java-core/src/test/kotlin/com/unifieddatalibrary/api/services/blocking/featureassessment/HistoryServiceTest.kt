// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.featureassessment

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryCountParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryListParams
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
        val historyService = client.featureAssessment().history()

        val page =
            historyService.list(
                HistoryListParams.builder().idAnalyticImagery("idAnalyticImagery").build()
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
        val historyService = client.featureAssessment().history()

        historyService.aodr(
            HistoryAodrParams.builder()
                .idAnalyticImagery("idAnalyticImagery")
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
        val historyService = client.featureAssessment().history()

        historyService.count(
            HistoryCountParams.builder()
                .idAnalyticImagery("idAnalyticImagery")
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }
}
