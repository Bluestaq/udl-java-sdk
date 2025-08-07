// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryFullTest {

    @Test
    fun create() {
        val countryFull =
            CountryFull.builder()
                .code("US")
                .dataMode(CountryFull.DataMode.TEST)
                .source("Bluestaq")
                .codeAlt("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fipsCode("US")
                .iso3Code("USA")
                .name("UNITED STATES")
                .origNetwork("OPS1")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(countryFull.code()).isEqualTo("US")
        assertThat(countryFull.dataMode()).isEqualTo(CountryFull.DataMode.TEST)
        assertThat(countryFull.source()).isEqualTo("Bluestaq")
        assertThat(countryFull.codeAlt()).contains("US")
        assertThat(countryFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(countryFull.createdBy()).contains("some.user")
        assertThat(countryFull.fipsCode()).contains("US")
        assertThat(countryFull.iso3Code()).contains("USA")
        assertThat(countryFull.name()).contains("UNITED STATES")
        assertThat(countryFull.origNetwork()).contains("OPS1")
        assertThat(countryFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(countryFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val countryFull =
            CountryFull.builder()
                .code("US")
                .dataMode(CountryFull.DataMode.TEST)
                .source("Bluestaq")
                .codeAlt("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fipsCode("US")
                .iso3Code("USA")
                .name("UNITED STATES")
                .origNetwork("OPS1")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedCountryFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(countryFull),
                jacksonTypeRef<CountryFull>(),
            )

        assertThat(roundtrippedCountryFull).isEqualTo(countryFull)
    }
}
