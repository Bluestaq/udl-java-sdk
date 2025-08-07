// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.eop.EopCountParams
import com.unifieddatalibrary.api.models.eop.EopCreateParams
import com.unifieddatalibrary.api.models.eop.EopListParams
import com.unifieddatalibrary.api.models.eop.EopListTupleParams
import com.unifieddatalibrary.api.models.eop.EopRetrieveParams
import com.unifieddatalibrary.api.models.eop.EopUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EopServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val eopServiceAsync = client.eop()

        val future =
            eopServiceAsync.create(
                EopCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(EopCreateParams.DataMode.TEST)
                    .eopDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .source("Bluestaq")
                    .id("EOP-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .dEpsilon(-0.917)
                    .dEpsilonB(-1.7)
                    .dEpsilonUnc(0.165)
                    .dPsi(-10.437)
                    .dPsib(-9.9)
                    .dPsiUnc(0.507)
                    .dX(-0.086)
                    .dXb(0.129)
                    .dXUnc(0.202)
                    .dY(0.13)
                    .dYb(-0.653)
                    .dYUnc(0.165)
                    .lod(1.8335)
                    .lodUnc(0.0201)
                    .nutationState(EopCreateParams.NutationState.I)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .polarMotionState(EopCreateParams.PolarMotionState.I)
                    .polarMotionX(0.182987)
                    .polarMotionXb(0.1824)
                    .polarMotionXUnc(0.000672)
                    .polarMotionY(0.168775)
                    .polarMotionYb(0.1679)
                    .polarMotionYUnc(0.000345)
                    .precessionNutationStd("IAU1980")
                    .rawFileUri("Example URI")
                    .ut1Utc(-0.1251659)
                    .ut1Utcb(-0.1253)
                    .ut1UtcState(EopCreateParams.Ut1UtcState.I)
                    .ut1UtcUnc(0.0000207)
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
        val eopServiceAsync = client.eop()

        val eopFullFuture =
            eopServiceAsync.retrieve(
                EopRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val eopFull = eopFullFuture.get()
        eopFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val eopServiceAsync = client.eop()

        val future =
            eopServiceAsync.update(
                EopUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(EopUpdateParams.DataMode.TEST)
                    .eopDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .source("Bluestaq")
                    .bodyId("EOP-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .dEpsilon(-0.917)
                    .dEpsilonB(-1.7)
                    .dEpsilonUnc(0.165)
                    .dPsi(-10.437)
                    .dPsib(-9.9)
                    .dPsiUnc(0.507)
                    .dX(-0.086)
                    .dXb(0.129)
                    .dXUnc(0.202)
                    .dY(0.13)
                    .dYb(-0.653)
                    .dYUnc(0.165)
                    .lod(1.8335)
                    .lodUnc(0.0201)
                    .nutationState(EopUpdateParams.NutationState.I)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .polarMotionState(EopUpdateParams.PolarMotionState.I)
                    .polarMotionX(0.182987)
                    .polarMotionXb(0.1824)
                    .polarMotionXUnc(0.000672)
                    .polarMotionY(0.168775)
                    .polarMotionYb(0.1679)
                    .polarMotionYUnc(0.000345)
                    .precessionNutationStd("IAU1980")
                    .rawFileUri("Example URI")
                    .ut1Utc(-0.1251659)
                    .ut1Utcb(-0.1253)
                    .ut1UtcState(EopUpdateParams.Ut1UtcState.I)
                    .ut1UtcUnc(0.0000207)
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
        val eopServiceAsync = client.eop()

        val pageFuture =
            eopServiceAsync.list(
                EopListParams.builder()
                    .eopDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

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
        val eopServiceAsync = client.eop()

        val future = eopServiceAsync.delete("id")

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
        val eopServiceAsync = client.eop()

        val responseFuture =
            eopServiceAsync.count(
                EopCountParams.builder()
                    .eopDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun listTuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val eopServiceAsync = client.eop()

        val eopFullsFuture =
            eopServiceAsync.listTuple(
                EopListTupleParams.builder()
                    .columns("columns")
                    .eopDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val eopFulls = eopFullsFuture.get()
        eopFulls.forEach { it.validate() }
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val eopServiceAsync = client.eop()

        val responseFuture = eopServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }
}
