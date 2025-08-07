// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCountParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeCreateParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeGetParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeTupleParams
import com.unifieddatalibrary.api.models.rfbandtype.RfBandTypeUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RfBandTypeServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandTypeService = client.rfBandType()

        rfBandTypeService.create(
            RfBandTypeCreateParams.builder()
                .id("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeCreateParams.DataMode.TEST)
                .description("Example description")
                .source("Bluestaq")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endFreq(123.4)
                .origin("THIRD_PARTY_DATASOURCE")
                .startFreq(123.4)
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
        val rfBandTypeService = client.rfBandType()

        rfBandTypeService.update(
            RfBandTypeUpdateParams.builder()
                .pathId("id")
                .bodyId("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeUpdateParams.DataMode.TEST)
                .description("Example description")
                .source("Bluestaq")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endFreq(123.4)
                .origin("THIRD_PARTY_DATASOURCE")
                .startFreq(123.4)
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
        val rfBandTypeService = client.rfBandType()

        val page = rfBandTypeService.list()

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
        val rfBandTypeService = client.rfBandType()

        rfBandTypeService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandTypeService = client.rfBandType()

        rfBandTypeService.count(
            RfBandTypeCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val rfBandTypeService = client.rfBandType()

        val rfBandType =
            rfBandTypeService.get(
                RfBandTypeGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        rfBandType.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandTypeService = client.rfBandType()

        val response = rfBandTypeService.queryhelp()

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
        val rfBandTypeService = client.rfBandType()

        val response =
            rfBandTypeService.tuple(
                RfBandTypeTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
