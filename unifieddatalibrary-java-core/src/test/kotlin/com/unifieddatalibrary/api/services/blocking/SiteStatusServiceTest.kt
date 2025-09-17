// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCountParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusCreateParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusGetParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusTupleParams
import com.unifieddatalibrary.api.models.sitestatus.SiteStatusUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SiteStatusServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteStatusService = client.siteStatus()

        siteStatusService.create(
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteStatusService = client.siteStatus()

        siteStatusService.update(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteStatusService = client.siteStatus()

        val page = siteStatusService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteStatusService = client.siteStatus()

        siteStatusService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteStatusService = client.siteStatus()

        siteStatusService.count(
            SiteStatusCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val siteStatusService = client.siteStatus()

        val siteStatus =
            siteStatusService.get(
                SiteStatusGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        siteStatus.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val siteStatusService = client.siteStatus()

        val response = siteStatusService.queryhelp()

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
        val siteStatusService = client.siteStatus()

        val response =
            siteStatusService.tuple(
                SiteStatusTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
