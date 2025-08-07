// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.collectresponses

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.collectresponses.tuple.TupleListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TupleServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val tupleServiceAsync = client.collectResponses().tuple()

        val pageFuture =
            tupleServiceAsync.list(
                TupleListParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }
}
