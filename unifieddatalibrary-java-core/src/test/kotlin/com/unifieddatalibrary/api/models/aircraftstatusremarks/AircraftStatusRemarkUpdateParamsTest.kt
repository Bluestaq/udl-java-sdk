// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.aircraftstatusremarks

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AircraftStatusRemarkUpdateParamsTest {

    @Test
    fun create() {
        AircraftStatusRemarkUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(AircraftStatusRemarkUpdateParams.DataMode.TEST)
            .idAircraftStatus("388b1f64-ccff-4113-b049-3cf5542c2a42")
            .source("Bluestaq")
            .text("Remark text")
            .bodyId("0167f577-e06c-358e-85aa-0a07a730bdd0")
            .altRmkId("GDSSBL022307131714250077")
            .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .lastUpdatedAt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
            .lastUpdatedBy("JOHN SMITH")
            .name("DISCREPANCY - 202297501")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .sourceDl("AXE")
            .timestamp(OffsetDateTime.parse("2024-01-01T15:00:00.123Z"))
            .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .updatedBy("some.user")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AircraftStatusRemarkUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AircraftStatusRemarkUpdateParams.DataMode.TEST)
                .idAircraftStatus("388b1f64-ccff-4113-b049-3cf5542c2a42")
                .source("Bluestaq")
                .text("Remark text")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AircraftStatusRemarkUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AircraftStatusRemarkUpdateParams.DataMode.TEST)
                .idAircraftStatus("388b1f64-ccff-4113-b049-3cf5542c2a42")
                .source("Bluestaq")
                .text("Remark text")
                .bodyId("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .altRmkId("GDSSBL022307131714250077")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .lastUpdatedAt(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                .lastUpdatedBy("JOHN SMITH")
                .name("DISCREPANCY - 202297501")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .sourceDl("AXE")
                .timestamp(OffsetDateTime.parse("2024-01-01T15:00:00.123Z"))
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AircraftStatusRemarkUpdateParams.DataMode.TEST)
        assertThat(body.idAircraftStatus()).isEqualTo("388b1f64-ccff-4113-b049-3cf5542c2a42")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.text()).isEqualTo("Remark text")
        assertThat(body.bodyId()).contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(body.altRmkId()).contains("GDSSBL022307131714250077")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.lastUpdatedAt()).contains(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
        assertThat(body.lastUpdatedBy()).contains("JOHN SMITH")
        assertThat(body.name()).contains("DISCREPANCY - 202297501")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.timestamp()).contains(OffsetDateTime.parse("2024-01-01T15:00:00.123Z"))
        assertThat(body.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.updatedBy()).contains("some.user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AircraftStatusRemarkUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(AircraftStatusRemarkUpdateParams.DataMode.TEST)
                .idAircraftStatus("388b1f64-ccff-4113-b049-3cf5542c2a42")
                .source("Bluestaq")
                .text("Remark text")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AircraftStatusRemarkUpdateParams.DataMode.TEST)
        assertThat(body.idAircraftStatus()).isEqualTo("388b1f64-ccff-4113-b049-3cf5542c2a42")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.text()).isEqualTo("Remark text")
    }
}
