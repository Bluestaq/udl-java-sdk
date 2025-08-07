// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfbandtype

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandTypeListResponseTest {

    @Test
    fun create() {
        val rfBandTypeListResponse =
            RfBandTypeListResponse.builder()
                .id("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeListResponse.DataMode.TEST)
                .description("Example description")
                .source("Bluestaq")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endFreq(123.4)
                .origin("THIRD_PARTY_DATASOURCE")
                .startFreq(123.4)
                .build()

        assertThat(rfBandTypeListResponse.id()).isEqualTo("Ku")
        assertThat(rfBandTypeListResponse.classificationMarking()).isEqualTo("U")
        assertThat(rfBandTypeListResponse.dataMode())
            .isEqualTo(RfBandTypeListResponse.DataMode.TEST)
        assertThat(rfBandTypeListResponse.description()).isEqualTo("Example description")
        assertThat(rfBandTypeListResponse.source()).isEqualTo("Bluestaq")
        assertThat(rfBandTypeListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(rfBandTypeListResponse.createdBy()).contains("some.user")
        assertThat(rfBandTypeListResponse.endFreq()).contains(123.4)
        assertThat(rfBandTypeListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(rfBandTypeListResponse.startFreq()).contains(123.4)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfBandTypeListResponse =
            RfBandTypeListResponse.builder()
                .id("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeListResponse.DataMode.TEST)
                .description("Example description")
                .source("Bluestaq")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endFreq(123.4)
                .origin("THIRD_PARTY_DATASOURCE")
                .startFreq(123.4)
                .build()

        val roundtrippedRfBandTypeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfBandTypeListResponse),
                jacksonTypeRef<RfBandTypeListResponse>(),
            )

        assertThat(roundtrippedRfBandTypeListResponse).isEqualTo(rfBandTypeListResponse)
    }
}
