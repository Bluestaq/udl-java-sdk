// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sortieppr

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SortiePprCreateParamsTest {

    @Test
    fun create() {
        SortiePprCreateParams.builder()
            .classificationMarking("U")
            .dataMode(SortiePprCreateParams.DataMode.TEST)
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
            .type(SortiePprCreateParams.Type.M)
            .build()
    }

    @Test
    fun body() {
        val params =
            SortiePprCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SortiePprCreateParams.DataMode.TEST)
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
                .type(SortiePprCreateParams.Type.M)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SortiePprCreateParams.DataMode.TEST)
        assertThat(body.idSortie()).isEqualTo("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("SORTIEPPR-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
        assertThat(body.externalId()).contains("aa714f4d52a37ab1a00b21af9566e379")
        assertThat(body.grantor()).contains("SMITH")
        assertThat(body.number()).contains("07-21-07W")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.remarks()).contains("PPR remark")
        assertThat(body.requestor()).contains("jsmith1")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
        assertThat(body.type()).contains(SortiePprCreateParams.Type.M)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SortiePprCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SortiePprCreateParams.DataMode.TEST)
                .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SortiePprCreateParams.DataMode.TEST)
        assertThat(body.idSortie()).isEqualTo("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
