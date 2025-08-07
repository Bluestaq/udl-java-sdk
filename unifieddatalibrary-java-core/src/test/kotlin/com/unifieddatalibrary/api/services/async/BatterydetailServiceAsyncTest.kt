// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailCreateParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailRetrieveParams
import com.unifieddatalibrary.api.models.batterydetails.BatterydetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatterydetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batterydetailServiceAsync = client.batterydetails()

        val future =
            batterydetailServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batterydetailServiceAsync = client.batterydetails()

        val batterydetailsFullFuture =
            batterydetailServiceAsync.retrieve(
                BatterydetailRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val batterydetailsFull = batterydetailsFullFuture.get()
        batterydetailsFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val batterydetailServiceAsync = client.batterydetails()

        val future =
            batterydetailServiceAsync.update(
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
        val batterydetailServiceAsync = client.batterydetails()

        val pageFuture = batterydetailServiceAsync.list()

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
        val batterydetailServiceAsync = client.batterydetails()

        val future = batterydetailServiceAsync.delete("id")

        val response = future.get()
    }
}
