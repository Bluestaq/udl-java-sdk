// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitlistGetResponseTest {

    @Test
    fun create() {
        val onorbitlistGetResponse =
            OnorbitlistGetResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistGetResponse.DataMode.TEST)
                .name("People")
                .source("Bluestaq")
                .id("ONORBITLIST-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION_OF_LIST")
                .addOnorbit("ID1")
                .addOnorbit("ID2")
                .origin("THIRD_PARTY_DATASOURCE")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(onorbitlistGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitlistGetResponse.dataMode())
            .isEqualTo(OnorbitlistGetResponse.DataMode.TEST)
        assertThat(onorbitlistGetResponse.name()).isEqualTo("People")
        assertThat(onorbitlistGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitlistGetResponse.id()).contains("ONORBITLIST-ID")
        assertThat(onorbitlistGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistGetResponse.createdBy()).contains("some.user")
        assertThat(onorbitlistGetResponse.description()).contains("DESCRIPTION_OF_LIST")
        assertThat(onorbitlistGetResponse.onorbits().getOrNull()).containsExactly("ID1", "ID2")
        assertThat(onorbitlistGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitlistGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitlistGetResponse =
            OnorbitlistGetResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistGetResponse.DataMode.TEST)
                .name("People")
                .source("Bluestaq")
                .id("ONORBITLIST-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION_OF_LIST")
                .addOnorbit("ID1")
                .addOnorbit("ID2")
                .origin("THIRD_PARTY_DATASOURCE")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedOnorbitlistGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitlistGetResponse),
                jacksonTypeRef<OnorbitlistGetResponse>(),
            )

        assertThat(roundtrippedOnorbitlistGetResponse).isEqualTo(onorbitlistGetResponse)
    }
}
