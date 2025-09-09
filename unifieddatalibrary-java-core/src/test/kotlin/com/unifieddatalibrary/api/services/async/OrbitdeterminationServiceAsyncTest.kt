// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCountParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateBulkParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationCreateParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationGetParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrbitdeterminationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val orbitdeterminationServiceAsync = client.orbitdetermination()

        val future =
            orbitdeterminationServiceAsync.create(
                OrbitdeterminationCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(OrbitdeterminationCreateParams.DataMode.TEST)
                    .endTime(OffsetDateTime.parse("2023-08-28T15:20:21.247192Z"))
                    .initialOd(false)
                    .method("BLS")
                    .source("Bluestaq")
                    .startTime(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .addAcceptedObId("EOOBSERVATION-ID1")
                    .addAcceptedObId("RADAROBSERVATION-ID1")
                    .addAcceptedObTyp("EO")
                    .addAcceptedObTyp("RADAR")
                    .agomEst(false)
                    .agomModel("RandomWalk")
                    .aprioriElset(
                        OrbitdeterminationCreateParams.AprioriElset.builder()
                            .classificationMarking("U")
                            .dataMode(OrbitdeterminationCreateParams.AprioriElset.DataMode.TEST)
                            .epoch(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .source("Bluestaq")
                            .agom(0.0126)
                            .algorithm("Example algorithm")
                            .apogee(1.1)
                            .argOfPerigee(1.1)
                            .ballisticCoeff(0.00815)
                            .bStar(1.1)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .descriptor("Example description")
                            .eccentricity(0.333)
                            .ephemType(1L)
                            .idElset("ELSET-ID")
                            .idOnOrbit("ONORBIT-ID")
                            .idOrbitDetermination("026dd511-8ba5-47d3-9909-836149f87686")
                            .inclination(45.1)
                            .line1("Example line1")
                            .line2("Example line2")
                            .meanAnomaly(179.1)
                            .meanMotion(1.1)
                            .meanMotionDDot(1.1)
                            .meanMotionDot(1.1)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("ORIGOBJECT-ID")
                            .perigee(1.1)
                            .period(1.1)
                            .raan(1.1)
                            .rawFileUri("Example URI")
                            .revNo(111)
                            .satNo(12)
                            .semiMajorAxis(1.1)
                            .addSourcedData("OBSERVATION_UUID1")
                            .addSourcedData("OBSERVATION_UUID2")
                            .addSourcedDataType(
                                OrbitdeterminationCreateParams.AprioriElset.SourcedDataType.RADAR
                            )
                            .addSourcedDataType(
                                OrbitdeterminationCreateParams.AprioriElset.SourcedDataType.RF
                            )
                            .sourceDl("AXE")
                            .addTag("PROVIDER_TAG1")
                            .addTag("PROVIDER_TAG2")
                            .transactionId("TRANSACTION-ID")
                            .uct(false)
                            .build()
                    )
                    .aprioriIdElset("80e544b7-6a17-4554-8abf-7301e98f8e5d")
                    .aprioriIdStateVector("6e291992-8ae3-4592-bb0f-055715bf4803")
                    .aprioriStateVector(
                        OrbitdeterminationCreateParams.AprioriStateVector.builder()
                            .classificationMarking("U")
                            .dataMode(
                                OrbitdeterminationCreateParams.AprioriStateVector.DataMode.TEST
                            )
                            .epoch(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .source("Bluestaq")
                            .actualOdSpan(3.5)
                            .algorithm("SAMPLE_ALGORITHM")
                            .alt1ReferenceFrame("TEME")
                            .alt2ReferenceFrame("EFG/TDR")
                            .area(5.065)
                            .bDot(1.23)
                            .cmOffset(1.23)
                            .cov(listOf(1.1, 2.4, 3.8, 4.2, 5.5, 6.0))
                            .covMethod("CALCULATED")
                            .covReferenceFrame(
                                OrbitdeterminationCreateParams.AprioriStateVector.CovReferenceFrame
                                    .J2000
                            )
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .descriptor("descriptor")
                            .dragArea(4.739)
                            .dragCoeff(0.0224391269775)
                            .dragModel("JAC70")
                            .edr(1.23)
                            .addEqCov(1.1)
                            .addEqCov(2.2)
                            .errorControl(1.23)
                            .fixedStep(true)
                            .geopotentialModel("EGM-96")
                            .iau1980Terms(4)
                            .idOnOrbit("ONORBIT-ID")
                            .idOrbitDetermination("026dd511-8ba5-47d3-9909-836149f87686")
                            .idStateVector("STATEVECTOR-ID")
                            .integratorMode("integratorMode")
                            .inTrackThrust(true)
                            .lastObEnd(OffsetDateTime.parse("2022-11-09T11:20:21.247192Z"))
                            .lastObStart(OffsetDateTime.parse("2022-11-09T11:20:21.247192Z"))
                            .leapSecondTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                            .lunarSolar(true)
                            .mass(164.5)
                            .obsAvailable(376)
                            .obsUsed(374)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("ORIGOBJECT-ID")
                            .partials("ANALYTIC")
                            .pedigree("CONJUNCTION")
                            .polarMotionX(1.23)
                            .polarMotionY(1.23)
                            .posUnc(0.333399744452)
                            .rawFileUri("rawFileURI")
                            .recOdSpan(3.5)
                            .referenceFrame(
                                OrbitdeterminationCreateParams.AprioriStateVector.ReferenceFrame
                                    .J2000
                            )
                            .residualsAcc(99.5)
                            .revNo(7205)
                            .rms(0.991)
                            .satNo(12)
                            .addSigmaPosUvw(1.23)
                            .addSigmaPosUvw(4.56)
                            .addSigmaVelUvw(1.23)
                            .addSigmaVelUvw(4.56)
                            .solarFluxApAvg(1.23)
                            .solarFluxF10(1.23)
                            .solarFluxF10Avg(1.23)
                            .solarRadPress(true)
                            .solarRadPressCoeff(0.0244394)
                            .solidEarthTides(true)
                            .addSourcedData("DATA1")
                            .addSourcedData("DATA2")
                            .addSourcedDataType(
                                OrbitdeterminationCreateParams.AprioriStateVector.SourcedDataType
                                    .RADAR
                            )
                            .sourceDl("AXE")
                            .srpArea(4.311)
                            .stepMode("AUTO")
                            .stepSize(1.23)
                            .stepSizeSelection("AUTO")
                            .addTag("TAG1")
                            .addTag("TAG2")
                            .taiUtc(1.23)
                            .thrustAccel(1.23)
                            .tracksAvail(163)
                            .tracksUsed(163)
                            .transactionId("transactionId")
                            .uct(true)
                            .ut1Rate(1.23)
                            .ut1Utc(1.23)
                            .velUnc(0.000004)
                            .xaccel(-2.12621392)
                            .xpos(-1118.577381)
                            .xposAlt1(-1145.688502)
                            .xposAlt2(-1456.915926)
                            .xvel(-4.25242784)
                            .xvelAlt1(-4.270832252)
                            .xvelAlt2(-1.219814294)
                            .yaccel(2.645553717)
                            .ypos(3026.231084)
                            .yposAlt1(3020.729572)
                            .yposAlt2(-2883.540406)
                            .yvel(5.291107434)
                            .yvelAlt1(5.27074276)
                            .yvelAlt2(-6.602080212)
                            .zaccel(-1.06310696)
                            .zpos(6167.831808)
                            .zposAlt1(6165.55187)
                            .zposAlt2(6165.55187)
                            .zvel(-3.356493869)
                            .zvelAlt1(-3.365155181)
                            .zvelAlt2(-3.365155181)
                            .build()
                    )
                    .ballisticCoeffEst(false)
                    .ballisticCoeffModel("GaussMarkov")
                    .bestPassWrms(0.975)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .edr(1.23)
                    .effectiveFrom(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                    .effectiveUntil(OffsetDateTime.parse("2023-08-30T08:15:00.123456Z"))
                    .errorGrowthRate(1.23)
                    .firstPassWrms(0.985)
                    .fitSpan(0.6)
                    .idOnOrbit("54741")
                    .lastObEnd(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                    .lastObStart(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                    .methodSource("ASW")
                    .numIterations(8)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origObjectId("ORIGOBJECT-ID")
                    .previousWrms(1.02)
                    .addRejectedObId("DIFFOFARRIVAL-ID2")
                    .addRejectedObId("RFOBSERVATION-ID2")
                    .addRejectedObTyp("DOA")
                    .addRejectedObTyp("RF")
                    .rmsConvergenceCriteria(0.001)
                    .satNo(54741)
                    .addSensorId("SENSOR-ID1")
                    .addSensorId("SENSOR-ID2")
                    .sourceDl("AXE")
                    .timeSpan(3.5)
                    .wrms(0.991)
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
        val orbitdeterminationServiceAsync = client.orbitdetermination()

        val pageFuture = orbitdeterminationServiceAsync.list()

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
        val orbitdeterminationServiceAsync = client.orbitdetermination()

        val responseFuture =
            orbitdeterminationServiceAsync.count(
                OrbitdeterminationCountParams.builder()
                    .firstResult(0L)
                    .idOnOrbit("idOnOrbit")
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
        val orbitdeterminationServiceAsync = client.orbitdetermination()

        val future =
            orbitdeterminationServiceAsync.createBulk(
                OrbitdeterminationCreateBulkParams.builder()
                    .addBody(
                        OrbitdeterminationCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(OrbitdeterminationCreateBulkParams.Body.DataMode.TEST)
                            .endTime(OffsetDateTime.parse("2023-08-28T15:20:21.247192Z"))
                            .initialOd(false)
                            .method("BLS")
                            .source("Bluestaq")
                            .startTime(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                            .id("026dd511-8ba5-47d3-9909-836149f87686")
                            .addAcceptedObId("EOOBSERVATION-ID1")
                            .addAcceptedObId("RADAROBSERVATION-ID1")
                            .addAcceptedObTyp("EO")
                            .addAcceptedObTyp("RADAR")
                            .agomEst(false)
                            .agomModel("RandomWalk")
                            .aprioriElset(
                                OrbitdeterminationCreateBulkParams.Body.AprioriElset.builder()
                                    .classificationMarking("U")
                                    .dataMode(
                                        OrbitdeterminationCreateBulkParams.Body.AprioriElset
                                            .DataMode
                                            .TEST
                                    )
                                    .epoch(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                                    .source("Bluestaq")
                                    .agom(0.0126)
                                    .algorithm("Example algorithm")
                                    .apogee(1.1)
                                    .argOfPerigee(1.1)
                                    .ballisticCoeff(0.00815)
                                    .bStar(1.1)
                                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                    .createdBy("some.user")
                                    .descriptor("Example description")
                                    .eccentricity(0.333)
                                    .ephemType(1L)
                                    .idElset("ELSET-ID")
                                    .idOnOrbit("ONORBIT-ID")
                                    .idOrbitDetermination("026dd511-8ba5-47d3-9909-836149f87686")
                                    .inclination(45.1)
                                    .line1("Example line1")
                                    .line2("Example line2")
                                    .meanAnomaly(179.1)
                                    .meanMotion(1.1)
                                    .meanMotionDDot(1.1)
                                    .meanMotionDot(1.1)
                                    .origin("THIRD_PARTY_DATASOURCE")
                                    .origNetwork("OPS1")
                                    .origObjectId("ORIGOBJECT-ID")
                                    .perigee(1.1)
                                    .period(1.1)
                                    .raan(1.1)
                                    .rawFileUri("Example URI")
                                    .revNo(111)
                                    .satNo(12)
                                    .semiMajorAxis(1.1)
                                    .addSourcedData("OBSERVATION_UUID1")
                                    .addSourcedData("OBSERVATION_UUID2")
                                    .addSourcedDataType(
                                        OrbitdeterminationCreateBulkParams.Body.AprioriElset
                                            .SourcedDataType
                                            .RADAR
                                    )
                                    .addSourcedDataType(
                                        OrbitdeterminationCreateBulkParams.Body.AprioriElset
                                            .SourcedDataType
                                            .RF
                                    )
                                    .sourceDl("AXE")
                                    .addTag("PROVIDER_TAG1")
                                    .addTag("PROVIDER_TAG2")
                                    .transactionId("TRANSACTION-ID")
                                    .uct(false)
                                    .build()
                            )
                            .aprioriIdElset("80e544b7-6a17-4554-8abf-7301e98f8e5d")
                            .aprioriIdStateVector("6e291992-8ae3-4592-bb0f-055715bf4803")
                            .aprioriStateVector(
                                OrbitdeterminationCreateBulkParams.Body.AprioriStateVector.builder()
                                    .classificationMarking("U")
                                    .dataMode(
                                        OrbitdeterminationCreateBulkParams.Body.AprioriStateVector
                                            .DataMode
                                            .TEST
                                    )
                                    .epoch(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                                    .source("Bluestaq")
                                    .actualOdSpan(3.5)
                                    .algorithm("SAMPLE_ALGORITHM")
                                    .alt1ReferenceFrame("TEME")
                                    .alt2ReferenceFrame("EFG/TDR")
                                    .area(5.065)
                                    .bDot(1.23)
                                    .cmOffset(1.23)
                                    .cov(listOf(1.1, 2.4, 3.8, 4.2, 5.5, 6.0))
                                    .covMethod("CALCULATED")
                                    .covReferenceFrame(
                                        OrbitdeterminationCreateBulkParams.Body.AprioriStateVector
                                            .CovReferenceFrame
                                            .J2000
                                    )
                                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                    .createdBy("some.user")
                                    .descriptor("descriptor")
                                    .dragArea(4.739)
                                    .dragCoeff(0.0224391269775)
                                    .dragModel("JAC70")
                                    .edr(1.23)
                                    .addEqCov(1.1)
                                    .addEqCov(2.2)
                                    .errorControl(1.23)
                                    .fixedStep(true)
                                    .geopotentialModel("EGM-96")
                                    .iau1980Terms(4)
                                    .idOnOrbit("ONORBIT-ID")
                                    .idOrbitDetermination("026dd511-8ba5-47d3-9909-836149f87686")
                                    .idStateVector("STATEVECTOR-ID")
                                    .integratorMode("integratorMode")
                                    .inTrackThrust(true)
                                    .lastObEnd(OffsetDateTime.parse("2022-11-09T11:20:21.247192Z"))
                                    .lastObStart(
                                        OffsetDateTime.parse("2022-11-09T11:20:21.247192Z")
                                    )
                                    .leapSecondTime(
                                        OffsetDateTime.parse("2021-01-01T01:01:01.123Z")
                                    )
                                    .lunarSolar(true)
                                    .mass(164.5)
                                    .obsAvailable(376)
                                    .obsUsed(374)
                                    .origin("THIRD_PARTY_DATASOURCE")
                                    .origNetwork("OPS1")
                                    .origObjectId("ORIGOBJECT-ID")
                                    .partials("ANALYTIC")
                                    .pedigree("CONJUNCTION")
                                    .polarMotionX(1.23)
                                    .polarMotionY(1.23)
                                    .posUnc(0.333399744452)
                                    .rawFileUri("rawFileURI")
                                    .recOdSpan(3.5)
                                    .referenceFrame(
                                        OrbitdeterminationCreateBulkParams.Body.AprioriStateVector
                                            .ReferenceFrame
                                            .J2000
                                    )
                                    .residualsAcc(99.5)
                                    .revNo(7205)
                                    .rms(0.991)
                                    .satNo(12)
                                    .addSigmaPosUvw(1.23)
                                    .addSigmaPosUvw(4.56)
                                    .addSigmaVelUvw(1.23)
                                    .addSigmaVelUvw(4.56)
                                    .solarFluxApAvg(1.23)
                                    .solarFluxF10(1.23)
                                    .solarFluxF10Avg(1.23)
                                    .solarRadPress(true)
                                    .solarRadPressCoeff(0.0244394)
                                    .solidEarthTides(true)
                                    .addSourcedData("DATA1")
                                    .addSourcedData("DATA2")
                                    .addSourcedDataType(
                                        OrbitdeterminationCreateBulkParams.Body.AprioriStateVector
                                            .SourcedDataType
                                            .RADAR
                                    )
                                    .sourceDl("AXE")
                                    .srpArea(4.311)
                                    .stepMode("AUTO")
                                    .stepSize(1.23)
                                    .stepSizeSelection("AUTO")
                                    .addTag("TAG1")
                                    .addTag("TAG2")
                                    .taiUtc(1.23)
                                    .thrustAccel(1.23)
                                    .tracksAvail(163)
                                    .tracksUsed(163)
                                    .transactionId("transactionId")
                                    .uct(true)
                                    .ut1Rate(1.23)
                                    .ut1Utc(1.23)
                                    .velUnc(0.000004)
                                    .xaccel(-2.12621392)
                                    .xpos(-1118.577381)
                                    .xposAlt1(-1145.688502)
                                    .xposAlt2(-1456.915926)
                                    .xvel(-4.25242784)
                                    .xvelAlt1(-4.270832252)
                                    .xvelAlt2(-1.219814294)
                                    .yaccel(2.645553717)
                                    .ypos(3026.231084)
                                    .yposAlt1(3020.729572)
                                    .yposAlt2(-2883.540406)
                                    .yvel(5.291107434)
                                    .yvelAlt1(5.27074276)
                                    .yvelAlt2(-6.602080212)
                                    .zaccel(-1.06310696)
                                    .zpos(6167.831808)
                                    .zposAlt1(6165.55187)
                                    .zposAlt2(6165.55187)
                                    .zvel(-3.356493869)
                                    .zvelAlt1(-3.365155181)
                                    .zvelAlt2(-3.365155181)
                                    .build()
                            )
                            .ballisticCoeffEst(false)
                            .ballisticCoeffModel("GaussMarkov")
                            .bestPassWrms(0.975)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .edr(1.23)
                            .effectiveFrom(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                            .effectiveUntil(OffsetDateTime.parse("2023-08-30T08:15:00.123456Z"))
                            .errorGrowthRate(1.23)
                            .firstPassWrms(0.985)
                            .fitSpan(0.6)
                            .idOnOrbit("54741")
                            .lastObEnd(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                            .lastObStart(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                            .methodSource("ASW")
                            .numIterations(8)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("ORIGOBJECT-ID")
                            .previousWrms(1.02)
                            .addRejectedObId("DIFFOFARRIVAL-ID2")
                            .addRejectedObId("RFOBSERVATION-ID2")
                            .addRejectedObTyp("DOA")
                            .addRejectedObTyp("RF")
                            .rmsConvergenceCriteria(0.001)
                            .satNo(54741)
                            .addSensorId("SENSOR-ID1")
                            .addSensorId("SENSOR-ID2")
                            .sourceDl("AXE")
                            .timeSpan(3.5)
                            .wrms(0.991)
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
        val orbitdeterminationServiceAsync = client.orbitdetermination()

        val orbitdeterminationFuture =
            orbitdeterminationServiceAsync.get(
                OrbitdeterminationGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val orbitdetermination = orbitdeterminationFuture.get()
        orbitdetermination.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val orbitdeterminationServiceAsync = client.orbitdetermination()

        val responseFuture = orbitdeterminationServiceAsync.queryhelp()

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
        val orbitdeterminationServiceAsync = client.orbitdetermination()

        val responseFuture =
            orbitdeterminationServiceAsync.tuple(
                OrbitdeterminationTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .idOnOrbit("idOnOrbit")
                    .maxResults(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val orbitdeterminationServiceAsync = client.orbitdetermination()

        val future =
            orbitdeterminationServiceAsync.unvalidatedPublish(
                OrbitdeterminationUnvalidatedPublishParams.builder()
                    .addBody(
                        OrbitdeterminationUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(OrbitdeterminationUnvalidatedPublishParams.Body.DataMode.TEST)
                            .endTime(OffsetDateTime.parse("2023-08-28T15:20:21.247192Z"))
                            .initialOd(false)
                            .method("BLS")
                            .source("Bluestaq")
                            .startTime(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                            .id("026dd511-8ba5-47d3-9909-836149f87686")
                            .addAcceptedObId("EOOBSERVATION-ID1")
                            .addAcceptedObId("RADAROBSERVATION-ID1")
                            .addAcceptedObTyp("EO")
                            .addAcceptedObTyp("RADAR")
                            .agomEst(false)
                            .agomModel("RandomWalk")
                            .aprioriElset(
                                OrbitdeterminationUnvalidatedPublishParams.Body.AprioriElset
                                    .builder()
                                    .classificationMarking("U")
                                    .dataMode(
                                        OrbitdeterminationUnvalidatedPublishParams.Body.AprioriElset
                                            .DataMode
                                            .TEST
                                    )
                                    .epoch(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                                    .source("Bluestaq")
                                    .agom(0.0126)
                                    .algorithm("Example algorithm")
                                    .apogee(1.1)
                                    .argOfPerigee(1.1)
                                    .ballisticCoeff(0.00815)
                                    .bStar(1.1)
                                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                    .createdBy("some.user")
                                    .descriptor("Example description")
                                    .eccentricity(0.333)
                                    .ephemType(1L)
                                    .idElset("ELSET-ID")
                                    .idOnOrbit("ONORBIT-ID")
                                    .idOrbitDetermination("026dd511-8ba5-47d3-9909-836149f87686")
                                    .inclination(45.1)
                                    .line1("Example line1")
                                    .line2("Example line2")
                                    .meanAnomaly(179.1)
                                    .meanMotion(1.1)
                                    .meanMotionDDot(1.1)
                                    .meanMotionDot(1.1)
                                    .origin("THIRD_PARTY_DATASOURCE")
                                    .origNetwork("OPS1")
                                    .origObjectId("ORIGOBJECT-ID")
                                    .perigee(1.1)
                                    .period(1.1)
                                    .raan(1.1)
                                    .rawFileUri("Example URI")
                                    .revNo(111)
                                    .satNo(12)
                                    .semiMajorAxis(1.1)
                                    .addSourcedData("OBSERVATION_UUID1")
                                    .addSourcedData("OBSERVATION_UUID2")
                                    .addSourcedDataType(
                                        OrbitdeterminationUnvalidatedPublishParams.Body.AprioriElset
                                            .SourcedDataType
                                            .RADAR
                                    )
                                    .addSourcedDataType(
                                        OrbitdeterminationUnvalidatedPublishParams.Body.AprioriElset
                                            .SourcedDataType
                                            .RF
                                    )
                                    .sourceDl("AXE")
                                    .addTag("PROVIDER_TAG1")
                                    .addTag("PROVIDER_TAG2")
                                    .transactionId("TRANSACTION-ID")
                                    .uct(false)
                                    .build()
                            )
                            .aprioriIdElset("80e544b7-6a17-4554-8abf-7301e98f8e5d")
                            .aprioriIdStateVector("6e291992-8ae3-4592-bb0f-055715bf4803")
                            .aprioriStateVector(
                                OrbitdeterminationUnvalidatedPublishParams.Body.AprioriStateVector
                                    .builder()
                                    .classificationMarking("U")
                                    .dataMode(
                                        OrbitdeterminationUnvalidatedPublishParams.Body
                                            .AprioriStateVector
                                            .DataMode
                                            .TEST
                                    )
                                    .epoch(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                                    .source("Bluestaq")
                                    .actualOdSpan(3.5)
                                    .algorithm("SAMPLE_ALGORITHM")
                                    .alt1ReferenceFrame("TEME")
                                    .alt2ReferenceFrame("EFG/TDR")
                                    .area(5.065)
                                    .bDot(1.23)
                                    .cmOffset(1.23)
                                    .cov(listOf(1.1, 2.4, 3.8, 4.2, 5.5, 6.0))
                                    .covMethod("CALCULATED")
                                    .covReferenceFrame(
                                        OrbitdeterminationUnvalidatedPublishParams.Body
                                            .AprioriStateVector
                                            .CovReferenceFrame
                                            .J2000
                                    )
                                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                                    .createdBy("some.user")
                                    .descriptor("descriptor")
                                    .dragArea(4.739)
                                    .dragCoeff(0.0224391269775)
                                    .dragModel("JAC70")
                                    .edr(1.23)
                                    .addEqCov(1.1)
                                    .addEqCov(2.2)
                                    .errorControl(1.23)
                                    .fixedStep(true)
                                    .geopotentialModel("EGM-96")
                                    .iau1980Terms(4)
                                    .idOnOrbit("ONORBIT-ID")
                                    .idOrbitDetermination("026dd511-8ba5-47d3-9909-836149f87686")
                                    .idStateVector("STATEVECTOR-ID")
                                    .integratorMode("integratorMode")
                                    .inTrackThrust(true)
                                    .lastObEnd(OffsetDateTime.parse("2022-11-09T11:20:21.247192Z"))
                                    .lastObStart(
                                        OffsetDateTime.parse("2022-11-09T11:20:21.247192Z")
                                    )
                                    .leapSecondTime(
                                        OffsetDateTime.parse("2021-01-01T01:01:01.123Z")
                                    )
                                    .lunarSolar(true)
                                    .mass(164.5)
                                    .obsAvailable(376)
                                    .obsUsed(374)
                                    .origin("THIRD_PARTY_DATASOURCE")
                                    .origNetwork("OPS1")
                                    .origObjectId("ORIGOBJECT-ID")
                                    .partials("ANALYTIC")
                                    .pedigree("CONJUNCTION")
                                    .polarMotionX(1.23)
                                    .polarMotionY(1.23)
                                    .posUnc(0.333399744452)
                                    .rawFileUri("rawFileURI")
                                    .recOdSpan(3.5)
                                    .referenceFrame(
                                        OrbitdeterminationUnvalidatedPublishParams.Body
                                            .AprioriStateVector
                                            .ReferenceFrame
                                            .J2000
                                    )
                                    .residualsAcc(99.5)
                                    .revNo(7205)
                                    .rms(0.991)
                                    .satNo(12)
                                    .addSigmaPosUvw(1.23)
                                    .addSigmaPosUvw(4.56)
                                    .addSigmaVelUvw(1.23)
                                    .addSigmaVelUvw(4.56)
                                    .solarFluxApAvg(1.23)
                                    .solarFluxF10(1.23)
                                    .solarFluxF10Avg(1.23)
                                    .solarRadPress(true)
                                    .solarRadPressCoeff(0.0244394)
                                    .solidEarthTides(true)
                                    .addSourcedData("DATA1")
                                    .addSourcedData("DATA2")
                                    .addSourcedDataType(
                                        OrbitdeterminationUnvalidatedPublishParams.Body
                                            .AprioriStateVector
                                            .SourcedDataType
                                            .RADAR
                                    )
                                    .sourceDl("AXE")
                                    .srpArea(4.311)
                                    .stepMode("AUTO")
                                    .stepSize(1.23)
                                    .stepSizeSelection("AUTO")
                                    .addTag("TAG1")
                                    .addTag("TAG2")
                                    .taiUtc(1.23)
                                    .thrustAccel(1.23)
                                    .tracksAvail(163)
                                    .tracksUsed(163)
                                    .transactionId("transactionId")
                                    .uct(true)
                                    .ut1Rate(1.23)
                                    .ut1Utc(1.23)
                                    .velUnc(0.000004)
                                    .xaccel(-2.12621392)
                                    .xpos(-1118.577381)
                                    .xposAlt1(-1145.688502)
                                    .xposAlt2(-1456.915926)
                                    .xvel(-4.25242784)
                                    .xvelAlt1(-4.270832252)
                                    .xvelAlt2(-1.219814294)
                                    .yaccel(2.645553717)
                                    .ypos(3026.231084)
                                    .yposAlt1(3020.729572)
                                    .yposAlt2(-2883.540406)
                                    .yvel(5.291107434)
                                    .yvelAlt1(5.27074276)
                                    .yvelAlt2(-6.602080212)
                                    .zaccel(-1.06310696)
                                    .zpos(6167.831808)
                                    .zposAlt1(6165.55187)
                                    .zposAlt2(6165.55187)
                                    .zvel(-3.356493869)
                                    .zvelAlt1(-3.365155181)
                                    .zvelAlt2(-3.365155181)
                                    .build()
                            )
                            .ballisticCoeffEst(false)
                            .ballisticCoeffModel("GaussMarkov")
                            .bestPassWrms(0.975)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .edr(1.23)
                            .effectiveFrom(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                            .effectiveUntil(OffsetDateTime.parse("2023-08-30T08:15:00.123456Z"))
                            .errorGrowthRate(1.23)
                            .firstPassWrms(0.985)
                            .fitSpan(0.6)
                            .idOnOrbit("54741")
                            .lastObEnd(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                            .lastObStart(OffsetDateTime.parse("2023-08-28T11:20:21.247192Z"))
                            .methodSource("ASW")
                            .numIterations(8)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("ORIGOBJECT-ID")
                            .previousWrms(1.02)
                            .addRejectedObId("DIFFOFARRIVAL-ID2")
                            .addRejectedObId("RFOBSERVATION-ID2")
                            .addRejectedObTyp("DOA")
                            .addRejectedObTyp("RF")
                            .rmsConvergenceCriteria(0.001)
                            .satNo(54741)
                            .addSensorId("SENSOR-ID1")
                            .addSensorId("SENSOR-ID2")
                            .sourceDl("AXE")
                            .timeSpan(3.5)
                            .wrms(0.991)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
