// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.cots

import com.unifieddatalibrary.api.models.cots.CotCreateParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CotCreateParamsTest {

    @Test
    fun create() {
      CotCreateParams.builder()
          .lat(45.23)
          .lon(45.23)
          .alt(5.23)
          .addCallSign("string")
          .ce(10.23)
          .cotChatData(CotCreateParams.CotChatData.builder()
              .chatMsg("Mission is go")
              .chatRoom("All Chat Rooms")
              .chatSenderCallSign("Pebble")
              .build())
          .cotPositionData(CotCreateParams.CotPositionData.builder()
              .callSign("POI_NAME")
              .team("Description of the object")
              .teamRole("Team Member")
              .build())
          .addGroup("string")
          .how("h-e")
          .le(10.23)
          .senderUid("POI-ID")
          .stale(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
          .start(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
          .type("a-h-G")
          .addUid("string")
          .build()
    }

    @Test
    fun body() {
      val params = CotCreateParams.builder()
          .lat(45.23)
          .lon(45.23)
          .alt(5.23)
          .addCallSign("string")
          .ce(10.23)
          .cotChatData(CotCreateParams.CotChatData.builder()
              .chatMsg("Mission is go")
              .chatRoom("All Chat Rooms")
              .chatSenderCallSign("Pebble")
              .build())
          .cotPositionData(CotCreateParams.CotPositionData.builder()
              .callSign("POI_NAME")
              .team("Description of the object")
              .teamRole("Team Member")
              .build())
          .addGroup("string")
          .how("h-e")
          .le(10.23)
          .senderUid("POI-ID")
          .stale(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
          .start(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
          .type("a-h-G")
          .addUid("string")
          .build()

      val body = params._body()

      assertThat(body.lat()).isEqualTo(45.23)
      assertThat(body.lon()).isEqualTo(45.23)
      assertThat(body.alt()).contains(5.23)
      assertThat(body.callSigns().getOrNull()).containsExactly("string")
      assertThat(body.ce()).contains(10.23)
      assertThat(body.cotChatData()).contains(CotCreateParams.CotChatData.builder()
          .chatMsg("Mission is go")
          .chatRoom("All Chat Rooms")
          .chatSenderCallSign("Pebble")
          .build())
      assertThat(body.cotPositionData()).contains(CotCreateParams.CotPositionData.builder()
          .callSign("POI_NAME")
          .team("Description of the object")
          .teamRole("Team Member")
          .build())
      assertThat(body.groups().getOrNull()).containsExactly("string")
      assertThat(body.how()).contains("h-e")
      assertThat(body.le()).contains(10.23)
      assertThat(body.senderUid()).contains("POI-ID")
      assertThat(body.stale()).contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
      assertThat(body.start()).contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
      assertThat(body.type()).contains("a-h-G")
      assertThat(body.uids().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = CotCreateParams.builder()
          .lat(45.23)
          .lon(45.23)
          .build()

      val body = params._body()

      assertThat(body.lat()).isEqualTo(45.23)
      assertThat(body.lon()).isEqualTo(45.23)
    }
}
