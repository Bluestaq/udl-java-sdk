// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scientific

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScientificListResponseTest {

    @Test
    fun create() {
        val scientificListResponse =
            ScientificListResponse.builder()
                .classificationMarking("U")
                .dataMode(ScientificListResponse.DataMode.TEST)
                .name("SEM/MAG")
                .source("Bluestaq")
                .spacecraftId("REF-SPACECRAFT-ID")
                .id("SCIENTIFIC-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .frequencyBand("Gamma")
                .hostedForCompanyOrgId("REF-HOSTEDFORCOMPANYORG-ID")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .manufacturerOrgId("REF-MANUFACTURERORG-ID")
                .notes("NOTES")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .payloadCategory("Sensor")
                .build()

        assertThat(scientificListResponse.classificationMarking()).isEqualTo("U")
        assertThat(scientificListResponse.dataMode())
            .isEqualTo(ScientificListResponse.DataMode.TEST)
        assertThat(scientificListResponse.name()).isEqualTo("SEM/MAG")
        assertThat(scientificListResponse.source()).isEqualTo("Bluestaq")
        assertThat(scientificListResponse.spacecraftId()).isEqualTo("REF-SPACECRAFT-ID")
        assertThat(scientificListResponse.id()).contains("SCIENTIFIC-ID")
        assertThat(scientificListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(scientificListResponse.createdBy()).contains("some.user")
        assertThat(scientificListResponse.frequencyBand()).contains("Gamma")
        assertThat(scientificListResponse.hostedForCompanyOrgId())
            .contains("REF-HOSTEDFORCOMPANYORG-ID")
        assertThat(scientificListResponse.idEntity())
            .contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(scientificListResponse.manufacturerOrgId()).contains("REF-MANUFACTURERORG-ID")
        assertThat(scientificListResponse.notes()).contains("NOTES")
        assertThat(scientificListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(scientificListResponse.origNetwork()).contains("ORIG")
        assertThat(scientificListResponse.payloadCategory()).contains("Sensor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scientificListResponse =
            ScientificListResponse.builder()
                .classificationMarking("U")
                .dataMode(ScientificListResponse.DataMode.TEST)
                .name("SEM/MAG")
                .source("Bluestaq")
                .spacecraftId("REF-SPACECRAFT-ID")
                .id("SCIENTIFIC-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .frequencyBand("Gamma")
                .hostedForCompanyOrgId("REF-HOSTEDFORCOMPANYORG-ID")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .manufacturerOrgId("REF-MANUFACTURERORG-ID")
                .notes("NOTES")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .payloadCategory("Sensor")
                .build()

        val roundtrippedScientificListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scientificListResponse),
                jacksonTypeRef<ScientificListResponse>(),
            )

        assertThat(roundtrippedScientificListResponse).isEqualTo(scientificListResponse)
    }
}
