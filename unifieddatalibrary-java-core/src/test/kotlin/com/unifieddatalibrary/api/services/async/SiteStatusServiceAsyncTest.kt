// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCountParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCreateParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusGetParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusTupleParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SiteStatusServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteStatusServiceAsync = client.siteStatus()

        val future =
            siteStatusServiceAsync.create(
                SiteStatusCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SiteStatusCreateParams.DataMode.TEST)
                    .idSite("41e3e554-9790-40b9-bd7b-f30d864dcad8")
                    .source("Bluestaq")
                    .id("SITESTATUS-ID")
                    .cat(SiteStatusCreateParams.Cat.COLD)
                    .coldInventory(1)
                    .commImpairment("commImpairment")
                    .cpcon(SiteStatusCreateParams.Cpcon._4)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .eoc(SiteStatusCreateParams.Eoc.WARM)
                    .fpcon(SiteStatusCreateParams.Fpcon.BRAVO)
                    .hotInventory(1)
                    .hpcon(SiteStatusCreateParams.Hpcon.CHARLIE)
                    .instStatus(SiteStatusCreateParams.InstStatus.PMC)
                    .link(listOf("ATDL", "IJMS", "LINK-1"))
                    .linkStatus(listOf("AVAILABLE", "DEGRADED", "NOT AVAILABLE"))
                    .missile(listOf("GMD", "HARPOON", "JAVELIN"))
                    .missileInventory(listOf(5, 10, 100))
                    .mobileAltId("MOBILEALT-ID")
                    .opsCapability("Fully Operational")
                    .opsImpairment("opsImpairment")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pes(true)
                    .poiid("d4a91864-6140-4b8d-67cd-45421c75f696")
                    .radarStatus(listOf("OPERATIONAL", "OFF", "NON-OPERATIONAL"))
                    .radarSystem(listOf("ILLUMINATING", "MODE-4", "MODE-3"))
                    .radiateMode("Active")
                    .reportTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .samMode("Initialization")
                    .siteType("ADOC")
                    .timeFunction("Activation")
                    .trackId("PCM4923-1656174732-4-1-257")
                    .trackRefL16("TrkNm")
                    .weatherMessage("Heavy rain")
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
        val siteStatusServiceAsync = client.siteStatus()

        val future =
            siteStatusServiceAsync.update(
                SiteStatusUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(SiteStatusUpdateParams.DataMode.TEST)
                    .idSite("41e3e554-9790-40b9-bd7b-f30d864dcad8")
                    .source("Bluestaq")
                    .bodyId("SITESTATUS-ID")
                    .cat(SiteStatusUpdateParams.Cat.COLD)
                    .coldInventory(1)
                    .commImpairment("commImpairment")
                    .cpcon(SiteStatusUpdateParams.Cpcon._4)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .eoc(SiteStatusUpdateParams.Eoc.WARM)
                    .fpcon(SiteStatusUpdateParams.Fpcon.BRAVO)
                    .hotInventory(1)
                    .hpcon(SiteStatusUpdateParams.Hpcon.CHARLIE)
                    .instStatus(SiteStatusUpdateParams.InstStatus.PMC)
                    .link(listOf("ATDL", "IJMS", "LINK-1"))
                    .linkStatus(listOf("AVAILABLE", "DEGRADED", "NOT AVAILABLE"))
                    .missile(listOf("GMD", "HARPOON", "JAVELIN"))
                    .missileInventory(listOf(5, 10, 100))
                    .mobileAltId("MOBILEALT-ID")
                    .opsCapability("Fully Operational")
                    .opsImpairment("opsImpairment")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pes(true)
                    .poiid("d4a91864-6140-4b8d-67cd-45421c75f696")
                    .radarStatus(listOf("OPERATIONAL", "OFF", "NON-OPERATIONAL"))
                    .radarSystem(listOf("ILLUMINATING", "MODE-4", "MODE-3"))
                    .radiateMode("Active")
                    .reportTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                    .samMode("Initialization")
                    .siteType("ADOC")
                    .timeFunction("Activation")
                    .trackId("PCM4923-1656174732-4-1-257")
                    .trackRefL16("TrkNm")
                    .weatherMessage("Heavy rain")
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
        val siteStatusServiceAsync = client.siteStatus()

        val pageFuture = siteStatusServiceAsync.list()

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
        val siteStatusServiceAsync = client.siteStatus()

        val future = siteStatusServiceAsync.delete("id")

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
        val siteStatusServiceAsync = client.siteStatus()

        val responseFuture =
            siteStatusServiceAsync.count(
                SiteStatusCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val siteStatusServiceAsync = client.siteStatus()

        val siteStatusFuture =
            siteStatusServiceAsync.get(
                SiteStatusGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val siteStatus = siteStatusFuture.get()
        siteStatus.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteStatusServiceAsync = client.siteStatus()

        val responseFuture = siteStatusServiceAsync.queryhelp()

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
        val siteStatusServiceAsync = client.siteStatus()

        val responseFuture =
            siteStatusServiceAsync.tuple(
                SiteStatusTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
