// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailCreateParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailGetParams
import com.unifieddatalibrary.api.models.solararraydetails.SolarArrayDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SolarArrayDetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val solarArrayDetailServiceAsync = client.solarArrayDetails()

        val future =
            solarArrayDetailServiceAsync.create(
                SolarArrayDetailCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SolarArrayDetailCreateParams.DataMode.TEST)
                    .idSolarArray("SOLARARRAY-ID")
                    .source("Bluestaq")
                    .id("SOLARARRAYDETAILS-ID")
                    .area(123.4)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("Example notes")
                    .junctionTechnology("Triple")
                    .manufacturerOrgId("MANUFACTURERORG-ID")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .span(123.4)
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .technology("Ga-As")
                    .type("U Shaped")
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
        val solarArrayDetailServiceAsync = client.solarArrayDetails()

        val future =
            solarArrayDetailServiceAsync.update(
                SolarArrayDetailUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(SolarArrayDetailUpdateParams.DataMode.TEST)
                    .idSolarArray("SOLARARRAY-ID")
                    .source("Bluestaq")
                    .bodyId("SOLARARRAYDETAILS-ID")
                    .area(123.4)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("Example notes")
                    .junctionTechnology("Triple")
                    .manufacturerOrgId("MANUFACTURERORG-ID")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .span(123.4)
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .technology("Ga-As")
                    .type("U Shaped")
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
        val solarArrayDetailServiceAsync = client.solarArrayDetails()

        val pageFuture = solarArrayDetailServiceAsync.list()

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
        val solarArrayDetailServiceAsync = client.solarArrayDetails()

        val future = solarArrayDetailServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val solarArrayDetailServiceAsync = client.solarArrayDetails()

        val solarArrayDetailsFullFuture =
            solarArrayDetailServiceAsync.get(
                SolarArrayDetailGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val solarArrayDetailsFull = solarArrayDetailsFullFuture.get()
        solarArrayDetailsFull.validate()
    }
}
