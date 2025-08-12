// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.video.VideoListResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoListResponseTest {

    @Test
    fun create() {
      val videoListResponse = VideoListResponse.builder()
          .classificationMarking("U")
          .dataMode(VideoListResponse.DataMode.TEST)
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

      assertThat(videoListResponse.classificationMarking()).isEqualTo("U")
      assertThat(videoListResponse.dataMode()).isEqualTo(VideoListResponse.DataMode.TEST)
      assertThat(videoListResponse.description()).isEqualTo("description")
      assertThat(videoListResponse.name()).isEqualTo("name")
      assertThat(videoListResponse.source()).isEqualTo("Bluestaq")
      assertThat(videoListResponse.tokenValue()).isEqualTo("tokenValue")
      assertThat(videoListResponse.id()).contains("VIDEOSTREAMS-ID")
      assertThat(videoListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(videoListResponse.createdBy()).contains("some.user")
      assertThat(videoListResponse.origin()).contains("origin")
      assertThat(videoListResponse.origNetwork()).contains("OPS1")
      assertThat(videoListResponse.startTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoListResponse.stopTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoListResponse.videoUrls().getOrNull()).containsExactly("videoUrls", "videoUrls2")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val videoListResponse = VideoListResponse.builder()
          .classificationMarking("U")
          .dataMode(VideoListResponse.DataMode.TEST)
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

      val roundtrippedVideoListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(videoListResponse), jacksonTypeRef<VideoListResponse>())

      assertThat(roundtrippedVideoListResponse).isEqualTo(videoListResponse)
    }
}
