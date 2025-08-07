// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCountParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCreateBulkParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCreateParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryFileCreateParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryGetParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryListParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PersonnelrecoveryServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val personnelrecoveryServiceAsync = client.personnelrecovery()

        val future =
            personnelrecoveryServiceAsync.create(
                PersonnelrecoveryCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(PersonnelrecoveryCreateParams.DataMode.TEST)
                    .msgTime(OffsetDateTime.parse("2021-10-15T16:00:00.123Z"))
                    .pickupLat(75.1234)
                    .pickupLon(175.1234)
                    .source("Bluestaq")
                    .type("MEDICAL")
                    .id("PERSONNEL_RECOVERY-ID")
                    .authMethod("PASSPORT")
                    .authStatus("NO STATEMENT")
                    .beaconInd(false)
                    .callSign("BADGER")
                    .commEq1("LL PHONE")
                    .commEq2("LL PHONE")
                    .commEq3("LL PHONE")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .executionInfo(
                        PersonnelrecoveryCreateParams.ExecutionInfo.builder()
                            .egress(66.53)
                            .addEgressPoint(107.23)
                            .addEgressPoint(30.455)
                            .escortVehicle(
                                PersonnelrecoveryCreateParams.ExecutionInfo.EscortVehicle.builder()
                                    .callSign("FALCO")
                                    .primaryFreq(34.55)
                                    .strength(5)
                                    .type("C17")
                                    .build()
                            )
                            .ingress(35.66)
                            .addInitialPoint(103.23)
                            .addInitialPoint(30.445)
                            .objStrategy("Description of strategy plan.")
                            .recoveryVehicle(
                                PersonnelrecoveryCreateParams.ExecutionInfo.RecoveryVehicle
                                    .builder()
                                    .callSign("FALCO")
                                    .primaryFreq(34.55)
                                    .strength(5)
                                    .type("C17")
                                    .build()
                            )
                            .build()
                    )
                    .identity("NEUTRAL CIVILIAN")
                    .idWeatherReport("WEATHER_REPORT-ID")
                    .milClass("CIVILIAN")
                    .natAlliance(1)
                    .natAlliance1(0)
                    .numAmbulatory(1)
                    .numAmbulatoryInjured(2)
                    .numNonAmbulatory(0)
                    .numPersons(1)
                    .objectiveAreaInfo(
                        PersonnelrecoveryCreateParams.ObjectiveAreaInfo.builder()
                            .addEnemyData(
                                PersonnelrecoveryCreateParams.ObjectiveAreaInfo.EnemyData.builder()
                                    .dirToEnemy("NORTHWEST")
                                    .friendliesRemarks("Comments from friendlies.")
                                    .hlzRemarks("Hot Landing Zone remarks.")
                                    .hostileFireType("SMALL ARMS")
                                    .build()
                            )
                            .oscCallSign("STARFOX")
                            .oscFreq(12.55)
                            .pzDesc("Near the lake.")
                            .addPzLocation(103.23)
                            .addPzLocation(30.445)
                            .build()
                    )
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .pickupAlt(30.1234)
                    .recovId("RECOV-ID")
                    .rxFreq(5.5)
                    .survivorMessages("UNINJURED CANT MOVE HOSTILES NEARBY")
                    .survivorRadio("NO STATEMENT")
                    .termInd(true)
                    .textMsg("Additional message from survivor.")
                    .txFreq(5.5)
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
        val personnelrecoveryServiceAsync = client.personnelrecovery()

        val pageFuture =
            personnelrecoveryServiceAsync.list(
                PersonnelrecoveryListParams.builder()
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val personnelrecoveryServiceAsync = client.personnelrecovery()

        val responseFuture =
            personnelrecoveryServiceAsync.count(
                PersonnelrecoveryCountParams.builder()
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
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
        val personnelrecoveryServiceAsync = client.personnelrecovery()

        val future =
            personnelrecoveryServiceAsync.createBulk(
                PersonnelrecoveryCreateBulkParams.builder()
                    .addBody(
                        PersonnelrecoveryCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(PersonnelrecoveryCreateBulkParams.Body.DataMode.TEST)
                            .msgTime(OffsetDateTime.parse("2021-10-15T16:00:00.123Z"))
                            .pickupLat(75.1234)
                            .pickupLon(175.1234)
                            .source("Bluestaq")
                            .type("MEDICAL")
                            .id("PERSONNEL_RECOVERY-ID")
                            .authMethod("PASSPORT")
                            .authStatus("NO STATEMENT")
                            .beaconInd(false)
                            .callSign("BADGER")
                            .commEq1("LL PHONE")
                            .commEq2("LL PHONE")
                            .commEq3("LL PHONE")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .executionInfo(
                                PersonnelrecoveryCreateBulkParams.Body.ExecutionInfo.builder()
                                    .egress(66.53)
                                    .addEgressPoint(107.23)
                                    .addEgressPoint(30.455)
                                    .escortVehicle(
                                        PersonnelrecoveryCreateBulkParams.Body.ExecutionInfo
                                            .EscortVehicle
                                            .builder()
                                            .callSign("FALCO")
                                            .primaryFreq(34.55)
                                            .strength(5)
                                            .type("C17")
                                            .build()
                                    )
                                    .ingress(35.66)
                                    .addInitialPoint(103.23)
                                    .addInitialPoint(30.445)
                                    .objStrategy("Description of strategy plan.")
                                    .recoveryVehicle(
                                        PersonnelrecoveryCreateBulkParams.Body.ExecutionInfo
                                            .RecoveryVehicle
                                            .builder()
                                            .callSign("FALCO")
                                            .primaryFreq(34.55)
                                            .strength(5)
                                            .type("C17")
                                            .build()
                                    )
                                    .build()
                            )
                            .identity("NEUTRAL CIVILIAN")
                            .idWeatherReport("WEATHER_REPORT-ID")
                            .milClass("CIVILIAN")
                            .natAlliance(1)
                            .natAlliance1(0)
                            .numAmbulatory(1)
                            .numAmbulatoryInjured(2)
                            .numNonAmbulatory(0)
                            .numPersons(1)
                            .objectiveAreaInfo(
                                PersonnelrecoveryCreateBulkParams.Body.ObjectiveAreaInfo.builder()
                                    .addEnemyData(
                                        PersonnelrecoveryCreateBulkParams.Body.ObjectiveAreaInfo
                                            .EnemyData
                                            .builder()
                                            .dirToEnemy("NORTHWEST")
                                            .friendliesRemarks("Comments from friendlies.")
                                            .hlzRemarks("Hot Landing Zone remarks.")
                                            .hostileFireType("SMALL ARMS")
                                            .build()
                                    )
                                    .oscCallSign("STARFOX")
                                    .oscFreq(12.55)
                                    .pzDesc("Near the lake.")
                                    .addPzLocation(103.23)
                                    .addPzLocation(30.445)
                                    .build()
                            )
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .pickupAlt(30.1234)
                            .recovId("RECOV-ID")
                            .rxFreq(5.5)
                            .survivorMessages("UNINJURED CANT MOVE HOSTILES NEARBY")
                            .survivorRadio("NO STATEMENT")
                            .termInd(true)
                            .textMsg("Additional message from survivor.")
                            .txFreq(5.5)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun fileCreate() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val personnelrecoveryServiceAsync = client.personnelrecovery()

        val future =
            personnelrecoveryServiceAsync.fileCreate(
                PersonnelrecoveryFileCreateParams.builder()
                    .addBody(
                        PersonnelrecoveryFileCreateParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(PersonnelrecoveryFileCreateParams.Body.DataMode.TEST)
                            .msgTime(OffsetDateTime.parse("2021-10-15T16:00:00.123Z"))
                            .pickupLat(75.1234)
                            .pickupLon(175.1234)
                            .source("Bluestaq")
                            .type("MEDICAL")
                            .id("PERSONNEL_RECOVERY-ID")
                            .authMethod("PASSPORT")
                            .authStatus("NO STATEMENT")
                            .beaconInd(false)
                            .callSign("BADGER")
                            .commEq1("LL PHONE")
                            .commEq2("LL PHONE")
                            .commEq3("LL PHONE")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .executionInfo(
                                PersonnelrecoveryFileCreateParams.Body.ExecutionInfo.builder()
                                    .egress(66.53)
                                    .addEgressPoint(107.23)
                                    .addEgressPoint(30.455)
                                    .escortVehicle(
                                        PersonnelrecoveryFileCreateParams.Body.ExecutionInfo
                                            .EscortVehicle
                                            .builder()
                                            .callSign("FALCO")
                                            .primaryFreq(34.55)
                                            .strength(5)
                                            .type("C17")
                                            .build()
                                    )
                                    .ingress(35.66)
                                    .addInitialPoint(103.23)
                                    .addInitialPoint(30.445)
                                    .objStrategy("Description of strategy plan.")
                                    .recoveryVehicle(
                                        PersonnelrecoveryFileCreateParams.Body.ExecutionInfo
                                            .RecoveryVehicle
                                            .builder()
                                            .callSign("FALCO")
                                            .primaryFreq(34.55)
                                            .strength(5)
                                            .type("C17")
                                            .build()
                                    )
                                    .build()
                            )
                            .identity("NEUTRAL CIVILIAN")
                            .idWeatherReport("WEATHER_REPORT-ID")
                            .milClass("CIVILIAN")
                            .natAlliance(1)
                            .natAlliance1(0)
                            .numAmbulatory(1)
                            .numAmbulatoryInjured(2)
                            .numNonAmbulatory(0)
                            .numPersons(1)
                            .objectiveAreaInfo(
                                PersonnelrecoveryFileCreateParams.Body.ObjectiveAreaInfo.builder()
                                    .addEnemyData(
                                        PersonnelrecoveryFileCreateParams.Body.ObjectiveAreaInfo
                                            .EnemyData
                                            .builder()
                                            .dirToEnemy("NORTHWEST")
                                            .friendliesRemarks("Comments from friendlies.")
                                            .hlzRemarks("Hot Landing Zone remarks.")
                                            .hostileFireType("SMALL ARMS")
                                            .build()
                                    )
                                    .oscCallSign("STARFOX")
                                    .oscFreq(12.55)
                                    .pzDesc("Near the lake.")
                                    .addPzLocation(103.23)
                                    .addPzLocation(30.445)
                                    .build()
                            )
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .pickupAlt(30.1234)
                            .recovId("RECOV-ID")
                            .rxFreq(5.5)
                            .survivorMessages("UNINJURED CANT MOVE HOSTILES NEARBY")
                            .survivorRadio("NO STATEMENT")
                            .termInd(true)
                            .textMsg("Additional message from survivor.")
                            .txFreq(5.5)
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
        val personnelrecoveryServiceAsync = client.personnelrecovery()

        val personnelRecoveryFullLFuture =
            personnelrecoveryServiceAsync.get(
                PersonnelrecoveryGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val personnelRecoveryFullL = personnelRecoveryFullLFuture.get()
        personnelRecoveryFullL.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val personnelrecoveryServiceAsync = client.personnelrecovery()

        val responseFuture = personnelrecoveryServiceAsync.queryhelp()

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
        val personnelrecoveryServiceAsync = client.personnelrecovery()

        val personnelRecoveryFullLsFuture =
            personnelrecoveryServiceAsync.tuple(
                PersonnelrecoveryTupleParams.builder()
                    .columns("columns")
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val personnelRecoveryFullLs = personnelRecoveryFullLsFuture.get()
        personnelRecoveryFullLs.forEach { it.validate() }
    }
}
