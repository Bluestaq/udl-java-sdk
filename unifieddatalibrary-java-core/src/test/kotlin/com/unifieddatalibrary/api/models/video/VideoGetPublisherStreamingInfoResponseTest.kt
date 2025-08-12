// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.video.VideoGetPublisherStreamingInfoResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoGetPublisherStreamingInfoResponseTest {

    @Test
    fun create() {
      val videoGetPublisherStreamingInfoResponse = VideoGetPublisherStreamingInfoResponse.builder()
          .classificationMarking("U")
          .dataMode(VideoGetPublisherStreamingInfoResponse.DataMode.TEST)
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

      assertThat(videoGetPublisherStreamingInfoResponse.classificationMarking()).isEqualTo("U")
      assertThat(videoGetPublisherStreamingInfoResponse.dataMode()).isEqualTo(VideoGetPublisherStreamingInfoResponse.DataMode.TEST)
      assertThat(videoGetPublisherStreamingInfoResponse.description()).isEqualTo("description")
      assertThat(videoGetPublisherStreamingInfoResponse.name()).isEqualTo("name")
      assertThat(videoGetPublisherStreamingInfoResponse.source()).isEqualTo("Bluestaq")
      assertThat(videoGetPublisherStreamingInfoResponse.tokenValue()).isEqualTo("tokenValue")
      assertThat(videoGetPublisherStreamingInfoResponse.id()).contains("VIDEOSTREAMS-ID")
      assertThat(videoGetPublisherStreamingInfoResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(videoGetPublisherStreamingInfoResponse.createdBy()).contains("some.user")
      assertThat(videoGetPublisherStreamingInfoResponse.origin()).contains("origin")
      assertThat(videoGetPublisherStreamingInfoResponse.origNetwork()).contains("OPS1")
      assertThat(videoGetPublisherStreamingInfoResponse.startTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoGetPublisherStreamingInfoResponse.stopTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(videoGetPublisherStreamingInfoResponse.videoUrls().getOrNull()).containsExactly("videoUrls", "videoUrls2")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val videoGetPublisherStreamingInfoResponse = VideoGetPublisherStreamingInfoResponse.builder()
          .classificationMarking("U")
          .dataMode(VideoGetPublisherStreamingInfoResponse.DataMode.TEST)
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

      val roundtrippedVideoGetPublisherStreamingInfoResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(videoGetPublisherStreamingInfoResponse), jacksonTypeRef<VideoGetPublisherStreamingInfoResponse>())

      assertThat(roundtrippedVideoGetPublisherStreamingInfoResponse).isEqualTo(videoGetPublisherStreamingInfoResponse)
    }
}
