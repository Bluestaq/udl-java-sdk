// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.countries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryAbridgedTest {

    @Test
    fun create() {
        val countryAbridged =
            CountryAbridged.builder()
                .code("US")
                .dataMode(CountryAbridged.DataMode.TEST)
                .source("Bluestaq")
                .codeAlt("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fipsCode("US")
                .iso3Code("USA")
                .name("UNITED STATES")
                .origNetwork("OPS1")
                .build()

        assertThat(countryAbridged.code()).isEqualTo("US")
        assertThat(countryAbridged.dataMode()).isEqualTo(CountryAbridged.DataMode.TEST)
        assertThat(countryAbridged.source()).isEqualTo("Bluestaq")
        assertThat(countryAbridged.codeAlt()).contains("US")
        assertThat(countryAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(countryAbridged.createdBy()).contains("some.user")
        assertThat(countryAbridged.fipsCode()).contains("US")
        assertThat(countryAbridged.iso3Code()).contains("USA")
        assertThat(countryAbridged.name()).contains("UNITED STATES")
        assertThat(countryAbridged.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val countryAbridged =
            CountryAbridged.builder()
                .code("US")
                .dataMode(CountryAbridged.DataMode.TEST)
                .source("Bluestaq")
                .codeAlt("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fipsCode("US")
                .iso3Code("USA")
                .name("UNITED STATES")
                .origNetwork("OPS1")
                .build()

        val roundtrippedCountryAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(countryAbridged),
                jacksonTypeRef<CountryAbridged>(),
            )

        assertThat(roundtrippedCountryAbridged).isEqualTo(countryAbridged)
    }
}
