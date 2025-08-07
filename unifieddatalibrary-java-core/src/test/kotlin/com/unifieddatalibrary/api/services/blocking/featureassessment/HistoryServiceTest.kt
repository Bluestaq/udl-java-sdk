// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.featureassessment

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryCountParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryQueryParams
import com.unifieddatalibrary.api.models.featureassessment.history.HistoryWriteAodrParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HistoryServiceTest {

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

    @Test
    fun query() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyService = client.featureAssessment().history()

        val response =
            historyService.query(
                HistoryQueryParams.builder()
                    .idAnalyticImagery("idAnalyticImagery")
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun writeAodr() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyService = client.featureAssessment().history()

        historyService.writeAodr(
            HistoryWriteAodrParams.builder()
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
}
