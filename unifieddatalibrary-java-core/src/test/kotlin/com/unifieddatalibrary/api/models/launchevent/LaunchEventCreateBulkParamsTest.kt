// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchevent

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchEventCreateBulkParamsTest {

    @Test
    fun create() {
        LaunchEventCreateBulkParams.builder()
            .addBody(
                LaunchEventCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(LaunchEventCreateBulkParams.Body.DataMode.TEST)
                    .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                    .source("Bluestaq")
                    .id("LAUNCHEVENT-ID")
                    .beNumber("ENC-123")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                    .declassificationString("Example Declassification")
                    .derivedFrom("Example source")
                    .idOnOrbit("REF-ONORBIT-ID")
                    .launchDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                    .launchFacilityName("Example launch facility name")
                    .launchFailureCode("Example failure code")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origObjectId("ORIGOBJECT-ID")
                    .oSuffix("oSuffix")
                    .satNo(12)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LaunchEventCreateBulkParams.builder()
                .addBody(
                    LaunchEventCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(LaunchEventCreateBulkParams.Body.DataMode.TEST)
                        .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                        .source("Bluestaq")
                        .id("LAUNCHEVENT-ID")
                        .beNumber("ENC-123")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                        .declassificationString("Example Declassification")
                        .derivedFrom("Example source")
                        .idOnOrbit("REF-ONORBIT-ID")
                        .launchDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                        .launchFacilityName("Example launch facility name")
                        .launchFailureCode("Example failure code")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .oSuffix("oSuffix")
                        .satNo(12)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                LaunchEventCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(LaunchEventCreateBulkParams.Body.DataMode.TEST)
                    .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                    .source("Bluestaq")
                    .id("LAUNCHEVENT-ID")
                    .beNumber("ENC-123")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                    .declassificationString("Example Declassification")
                    .derivedFrom("Example source")
                    .idOnOrbit("REF-ONORBIT-ID")
                    .launchDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                    .launchFacilityName("Example launch facility name")
                    .launchFailureCode("Example failure code")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origObjectId("ORIGOBJECT-ID")
                    .oSuffix("oSuffix")
                    .satNo(12)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LaunchEventCreateBulkParams.builder()
                .addBody(
                    LaunchEventCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(LaunchEventCreateBulkParams.Body.DataMode.TEST)
                        .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                LaunchEventCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(LaunchEventCreateBulkParams.Body.DataMode.TEST)
                    .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                    .source("Bluestaq")
                    .build()
            )
    }
}
