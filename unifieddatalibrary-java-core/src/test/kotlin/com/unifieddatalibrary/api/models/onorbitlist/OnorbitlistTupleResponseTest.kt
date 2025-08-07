// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitlistTupleResponseTest {

    @Test
    fun create() {
        val onorbitlistTupleResponse =
            OnorbitlistTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistTupleResponse.DataMode.TEST)
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

        assertThat(onorbitlistTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitlistTupleResponse.dataMode())
            .isEqualTo(OnorbitlistTupleResponse.DataMode.TEST)
        assertThat(onorbitlistTupleResponse.name()).isEqualTo("People")
        assertThat(onorbitlistTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitlistTupleResponse.id()).contains("ONORBITLIST-ID")
        assertThat(onorbitlistTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistTupleResponse.createdBy()).contains("some.user")
        assertThat(onorbitlistTupleResponse.description()).contains("DESCRIPTION_OF_LIST")
        assertThat(onorbitlistTupleResponse.onorbits().getOrNull()).containsExactly("ID1", "ID2")
        assertThat(onorbitlistTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitlistTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitlistTupleResponse =
            OnorbitlistTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistTupleResponse.DataMode.TEST)
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

        val roundtrippedOnorbitlistTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitlistTupleResponse),
                jacksonTypeRef<OnorbitlistTupleResponse>(),
            )

        assertThat(roundtrippedOnorbitlistTupleResponse).isEqualTo(onorbitlistTupleResponse)
    }
}
