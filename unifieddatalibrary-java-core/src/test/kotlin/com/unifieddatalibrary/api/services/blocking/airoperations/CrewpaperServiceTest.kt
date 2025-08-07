// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.airoperations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUnpublishParams
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUploadPdfParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CrewpaperServiceTest {

    @Test
    fun unpublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val crewpaperService = client.airOperations().crewpapers()

        crewpaperService.unpublish(CrewpaperUnpublishParams.builder().ids("ids").build())
    }

    @Test
    fun uploadPdf() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val crewpaperService = client.airOperations().crewpapers()

        crewpaperService.uploadPdf(
            CrewpaperUploadPdfParams.builder()
                .aircraftSortieIds("aircraftSortieIds")
                .classificationMarking("x")
                .paperStatus(CrewpaperUploadPdfParams.PaperStatus.PUBLISHED)
                .papersVersion("x")
                .fileContent("some content")
                .build()
        )
    }
}
