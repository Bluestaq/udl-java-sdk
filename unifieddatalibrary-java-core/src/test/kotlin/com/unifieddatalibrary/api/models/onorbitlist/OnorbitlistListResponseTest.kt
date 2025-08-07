// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitlistListResponseTest {

    @Test
    fun create() {
        val onorbitlistListResponse =
            OnorbitlistListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistListResponse.DataMode.TEST)
                .name("People")
                .source("Bluestaq")
                .id("ONORBITLIST-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION_OF_LIST")
                .addOnorbit("ID1")
                .addOnorbit("ID2")
                .origin("THIRD_PARTY_DATASOURCE")
                .build()

        assertThat(onorbitlistListResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitlistListResponse.dataMode())
            .isEqualTo(OnorbitlistListResponse.DataMode.TEST)
        assertThat(onorbitlistListResponse.name()).isEqualTo("People")
        assertThat(onorbitlistListResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitlistListResponse.id()).contains("ONORBITLIST-ID")
        assertThat(onorbitlistListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistListResponse.createdBy()).contains("some.user")
        assertThat(onorbitlistListResponse.description()).contains("DESCRIPTION_OF_LIST")
        assertThat(onorbitlistListResponse.onorbits().getOrNull()).containsExactly("ID1", "ID2")
        assertThat(onorbitlistListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitlistListResponse =
            OnorbitlistListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistListResponse.DataMode.TEST)
                .name("People")
                .source("Bluestaq")
                .id("ONORBITLIST-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION_OF_LIST")
                .addOnorbit("ID1")
                .addOnorbit("ID2")
                .origin("THIRD_PARTY_DATASOURCE")
                .build()

        val roundtrippedOnorbitlistListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitlistListResponse),
                jacksonTypeRef<OnorbitlistListResponse>(),
            )

        assertThat(roundtrippedOnorbitlistListResponse).isEqualTo(onorbitlistListResponse)
    }
}
