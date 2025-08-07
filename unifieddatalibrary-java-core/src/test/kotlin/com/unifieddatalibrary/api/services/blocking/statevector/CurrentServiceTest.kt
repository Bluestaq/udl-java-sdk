// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.statevector

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.statevector.current.CurrentTupleParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CurrentServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val currentService = client.stateVector().current()

        val page = currentService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val currentService = client.stateVector().current()

        val stateVectorFulls =
            currentService.tuple(
                CurrentTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        stateVectorFulls.forEach { it.validate() }
    }
}
