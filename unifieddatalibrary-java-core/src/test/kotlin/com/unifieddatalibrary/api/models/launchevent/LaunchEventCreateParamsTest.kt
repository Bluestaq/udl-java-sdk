// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchevent

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LaunchEventCreateParamsTest {

    @Test
    fun create() {
        LaunchEventCreateParams.builder()
            .classificationMarking("U")
            .dataMode(LaunchEventCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            LaunchEventCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchEventCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(LaunchEventCreateParams.DataMode.TEST)
        assertThat(body.msgCreateDate()).isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("LAUNCHEVENT-ID")
        assertThat(body.beNumber()).contains("ENC-123")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.declassificationDate())
            .contains(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
        assertThat(body.declassificationString()).contains("Example Declassification")
        assertThat(body.derivedFrom()).contains("Example source")
        assertThat(body.idOnOrbit()).contains("REF-ONORBIT-ID")
        assertThat(body.launchDate()).contains(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
        assertThat(body.launchFacilityName()).contains("Example launch facility name")
        assertThat(body.launchFailureCode()).contains("Example failure code")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(body.oSuffix()).contains("oSuffix")
        assertThat(body.satNo()).contains(12)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LaunchEventCreateParams.builder()
                .classificationMarking("U")
                .dataMode(LaunchEventCreateParams.DataMode.TEST)
                .msgCreateDate(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(LaunchEventCreateParams.DataMode.TEST)
        assertThat(body.msgCreateDate()).isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00.123Z"))
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
