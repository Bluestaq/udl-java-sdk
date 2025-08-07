// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sortieppr

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SortiePprUnvalidatedPublishParamsTest {

    @Test
    fun create() {
        SortiePprUnvalidatedPublishParams.builder()
            .addBody(
                SortiePprUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(SortiePprUnvalidatedPublishParams.Body.DataMode.TEST)
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
                    .type(SortiePprUnvalidatedPublishParams.Body.Type.M)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SortiePprUnvalidatedPublishParams.builder()
                .addBody(
                    SortiePprUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(SortiePprUnvalidatedPublishParams.Body.DataMode.TEST)
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
                        .type(SortiePprUnvalidatedPublishParams.Body.Type.M)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                SortiePprUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(SortiePprUnvalidatedPublishParams.Body.DataMode.TEST)
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
                    .type(SortiePprUnvalidatedPublishParams.Body.Type.M)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SortiePprUnvalidatedPublishParams.builder()
                .addBody(
                    SortiePprUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(SortiePprUnvalidatedPublishParams.Body.DataMode.TEST)
                        .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                SortiePprUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(SortiePprUnvalidatedPublishParams.Body.DataMode.TEST)
                    .idSortie("4ef3d1e8-ab08-ab70-498f-edc479734e5c")
                    .source("Bluestaq")
                    .build()
            )
    }
}
