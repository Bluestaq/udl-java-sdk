// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.substatus

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubstatusCreateParamsTest {

    @Test
    fun create() {
        SubstatusCreateParams.builder()
            .classificationMarking("U")
            .dataMode(SubstatusCreateParams.DataMode.TEST)
            .notes("Sample Notes")
            .source("Bluestaq")
            .status(SubstatusCreateParams.Status.FMC)
            .statusId("REF-STATUS-ID")
            .type(SubstatusCreateParams.Type.MD_CAP)
            .id("SUBSTATUS-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("TST1")
            .build()
    }

    @Test
    fun body() {
        val params =
            SubstatusCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SubstatusCreateParams.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubstatusCreateParams.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubstatusCreateParams.Type.MD_CAP)
                .id("SUBSTATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("TST1")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SubstatusCreateParams.DataMode.TEST)
        assertThat(body.notes()).isEqualTo("Sample Notes")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.status()).isEqualTo(SubstatusCreateParams.Status.FMC)
        assertThat(body.statusId()).isEqualTo("REF-STATUS-ID")
        assertThat(body.type()).isEqualTo(SubstatusCreateParams.Type.MD_CAP)
        assertThat(body.id()).contains("SUBSTATUS-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("TST1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubstatusCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SubstatusCreateParams.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubstatusCreateParams.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubstatusCreateParams.Type.MD_CAP)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SubstatusCreateParams.DataMode.TEST)
        assertThat(body.notes()).isEqualTo("Sample Notes")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.status()).isEqualTo(SubstatusCreateParams.Status.FMC)
        assertThat(body.statusId()).isEqualTo("REF-STATUS-ID")
        assertThat(body.type()).isEqualTo(SubstatusCreateParams.Type.MD_CAP)
    }
}
