// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
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
internal class StarCatalogServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val starCatalogService = client.starCatalog()

        starCatalogService.create(
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
                .allWiseId("WISEA J152743.04+624823.6")
                .allWisew1Mag(15.782)
                .allWisew1MagUnc(0.042)
                .allWisew2Mag(16.523)
                .allWisew2MagUnc(0.021)
                .allWisew3Mag(11.541)
                .allWisew3MagUnc(0.159)
                .allWisew4Mag(9.007)
                .allWisew4MagUnc(0.468)
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
                .multiplicity("2")
                .neighborDistance(201.406)
                .neighborFlag(false)
                .neighborId(2456)
                .nonSingleStar("7")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
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
                .shiftFwhm1(0.157)
                .shiftFwhm6(1.065)
                .twoMassId("A1B2C3D4E5")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .varFlag(true)
                .variability("1")
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
        val starCatalogService = client.starCatalog()

        starCatalogService.update(
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
                .allWiseId("WISEA J152743.04+624823.6")
                .allWisew1Mag(15.782)
                .allWisew1MagUnc(0.042)
                .allWisew2Mag(16.523)
                .allWisew2MagUnc(0.021)
                .allWisew3Mag(11.541)
                .allWisew3MagUnc(0.159)
                .allWisew4Mag(9.007)
                .allWisew4MagUnc(0.468)
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
                .multiplicity("2")
                .neighborDistance(201.406)
                .neighborFlag(false)
                .neighborId(2456)
                .nonSingleStar("7")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
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
                .shiftFwhm1(0.157)
                .shiftFwhm6(1.065)
                .twoMassId("A1B2C3D4E5")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .varFlag(true)
                .variability("1")
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
        val starCatalogService = client.starCatalog()

        val page = starCatalogService.list()

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
        val starCatalogService = client.starCatalog()

        starCatalogService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val starCatalogService = client.starCatalog()

        starCatalogService.count(
            StarCatalogCountParams.builder().dec(0.0).firstResult(0L).maxResults(0L).ra(0.0).build()
        )
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val starCatalogService = client.starCatalog()

        starCatalogService.createBulk(
            StarCatalogCreateBulkParams.builder()
                .addBody(
                    StarCatalogCreateBulkParams.Body.builder()
                        .astrometryOrigin(StarCatalogCreateBulkParams.Body.AstrometryOrigin.GAIADR3)
                        .classificationMarking("U")
                        .csId(12345L)
                        .dataMode(StarCatalogCreateBulkParams.Body.DataMode.TEST)
                        .dec(21.8)
                        .ra(14.43)
                        .source("Bluestaq")
                        .starEpoch(2016.0)
                        .id("STAR-CAT-DATASET-ID")
                        .allWiseId("WISEA J152743.04+624823.6")
                        .allWisew1Mag(15.782)
                        .allWisew1MagUnc(0.042)
                        .allWisew2Mag(16.523)
                        .allWisew2MagUnc(0.021)
                        .allWisew3Mag(11.541)
                        .allWisew3MagUnc(0.159)
                        .allWisew4Mag(9.007)
                        .allWisew4MagUnc(0.468)
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
                        .multiplicity("2")
                        .neighborDistance(201.406)
                        .neighborFlag(false)
                        .neighborId(2456)
                        .nonSingleStar("7")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
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
                        .shiftFwhm1(0.157)
                        .shiftFwhm6(1.065)
                        .twoMassId("A1B2C3D4E5")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .varFlag(true)
                        .variability("1")
                        .build()
                )
                .build()
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
        val starCatalogService = client.starCatalog()

        val starCatalog =
            starCatalogService.get(
                StarCatalogGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        starCatalog.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val starCatalogService = client.starCatalog()

        val response = starCatalogService.queryhelp()

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
        val starCatalogService = client.starCatalog()

        val response =
            starCatalogService.tuple(
                StarCatalogTupleParams.builder()
                    .columns("columns")
                    .dec(0.0)
                    .firstResult(0L)
                    .maxResults(0L)
                    .ra(0.0)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val starCatalogService = client.starCatalog()

        starCatalogService.unvalidatedPublish(
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
                        .allWiseId("WISEA J152743.04+624823.6")
                        .allWisew1Mag(15.782)
                        .allWisew1MagUnc(0.042)
                        .allWisew2Mag(16.523)
                        .allWisew2MagUnc(0.021)
                        .allWisew3Mag(11.541)
                        .allWisew3MagUnc(0.159)
                        .allWisew4Mag(9.007)
                        .allWisew4MagUnc(0.468)
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
                        .multiplicity("2")
                        .neighborDistance(201.406)
                        .neighborFlag(false)
                        .neighborId(2456)
                        .nonSingleStar("7")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
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
                        .shiftFwhm1(0.157)
                        .shiftFwhm6(1.065)
                        .twoMassId("A1B2C3D4E5")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .varFlag(true)
                        .variability("1")
                        .build()
                )
                .build()
        )
    }
}
