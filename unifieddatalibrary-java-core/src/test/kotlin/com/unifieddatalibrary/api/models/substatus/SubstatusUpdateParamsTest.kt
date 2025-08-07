// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.substatus

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubstatusUpdateParamsTest {

    @Test
    fun create() {
        SubstatusUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(SubstatusUpdateParams.DataMode.TEST)
            .notes("Sample Notes")
            .source("Bluestaq")
            .status(SubstatusUpdateParams.Status.FMC)
            .statusId("REF-STATUS-ID")
            .type(SubstatusUpdateParams.Type.MD_CAP)
            .bodyId("SUBSTATUS-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("TST1")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubstatusUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SubstatusUpdateParams.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubstatusUpdateParams.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubstatusUpdateParams.Type.MD_CAP)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubstatusUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SubstatusUpdateParams.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubstatusUpdateParams.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubstatusUpdateParams.Type.MD_CAP)
                .bodyId("SUBSTATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("TST1")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SubstatusUpdateParams.DataMode.TEST)
        assertThat(body.notes()).isEqualTo("Sample Notes")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.status()).isEqualTo(SubstatusUpdateParams.Status.FMC)
        assertThat(body.statusId()).isEqualTo("REF-STATUS-ID")
        assertThat(body.type()).isEqualTo(SubstatusUpdateParams.Type.MD_CAP)
        assertThat(body.bodyId()).contains("SUBSTATUS-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("TST1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubstatusUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SubstatusUpdateParams.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubstatusUpdateParams.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubstatusUpdateParams.Type.MD_CAP)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SubstatusUpdateParams.DataMode.TEST)
        assertThat(body.notes()).isEqualTo("Sample Notes")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.status()).isEqualTo(SubstatusUpdateParams.Status.FMC)
        assertThat(body.statusId()).isEqualTo("REF-STATUS-ID")
        assertThat(body.type()).isEqualTo(SubstatusUpdateParams.Type.MD_CAP)
    }
}
