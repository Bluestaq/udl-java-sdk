// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationAbridgedTest {

    @Test
    fun create() {
        val locationAbridged =
            LocationAbridged.builder()
                .classificationMarking("U")
                .dataMode(LocationAbridged.DataMode.TEST)
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
                .build()

        assertThat(locationAbridged.classificationMarking()).isEqualTo("U")
        assertThat(locationAbridged.dataMode()).isEqualTo(LocationAbridged.DataMode.TEST)
        assertThat(locationAbridged.name()).isEqualTo("Example location")
        assertThat(locationAbridged.source()).isEqualTo("Bluestaq")
        assertThat(locationAbridged.altitude()).contains(10.23)
        assertThat(locationAbridged.countryCode()).contains("US")
        assertThat(locationAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(locationAbridged.createdBy()).contains("some.user")
        assertThat(locationAbridged.idLocation()).contains("LOCATION-ID")
        assertThat(locationAbridged.lat()).contains(45.23)
        assertThat(locationAbridged.lon()).contains(179.1)
        assertThat(locationAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(locationAbridged.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locationAbridged =
            LocationAbridged.builder()
                .classificationMarking("U")
                .dataMode(LocationAbridged.DataMode.TEST)
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
                .build()

        val roundtrippedLocationAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locationAbridged),
                jacksonTypeRef<LocationAbridged>(),
            )

        assertThat(roundtrippedLocationAbridged).isEqualTo(locationAbridged)
    }
}
