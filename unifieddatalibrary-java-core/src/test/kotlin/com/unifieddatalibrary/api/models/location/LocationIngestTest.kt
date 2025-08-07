// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.location

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationIngestTest {

    @Test
    fun create() {
        val locationIngest =
            LocationIngest.builder()
                .classificationMarking("U")
                .dataMode(LocationIngest.DataMode.TEST)
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

        assertThat(locationIngest.classificationMarking()).isEqualTo("U")
        assertThat(locationIngest.dataMode()).isEqualTo(LocationIngest.DataMode.TEST)
        assertThat(locationIngest.name()).isEqualTo("Example location")
        assertThat(locationIngest.source()).isEqualTo("Bluestaq")
        assertThat(locationIngest.altitude()).contains(10.23)
        assertThat(locationIngest.countryCode()).contains("US")
        assertThat(locationIngest.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(locationIngest.createdBy()).contains("some.user")
        assertThat(locationIngest.idLocation()).contains("LOCATION-ID")
        assertThat(locationIngest.lat()).contains(45.23)
        assertThat(locationIngest.lon()).contains(179.1)
        assertThat(locationIngest.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(locationIngest.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locationIngest =
            LocationIngest.builder()
                .classificationMarking("U")
                .dataMode(LocationIngest.DataMode.TEST)
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

        val roundtrippedLocationIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locationIngest),
                jacksonTypeRef<LocationIngest>(),
            )

        assertThat(roundtrippedLocationIngest).isEqualTo(locationIngest)
    }
}
