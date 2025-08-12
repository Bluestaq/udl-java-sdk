// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.video.history.VideoStreamsFull
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoStreamsFullTest {

    @Test
    fun create() {
      val videoStreamsFull = VideoStreamsFull.builder()
          .classificationMarking("U")
          .dataMode(VideoStreamsFull.DataMode.TEST)
          .description("description")
          .name("name")
          .source("Bluestaq")
          .tokenValue("tokenValue")
          .id("VIDEOSTREAMS-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("origin")
          .origNetwork("OPS1")
          .startTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .stopTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .addVideoUrl("videoUrls")
          .addVideoUrl("videoUrls2")
          .build()

      assertThat(videoStreamsFull.classificationMarking()).isEqualTo("U")
      assertThat(videoStreamsFull.dataMode()).isEqualTo(VideoStreamsFull.DataMode.TEST)
      assertThat(videoStreamsFull.description()).isEqualTo("description")
      assertThat(videoStreamsFull.name()).isEqualTo("name")
      assertThat(videoStreamsFull.source()).isEqualTo("Bluestaq")
      assertThat(videoStreamsFull.tokenValue()).isEqualTo("tokenValue")
      assertThat(videoStreamsFull.id()).contains("VIDEOSTREAMS-ID")
      assertThat(videoStreamsFull.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(videoStreamsFull.createdBy()).contains("some.user")
      assertThat(videoStreamsFull.origin()).contains("origin")
      assertThat(videoStreamsFull.origNetwork()).contains("OPS1")
      assertThat(videoStreamsFull.startTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoStreamsFull.stopTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoStreamsFull.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(videoStreamsFull.updatedBy()).contains("some.user")
      assertThat(videoStreamsFull.videoUrls().getOrNull()).containsExactly("videoUrls", "videoUrls2")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val videoStreamsFull = VideoStreamsFull.builder()
          .classificationMarking("U")
          .dataMode(VideoStreamsFull.DataMode.TEST)
          .description("description")
          .name("name")
          .source("Bluestaq")
          .tokenValue("tokenValue")
          .id("VIDEOSTREAMS-ID")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .origin("origin")
          .origNetwork("OPS1")
          .startTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .stopTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .addVideoUrl("videoUrls")
          .addVideoUrl("videoUrls2")
          .build()

      val roundtrippedVideoStreamsFull = jsonMapper.readValue(jsonMapper.writeValueAsString(videoStreamsFull), jacksonTypeRef<VideoStreamsFull>())

      assertThat(roundtrippedVideoStreamsFull).isEqualTo(videoStreamsFull)
    }
}
