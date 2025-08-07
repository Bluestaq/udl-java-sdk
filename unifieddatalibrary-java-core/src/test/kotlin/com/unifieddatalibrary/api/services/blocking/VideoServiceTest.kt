// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.video.VideoCountParams
import com.unifieddatalibrary.api.models.video.VideoCreateParams
import com.unifieddatalibrary.api.models.video.VideoGetParams
import com.unifieddatalibrary.api.models.video.VideoGetPlayerStreamingInfoParams
import com.unifieddatalibrary.api.models.video.VideoGetPublisherStreamingInfoParams
import com.unifieddatalibrary.api.models.video.VideoGetStreamFileParams
import com.unifieddatalibrary.api.models.video.VideoTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VideoServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoService = client.video()

        videoService.create(
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
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoService = client.video()

        val page = videoService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoService = client.video()

        videoService.count(VideoCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoService = client.video()

        val videoStreamsFull =
            videoService.get(
                VideoGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        videoStreamsFull.validate()
    }

    @Test
    fun getPlayerStreamingInfo() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoService = client.video()

        val response =
            videoService.getPlayerStreamingInfo(
                VideoGetPlayerStreamingInfoParams.builder()
                    .sourceName("sourceName")
                    .streamName("streamName")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun getPublisherStreamingInfo() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoService = client.video()

        val response =
            videoService.getPublisherStreamingInfo(
                VideoGetPublisherStreamingInfoParams.builder()
                    .sourceName("sourceName")
                    .streamName("streamName")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun getStreamFile() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoService = client.video()

        val response =
            videoService.getStreamFile(
                VideoGetStreamFileParams.builder()
                    .sourceName("sourceName")
                    .streamName("streamName")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoService = client.video()

        val response = videoService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoService = client.video()

        val videoStreamsFulls =
            videoService.tuple(
                VideoTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        videoStreamsFulls.forEach { it.validate() }
    }
}
