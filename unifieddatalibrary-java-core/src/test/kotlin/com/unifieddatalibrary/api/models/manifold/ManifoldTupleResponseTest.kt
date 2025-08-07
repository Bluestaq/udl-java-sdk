// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifold

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldTupleResponseTest {

    @Test
    fun create() {
        val manifoldTupleResponse =
            ManifoldTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(ManifoldTupleResponse.DataMode.TEST)
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

        assertThat(manifoldTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(manifoldTupleResponse.dataMode()).isEqualTo(ManifoldTupleResponse.DataMode.TEST)
        assertThat(manifoldTupleResponse.idObjectOfInterest()).isEqualTo("OBJECTOFINTEREST-ID")
        assertThat(manifoldTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(manifoldTupleResponse.id()).contains("MANIFOLD-ID")
        assertThat(manifoldTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(manifoldTupleResponse.createdBy()).contains("some.user")
        assertThat(manifoldTupleResponse.deltaT()).contains(10.23)
        assertThat(manifoldTupleResponse.deltaV()).contains(10.23)
        assertThat(manifoldTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(manifoldTupleResponse.origNetwork()).contains("ORIG")
        assertThat(manifoldTupleResponse.status()).contains("PENDING")
        assertThat(manifoldTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(manifoldTupleResponse.updatedBy()).contains("some.user")
        assertThat(manifoldTupleResponse.weight()).contains(0.3)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val manifoldTupleResponse =
            ManifoldTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(ManifoldTupleResponse.DataMode.TEST)
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

        val roundtrippedManifoldTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(manifoldTupleResponse),
                jacksonTypeRef<ManifoldTupleResponse>(),
            )

        assertThat(roundtrippedManifoldTupleResponse).isEqualTo(manifoldTupleResponse)
    }
}
