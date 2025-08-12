// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.video.VideoGetPlayerStreamingInfoResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoGetPlayerStreamingInfoResponseTest {

    @Test
    fun create() {
      val videoGetPlayerStreamingInfoResponse = VideoGetPlayerStreamingInfoResponse.builder()
          .classificationMarking("U")
          .dataMode(VideoGetPlayerStreamingInfoResponse.DataMode.TEST)
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

      assertThat(videoGetPlayerStreamingInfoResponse.classificationMarking()).isEqualTo("U")
      assertThat(videoGetPlayerStreamingInfoResponse.dataMode()).isEqualTo(VideoGetPlayerStreamingInfoResponse.DataMode.TEST)
      assertThat(videoGetPlayerStreamingInfoResponse.description()).isEqualTo("description")
      assertThat(videoGetPlayerStreamingInfoResponse.name()).isEqualTo("name")
      assertThat(videoGetPlayerStreamingInfoResponse.source()).isEqualTo("Bluestaq")
      assertThat(videoGetPlayerStreamingInfoResponse.tokenValue()).isEqualTo("tokenValue")
      assertThat(videoGetPlayerStreamingInfoResponse.id()).contains("VIDEOSTREAMS-ID")
      assertThat(videoGetPlayerStreamingInfoResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(videoGetPlayerStreamingInfoResponse.createdBy()).contains("some.user")
      assertThat(videoGetPlayerStreamingInfoResponse.origin()).contains("origin")
      assertThat(videoGetPlayerStreamingInfoResponse.origNetwork()).contains("OPS1")
      assertThat(videoGetPlayerStreamingInfoResponse.startTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoGetPlayerStreamingInfoResponse.stopTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoGetPlayerStreamingInfoResponse.videoUrls().getOrNull()).containsExactly("videoUrls", "videoUrls2")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val videoGetPlayerStreamingInfoResponse = VideoGetPlayerStreamingInfoResponse.builder()
          .classificationMarking("U")
          .dataMode(VideoGetPlayerStreamingInfoResponse.DataMode.TEST)
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

      val roundtrippedVideoGetPlayerStreamingInfoResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(videoGetPlayerStreamingInfoResponse), jacksonTypeRef<VideoGetPlayerStreamingInfoResponse>())

      assertThat(roundtrippedVideoGetPlayerStreamingInfoResponse).isEqualTo(videoGetPlayerStreamingInfoResponse)
    }
}
