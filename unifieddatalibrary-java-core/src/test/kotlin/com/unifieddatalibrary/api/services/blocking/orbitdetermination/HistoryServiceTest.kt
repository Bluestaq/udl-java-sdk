// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.orbitdetermination

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.orbitdetermination.history.HistoryAodrParams
import com.unifieddatalibrary.api.models.orbitdetermination.history.HistoryCountParams
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
        val historyService = client.orbitdetermination().history()

        val page = historyService.list()

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
        val historyService = client.orbitdetermination().history()

        historyService.aodr(
            HistoryAodrParams.builder()
                .columns("columns")
                .firstResult(0L)
                .idOnOrbit("idOnOrbit")
                .maxResults(0L)
                .notification("notification")
                .outputDelimiter("outputDelimiter")
                .outputFormat("outputFormat")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val historyService = client.orbitdetermination().history()

        historyService.count(
            HistoryCountParams.builder()
                .firstResult(0L)
                .idOnOrbit("idOnOrbit")
                .maxResults(0L)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }
}
