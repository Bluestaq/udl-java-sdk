// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifold

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldGetResponseTest {

    @Test
    fun create() {
        val manifoldGetResponse =
            ManifoldGetResponse.builder()
                .classificationMarking("U")
                .dataMode(ManifoldGetResponse.DataMode.TEST)
                .idObjectOfInterest("OBJECTOFINTEREST-ID")
                .source("Bluestaq")
                .id("MANIFOLD-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deltaT(10.23)
                .deltaV(10.23)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .status("PENDING")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .weight(0.3)
                .build()

        assertThat(manifoldGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(manifoldGetResponse.dataMode()).isEqualTo(ManifoldGetResponse.DataMode.TEST)
        assertThat(manifoldGetResponse.idObjectOfInterest()).isEqualTo("OBJECTOFINTEREST-ID")
        assertThat(manifoldGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(manifoldGetResponse.id()).contains("MANIFOLD-ID")
        assertThat(manifoldGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(manifoldGetResponse.createdBy()).contains("some.user")
        assertThat(manifoldGetResponse.deltaT()).contains(10.23)
        assertThat(manifoldGetResponse.deltaV()).contains(10.23)
        assertThat(manifoldGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(manifoldGetResponse.origNetwork()).contains("ORIG")
        assertThat(manifoldGetResponse.status()).contains("PENDING")
        assertThat(manifoldGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(manifoldGetResponse.updatedBy()).contains("some.user")
        assertThat(manifoldGetResponse.weight()).contains(0.3)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val manifoldGetResponse =
            ManifoldGetResponse.builder()
                .classificationMarking("U")
                .dataMode(ManifoldGetResponse.DataMode.TEST)
                .idObjectOfInterest("OBJECTOFINTEREST-ID")
                .source("Bluestaq")
                .id("MANIFOLD-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deltaT(10.23)
                .deltaV(10.23)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .status("PENDING")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .weight(0.3)
                .build()

        val roundtrippedManifoldGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(manifoldGetResponse),
                jacksonTypeRef<ManifoldGetResponse>(),
            )

        assertThat(roundtrippedManifoldGetResponse).isEqualTo(manifoldGetResponse)
    }
}
