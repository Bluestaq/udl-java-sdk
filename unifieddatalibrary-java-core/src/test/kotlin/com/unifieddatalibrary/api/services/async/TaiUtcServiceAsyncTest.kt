// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCountParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcCreateParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcGetParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcListParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcTupleParams
import com.unifieddatalibrary.api.models.taiutc.TaiUtcUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TaiUtcServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val taiUtcServiceAsync = client.taiUtc()

        val future =
            taiUtcServiceAsync.create(
                TaiUtcCreateParams.builder()
                    .adjustmentDate(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
                    .classificationMarking("U")
                    .dataMode(TaiUtcCreateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .id("TAIUTC-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .multiplicationFactor(0.001296)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .rawFileUri("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
                    .taiUtc(1.422818)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val taiUtcServiceAsync = client.taiUtc()

        val future =
            taiUtcServiceAsync.update(
                TaiUtcUpdateParams.builder()
                    .pathId("id")
                    .adjustmentDate(OffsetDateTime.parse("2017-01-01T00:00:00.123Z"))
                    .classificationMarking("U")
                    .dataMode(TaiUtcUpdateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .bodyId("TAIUTC-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .multiplicationFactor(0.001296)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .rawFileUri("/TAI/2019/01/22/4318471007562436-tai-utc.dat")
                    .taiUtc(1.422818)
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
        val taiUtcServiceAsync = client.taiUtc()

        val pageFuture =
            taiUtcServiceAsync.list(
                TaiUtcListParams.builder()
                    .adjustmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val taiUtcServiceAsync = client.taiUtc()

        val future = taiUtcServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val taiUtcServiceAsync = client.taiUtc()

        val responseFuture =
            taiUtcServiceAsync.count(
                TaiUtcCountParams.builder()
                    .adjustmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
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
        val taiUtcServiceAsync = client.taiUtc()

        val taiutcFullFuture =
            taiUtcServiceAsync.get(
                TaiUtcGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val taiutcFull = taiutcFullFuture.get()
        taiutcFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val taiUtcServiceAsync = client.taiUtc()

        val responseFuture = taiUtcServiceAsync.queryhelp()

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
        val taiUtcServiceAsync = client.taiUtc()

        val taiutcFullsFuture =
            taiUtcServiceAsync.tuple(
                TaiUtcTupleParams.builder()
                    .adjustmentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val taiutcFulls = taiutcFullsFuture.get()
        taiutcFulls.forEach { it.validate() }
    }
}
