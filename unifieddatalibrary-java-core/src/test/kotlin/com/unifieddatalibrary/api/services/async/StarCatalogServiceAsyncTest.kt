// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCountParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCreateBulkParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogCreateParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogGetParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogTupleParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.starcatalog.StarCatalogUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StarCatalogServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val starCatalogServiceAsync = client.starCatalog()

        val future =
            starCatalogServiceAsync.create(
                StarCatalogCreateParams.builder()
                    .astrometryOrigin(StarCatalogCreateParams.AstrometryOrigin.GAIADR3)
                    .classificationMarking("U")
                    .csId(12345L)
                    .dataMode(StarCatalogCreateParams.DataMode.TEST)
                    .dec(21.8)
                    .ra(14.43)
                    .source("Bluestaq")
                    .starEpoch(2016.0)
                    .id("STAR-CAT-DATASET-ID")
                    .bpmag(0.04559)
                    .bpmagUnc(0.2227)
                    .catVersion("1.23")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .decUnc(40.996)
                    .gaiadr3CatId(89012345678901L)
                    .gmag(0.0046)
                    .gmagUnc(0.00292)
                    .gncCatId(12345)
                    .hipCatId(12345)
                    .hmag(12.126)
                    .hmagUnc(5.722)
                    .jmag(9.515)
                    .jmagUnc(7.559)
                    .kmag(13.545)
                    .kmagUnc(0.052)
                    .multFlag(true)
                    .neighborDistance(201.406)
                    .neighborFlag(false)
                    .neighborId(2456)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .parallax(-6.8)
                    .parallaxUnc(82.35)
                    .pmdec(-970.1003)
                    .pmdecUnc(1.22)
                    .pmra(1000.45)
                    .pmraUnc(5.6)
                    .pmUncFlag(false)
                    .posUncFlag(false)
                    .raUnc(509.466)
                    .rpmag(8.0047)
                    .rpmagUnc(1.233)
                    .shift(4.548)
                    .shiftFlag(false)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .varFlag(true)
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
        val starCatalogServiceAsync = client.starCatalog()

        val future =
            starCatalogServiceAsync.update(
                StarCatalogUpdateParams.builder()
                    .pathId("id")
                    .astrometryOrigin(StarCatalogUpdateParams.AstrometryOrigin.GAIADR3)
                    .classificationMarking("U")
                    .csId(12345L)
                    .dataMode(StarCatalogUpdateParams.DataMode.TEST)
                    .dec(21.8)
                    .ra(14.43)
                    .source("Bluestaq")
                    .starEpoch(2016.0)
                    .bodyId("STAR-CAT-DATASET-ID")
                    .bpmag(0.04559)
                    .bpmagUnc(0.2227)
                    .catVersion("1.23")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .decUnc(40.996)
                    .gaiadr3CatId(89012345678901L)
                    .gmag(0.0046)
                    .gmagUnc(0.00292)
                    .gncCatId(12345)
                    .hipCatId(12345)
                    .hmag(12.126)
                    .hmagUnc(5.722)
                    .jmag(9.515)
                    .jmagUnc(7.559)
                    .kmag(13.545)
                    .kmagUnc(0.052)
                    .multFlag(true)
                    .neighborDistance(201.406)
                    .neighborFlag(false)
                    .neighborId(2456)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .parallax(-6.8)
                    .parallaxUnc(82.35)
                    .pmdec(-970.1003)
                    .pmdecUnc(1.22)
                    .pmra(1000.45)
                    .pmraUnc(5.6)
                    .pmUncFlag(false)
                    .posUncFlag(false)
                    .raUnc(509.466)
                    .rpmag(8.0047)
                    .rpmagUnc(1.233)
                    .shift(4.548)
                    .shiftFlag(false)
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .varFlag(true)
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
        val starCatalogServiceAsync = client.starCatalog()

        val pageFuture = starCatalogServiceAsync.list()

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
        val starCatalogServiceAsync = client.starCatalog()

        val future = starCatalogServiceAsync.delete("id")

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
        val starCatalogServiceAsync = client.starCatalog()

        val responseFuture =
            starCatalogServiceAsync.count(
                StarCatalogCountParams.builder()
                    .dec(0.0)
                    .firstResult(0L)
                    .maxResults(0L)
                    .ra(0.0)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val starCatalogServiceAsync = client.starCatalog()

        val future =
            starCatalogServiceAsync.createBulk(
                StarCatalogCreateBulkParams.builder()
                    .addBody(
                        StarCatalogCreateBulkParams.Body.builder()
                            .astrometryOrigin(
                                StarCatalogCreateBulkParams.Body.AstrometryOrigin.GAIADR3
                            )
                            .classificationMarking("U")
                            .csId(12345L)
                            .dataMode(StarCatalogCreateBulkParams.Body.DataMode.TEST)
                            .dec(21.8)
                            .ra(14.43)
                            .source("Bluestaq")
                            .starEpoch(2016.0)
                            .id("STAR-CAT-DATASET-ID")
                            .bpmag(0.04559)
                            .bpmagUnc(0.2227)
                            .catVersion("1.23")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .decUnc(40.996)
                            .gaiadr3CatId(89012345678901L)
                            .gmag(0.0046)
                            .gmagUnc(0.00292)
                            .gncCatId(12345)
                            .hipCatId(12345)
                            .hmag(12.126)
                            .hmagUnc(5.722)
                            .jmag(9.515)
                            .jmagUnc(7.559)
                            .kmag(13.545)
                            .kmagUnc(0.052)
                            .multFlag(true)
                            .neighborDistance(201.406)
                            .neighborFlag(false)
                            .neighborId(2456)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .parallax(-6.8)
                            .parallaxUnc(82.35)
                            .pmdec(-970.1003)
                            .pmdecUnc(1.22)
                            .pmra(1000.45)
                            .pmraUnc(5.6)
                            .pmUncFlag(false)
                            .posUncFlag(false)
                            .raUnc(509.466)
                            .rpmag(8.0047)
                            .rpmagUnc(1.233)
                            .shift(4.548)
                            .shiftFlag(false)
                            .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .updatedBy("some.user")
                            .varFlag(true)
                            .build()
                    )
                    .build()
            )

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
        val starCatalogServiceAsync = client.starCatalog()

        val starCatalogFuture =
            starCatalogServiceAsync.get(
                StarCatalogGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val starCatalog = starCatalogFuture.get()
        starCatalog.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val starCatalogServiceAsync = client.starCatalog()

        val responseFuture = starCatalogServiceAsync.queryhelp()

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
        val starCatalogServiceAsync = client.starCatalog()

        val responseFuture =
            starCatalogServiceAsync.tuple(
                StarCatalogTupleParams.builder()
                    .columns("columns")
                    .dec(0.0)
                    .firstResult(0L)
                    .maxResults(0L)
                    .ra(0.0)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val starCatalogServiceAsync = client.starCatalog()

        val future =
            starCatalogServiceAsync.unvalidatedPublish(
                StarCatalogUnvalidatedPublishParams.builder()
                    .addBody(
                        StarCatalogUnvalidatedPublishParams.Body.builder()
                            .astrometryOrigin(
                                StarCatalogUnvalidatedPublishParams.Body.AstrometryOrigin.GAIADR3
                            )
                            .classificationMarking("U")
                            .csId(12345L)
                            .dataMode(StarCatalogUnvalidatedPublishParams.Body.DataMode.TEST)
                            .dec(21.8)
                            .ra(14.43)
                            .source("Bluestaq")
                            .starEpoch(2016.0)
                            .id("STAR-CAT-DATASET-ID")
                            .bpmag(0.04559)
                            .bpmagUnc(0.2227)
                            .catVersion("1.23")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .decUnc(40.996)
                            .gaiadr3CatId(89012345678901L)
                            .gmag(0.0046)
                            .gmagUnc(0.00292)
                            .gncCatId(12345)
                            .hipCatId(12345)
                            .hmag(12.126)
                            .hmagUnc(5.722)
                            .jmag(9.515)
                            .jmagUnc(7.559)
                            .kmag(13.545)
                            .kmagUnc(0.052)
                            .multFlag(true)
                            .neighborDistance(201.406)
                            .neighborFlag(false)
                            .neighborId(2456)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .parallax(-6.8)
                            .parallaxUnc(82.35)
                            .pmdec(-970.1003)
                            .pmdecUnc(1.22)
                            .pmra(1000.45)
                            .pmraUnc(5.6)
                            .pmUncFlag(false)
                            .posUncFlag(false)
                            .raUnc(509.466)
                            .rpmag(8.0047)
                            .rpmagUnc(1.233)
                            .shift(4.548)
                            .shiftFlag(false)
                            .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .updatedBy("some.user")
                            .varFlag(true)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
