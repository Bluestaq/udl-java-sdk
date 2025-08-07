// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfbandtype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandTypeGetResponseTest {

    @Test
    fun create() {
        val rfBandTypeGetResponse =
            RfBandTypeGetResponse.builder()
                .id("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeGetResponse.DataMode.TEST)
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

        assertThat(rfBandTypeGetResponse.id()).isEqualTo("Ku")
        assertThat(rfBandTypeGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(rfBandTypeGetResponse.dataMode()).isEqualTo(RfBandTypeGetResponse.DataMode.TEST)
        assertThat(rfBandTypeGetResponse.description()).isEqualTo("Example description")
        assertThat(rfBandTypeGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(rfBandTypeGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(rfBandTypeGetResponse.createdBy()).contains("some.user")
        assertThat(rfBandTypeGetResponse.endFreq()).contains(123.4)
        assertThat(rfBandTypeGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(rfBandTypeGetResponse.startFreq()).contains(123.4)
        assertThat(rfBandTypeGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(rfBandTypeGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfBandTypeGetResponse =
            RfBandTypeGetResponse.builder()
                .id("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeGetResponse.DataMode.TEST)
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

        val roundtrippedRfBandTypeGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfBandTypeGetResponse),
                jacksonTypeRef<RfBandTypeGetResponse>(),
            )

        assertThat(roundtrippedRfBandTypeGetResponse).isEqualTo(rfBandTypeGetResponse)
    }
}
