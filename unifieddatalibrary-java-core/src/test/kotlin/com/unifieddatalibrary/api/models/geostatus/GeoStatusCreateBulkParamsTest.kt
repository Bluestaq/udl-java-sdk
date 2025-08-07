// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.geostatus

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeoStatusCreateBulkParamsTest {

    @Test
    fun create() {
        GeoStatusCreateBulkParams.builder()
            .addBody(
                GeoStatusCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(GeoStatusCreateBulkParams.Body.DataMode.TEST)
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            GeoStatusCreateBulkParams.builder()
                .addBody(
                    GeoStatusCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(GeoStatusCreateBulkParams.Body.DataMode.TEST)
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                GeoStatusCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(GeoStatusCreateBulkParams.Body.DataMode.TEST)
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GeoStatusCreateBulkParams.builder()
                .addBody(
                    GeoStatusCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(GeoStatusCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                GeoStatusCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(GeoStatusCreateBulkParams.Body.DataMode.TEST)
                    .source("Bluestaq")
                    .build()
            )
    }
}
