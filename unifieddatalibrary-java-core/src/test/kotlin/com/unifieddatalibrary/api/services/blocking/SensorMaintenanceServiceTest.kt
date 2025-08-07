// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCountParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateBulkParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCreateParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceCurrentParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceGetParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceTupleParams
import com.unifieddatalibrary.api.models.sensormaintenance.SensorMaintenanceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SensorMaintenanceServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceService = client.sensorMaintenance()

        sensorMaintenanceService.create(
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
                .idSensor("idSensor")
                .impactedFaces("impactedFaces")
                .inactiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .lineNumber("lineNumber")
                .mdOpsCap("R")
                .mwOpsCap("G")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
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
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceService = client.sensorMaintenance()

        sensorMaintenanceService.update(
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
                .idSensor("idSensor")
                .impactedFaces("impactedFaces")
                .inactiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .lineNumber("lineNumber")
                .mdOpsCap("R")
                .mwOpsCap("G")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceService = client.sensorMaintenance()

        val page = sensorMaintenanceService.list()

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
        val sensorMaintenanceService = client.sensorMaintenance()

        sensorMaintenanceService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceService = client.sensorMaintenance()

        sensorMaintenanceService.count(
            SensorMaintenanceCountParams.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
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
        val sensorMaintenanceService = client.sensorMaintenance()

        sensorMaintenanceService.createBulk(
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
                        .idSensor("idSensor")
                        .impactedFaces("impactedFaces")
                        .inactiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .lineNumber("lineNumber")
                        .mdOpsCap("R")
                        .mwOpsCap("G")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
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
    }

    @Test
    fun current() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceService = client.sensorMaintenance()

        val response =
            sensorMaintenanceService.current(
                SensorMaintenanceCurrentParams.builder().firstResult(0L).maxResults(0L).build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceService = client.sensorMaintenance()

        val sensorMaintenance =
            sensorMaintenanceService.get(
                SensorMaintenanceGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        sensorMaintenance.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorMaintenanceService = client.sensorMaintenance()

        val response = sensorMaintenanceService.queryhelp()

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
        val sensorMaintenanceService = client.sensorMaintenance()

        val response =
            sensorMaintenanceService.tuple(
                SensorMaintenanceTupleParams.builder()
                    .columns("columns")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.forEach { it.validate() }
    }
}
