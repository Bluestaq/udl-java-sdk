// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.crewpapers

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CrewpaperUnpublishParamsTest {

    @Test
    fun create() {
        CrewpaperUnpublishParams.builder().ids("ids").build()
    }

    @Test
    fun queryParams() {
        val params = CrewpaperUnpublishParams.builder().ids("ids").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("ids", "ids").build())
    }
}
