// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.taiutc

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaiUtcListResponseTest {

    @Test
    fun create() {
        val taiUtcListResponse =
            TaiUtcListResponse.builder()
                .adjustmentDate(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
                .classificationMarking("U")
                .dataMode(TaiUtcListResponse.DataMode.TEST)
                .source("Bluestaq")
                .id("TAIUTC-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .multiplicationFactor(0.001296)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .rawFileUri("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
                .taiUtc(1.422818)
                .build()

        assertThat(taiUtcListResponse.adjustmentDate())
            .isEqualTo(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
        assertThat(taiUtcListResponse.classificationMarking()).isEqualTo("U")
        assertThat(taiUtcListResponse.dataMode()).isEqualTo(TaiUtcListResponse.DataMode.TEST)
        assertThat(taiUtcListResponse.source()).isEqualTo("Bluestaq")
        assertThat(taiUtcListResponse.id()).contains("TAIUTC-ID")
        assertThat(taiUtcListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(taiUtcListResponse.createdBy()).contains("some.user")
        assertThat(taiUtcListResponse.multiplicationFactor()).contains(0.001296)
        assertThat(taiUtcListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(taiUtcListResponse.origNetwork()).contains("ORIG")
        assertThat(taiUtcListResponse.rawFileUri())
            .contains("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
        assertThat(taiUtcListResponse.taiUtc()).contains(1.422818)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val taiUtcListResponse =
            TaiUtcListResponse.builder()
                .adjustmentDate(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
                .classificationMarking("U")
                .dataMode(TaiUtcListResponse.DataMode.TEST)
                .source("Bluestaq")
                .id("TAIUTC-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .multiplicationFactor(0.001296)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .rawFileUri("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
                .taiUtc(1.422818)
                .build()

        val roundtrippedTaiUtcListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(taiUtcListResponse),
                jacksonTypeRef<TaiUtcListResponse>(),
            )

        assertThat(roundtrippedTaiUtcListResponse).isEqualTo(taiUtcListResponse)
    }
}
