// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectresponses

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectResponseUnvalidatedPublishParamsTest {

    @Test
    fun create() {
        CollectResponseUnvalidatedPublishParams.builder()
            .addBody(
                CollectResponseUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(CollectResponseUnvalidatedPublishParams.Body.DataMode.TEST)
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CollectResponseUnvalidatedPublishParams.builder()
                .addBody(
                    CollectResponseUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(CollectResponseUnvalidatedPublishParams.Body.DataMode.TEST)
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                CollectResponseUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(CollectResponseUnvalidatedPublishParams.Body.DataMode.TEST)
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CollectResponseUnvalidatedPublishParams.builder()
                .addBody(
                    CollectResponseUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(CollectResponseUnvalidatedPublishParams.Body.DataMode.TEST)
                        .idRequest("REF-REQUEST-ID")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                CollectResponseUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(CollectResponseUnvalidatedPublishParams.Body.DataMode.TEST)
                    .idRequest("REF-REQUEST-ID")
                    .source("Bluestaq")
                    .build()
            )
    }
}
