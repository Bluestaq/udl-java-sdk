// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.channels.ChannelCountParams
import com.unifieddatalibrary.api.models.channels.ChannelCreateParams
import com.unifieddatalibrary.api.models.channels.ChannelRetrieveParams
import com.unifieddatalibrary.api.models.channels.ChannelTupleParams
import com.unifieddatalibrary.api.models.channels.ChannelUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val channelService = client.channels()

        channelService.create(
            ChannelCreateParams.builder()
                .classificationMarking("U")
                .dataMode(ChannelCreateParams.DataMode.TEST)
                .idTransponder("REF-TRANSPONDER-ID")
                .name("Example name")
                .source("system.source")
                .id("CHANNEL-ID")
                .apid("AP-ID")
                .beamName("B8VD")
                .compression("Example compression")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .encryption("Example encryption")
                .idBeam("REF-BEAM-ID")
                .idRfBand("REF-RFBAND-ID")
                .origin("example_origin")
                .origNetwork("OPS1")
                .owner("example_owner")
                .pkg("Example pkg")
                .res("Example res")
                .sid("S-ID")
                .type("Example type")
                .vpid("VP-ID")
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val channelService = client.channels()

        val channelFull =
            channelService.retrieve(
                ChannelRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        channelFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val channelService = client.channels()

        channelService.update(
            ChannelUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(ChannelUpdateParams.DataMode.TEST)
                .idTransponder("REF-TRANSPONDER-ID")
                .name("Example name")
                .source("system.source")
                .bodyId("CHANNEL-ID")
                .apid("AP-ID")
                .beamName("B8VD")
                .compression("Example compression")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .encryption("Example encryption")
                .idBeam("REF-BEAM-ID")
                .idRfBand("REF-RFBAND-ID")
                .origin("example_origin")
                .origNetwork("OPS1")
                .owner("example_owner")
                .pkg("Example pkg")
                .res("Example res")
                .sid("S-ID")
                .type("Example type")
                .vpid("VP-ID")
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
        val channelService = client.channels()

        val page = channelService.list()

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
        val channelService = client.channels()

        channelService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val channelService = client.channels()

        channelService.count(ChannelCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val channelService = client.channels()

        val response = channelService.queryhelp()

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
        val channelService = client.channels()

        val channelFulls =
            channelService.tuple(
                ChannelTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        channelFulls.forEach { it.validate() }
    }
}
