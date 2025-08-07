// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.location

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationUpdateParamsTest {

    @Test
    fun create() {
        LocationUpdateParams.builder()
            .id("id")
            .locationIngest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LocationUpdateParams.builder()
                .id("id")
                .locationIngest(
                    LocationIngest.builder()
                        .classificationMarking("U")
                        .dataMode(LocationIngest.DataMode.TEST)
                        .name("Example location")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LocationUpdateParams.builder()
                .id("id")
                .locationIngest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LocationUpdateParams.builder()
                .id("id")
                .locationIngest(
                    LocationIngest.builder()
                        .classificationMarking("U")
                        .dataMode(LocationIngest.DataMode.TEST)
                        .name("Example location")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LocationIngest.builder()
                    .classificationMarking("U")
                    .dataMode(LocationIngest.DataMode.TEST)
                    .name("Example location")
                    .source("Bluestaq")
                    .build()
            )
    }
}
