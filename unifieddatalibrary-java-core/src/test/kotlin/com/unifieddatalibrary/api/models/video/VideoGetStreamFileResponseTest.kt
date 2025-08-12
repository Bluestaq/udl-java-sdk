// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.video.VideoGetStreamFileResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoGetStreamFileResponseTest {

    @Test
    fun create() {
      val videoGetStreamFileResponse = VideoGetStreamFileResponse.builder()
          .classificationMarking("U")
          .dataMode(VideoGetStreamFileResponse.DataMode.TEST)
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
          .addVideoUrl("videoUrls")
          .addVideoUrl("videoUrls2")
          .build()

      assertThat(videoGetStreamFileResponse.classificationMarking()).isEqualTo("U")
      assertThat(videoGetStreamFileResponse.dataMode()).isEqualTo(VideoGetStreamFileResponse.DataMode.TEST)
      assertThat(videoGetStreamFileResponse.description()).isEqualTo("description")
      assertThat(videoGetStreamFileResponse.name()).isEqualTo("name")
      assertThat(videoGetStreamFileResponse.source()).isEqualTo("Bluestaq")
      assertThat(videoGetStreamFileResponse.tokenValue()).isEqualTo("tokenValue")
      assertThat(videoGetStreamFileResponse.id()).contains("VIDEOSTREAMS-ID")
      assertThat(videoGetStreamFileResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(videoGetStreamFileResponse.createdBy()).contains("some.user")
      assertThat(videoGetStreamFileResponse.origin()).contains("origin")
      assertThat(videoGetStreamFileResponse.origNetwork()).contains("OPS1")
      assertThat(videoGetStreamFileResponse.startTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoGetStreamFileResponse.stopTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoGetStreamFileResponse.videoUrls().getOrNull()).containsExactly("videoUrls", "videoUrls2")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val videoGetStreamFileResponse = VideoGetStreamFileResponse.builder()
          .classificationMarking("U")
          .dataMode(VideoGetStreamFileResponse.DataMode.TEST)
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
          .addVideoUrl("videoUrls")
          .addVideoUrl("videoUrls2")
          .build()

      val roundtrippedVideoGetStreamFileResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(videoGetStreamFileResponse), jacksonTypeRef<VideoGetStreamFileResponse>())

      assertThat(roundtrippedVideoGetStreamFileResponse).isEqualTo(videoGetStreamFileResponse)
    }
}
