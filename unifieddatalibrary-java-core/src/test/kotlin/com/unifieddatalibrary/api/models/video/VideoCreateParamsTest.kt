// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.video

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoCreateParamsTest {

    @Test
    fun create() {
        VideoCreateParams.builder()
            .classificationMarking("U")
            .dataMode(VideoCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            VideoCreateParams.builder()
                .classificationMarking("U")
                .dataMode(VideoCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(VideoCreateParams.DataMode.TEST)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.tokenValue()).isEqualTo("tokenValue")
        assertThat(body.id()).contains("VIDEOSTREAMS-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.origin()).contains("origin")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(body.stopTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(body.videoUrls().getOrNull()).containsExactly("videoUrls", "videoUrls2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VideoCreateParams.builder()
                .classificationMarking("U")
                .dataMode(VideoCreateParams.DataMode.TEST)
                .description("description")
                .name("name")
                .source("Bluestaq")
                .tokenValue("tokenValue")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(VideoCreateParams.DataMode.TEST)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.tokenValue()).isEqualTo("tokenValue")
    }
}
