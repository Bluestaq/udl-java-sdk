// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sitestatus

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteStatusUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            SiteStatusUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SiteStatusUpdateParams.DataMode.TEST)
                .idSite("41e3e554-9790-40b9-bd7b-f30d864dcad8")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SiteStatusUpdateParams.DataMode.TEST)
        assertThat(body.idSite()).isEqualTo("41e3e554-9790-40b9-bd7b-f30d864dcad8")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("SITESTATUS-ID")
        assertThat(body.cat()).contains(SiteStatusUpdateParams.Cat.COLD)
        assertThat(body.coldInventory()).contains(1)
        assertThat(body.commImpairment()).contains("commImpairment")
        assertThat(body.cpcon()).contains(SiteStatusUpdateParams.Cpcon._4)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.eoc()).contains(SiteStatusUpdateParams.Eoc.WARM)
        assertThat(body.fpcon()).contains(SiteStatusUpdateParams.Fpcon.BRAVO)
        assertThat(body.hotInventory()).contains(1)
        assertThat(body.hpcon()).contains(SiteStatusUpdateParams.Hpcon.CHARLIE)
        assertThat(body.instStatus()).contains(SiteStatusUpdateParams.InstStatus.PMC)
        assertThat(body.link().getOrNull()).containsExactly("ATDL", "IJMS", "LINK-1")
        assertThat(body.linkStatus().getOrNull())
            .containsExactly("AVAILABLE", "DEGRADED", "NOT AVAILABLE")
        assertThat(body.missile().getOrNull()).containsExactly("GMD", "HARPOON", "JAVELIN")
        assertThat(body.missileInventory().getOrNull()).containsExactly(5, 10, 100)
        assertThat(body.mobileAltId()).contains("MOBILEALT-ID")
        assertThat(body.opsCapability()).contains("Fully Operational")
        assertThat(body.opsImpairment()).contains("opsImpairment")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.pes()).contains(true)
        assertThat(body.poiid()).contains("d4a91864-6140-4b8d-67cd-45421c75f696")
        assertThat(body.radarStatus().getOrNull())
            .containsExactly("OPERATIONAL", "OFF", "NON-OPERATIONAL")
        assertThat(body.radarSystem().getOrNull())
            .containsExactly("ILLUMINATING", "MODE-4", "MODE-3")
        assertThat(body.radiateMode()).contains("Active")
        assertThat(body.reportTime()).contains(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(body.samMode()).contains("Initialization")
        assertThat(body.siteType()).contains("ADOC")
        assertThat(body.timeFunction()).contains("Activation")
        assertThat(body.trackId()).contains("PCM4923-1656174732-4-1-257")
        assertThat(body.trackRefL16()).contains("TrkNm")
        assertThat(body.weatherMessage()).contains("Heavy rain")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SiteStatusUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SiteStatusUpdateParams.DataMode.TEST)
                .idSite("41e3e554-9790-40b9-bd7b-f30d864dcad8")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SiteStatusUpdateParams.DataMode.TEST)
        assertThat(body.idSite()).isEqualTo("41e3e554-9790-40b9-bd7b-f30d864dcad8")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
