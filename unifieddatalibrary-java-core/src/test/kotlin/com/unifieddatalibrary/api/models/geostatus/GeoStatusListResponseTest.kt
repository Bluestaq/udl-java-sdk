// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.geostatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeoStatusListResponseTest {

    @Test
    fun create() {
        val geoStatusListResponse =
            GeoStatusListResponse.builder()
                .classificationMarking("U")
                .dataMode(GeoStatusListResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
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

        assertThat(geoStatusListResponse.classificationMarking()).isEqualTo("U")
        assertThat(geoStatusListResponse.dataMode()).isEqualTo(GeoStatusListResponse.DataMode.TEST)
        assertThat(geoStatusListResponse.source()).isEqualTo("Bluestaq")
        assertThat(geoStatusListResponse.id()).contains("GEOSTATUS-ID")
        assertThat(geoStatusListResponse.confidenceLevel()).contains("Low")
        assertThat(geoStatusListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(geoStatusListResponse.createdBy()).contains("some.user")
        assertThat(geoStatusListResponse.idOnOrbit()).contains("REF-ONORBIT-ID")
        assertThat(geoStatusListResponse.longitudeMax()).contains(1.01)
        assertThat(geoStatusListResponse.longitudeMin()).contains(180.1)
        assertThat(geoStatusListResponse.longitudeRate()).contains(1.1)
        assertThat(geoStatusListResponse.lostFlag()).contains(false)
        assertThat(geoStatusListResponse.objectStatus()).contains("Active")
        assertThat(geoStatusListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(geoStatusListResponse.origNetwork()).contains("OPS1")
        assertThat(geoStatusListResponse.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(geoStatusListResponse.planeChangeStatus()).contains("Current")
        assertThat(geoStatusListResponse.rawFileUri()).contains("Example URI")
        assertThat(geoStatusListResponse.relativeEnergy()).contains(1.1)
        assertThat(geoStatusListResponse.satNo()).contains(21)
        assertThat(geoStatusListResponse.sc()).contains(1.1)
        assertThat(geoStatusListResponse.semiAnnualCorrFlag()).contains(false)
        assertThat(geoStatusListResponse.ss()).contains(1.1)
        assertThat(geoStatusListResponse.troughType()).contains("West")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geoStatusListResponse =
            GeoStatusListResponse.builder()
                .classificationMarking("U")
                .dataMode(GeoStatusListResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
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

        val roundtrippedGeoStatusListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geoStatusListResponse),
                jacksonTypeRef<GeoStatusListResponse>(),
            )

        assertThat(roundtrippedGeoStatusListResponse).isEqualTo(geoStatusListResponse)
    }
}
