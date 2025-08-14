// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfbandtype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandTypeTupleResponseTest {

    @Test
    fun create() {
        val rfBandTypeTupleResponse =
            RfBandTypeTupleResponse.builder()
                .id("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeTupleResponse.DataMode.TEST)
                .description("Example description")
                .source("Bluestaq")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endFreq(123.4)
                .origin("THIRD_PARTY_DATASOURCE")
                .startFreq(123.4)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(rfBandTypeTupleResponse.id()).isEqualTo("Ku")
        assertThat(rfBandTypeTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(rfBandTypeTupleResponse.dataMode())
            .isEqualTo(RfBandTypeTupleResponse.DataMode.TEST)
        assertThat(rfBandTypeTupleResponse.description()).isEqualTo("Example description")
        assertThat(rfBandTypeTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(rfBandTypeTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(rfBandTypeTupleResponse.createdBy()).contains("some.user")
        assertThat(rfBandTypeTupleResponse.endFreq()).contains(123.4)
        assertThat(rfBandTypeTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(rfBandTypeTupleResponse.startFreq()).contains(123.4)
        assertThat(rfBandTypeTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(rfBandTypeTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfBandTypeTupleResponse =
            RfBandTypeTupleResponse.builder()
                .id("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeTupleResponse.DataMode.TEST)
                .description("Example description")
                .source("Bluestaq")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endFreq(123.4)
                .origin("THIRD_PARTY_DATASOURCE")
                .startFreq(123.4)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedRfBandTypeTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfBandTypeTupleResponse),
                jacksonTypeRef<RfBandTypeTupleResponse>(),
            )

        assertThat(roundtrippedRfBandTypeTupleResponse).isEqualTo(rfBandTypeTupleResponse)
    }
}
