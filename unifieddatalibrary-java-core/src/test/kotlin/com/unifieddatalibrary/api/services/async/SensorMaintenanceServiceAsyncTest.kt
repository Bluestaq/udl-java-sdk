// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCountParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateBulkParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceGetParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceTupleParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SensorMaintenanceServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val future =
            sensorMaintenanceServiceAsync.create(
                SensorMaintenanceCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SensorMaintenanceCreateParams.DataMode.TEST)
                    .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .siteCode("site01")
                    .source("Bluestaq")
                    .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .id("SENSORMAINTENANCE-ID")
                    .activity("Activity Description")
                    .approver("approver")
                    .changer("changer")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .duration("128:16:52")
                    .eowId("eowId")
                    .equipStatus("FMC")
                    .externalId("EXTERNAL-ID")
                    .idSensor("idSensor")
                    .impactedFaces("impactedFaces")
                    .inactiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .lineNumber("lineNumber")
                    .mdOpsCap("R")
                    .mwOpsCap("G")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .priority("low")
                    .recall("128:16:52")
                    .rel("rel")
                    .remark("Remarks")
                    .requestor("requestor")
                    .resource("resource")
                    .rev("rev")
                    .ssOpsCap("Y")
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
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val future =
            sensorMaintenanceServiceAsync.update(
                SensorMaintenanceUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(SensorMaintenanceUpdateParams.DataMode.TEST)
                    .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .siteCode("site01")
                    .source("Bluestaq")
                    .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .bodyId("SENSORMAINTENANCE-ID")
                    .activity("Activity Description")
                    .approver("approver")
                    .changer("changer")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .duration("128:16:52")
                    .eowId("eowId")
                    .equipStatus("FMC")
                    .externalId("EXTERNAL-ID")
                    .idSensor("idSensor")
                    .impactedFaces("impactedFaces")
                    .inactiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .lineNumber("lineNumber")
                    .mdOpsCap("R")
                    .mwOpsCap("G")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .priority("low")
                    .recall("128:16:52")
                    .rel("rel")
                    .remark("Remarks")
                    .requestor("requestor")
                    .resource("resource")
                    .rev("rev")
                    .ssOpsCap("Y")
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
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val pageFuture = sensorMaintenanceServiceAsync.list()

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
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val future = sensorMaintenanceServiceAsync.delete("id")

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
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val responseFuture =
            sensorMaintenanceServiceAsync.count(
                SensorMaintenanceCountParams.builder()
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val future =
            sensorMaintenanceServiceAsync.createBulk(
                SensorMaintenanceCreateBulkParams.builder()
                    .origin("origin")
                    .source("source")
                    .addBody(
                        SensorMaintenanceCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(SensorMaintenanceCreateBulkParams.Body.DataMode.TEST)
                            .endTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .siteCode("site01")
                            .source("Bluestaq")
                            .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .id("SENSORMAINTENANCE-ID")
                            .activity("Activity Description")
                            .approver("approver")
                            .changer("changer")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .duration("128:16:52")
                            .eowId("eowId")
                            .equipStatus("FMC")
                            .externalId("EXTERNAL-ID")
                            .idSensor("idSensor")
                            .impactedFaces("impactedFaces")
                            .inactiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .lineNumber("lineNumber")
                            .mdOpsCap("R")
                            .mwOpsCap("G")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .priority("low")
                            .recall("128:16:52")
                            .rel("rel")
                            .remark("Remarks")
                            .requestor("requestor")
                            .resource("resource")
                            .rev("rev")
                            .ssOpsCap("Y")
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
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val sensorMaintenanceFuture =
            sensorMaintenanceServiceAsync.get(
                SensorMaintenanceGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val sensorMaintenance = sensorMaintenanceFuture.get()
        sensorMaintenance.validate()
    }

    @Test
    fun listCurrent() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val pageFuture = sensorMaintenanceServiceAsync.listCurrent()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val responseFuture = sensorMaintenanceServiceAsync.queryHelp()

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
        val sensorMaintenanceServiceAsync = client.sensorMaintenance()

        val responseFuture =
            sensorMaintenanceServiceAsync.tuple(
                SensorMaintenanceTupleParams.builder()
                    .columns("columns")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
