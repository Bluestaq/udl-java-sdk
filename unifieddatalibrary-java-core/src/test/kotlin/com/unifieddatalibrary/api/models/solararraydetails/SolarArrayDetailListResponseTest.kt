// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararraydetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolarArrayDetailListResponseTest {

    @Test
    fun create() {
        val solarArrayDetailListResponse =
            SolarArrayDetailListResponse.builder()
                .classificationMarking("U")
                .dataMode(SolarArrayDetailListResponse.DataMode.TEST)
                .idSolarArray("SOLARARRAY-ID")
                .source("Bluestaq")
                .id("SOLARARRAYDETAILS-ID")
                .area(123.4)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example notes")
                .junctionTechnology("Triple")
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .span(123.4)
                .technology("Ga-As")
                .type("U Shaped")
                .build()

        assertThat(solarArrayDetailListResponse.classificationMarking()).isEqualTo("U")
        assertThat(solarArrayDetailListResponse.dataMode())
            .isEqualTo(SolarArrayDetailListResponse.DataMode.TEST)
        assertThat(solarArrayDetailListResponse.idSolarArray()).isEqualTo("SOLARARRAY-ID")
        assertThat(solarArrayDetailListResponse.source()).isEqualTo("Bluestaq")
        assertThat(solarArrayDetailListResponse.id()).contains("SOLARARRAYDETAILS-ID")
        assertThat(solarArrayDetailListResponse.area()).contains(123.4)
        assertThat(solarArrayDetailListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(solarArrayDetailListResponse.createdBy()).contains("some.user")
        assertThat(solarArrayDetailListResponse.description()).contains("Example notes")
        assertThat(solarArrayDetailListResponse.junctionTechnology()).contains("Triple")
        assertThat(solarArrayDetailListResponse.manufacturerOrgId()).contains("MANUFACTURERORG-ID")
        assertThat(solarArrayDetailListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(solarArrayDetailListResponse.origNetwork()).contains("OPS1")
        assertThat(solarArrayDetailListResponse.span()).contains(123.4)
        assertThat(solarArrayDetailListResponse.technology()).contains("Ga-As")
        assertThat(solarArrayDetailListResponse.type()).contains("U Shaped")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val solarArrayDetailListResponse =
            SolarArrayDetailListResponse.builder()
                .classificationMarking("U")
                .dataMode(SolarArrayDetailListResponse.DataMode.TEST)
                .idSolarArray("SOLARARRAY-ID")
                .source("Bluestaq")
                .id("SOLARARRAYDETAILS-ID")
                .area(123.4)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example notes")
                .junctionTechnology("Triple")
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .span(123.4)
                .technology("Ga-As")
                .type("U Shaped")
                .build()

        val roundtrippedSolarArrayDetailListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(solarArrayDetailListResponse),
                jacksonTypeRef<SolarArrayDetailListResponse>(),
            )

        assertThat(roundtrippedSolarArrayDetailListResponse).isEqualTo(solarArrayDetailListResponse)
    }
}
