// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.AirTaskingOrderFull
import com.unifieddatalibrary.api.models.scs.SearchCriterion
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/unifieddatalibrary-java-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .password("My Password")
                .username("My Username")
                .build()

        assertThat(client).isNotNull()
        assertThat(client.airEvents()).isNotNull()
        assertThat(client.airOperations()).isNotNull()
        assertThat(client.airTransportMissions()).isNotNull()
        assertThat(client.aircraft()).isNotNull()
        assertThat(client.aircraftSorties()).isNotNull()
        assertThat(client.aircraftStatusRemarks()).isNotNull()
        assertThat(client.aircraftStatuses()).isNotNull()
        assertThat(client.airfieldSlotConsumptions()).isNotNull()
        assertThat(client.airfieldSlots()).isNotNull()
        assertThat(client.airfieldStatus()).isNotNull()
        assertThat(client.airfields()).isNotNull()
        assertThat(client.airloadPlans()).isNotNull()
        assertThat(client.airspaceControlOrders()).isNotNull()
        assertThat(client.ais()).isNotNull()
        assertThat(client.aisObjects()).isNotNull()
        assertThat(client.analyticImagery()).isNotNull()
        assertThat(client.antennas()).isNotNull()
        assertThat(client.attitudeData()).isNotNull()
        assertThat(client.attitudeSets()).isNotNull()
        assertThat(client.aviationRiskManagement()).isNotNull()
        assertThat(client.batteries()).isNotNull()
        assertThat(client.batterydetails()).isNotNull()
        assertThat(client.beam()).isNotNull()
        assertThat(client.beamContours()).isNotNull()
        assertThat(client.buses()).isNotNull()
        assertThat(client.channels()).isNotNull()
        assertThat(client.collectRequests()).isNotNull()
        assertThat(client.collectResponses()).isNotNull()
        assertThat(client.comm()).isNotNull()
        assertThat(client.conjunctions()).isNotNull()
        assertThat(client.cots()).isNotNull()
        assertThat(client.countries()).isNotNull()
        assertThat(client.crew()).isNotNull()
        assertThat(client.deconflictset()).isNotNull()
        assertThat(client.diffOfArrival()).isNotNull()
        assertThat(client.diplomaticClearance()).isNotNull()
        assertThat(client.driftHistory()).isNotNull()
        assertThat(client.dropzone()).isNotNull()
        assertThat(client.ecpedr()).isNotNull()
        assertThat(client.effectRequests()).isNotNull()
        assertThat(client.effectResponses()).isNotNull()
        assertThat(client.elsets()).isNotNull()
        assertThat(client.emireport()).isNotNull()
        assertThat(client.emitterGeolocation()).isNotNull()
        assertThat(client.engineDetails()).isNotNull()
        assertThat(client.engines()).isNotNull()
        assertThat(client.entities()).isNotNull()
        assertThat(client.eop()).isNotNull()
        assertThat(client.ephemeris()).isNotNull()
        assertThat(client.ephemerisSets()).isNotNull()
        assertThat(client.equipment()).isNotNull()
        assertThat(client.equipmentRemarks()).isNotNull()
        assertThat(client.evac()).isNotNull()
        assertThat(client.eventEvolution()).isNotNull()
        assertThat(client.featureAssessment()).isNotNull()
        assertThat(client.flightplan()).isNotNull()
        assertThat(client.geoStatus()).isNotNull()
        assertThat(client.globalAtmosphericModel()).isNotNull()
        assertThat(client.gnssObservations()).isNotNull()
        assertThat(client.gnssObservationset()).isNotNull()
        assertThat(client.gnssRawIf()).isNotNull()
        assertThat(client.groundImagery()).isNotNull()
        assertThat(client.h3Geo()).isNotNull()
        assertThat(client.h3GeoHexCell()).isNotNull()
        assertThat(client.hazard()).isNotNull()
        assertThat(client.ionoObservations()).isNotNull()
        assertThat(client.ir()).isNotNull()
        assertThat(client.isrCollections()).isNotNull()
        assertThat(client.item()).isNotNull()
        assertThat(client.itemTrackings()).isNotNull()
        assertThat(client.laserdeconflictrequest()).isNotNull()
        assertThat(client.laseremitter()).isNotNull()
        assertThat(client.launchDetection()).isNotNull()
        assertThat(client.launchEvent()).isNotNull()
        assertThat(client.launchSite()).isNotNull()
        assertThat(client.launchSiteDetails()).isNotNull()
        assertThat(client.launchVehicle()).isNotNull()
        assertThat(client.launchVehicleDetails()).isNotNull()
        assertThat(client.linkStatus()).isNotNull()
        assertThat(client.linkstatus()).isNotNull()
        assertThat(client.location()).isNotNull()
        assertThat(client.logisticsSupport()).isNotNull()
        assertThat(client.maneuvers()).isNotNull()
        assertThat(client.manifold()).isNotNull()
        assertThat(client.manifoldelset()).isNotNull()
        assertThat(client.missileTracks()).isNotNull()
        assertThat(client.missionAssignment()).isNotNull()
        assertThat(client.mti()).isNotNull()
        assertThat(client.navigation()).isNotNull()
        assertThat(client.navigationalObstruction()).isNotNull()
        assertThat(client.notification()).isNotNull()
        assertThat(client.objectOfInterest()).isNotNull()
        assertThat(client.observations()).isNotNull()
        assertThat(client.onboardnavigation()).isNotNull()
        assertThat(client.onorbit()).isNotNull()
        assertThat(client.onorbitantenna()).isNotNull()
        assertThat(client.onorbitbattery()).isNotNull()
        assertThat(client.onorbitdetails()).isNotNull()
        assertThat(client.onorbitevent()).isNotNull()
        assertThat(client.onorbitlist()).isNotNull()
        assertThat(client.onorbitsolararray()).isNotNull()
        assertThat(client.onorbitthruster()).isNotNull()
        assertThat(client.onorbitthrusterstatus()).isNotNull()
        assertThat(client.operatingunit()).isNotNull()
        assertThat(client.operatingunitremark()).isNotNull()
        assertThat(client.orbitdetermination()).isNotNull()
        assertThat(client.orbittrack()).isNotNull()
        assertThat(client.organization()).isNotNull()
        assertThat(client.organizationdetails()).isNotNull()
        assertThat(client.personnelrecovery()).isNotNull()
        assertThat(client.poi()).isNotNull()
        assertThat(client.port()).isNotNull()
        assertThat(client.reportAndActivities()).isNotNull()
        assertThat(client.rfBand()).isNotNull()
        assertThat(client.rfBandType()).isNotNull()
        assertThat(client.rfEmitter()).isNotNull()
        assertThat(client.routeStats()).isNotNull()
        assertThat(client.sarObservation()).isNotNull()
        assertThat(client.scientific()).isNotNull()
        assertThat(client.scs()).isNotNull()
        assertThat(client.secureMessaging()).isNotNull()
        assertThat(client.sensor()).isNotNull()
        assertThat(client.sensorMaintenance()).isNotNull()
        assertThat(client.sensorObservationType()).isNotNull()
        assertThat(client.sensorPlan()).isNotNull()
        assertThat(client.sensorType()).isNotNull()
        assertThat(client.seraDataCommDetails()).isNotNull()
        assertThat(client.seraDataEarlyWarning()).isNotNull()
        assertThat(client.seraDataNavigation()).isNotNull()
        assertThat(client.seradataOpticalPayload()).isNotNull()
        assertThat(client.seradataRadarPayload()).isNotNull()
        assertThat(client.seradataSigintPayload()).isNotNull()
        assertThat(client.seradataSpacecraftDetails()).isNotNull()
        assertThat(client.sgi()).isNotNull()
        assertThat(client.sigact()).isNotNull()
        assertThat(client.site()).isNotNull()
        assertThat(client.siteRemark()).isNotNull()
        assertThat(client.siteStatus()).isNotNull()
        assertThat(client.skyImagery()).isNotNull()
        assertThat(client.soiObservationSet()).isNotNull()
        assertThat(client.solarArray()).isNotNull()
        assertThat(client.solarArrayDetails()).isNotNull()
        assertThat(client.sortiePpr()).isNotNull()
        assertThat(client.spaceEnvObservation()).isNotNull()
        assertThat(client.stage()).isNotNull()
        assertThat(client.starCatalog()).isNotNull()
        assertThat(client.stateVector()).isNotNull()
        assertThat(client.status()).isNotNull()
        assertThat(client.substatus()).isNotNull()
        assertThat(client.supportingData()).isNotNull()
        assertThat(client.surface()).isNotNull()
        assertThat(client.surfaceObstruction()).isNotNull()
        assertThat(client.swir()).isNotNull()
        assertThat(client.taiUtc()).isNotNull()
        assertThat(client.tdoaFdoa()).isNotNull()
        assertThat(client.track()).isNotNull()
        assertThat(client.trackDetails()).isNotNull()
        assertThat(client.trackRoute()).isNotNull()
        assertThat(client.transponder()).isNotNull()
        assertThat(client.user()).isNotNull()
        assertThat(client.vessel()).isNotNull()
        assertThat(client.video()).isNotNull()
        assertThat(client.weatherData()).isNotNull()
        assertThat(client.weatherReport()).isNotNull()
    }

    @Test
    fun airTaskingOrderFullRoundtrip() {
        val jsonMapper = jsonMapper()
        val airTaskingOrderFull =
            AirTaskingOrderFull.builder()
                .beginTs(OffsetDateTime.parse("2023-10-25T12:00:00.123Z"))
                .classificationMarking("U")
                .dataMode(AirTaskingOrderFull.DataMode.TEST)
                .opExerName("DESERT WIND")
                .source("Bluestaq")
                .id("POI-ID")
                .ackReqInd("YES")
                .ackUnitInstructions("INST:45TS")
                .addAcMsnTasking(
                    AirTaskingOrderFull.AcMsnTasking.builder()
                        .countryCode("US")
                        .taskedService("A")
                        .unitDesignator("AMPHIB5DIV")
                        .addAcMsnLocSeg(
                            AirTaskingOrderFull.AcMsnTasking.AcMsnLocSeg.builder()
                                .startTime(OffsetDateTime.parse("2021-10-25T12:00:00.123Z"))
                                .airMsnPri("1A")
                                .alt(210)
                                .areaGeoRad(1000)
                                .endTime(OffsetDateTime.parse("2021-10-25T12:00:00.123Z"))
                                .msnLocName("KLSV")
                                .msnLocPtBarT("330T-PT ALFA-50NM")
                                .msnLocPtLat(35.123)
                                .msnLocPtLon(79.01)
                                .msnLocPtName("PT ALFA")
                                .build()
                        )
                        .alertStatus(30)
                        .amcMsnNum("AMC:JJXD123HA045")
                        .depLocLat(35.123)
                        .depLocLon(79.2354)
                        .depLocName("ICAO:KBIF")
                        .depLocUtm("32WDL123123")
                        .depTime(OffsetDateTime.parse("2021-10-25T12:00:00.123Z"))
                        .addIndAcTasking(
                            AirTaskingOrderFull.AcMsnTasking.IndAcTasking.builder()
                                .acftType("F35A")
                                .callSign("EAGLE47")
                                .iffSifMode1Code("111")
                                .iffSifMode2Code("20147")
                                .iffSifMode3Code("30147")
                                .addJuAddress(12345)
                                .addJuAddress(65432)
                                .link16CallSign("EE47")
                                .numAcft(2)
                                .priConfigCode("6A2W3")
                                .secConfigCode("2S2WG")
                                .tacanChan(123)
                                .build()
                        )
                        .msnCommander("MC")
                        .msnNum("D123HA")
                        .pkgId("ZZ")
                        .priMsnType("CAS")
                        .addRcvyLocLat(48.8584)
                        .addRcvyLocLat(40.7554)
                        .addRcvyLocLon(2.2945)
                        .addRcvyLocLon(-73.9866)
                        .addRcvyLocName("ARRLOC:KBIF")
                        .addRcvyLocName("ARRLOC:KDZ7")
                        .addRcvyLocUtm("ARRUTMO:32WDL123123")
                        .addRcvyLocUtm("ARRUTMO:32WDL321321")
                        .addRcvyTime(OffsetDateTime.parse("2021-10-25T16:00:00.234Z"))
                        .addRcvyTime(OffsetDateTime.parse("2021-10-26T16:00:00.234Z"))
                        .resMsnInd("N")
                        .secMsnType("SEAD")
                        .unitLocName("ICAO:KXXQ")
                        .build()
                )
                .endTs(OffsetDateTime.parse("2023-10-27T12:00:00.123Z"))
                .addGenText(
                    AirTaskingOrderFull.GenText.builder()
                        .text("FREE-TEXT")
                        .textInd("OPENING REMARKS")
                        .build()
                )
                .msgMonth("OCT")
                .msgOriginator("USCENTCOM")
                .msgQualifier("CHG")
                .msgSn("ATO A")
                .addNavalFltOp(
                    AirTaskingOrderFull.NavalFltOp.builder()
                        .shipName("USS WASP")
                        .fltOpStart(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                        .fltOpStop(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                        .addSchdLaunchRcvyTime(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .build()

        val roundtrippedAirTaskingOrderFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airTaskingOrderFull),
                jacksonTypeRef<AirTaskingOrderFull>(),
            )

        assertThat(roundtrippedAirTaskingOrderFull).isEqualTo(airTaskingOrderFull)
    }

    @Test
    fun searchCriterionRoundtrip() {
        val jsonMapper = jsonMapper()
        val searchCriterion =
            SearchCriterion.ofScsSearchField(
                SearchCriterion.ScsSearchFieldCriterion.builder()
                    .field("field")
                    .operator(SearchCriterion.ScsSearchFieldCriterion.Operator.EXACT_MATCH)
                    .value("value")
                    .build()
            )

        val roundtrippedSearchCriterion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(searchCriterion),
                jacksonTypeRef<SearchCriterion>(),
            )

        assertThat(roundtrippedSearchCriterion).isEqualTo(searchCriterion)
    }
}
