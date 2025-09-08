// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifold

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldCreateBulkParamsTest {

    @Test
    fun create() {
        ManifoldCreateBulkParams.builder()
            .addBody(
                ManifoldCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(ManifoldCreateBulkParams.Body.DataMode.TEST)
                    .idObjectOfInterest("OBJECTOFINTEREST-ID")
                    .source("Bluestaq")
                    .id("MANIFOLD-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .deltaT(10.23)
                    .deltaV(10.23)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .status("PENDING")
                    .weight(0.3)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ManifoldCreateBulkParams.builder()
                .addBody(
                    ManifoldCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(ManifoldCreateBulkParams.Body.DataMode.TEST)
                        .idObjectOfInterest("OBJECTOFINTEREST-ID")
                        .source("Bluestaq")
                        .id("MANIFOLD-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .deltaT(10.23)
                        .deltaV(10.23)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .status("PENDING")
                        .weight(0.3)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                ManifoldCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(ManifoldCreateBulkParams.Body.DataMode.TEST)
                    .idObjectOfInterest("OBJECTOFINTEREST-ID")
                    .source("Bluestaq")
                    .id("MANIFOLD-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .deltaT(10.23)
                    .deltaV(10.23)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .status("PENDING")
                    .weight(0.3)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ManifoldCreateBulkParams.builder()
                .addBody(
                    ManifoldCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(ManifoldCreateBulkParams.Body.DataMode.TEST)
                        .idObjectOfInterest("OBJECTOFINTEREST-ID")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                ManifoldCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(ManifoldCreateBulkParams.Body.DataMode.TEST)
                    .idObjectOfInterest("OBJECTOFINTEREST-ID")
                    .source("Bluestaq")
                    .build()
            )
    }
}
