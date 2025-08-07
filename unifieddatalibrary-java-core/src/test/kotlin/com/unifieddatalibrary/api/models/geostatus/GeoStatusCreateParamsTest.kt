// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.geostatus

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeoStatusCreateParamsTest {

    @Test
    fun create() {
        GeoStatusCreateParams.builder()
            .classificationMarking("U")
            .dataMode(GeoStatusCreateParams.DataMode.TEST)
            .source("Bluestaq")
            .id("GEOSTATUS-ID")
            .confidenceLevel("Low")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .idOnOrbit("REF-ONORBIT-ID")
            .longitudeMax(1.01)
            .longitudeMin(180.1)
            .longitudeRate(1.1)
            .lostFlag(false)
            .objectStatus("Active")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .origObjectId("ORIGOBJECT-ID")
            .planeChangeStatus("Current")
            .rawFileUri("Example URI")
            .relativeEnergy(1.1)
            .satNo(21)
            .sc(1.1)
            .semiAnnualCorrFlag(false)
            .ss(1.1)
            .troughType("West")
            .build()
    }

    @Test
    fun body() {
        val params =
            GeoStatusCreateParams.builder()
                .classificationMarking("U")
                .dataMode(GeoStatusCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .id("GEOSTATUS-ID")
                .confidenceLevel("Low")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .idOnOrbit("REF-ONORBIT-ID")
                .longitudeMax(1.01)
                .longitudeMin(180.1)
                .longitudeRate(1.1)
                .lostFlag(false)
                .objectStatus("Active")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origObjectId("ORIGOBJECT-ID")
                .planeChangeStatus("Current")
                .rawFileUri("Example URI")
                .relativeEnergy(1.1)
                .satNo(21)
                .sc(1.1)
                .semiAnnualCorrFlag(false)
                .ss(1.1)
                .troughType("West")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(GeoStatusCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("GEOSTATUS-ID")
        assertThat(body.confidenceLevel()).contains("Low")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.idOnOrbit()).contains("REF-ONORBIT-ID")
        assertThat(body.longitudeMax()).contains(1.01)
        assertThat(body.longitudeMin()).contains(180.1)
        assertThat(body.longitudeRate()).contains(1.1)
        assertThat(body.lostFlag()).contains(false)
        assertThat(body.objectStatus()).contains("Active")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(body.planeChangeStatus()).contains("Current")
        assertThat(body.rawFileUri()).contains("Example URI")
        assertThat(body.relativeEnergy()).contains(1.1)
        assertThat(body.satNo()).contains(21)
        assertThat(body.sc()).contains(1.1)
        assertThat(body.semiAnnualCorrFlag()).contains(false)
        assertThat(body.ss()).contains(1.1)
        assertThat(body.troughType()).contains("West")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GeoStatusCreateParams.builder()
                .classificationMarking("U")
                .dataMode(GeoStatusCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(GeoStatusCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
