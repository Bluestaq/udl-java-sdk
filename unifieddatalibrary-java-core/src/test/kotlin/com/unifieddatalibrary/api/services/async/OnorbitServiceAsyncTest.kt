// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.onorbit.OnorbitCountParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitGetSignatureParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitIngest
import com.unifieddatalibrary.api.models.onorbit.OnorbitTupleParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitServiceAsync = client.onorbit()

        val future =
            onorbitServiceAsync.create(
                OnorbitIngest.builder()
                    .classificationMarking("U")
                    .dataMode(OnorbitIngest.DataMode.TEST)
                    .satNo(1)
                    .source("Bluestaq")
                    .altName("Alternate Name")
                    .category(OnorbitIngest.Category.LUNAR)
                    .commonName("Example common name")
                    .constellation("Big Dipper")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .decayDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .idOnOrbit("ONORBIT-ID")
                    .intlDes("2021123ABC")
                    .launchDate(LocalDate.parse("2018-01-01"))
                    .launchSiteId("LAUNCHSITE-ID")
                    .lifetimeYears(10)
                    .missionNumber("Expedition 1")
                    .objectType(OnorbitIngest.ObjectType.PAYLOAD)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
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
        val onorbitServiceAsync = client.onorbit()

        val future =
            onorbitServiceAsync.update(
                OnorbitUpdateParams.builder()
                    .id("id")
                    .onorbitIngest(
                        OnorbitIngest.builder()
                            .classificationMarking("U")
                            .dataMode(OnorbitIngest.DataMode.TEST)
                            .satNo(1)
                            .source("Bluestaq")
                            .altName("Alternate Name")
                            .category(OnorbitIngest.Category.LUNAR)
                            .commonName("Example common name")
                            .constellation("Big Dipper")
                            .countryCode("US")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .decayDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .idOnOrbit("ONORBIT-ID")
                            .intlDes("2021123ABC")
                            .launchDate(LocalDate.parse("2018-01-01"))
                            .launchSiteId("LAUNCHSITE-ID")
                            .lifetimeYears(10)
                            .missionNumber("Expedition 1")
                            .objectType(OnorbitIngest.ObjectType.PAYLOAD)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .build()
                    )
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
        val onorbitServiceAsync = client.onorbit()

        val pageFuture = onorbitServiceAsync.list()

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
        val onorbitServiceAsync = client.onorbit()

        val future = onorbitServiceAsync.delete("id")

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
        val onorbitServiceAsync = client.onorbit()

        val responseFuture =
            onorbitServiceAsync.count(
                OnorbitCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val onorbitServiceAsync = client.onorbit()

        val onorbitFullFuture =
            onorbitServiceAsync.get(
                OnorbitGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val onorbitFull = onorbitFullFuture.get()
        onorbitFull.validate()
    }

    @Test
    fun getSignature() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitServiceAsync = client.onorbit()

        val responseFuture =
            onorbitServiceAsync.getSignature(
                OnorbitGetSignatureParams.builder()
                    .idOnOrbit("idOnOrbit")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitServiceAsync = client.onorbit()

        val responseFuture = onorbitServiceAsync.queryhelp()

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
        val onorbitServiceAsync = client.onorbit()

        val onorbitFullsFuture =
            onorbitServiceAsync.tuple(
                OnorbitTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val onorbitFulls = onorbitFullsFuture.get()
        onorbitFulls.forEach { it.validate() }
    }
}
