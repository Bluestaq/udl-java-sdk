// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sortieppr

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SortiePprListResponseTest {

    @Test
    fun create() {
        val sortiePprListResponse =
            SortiePprListResponse.builder()
                .classificationMarking("U")
                .dataMode(SortiePprListResponse.DataMode.TEST)
                .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                .source("Bluestaq")
                .id("SORTIEPPR-ID")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                .externalId("aa714f4d52a37ab1a00b21af9566e379")
                .grantor("SMITH")
                .number("07-21-07W")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .remarks("PPR remark")
                .requestor("jsmith1")
                .sourceDl("AXE")
                .startTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                .type(SortiePprListResponse.Type.M)
                .build()

        assertThat(sortiePprListResponse.classificationMarking()).isEqualTo("U")
        assertThat(sortiePprListResponse.dataMode()).isEqualTo(SortiePprListResponse.DataMode.TEST)
        assertThat(sortiePprListResponse.idSortie())
            .isEqualTo("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
        assertThat(sortiePprListResponse.source()).isEqualTo("Bluestaq")
        assertThat(sortiePprListResponse.id()).contains("SORTIEPPR-ID")
        assertThat(sortiePprListResponse.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(sortiePprListResponse.createdBy()).contains("some.user")
        assertThat(sortiePprListResponse.endTime())
            .contains(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
        assertThat(sortiePprListResponse.externalId()).contains("aa714f4d52a37ab1a00b21af9566e379")
        assertThat(sortiePprListResponse.grantor()).contains("SMITH")
        assertThat(sortiePprListResponse.number()).contains("07-21-07W")
        assertThat(sortiePprListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(sortiePprListResponse.origNetwork()).contains("OPS1")
        assertThat(sortiePprListResponse.remarks()).contains("PPR remark")
        assertThat(sortiePprListResponse.requestor()).contains("jsmith1")
        assertThat(sortiePprListResponse.sourceDl()).contains("AXE")
        assertThat(sortiePprListResponse.startTime())
            .contains(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
        assertThat(sortiePprListResponse.type()).contains(SortiePprListResponse.Type.M)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sortiePprListResponse =
            SortiePprListResponse.builder()
                .classificationMarking("U")
                .dataMode(SortiePprListResponse.DataMode.TEST)
                .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                .source("Bluestaq")
                .id("SORTIEPPR-ID")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                .externalId("aa714f4d52a37ab1a00b21af9566e379")
                .grantor("SMITH")
                .number("07-21-07W")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .remarks("PPR remark")
                .requestor("jsmith1")
                .sourceDl("AXE")
                .startTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                .type(SortiePprListResponse.Type.M)
                .build()

        val roundtrippedSortiePprListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sortiePprListResponse),
                jacksonTypeRef<SortiePprListResponse>(),
            )

        assertThat(roundtrippedSortiePprListResponse).isEqualTo(sortiePprListResponse)
    }
}
