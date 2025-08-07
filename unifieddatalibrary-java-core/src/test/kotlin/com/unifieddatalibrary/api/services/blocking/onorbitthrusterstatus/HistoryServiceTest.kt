// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.onorbitthrusterstatus

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.onorbitthrusterstatus.history.HistoryCountParams
import java.time.OffsetDateTime
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
        val historyService = client.onorbitthrusterstatus().history()

        val page = historyService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyService = client.onorbitthrusterstatus().history()

        historyService.count(
            HistoryCountParams.builder()
                .firstResult(0L)
                .idOnorbitThruster("idOnorbitThruster")
                .maxResults(0L)
                .statusTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }
}
