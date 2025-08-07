// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.surface.SurfaceCountParams
import com.unifieddatalibrary.api.models.surface.SurfaceCreateParams
import com.unifieddatalibrary.api.models.surface.SurfaceGetParams
import com.unifieddatalibrary.api.models.surface.SurfaceTupleParams
import com.unifieddatalibrary.api.models.surface.SurfaceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SurfaceServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceServiceAsync = client.surface()

        val future =
            surfaceServiceAsync.create(
                SurfaceCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SurfaceCreateParams.DataMode.TEST)
                    .name("West lot")
                    .source("Bluestaq")
                    .type("PARKING")
                    .id("be831d39-1822-da9f-7ace-6cc5643397dc")
                    .altSiteId("ORIG-SITE-ID")
                    .condition("GOOD")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .ddtWtKip(833.5)
                    .ddtWtKipMod(625.125)
                    .ddtWtKipModNote("Observed 25% reduction in surface integrity.")
                    .ddtWtKn(3705.44)
                    .ddWtKip(416.25)
                    .ddWtKipMod(312.1875)
                    .ddWtKipModNote("Observed 25% reduction in surface integrity.")
                    .ddWtKn(1850.1)
                    .endLat(45.844)
                    .endLon(-67.0094)
                    .idSite("SITE-ID")
                    .lcn(50)
                    .ldaFt(475.2)
                    .ldaM(145.75)
                    .lengthFt(1500.75)
                    .lengthM(457.5)
                    .lighting(true)
                    .lightsAprch(true)
                    .lightsCl(true)
                    .lightsOls(true)
                    .lightsPapi(true)
                    .lightsReil(true)
                    .lightsRwy(true)
                    .lightsSeqfl(true)
                    .lightsTdzl(true)
                    .lightsUnkn(false)
                    .lightsVasi(true)
                    .material("Concrete")
                    .obstacle(true)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pcn("73RBWT")
                    .pointReference("Reference Point Example")
                    .primary(true)
                    .rawWbc("LCN 42")
                    .sbttWtKip(603.025)
                    .sbttWtKipMod(452.269)
                    .sbttWtKipModNote("Observed 25% reduction in surface integrity.")
                    .sbttWtKn(2682.05)
                    .startLat(46.757211)
                    .startLon(-67.759494)
                    .stWtKip(195.75)
                    .stWtKipMod(146.8125)
                    .stWtKipModNote("Observed 25% reduction in surface integrity.")
                    .stWtKn(867.6)
                    .sWtKip(143.5)
                    .sWtKipMod(107.625)
                    .sWtKipModNote("Observed 25% reduction in surface integrity.")
                    .sWtKn(636.4)
                    .tdtWtkip(870.2)
                    .tdtWtKipMod(652.65)
                    .tdtWtKipModNote("Serious 25 percent reduction.")
                    .tdtWtKn(3870.05)
                    .trtWtKip(622.85)
                    .trtWtKipMod(467.1375)
                    .trtWtKipModNote("Observed 25% reduction in surface integrity.")
                    .trtWtKn(2767.15)
                    .ttWtKip(414.9)
                    .ttWtKipMod(311.175)
                    .ttWtKipModNote("Observed 25% reduction in surface integrity.")
                    .ttWtKn(1842.55)
                    .tWtKip(188.2)
                    .tWtKipMod(141.15)
                    .tWtKipModNote("Observed 25% reduction in surface integrity.")
                    .tWtKn(836.45)
                    .widthFt(220.3)
                    .widthM(67.25)
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
        val surfaceServiceAsync = client.surface()

        val future =
            surfaceServiceAsync.update(
                SurfaceUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(SurfaceUpdateParams.DataMode.TEST)
                    .name("West lot")
                    .source("Bluestaq")
                    .type("PARKING")
                    .bodyId("be831d39-1822-da9f-7ace-6cc5643397dc")
                    .altSiteId("ORIG-SITE-ID")
                    .condition("GOOD")
                    .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .ddtWtKip(833.5)
                    .ddtWtKipMod(625.125)
                    .ddtWtKipModNote("Observed 25% reduction in surface integrity.")
                    .ddtWtKn(3705.44)
                    .ddWtKip(416.25)
                    .ddWtKipMod(312.1875)
                    .ddWtKipModNote("Observed 25% reduction in surface integrity.")
                    .ddWtKn(1850.1)
                    .endLat(45.844)
                    .endLon(-67.0094)
                    .idSite("SITE-ID")
                    .lcn(50)
                    .ldaFt(475.2)
                    .ldaM(145.75)
                    .lengthFt(1500.75)
                    .lengthM(457.5)
                    .lighting(true)
                    .lightsAprch(true)
                    .lightsCl(true)
                    .lightsOls(true)
                    .lightsPapi(true)
                    .lightsReil(true)
                    .lightsRwy(true)
                    .lightsSeqfl(true)
                    .lightsTdzl(true)
                    .lightsUnkn(false)
                    .lightsVasi(true)
                    .material("Concrete")
                    .obstacle(true)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .pcn("73RBWT")
                    .pointReference("Reference Point Example")
                    .primary(true)
                    .rawWbc("LCN 42")
                    .sbttWtKip(603.025)
                    .sbttWtKipMod(452.269)
                    .sbttWtKipModNote("Observed 25% reduction in surface integrity.")
                    .sbttWtKn(2682.05)
                    .startLat(46.757211)
                    .startLon(-67.759494)
                    .stWtKip(195.75)
                    .stWtKipMod(146.8125)
                    .stWtKipModNote("Observed 25% reduction in surface integrity.")
                    .stWtKn(867.6)
                    .sWtKip(143.5)
                    .sWtKipMod(107.625)
                    .sWtKipModNote("Observed 25% reduction in surface integrity.")
                    .sWtKn(636.4)
                    .tdtWtkip(870.2)
                    .tdtWtKipMod(652.65)
                    .tdtWtKipModNote("Serious 25 percent reduction.")
                    .tdtWtKn(3870.05)
                    .trtWtKip(622.85)
                    .trtWtKipMod(467.1375)
                    .trtWtKipModNote("Observed 25% reduction in surface integrity.")
                    .trtWtKn(2767.15)
                    .ttWtKip(414.9)
                    .ttWtKipMod(311.175)
                    .ttWtKipModNote("Observed 25% reduction in surface integrity.")
                    .ttWtKn(1842.55)
                    .tWtKip(188.2)
                    .tWtKipMod(141.15)
                    .tWtKipModNote("Observed 25% reduction in surface integrity.")
                    .tWtKn(836.45)
                    .widthFt(220.3)
                    .widthM(67.25)
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
        val surfaceServiceAsync = client.surface()

        val pageFuture = surfaceServiceAsync.list()

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
        val surfaceServiceAsync = client.surface()

        val future = surfaceServiceAsync.delete("id")

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
        val surfaceServiceAsync = client.surface()

        val responseFuture =
            surfaceServiceAsync.count(
                SurfaceCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val surfaceServiceAsync = client.surface()

        val surfaceFuture =
            surfaceServiceAsync.get(
                SurfaceGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val surface = surfaceFuture.get()
        surface.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val surfaceServiceAsync = client.surface()

        val responseFuture = surfaceServiceAsync.queryhelp()

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
        val surfaceServiceAsync = client.surface()

        val responseFuture =
            surfaceServiceAsync.tuple(
                SurfaceTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
