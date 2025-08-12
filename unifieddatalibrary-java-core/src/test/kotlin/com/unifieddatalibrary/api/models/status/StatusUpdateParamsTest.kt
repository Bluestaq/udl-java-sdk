// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.status

import com.unifieddatalibrary.api.models.status.StatusUpdateParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusUpdateParamsTest {

    @Test
    fun create() {
      StatusUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(StatusUpdateParams.DataMode.TEST)
          .idEntity("ENTITY-ID")
          .source("Bluestaq")
          .bodyId("STATUS-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
          .declassificationString("U")
          .derivedFrom("SOME_SOURCE")
          .notes("Example Notes")
          .opsCap(StatusUpdateParams.OpsCap.FMC)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("TST1")
          .state(StatusUpdateParams.State.ACTIVE)
          .addSubStatusCollection(StatusUpdateParams.SubStatusCollection.builder()
              .classificationMarking("U")
              .dataMode(StatusUpdateParams.SubStatusCollection.DataMode.TEST)
              .notes("Sample Notes")
              .source("Bluestaq")
              .status(StatusUpdateParams.SubStatusCollection.Status.FMC)
              .statusId("REF-STATUS-ID")
              .type(StatusUpdateParams.SubStatusCollection.Type.MD_CAP)
              .id("SUBSTATUS-ID")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("TST1")
              .build())
          .sysCap(StatusUpdateParams.SysCap.FMC)
          .build()
    }

    @Test
    fun pathParams() {
      val params = StatusUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(StatusUpdateParams.DataMode.TEST)
          .idEntity("ENTITY-ID")
          .source("Bluestaq")
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
      val params = StatusUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(StatusUpdateParams.DataMode.TEST)
          .idEntity("ENTITY-ID")
          .source("Bluestaq")
          .bodyId("STATUS-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
          .declassificationString("U")
          .derivedFrom("SOME_SOURCE")
          .notes("Example Notes")
          .opsCap(StatusUpdateParams.OpsCap.FMC)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("TST1")
          .state(StatusUpdateParams.State.ACTIVE)
          .addSubStatusCollection(StatusUpdateParams.SubStatusCollection.builder()
              .classificationMarking("U")
              .dataMode(StatusUpdateParams.SubStatusCollection.DataMode.TEST)
              .notes("Sample Notes")
              .source("Bluestaq")
              .status(StatusUpdateParams.SubStatusCollection.Status.FMC)
              .statusId("REF-STATUS-ID")
              .type(StatusUpdateParams.SubStatusCollection.Type.MD_CAP)
              .id("SUBSTATUS-ID")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("TST1")
              .build())
          .sysCap(StatusUpdateParams.SysCap.FMC)
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(StatusUpdateParams.DataMode.TEST)
      assertThat(body.idEntity()).isEqualTo("ENTITY-ID")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.bodyId()).contains("STATUS-ID")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.declassificationDate()).contains(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
      assertThat(body.declassificationString()).contains("U")
      assertThat(body.derivedFrom()).contains("SOME_SOURCE")
      assertThat(body.notes()).contains("Example Notes")
      assertThat(body.opsCap()).contains(StatusUpdateParams.OpsCap.FMC)
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("TST1")
      assertThat(body.state()).contains(StatusUpdateParams.State.ACTIVE)
      assertThat(body.subStatusCollection().getOrNull()).containsExactly(StatusUpdateParams.SubStatusCollection.builder()
          .classificationMarking("U")
          .dataMode(StatusUpdateParams.SubStatusCollection.DataMode.TEST)
          .notes("Sample Notes")
          .source("Bluestaq")
          .status(StatusUpdateParams.SubStatusCollection.Status.FMC)
          .statusId("REF-STATUS-ID")
          .type(StatusUpdateParams.SubStatusCollection.Type.MD_CAP)
          .id("SUBSTATUS-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("TST1")
          .build())
      assertThat(body.sysCap()).contains(StatusUpdateParams.SysCap.FMC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = StatusUpdateParams.builder()
          .pathId("id")
          .classificationMarking("U")
          .dataMode(StatusUpdateParams.DataMode.TEST)
          .idEntity("ENTITY-ID")
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(StatusUpdateParams.DataMode.TEST)
      assertThat(body.idEntity()).isEqualTo("ENTITY-ID")
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
