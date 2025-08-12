// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.status

import com.unifieddatalibrary.api.models.status.StatusCreateParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusCreateParamsTest {

    @Test
    fun create() {
      StatusCreateParams.builder()
          .classificationMarking("U")
          .dataMode(StatusCreateParams.DataMode.TEST)
          .idEntity("ENTITY-ID")
          .source("Bluestaq")
          .id("STATUS-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
          .declassificationString("U")
          .derivedFrom("SOME_SOURCE")
          .notes("Example Notes")
          .opsCap(StatusCreateParams.OpsCap.FMC)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("TST1")
          .state(StatusCreateParams.State.ACTIVE)
          .addSubStatusCollection(StatusCreateParams.SubStatusCollection.builder()
              .classificationMarking("U")
              .dataMode(StatusCreateParams.SubStatusCollection.DataMode.TEST)
              .notes("Sample Notes")
              .source("Bluestaq")
              .status(StatusCreateParams.SubStatusCollection.Status.FMC)
              .statusId("REF-STATUS-ID")
              .type(StatusCreateParams.SubStatusCollection.Type.MD_CAP)
              .id("SUBSTATUS-ID")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("TST1")
              .build())
          .sysCap(StatusCreateParams.SysCap.FMC)
          .build()
    }

    @Test
    fun body() {
      val params = StatusCreateParams.builder()
          .classificationMarking("U")
          .dataMode(StatusCreateParams.DataMode.TEST)
          .idEntity("ENTITY-ID")
          .source("Bluestaq")
          .id("STATUS-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
          .declassificationString("U")
          .derivedFrom("SOME_SOURCE")
          .notes("Example Notes")
          .opsCap(StatusCreateParams.OpsCap.FMC)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("TST1")
          .state(StatusCreateParams.State.ACTIVE)
          .addSubStatusCollection(StatusCreateParams.SubStatusCollection.builder()
              .classificationMarking("U")
              .dataMode(StatusCreateParams.SubStatusCollection.DataMode.TEST)
              .notes("Sample Notes")
              .source("Bluestaq")
              .status(StatusCreateParams.SubStatusCollection.Status.FMC)
              .statusId("REF-STATUS-ID")
              .type(StatusCreateParams.SubStatusCollection.Type.MD_CAP)
              .id("SUBSTATUS-ID")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("TST1")
              .build())
          .sysCap(StatusCreateParams.SysCap.FMC)
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(StatusCreateParams.DataMode.TEST)
      assertThat(body.idEntity()).isEqualTo("ENTITY-ID")
      assertThat(body.source()).isEqualTo("Bluestaq")
      assertThat(body.id()).contains("STATUS-ID")
      assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(body.createdBy()).contains("some.user")
      assertThat(body.declassificationDate()).contains(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
      assertThat(body.declassificationString()).contains("U")
      assertThat(body.derivedFrom()).contains("SOME_SOURCE")
      assertThat(body.notes()).contains("Example Notes")
      assertThat(body.opsCap()).contains(StatusCreateParams.OpsCap.FMC)
      assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(body.origNetwork()).contains("TST1")
      assertThat(body.state()).contains(StatusCreateParams.State.ACTIVE)
      assertThat(body.subStatusCollection().getOrNull()).containsExactly(StatusCreateParams.SubStatusCollection.builder()
          .classificationMarking("U")
          .dataMode(StatusCreateParams.SubStatusCollection.DataMode.TEST)
          .notes("Sample Notes")
          .source("Bluestaq")
          .status(StatusCreateParams.SubStatusCollection.Status.FMC)
          .statusId("REF-STATUS-ID")
          .type(StatusCreateParams.SubStatusCollection.Type.MD_CAP)
          .id("SUBSTATUS-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("TST1")
          .build())
      assertThat(body.sysCap()).contains(StatusCreateParams.SysCap.FMC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = StatusCreateParams.builder()
          .classificationMarking("U")
          .dataMode(StatusCreateParams.DataMode.TEST)
          .idEntity("ENTITY-ID")
          .source("Bluestaq")
          .build()

      val body = params._body()

      assertThat(body.classificationMarking()).isEqualTo("U")
      assertThat(body.dataMode()).isEqualTo(StatusCreateParams.DataMode.TEST)
      assertThat(body.idEntity()).isEqualTo("ENTITY-ID")
      assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
