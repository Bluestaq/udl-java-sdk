// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifold

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldListResponseTest {

    @Test
    fun create() {
        val manifoldListResponse =
            ManifoldListResponse.builder()
                .classificationMarking("U")
                .dataMode(ManifoldListResponse.DataMode.TEST)
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

        assertThat(manifoldListResponse.classificationMarking()).isEqualTo("U")
        assertThat(manifoldListResponse.dataMode()).isEqualTo(ManifoldListResponse.DataMode.TEST)
        assertThat(manifoldListResponse.idObjectOfInterest()).isEqualTo("OBJECTOFINTEREST-ID")
        assertThat(manifoldListResponse.source()).isEqualTo("Bluestaq")
        assertThat(manifoldListResponse.id()).contains("MANIFOLD-ID")
        assertThat(manifoldListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(manifoldListResponse.createdBy()).contains("some.user")
        assertThat(manifoldListResponse.deltaT()).contains(10.23)
        assertThat(manifoldListResponse.deltaV()).contains(10.23)
        assertThat(manifoldListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(manifoldListResponse.origNetwork()).contains("OPS1")
        assertThat(manifoldListResponse.status()).contains("PENDING")
        assertThat(manifoldListResponse.weight()).contains(0.3)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val manifoldListResponse =
            ManifoldListResponse.builder()
                .classificationMarking("U")
                .dataMode(ManifoldListResponse.DataMode.TEST)
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

        val roundtrippedManifoldListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(manifoldListResponse),
                jacksonTypeRef<ManifoldListResponse>(),
            )

        assertThat(roundtrippedManifoldListResponse).isEqualTo(manifoldListResponse)
    }
}
