// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUnpublishParams
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUploadPdfParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CrewpaperServiceAsyncTest {

    @Test
    fun unpublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val crewpaperServiceAsync = client.airOperations().crewpapers()

        val future =
            crewpaperServiceAsync.unpublish(CrewpaperUnpublishParams.builder().ids("ids").build())

        val response = future.get()
    }

    @Test
    fun uploadPdf() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val crewpaperServiceAsync = client.airOperations().crewpapers()

        val future =
            crewpaperServiceAsync.uploadPdf(
                CrewpaperUploadPdfParams.builder()
                    .aircraftSortieIds("aircraftSortieIds")
                    .classificationMarking("x")
                    .paperStatus(CrewpaperUploadPdfParams.PaperStatus.PUBLISHED)
                    .papersVersion("x")
                    .fileContent("some content")
                    .build()
            )

        val response = future.get()
    }
}
