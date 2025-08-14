// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NavigationListResponseTest {

    @Test
    fun create() {
        val navigationListResponse =
            NavigationListResponse.builder()
                .classificationMarking("U")
                .dataMode(NavigationListResponse.DataMode.TEST)
                .name("NAME")
                .source("Bluestaq")
                .id("NAVIGATION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        assertThat(navigationListResponse.classificationMarking()).isEqualTo("U")
        assertThat(navigationListResponse.dataMode())
            .isEqualTo(NavigationListResponse.DataMode.TEST)
        assertThat(navigationListResponse.name()).isEqualTo("NAME")
        assertThat(navigationListResponse.source()).isEqualTo("Bluestaq")
        assertThat(navigationListResponse.id()).contains("NAVIGATION-ID")
        assertThat(navigationListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(navigationListResponse.createdBy()).contains("some.user")
        assertThat(navigationListResponse.description()).contains("DESCRIPTION")
        assertThat(navigationListResponse.idEntity())
            .contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(navigationListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(navigationListResponse.origNetwork()).contains("ORIG")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val navigationListResponse =
            NavigationListResponse.builder()
                .classificationMarking("U")
                .dataMode(NavigationListResponse.DataMode.TEST)
                .name("NAME")
                .source("Bluestaq")
                .id("NAVIGATION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .build()

        val roundtrippedNavigationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(navigationListResponse),
                jacksonTypeRef<NavigationListResponse>(),
            )

        assertThat(roundtrippedNavigationListResponse).isEqualTo(navigationListResponse)
    }
}
