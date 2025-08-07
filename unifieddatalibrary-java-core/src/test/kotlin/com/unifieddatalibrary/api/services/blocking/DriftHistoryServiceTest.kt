// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryCountParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryRetrieveParams
import com.unifieddatalibrary.api.models.drifthistory.DriftHistoryTupleParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DriftHistoryServiceTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val driftHistoryService = client.driftHistory()

        val driftHistoryFull =
            driftHistoryService.retrieve(
                DriftHistoryRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        driftHistoryFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val driftHistoryService = client.driftHistory()

        val page = driftHistoryService.list()

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
        val driftHistoryService = client.driftHistory()

        driftHistoryService.count(
            DriftHistoryCountParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val driftHistoryService = client.driftHistory()

        val response = driftHistoryService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val driftHistoryService = client.driftHistory()

        val driftHistoryFulls =
            driftHistoryService.tuple(
                DriftHistoryTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        driftHistoryFulls.forEach { it.validate() }
    }
}
