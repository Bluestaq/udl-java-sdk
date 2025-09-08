// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.substatus

import com.unifieddatalibrary.api.models.SubStatusIngest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubstatusCreateParamsTest {

    @Test
    fun create() {
        SubstatusCreateParams.builder()
            .subStatusIngest(
                SubStatusIngest.builder()
                    .classificationMarking("U")
                    .dataMode(SubStatusIngest.DataMode.TEST)
                    .notes("Sample Notes")
                    .source("Bluestaq")
                    .status(SubStatusIngest.Status.FMC)
                    .statusId("REF-STATUS-ID")
                    .type(SubStatusIngest.Type.MD_CAP)
                    .id("SUBSTATUS-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SubstatusCreateParams.builder()
                .subStatusIngest(
                    SubStatusIngest.builder()
                        .classificationMarking("U")
                        .dataMode(SubStatusIngest.DataMode.TEST)
                        .notes("Sample Notes")
                        .source("Bluestaq")
                        .status(SubStatusIngest.Status.FMC)
                        .statusId("REF-STATUS-ID")
                        .type(SubStatusIngest.Type.MD_CAP)
                        .id("SUBSTATUS-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubStatusIngest.builder()
                    .classificationMarking("U")
                    .dataMode(SubStatusIngest.DataMode.TEST)
                    .notes("Sample Notes")
                    .source("Bluestaq")
                    .status(SubStatusIngest.Status.FMC)
                    .statusId("REF-STATUS-ID")
                    .type(SubStatusIngest.Type.MD_CAP)
                    .id("SUBSTATUS-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubstatusCreateParams.builder()
                .subStatusIngest(
                    SubStatusIngest.builder()
                        .classificationMarking("U")
                        .dataMode(SubStatusIngest.DataMode.TEST)
                        .notes("Sample Notes")
                        .source("Bluestaq")
                        .status(SubStatusIngest.Status.FMC)
                        .statusId("REF-STATUS-ID")
                        .type(SubStatusIngest.Type.MD_CAP)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubStatusIngest.builder()
                    .classificationMarking("U")
                    .dataMode(SubStatusIngest.DataMode.TEST)
                    .notes("Sample Notes")
                    .source("Bluestaq")
                    .status(SubStatusIngest.Status.FMC)
                    .statusId("REF-STATUS-ID")
                    .type(SubStatusIngest.Type.MD_CAP)
                    .build()
            )
    }
}
