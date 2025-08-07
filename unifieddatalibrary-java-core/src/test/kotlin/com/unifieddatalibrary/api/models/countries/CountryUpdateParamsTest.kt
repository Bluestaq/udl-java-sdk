// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.countries

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryUpdateParamsTest {

    @Test
    fun create() {
        CountryUpdateParams.builder()
            .pathCode("code")
            .bodyCode("US")
            .dataMode(CountryUpdateParams.DataMode.TEST)
            .source("Bluestaq")
            .codeAlt("US")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .fipsCode("US")
            .iso3Code("USA")
            .name("UNITED STATES")
            .origNetwork("OPS1")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CountryUpdateParams.builder()
                .pathCode("code")
                .bodyCode("US")
                .dataMode(CountryUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("code")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CountryUpdateParams.builder()
                .pathCode("code")
                .bodyCode("US")
                .dataMode(CountryUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .codeAlt("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .fipsCode("US")
                .iso3Code("USA")
                .name("UNITED STATES")
                .origNetwork("OPS1")
                .build()

        val body = params._body()

        assertThat(body.bodyCode()).isEqualTo("US")
        assertThat(body.dataMode()).isEqualTo(CountryUpdateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.codeAlt()).contains("US")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.fipsCode()).contains("US")
        assertThat(body.iso3Code()).contains("USA")
        assertThat(body.name()).contains("UNITED STATES")
        assertThat(body.origNetwork()).contains("OPS1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CountryUpdateParams.builder()
                .pathCode("code")
                .bodyCode("US")
                .dataMode(CountryUpdateParams.DataMode.TEST)
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.bodyCode()).isEqualTo("US")
        assertThat(body.dataMode()).isEqualTo(CountryUpdateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
