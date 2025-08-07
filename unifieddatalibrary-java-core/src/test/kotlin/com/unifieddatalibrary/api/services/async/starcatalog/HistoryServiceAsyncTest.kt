// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.starcatalog

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.starcatalog.history.HistoryAodrParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HistoryServiceAsyncTest {

    @Test
    fun aodr() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val historyServiceAsync = client.starCatalog().history()

        val future =
            historyServiceAsync.aodr(
                HistoryAodrParams.builder()
                    .columns("columns")
                    .dec(0.0)
                    .firstResult(0L)
                    .maxResults(0L)
                    .notification("notification")
                    .outputDelimiter("outputDelimiter")
                    .outputFormat("outputFormat")
                    .ra(0.0)
                    .build()
            )

        val response = future.get()
    }
}
