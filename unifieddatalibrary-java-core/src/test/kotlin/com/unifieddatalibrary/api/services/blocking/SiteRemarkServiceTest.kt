// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCountParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkCreateParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkGetParams
import com.unifieddatalibrary.api.models.siteremark.SiteRemarkTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SiteRemarkServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteRemarkService = client.siteRemark()

        siteRemarkService.create(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteRemarkService = client.siteRemark()

        val page = siteRemarkService.list()

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
        val siteRemarkService = client.siteRemark()

        siteRemarkService.count(
            SiteRemarkCountParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteRemarkService = client.siteRemark()

        val siteRemark =
            siteRemarkService.get(
                SiteRemarkGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        siteRemark.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteRemarkService = client.siteRemark()

        val response = siteRemarkService.queryhelp()

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
        val siteRemarkService = client.siteRemark()

        val response =
            siteRemarkService.tuple(
                SiteRemarkTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
