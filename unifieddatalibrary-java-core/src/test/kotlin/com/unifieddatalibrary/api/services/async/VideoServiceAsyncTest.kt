// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
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
internal class VideoServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoServiceAsync = client.video()

        val future =
            videoServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoServiceAsync = client.video()

        val pageFuture = videoServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoServiceAsync = client.video()

        val responseFuture =
            videoServiceAsync.count(
                VideoCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoServiceAsync = client.video()

        val videoStreamsFullFuture =
            videoServiceAsync.get(
                VideoGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val videoStreamsFull = videoStreamsFullFuture.get()
        videoStreamsFull.validate()
    }

    @Test
    fun getPlayerStreamingInfo() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoServiceAsync = client.video()

        val responseFuture =
            videoServiceAsync.getPlayerStreamingInfo(
                VideoGetPlayerStreamingInfoParams.builder()
                    .sourceName("sourceName")
                    .streamName("streamName")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getPublisherStreamingInfo() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoServiceAsync = client.video()

        val responseFuture =
            videoServiceAsync.getPublisherStreamingInfo(
                VideoGetPublisherStreamingInfoParams.builder()
                    .sourceName("sourceName")
                    .streamName("streamName")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getStreamFile() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoServiceAsync = client.video()

        val responseFuture =
            videoServiceAsync.getStreamFile(
                VideoGetStreamFileParams.builder()
                    .sourceName("sourceName")
                    .streamName("streamName")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoServiceAsync = client.video()

        val responseFuture = videoServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val videoServiceAsync = client.video()

        val videoStreamsFullsFuture =
            videoServiceAsync.tuple(
                VideoTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        val videoStreamsFulls = videoStreamsFullsFuture.get()
        videoStreamsFulls.forEach { it.validate() }
    }
}
