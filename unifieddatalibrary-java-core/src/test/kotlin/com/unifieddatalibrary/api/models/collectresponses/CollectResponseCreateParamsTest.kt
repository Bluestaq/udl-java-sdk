// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectresponses

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectResponseCreateParamsTest {

    @Test
    fun create() {
        CollectResponseCreateParams.builder()
            .classificationMarking("U")
            .dataMode(CollectResponseCreateParams.DataMode.TEST)
            .idRequest("REF-REQUEST-ID")
            .source("Bluestaq")
            .id("COLLECTRESPONSE-ID")
            .actualEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
            .actualStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
            .altEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
            .altStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .errCode("ERROR CODE")
            .externalId("EXTERNAL-ID")
            .idOnOrbit("REF-ONORBIT-ID")
            .idPlan("REF-PLAN-ID")
            .idSensor("REF-SENSOR-ID")
            .notes("Example notes")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .origObjectId("ORIGOBJECT-ID")
            .origSensorId("ORIGSENSOR-ID")
            .satNo(101)
            .addSrcId("DOA_ID")
            .addSrcId("DWELL_ID")
            .addSrcTyp("DOA")
            .addSrcTyp("DWELL")
            .status("ACCEPTED")
            .addTag("PROVIDER_TAG1")
            .addTag("PROVIDER_TAG2")
            .taskId("TASK-ID")
            .build()
    }

    @Test
    fun body() {
        val params =
            CollectResponseCreateParams.builder()
                .classificationMarking("U")
                .dataMode(CollectResponseCreateParams.DataMode.TEST)
                .idRequest("REF-REQUEST-ID")
                .source("Bluestaq")
                .id("COLLECTRESPONSE-ID")
                .actualEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                .actualStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .altEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                .altStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .errCode("ERROR CODE")
                .externalId("EXTERNAL-ID")
                .idOnOrbit("REF-ONORBIT-ID")
                .idPlan("REF-PLAN-ID")
                .idSensor("REF-SENSOR-ID")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origObjectId("ORIGOBJECT-ID")
                .origSensorId("ORIGSENSOR-ID")
                .satNo(101)
                .addSrcId("DOA_ID")
                .addSrcId("DWELL_ID")
                .addSrcTyp("DOA")
                .addSrcTyp("DWELL")
                .status("ACCEPTED")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .taskId("TASK-ID")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(CollectResponseCreateParams.DataMode.TEST)
        assertThat(body.idRequest()).isEqualTo("REF-REQUEST-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("COLLECTRESPONSE-ID")
        assertThat(body.actualEndTime())
            .contains(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
        assertThat(body.actualStartTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(body.altEndTime()).contains(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
        assertThat(body.altStartTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.errCode()).contains("ERROR CODE")
        assertThat(body.externalId()).contains("EXTERNAL-ID")
        assertThat(body.idOnOrbit()).contains("REF-ONORBIT-ID")
        assertThat(body.idPlan()).contains("REF-PLAN-ID")
        assertThat(body.idSensor()).contains("REF-SENSOR-ID")
        assertThat(body.notes()).contains("Example notes")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(body.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(body.satNo()).contains(101)
        assertThat(body.srcIds().getOrNull()).containsExactly("DOA_ID", "DWELL_ID")
        assertThat(body.srcTyps().getOrNull()).containsExactly("DOA", "DWELL")
        assertThat(body.status()).contains("ACCEPTED")
        assertThat(body.tags().getOrNull()).containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(body.taskId()).contains("TASK-ID")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CollectResponseCreateParams.builder()
                .classificationMarking("U")
                .dataMode(CollectResponseCreateParams.DataMode.TEST)
                .idRequest("REF-REQUEST-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(CollectResponseCreateParams.DataMode.TEST)
        assertThat(body.idRequest()).isEqualTo("REF-REQUEST-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
