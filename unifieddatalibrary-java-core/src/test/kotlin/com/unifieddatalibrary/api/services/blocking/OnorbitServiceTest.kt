// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.onorbit.OnorbitCountParams
import com.unifieddatalibrary.api.models.onorbit.OnorbitCreateParams
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
internal class OnorbitServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitService = client.onorbit()

        onorbitService.create(
            OnorbitCreateParams.builder()
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitService = client.onorbit()

        onorbitService.update(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitService = client.onorbit()

        val page = onorbitService.list()

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
        val onorbitService = client.onorbit()

        onorbitService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitService = client.onorbit()

        onorbitService.count(OnorbitCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitService = client.onorbit()

        val onorbitFull =
            onorbitService.get(
                OnorbitGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        onorbitFull.validate()
    }

    @Test
    fun getSignature() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitService = client.onorbit()

        val response =
            onorbitService.getSignature(
                OnorbitGetSignatureParams.builder()
                    .idOnOrbit("idOnOrbit")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitService = client.onorbit()

        val response = onorbitService.queryhelp()

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
        val onorbitService = client.onorbit()

        val onorbitFulls =
            onorbitService.tuple(
                OnorbitTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        onorbitFulls.forEach { it.validate() }
    }
}
