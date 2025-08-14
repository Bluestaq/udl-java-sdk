// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationFullTest {

    @Test
    fun create() {
        val locationFull =
            LocationFull.builder()
                .classificationMarking("U")
                .dataMode(LocationFull.DataMode.TEST)
                .name("Example location")
                .source("Bluestaq")
                .altitude(10.23)
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .idLocation("LOCATION-ID")
                .lat(45.23)
                .lon(179.1)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(locationFull.classificationMarking()).isEqualTo("U")
        assertThat(locationFull.dataMode()).isEqualTo(LocationFull.DataMode.TEST)
        assertThat(locationFull.name()).isEqualTo("Example location")
        assertThat(locationFull.source()).isEqualTo("Bluestaq")
        assertThat(locationFull.altitude()).contains(10.23)
        assertThat(locationFull.countryCode()).contains("US")
        assertThat(locationFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(locationFull.createdBy()).contains("some.user")
        assertThat(locationFull.idLocation()).contains("LOCATION-ID")
        assertThat(locationFull.lat()).contains(45.23)
        assertThat(locationFull.lon()).contains(179.1)
        assertThat(locationFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(locationFull.origNetwork()).contains("OPS1")
        assertThat(locationFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(locationFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locationFull =
            LocationFull.builder()
                .classificationMarking("U")
                .dataMode(LocationFull.DataMode.TEST)
                .name("Example location")
                .source("Bluestaq")
                .altitude(10.23)
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .idLocation("LOCATION-ID")
                .lat(45.23)
                .lon(179.1)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedLocationFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locationFull),
                jacksonTypeRef<LocationFull>(),
            )

        assertThat(roundtrippedLocationFull).isEqualTo(locationFull)
    }
}
