// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailCreateParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailRetrieveParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatterydetailServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batterydetailService = client.batterydetails()

        batterydetailService.create(
            BatterydetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(BatterydetailCreateParams.DataMode.TEST)
                .idBattery("BATTERY-ID")
                .source("Bluestaq")
                .id("BATTERYDETAILS-ID")
                .capacity(10.1)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("example notes")
                .dischargeDepth(0.2)
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .model("11212")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .technology("Ni-Cd")
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
        val batterydetailService = client.batterydetails()

        val batterydetailsFull =
            batterydetailService.retrieve(
                BatterydetailRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        batterydetailsFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batterydetailService = client.batterydetails()

        batterydetailService.update(
            BatterydetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(BatterydetailUpdateParams.DataMode.TEST)
                .idBattery("BATTERY-ID")
                .source("Bluestaq")
                .bodyId("BATTERYDETAILS-ID")
                .capacity(10.1)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("example notes")
                .dischargeDepth(0.2)
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .model("11212")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .technology("Ni-Cd")
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
        val batterydetailService = client.batterydetails()

        val page = batterydetailService.list()

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
        val batterydetailService = client.batterydetails()

        batterydetailService.delete("id")
    }
}
