// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.crewpapers

import com.unifieddatalibrary.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrewpaperUploadPdfParamsTest {

    @Test
    fun create() {
        CrewpaperUploadPdfParams.builder()
            .aircraftSortieIds("aircraftSortieIds")
            .classificationMarking("x")
            .paperStatus(CrewpaperUploadPdfParams.PaperStatus.PUBLISHED)
            .papersVersion("x")
            .fileContent("some content")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CrewpaperUploadPdfParams.builder()
                .aircraftSortieIds("aircraftSortieIds")
                .classificationMarking("x")
                .paperStatus(CrewpaperUploadPdfParams.PaperStatus.PUBLISHED)
                .papersVersion("x")
                .fileContent("some content")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("aircraftSortieIds", "aircraftSortieIds")
                    .put("classificationMarking", "x")
                    .put("paperStatus", "PUBLISHED")
                    .put("papersVersion", "x")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            CrewpaperUploadPdfParams.builder()
                .aircraftSortieIds("aircraftSortieIds")
                .classificationMarking("x")
                .paperStatus(CrewpaperUploadPdfParams.PaperStatus.PUBLISHED)
                .papersVersion("x")
                .fileContent("some content")
                .build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo("some content")
    }
}
