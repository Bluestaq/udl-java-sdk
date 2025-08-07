// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCountParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCreateParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SiteRemarkServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteRemarkServiceAsync = client.siteRemark()

        val future =
            siteRemarkServiceAsync.create(
                SiteRemarkCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SiteRemarkCreateParams.DataMode.TEST)
                    .idSite("SITE-ID")
                    .source("Bluestaq")
                    .text("This is a remark")
                    .id("5000a3ef-8e39-2551-80f1-b3cd1895fe7b")
                    .code("M")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .name("Remark name")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origRmkId("123456ABC")
                    .type("Restriction")
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
        val siteRemarkServiceAsync = client.siteRemark()

        val pageFuture = siteRemarkServiceAsync.list()

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
        val siteRemarkServiceAsync = client.siteRemark()

        val responseFuture =
            siteRemarkServiceAsync.count(
                SiteRemarkCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val siteRemarkServiceAsync = client.siteRemark()

        val siteRemarkFuture =
            siteRemarkServiceAsync.get(
                SiteRemarkGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val siteRemark = siteRemarkFuture.get()
        siteRemark.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteRemarkServiceAsync = client.siteRemark()

        val responseFuture = siteRemarkServiceAsync.queryhelp()

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
        val siteRemarkServiceAsync = client.siteRemark()

        val responseFuture =
            siteRemarkServiceAsync.tuple(
                SiteRemarkTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
