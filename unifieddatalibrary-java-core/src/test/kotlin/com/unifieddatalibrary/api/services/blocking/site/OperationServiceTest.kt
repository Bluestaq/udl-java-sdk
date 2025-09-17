// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.site

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.site.operations.OperationCountParams
import com.unifieddatalibrary.api.models.site.operations.OperationCreateBulkParams
import com.unifieddatalibrary.api.models.site.operations.OperationCreateParams
import com.unifieddatalibrary.api.models.site.operations.OperationListParams
import com.unifieddatalibrary.api.models.site.operations.OperationRetrieveParams
import com.unifieddatalibrary.api.models.site.operations.OperationTupleParams
import com.unifieddatalibrary.api.models.site.operations.OperationUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.site.operations.OperationUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OperationServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operationService = client.site().operations()

        operationService.create(
            OperationCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OperationCreateParams.DataMode.TEST)
                .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                .source("Bluestaq")
                .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .addDailyOperation(
                    OperationCreateParams.DailyOperation.builder()
                        .dayOfWeek(OperationCreateParams.DailyOperation.DayOfWeek.MONDAY)
                        .addOperatingHour(
                            OperationCreateParams.DailyOperation.OperatingHour.builder()
                                .opStartTime("12:00")
                                .opStopTime("22:00")
                                .build()
                        )
                        .operationName("Arrivals")
                        .ophrsLastChangedBy("John Smith")
                        .ophrsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .build()
                )
                .dopsLastChangedBy("John Smith")
                .dopsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .dopsLastChangedReason("Example reason for change.")
                .idLaunchSite("b150b3ee-884b-b9ac-60a0-6408b4b16088")
                .addMaximumOnGround(
                    OperationCreateParams.MaximumOnGround.builder()
                        .aircraftMds("C017A")
                        .contingencyMog(3)
                        .mogLastChangedBy("John Smith")
                        .mogLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .wideParkingMog(1)
                        .wideWorkingMog(1)
                        .build()
                )
                .mogsLastChangedBy("Jane Doe")
                .mogsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .mogsLastChangedReason("Example reason for change.")
                .addOperationalDeviation(
                    OperationCreateParams.OperationalDeviation.builder()
                        .affectedAircraftMds("C017A")
                        .affectedMog(1)
                        .aircraftOnGroundTime("14:00")
                        .crewRestTime("14:00")
                        .odLastChangedBy("John Smith")
                        .odLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .odRemark("Example remark about this operational deviation.")
                        .build()
                )
                .addOperationalPlanning(
                    OperationCreateParams.OperationalPlanning.builder()
                        .opEndDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .opLastChangedBy("John Smith")
                        .opLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .opRemark("Example planning remark")
                        .opSource("a3")
                        .opStartDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .opStatus("Verified")
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .addPathway(
                    OperationCreateParams.Pathway.builder()
                        .pwDefinition("AGP: 14L, K6, K, G (ANG APRN TO TWY K), GUARD (MAIN)")
                        .pwLastChangedBy("John Smith")
                        .pwLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .pwType("Taxiway")
                        .pwUsage("Arrival")
                        .build()
                )
                .sourceDl("AXE")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .addWaiver(
                    OperationCreateParams.Waiver.builder()
                        .expirationDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .hasExpired(false)
                        .issueDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .issuerName("John Smith")
                        .requesterName("Jane Doe")
                        .requesterPhoneNumber("808-123-4567")
                        .requestingUnit("2A1")
                        .waiverAppliesTo("C017A")
                        .waiverDescription("Example waiver description")
                        .waiverLastChangedBy("J. Appleseed")
                        .waiverLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .build()
                )
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operationService = client.site().operations()

        val operation =
            operationService.retrieve(
                OperationRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        operation.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operationService = client.site().operations()

        operationService.update(
            OperationUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(OperationUpdateParams.DataMode.TEST)
                .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                .source("Bluestaq")
                .bodyId("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .addDailyOperation(
                    OperationUpdateParams.DailyOperation.builder()
                        .dayOfWeek(OperationUpdateParams.DailyOperation.DayOfWeek.MONDAY)
                        .addOperatingHour(
                            OperationUpdateParams.DailyOperation.OperatingHour.builder()
                                .opStartTime("12:00")
                                .opStopTime("22:00")
                                .build()
                        )
                        .operationName("Arrivals")
                        .ophrsLastChangedBy("John Smith")
                        .ophrsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
                        .build()
                )
                .dopsLastChangedBy("John Smith")
                .dopsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .dopsLastChangedReason("Example reason for change.")
                .idLaunchSite("b150b3ee-884b-b9ac-60a0-6408b4b16088")
                .addMaximumOnGround(
                    OperationUpdateParams.MaximumOnGround.builder()
                        .aircraftMds("C017A")
                        .contingencyMog(3)
                        .mogLastChangedBy("John Smith")
                        .mogLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .wideParkingMog(1)
                        .wideWorkingMog(1)
                        .build()
                )
                .mogsLastChangedBy("Jane Doe")
                .mogsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                .mogsLastChangedReason("Example reason for change.")
                .addOperationalDeviation(
                    OperationUpdateParams.OperationalDeviation.builder()
                        .affectedAircraftMds("C017A")
                        .affectedMog(1)
                        .aircraftOnGroundTime("14:00")
                        .crewRestTime("14:00")
                        .odLastChangedBy("John Smith")
                        .odLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .odRemark("Example remark about this operational deviation.")
                        .build()
                )
                .addOperationalPlanning(
                    OperationUpdateParams.OperationalPlanning.builder()
                        .opEndDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .opLastChangedBy("John Smith")
                        .opLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .opRemark("Example planning remark")
                        .opSource("a3")
                        .opStartDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .opStatus("Verified")
                        .build()
                )
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .addPathway(
                    OperationUpdateParams.Pathway.builder()
                        .pwDefinition("AGP: 14L, K6, K, G (ANG APRN TO TWY K), GUARD (MAIN)")
                        .pwLastChangedBy("John Smith")
                        .pwLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .pwType("Taxiway")
                        .pwUsage("Arrival")
                        .build()
                )
                .sourceDl("AXE")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .addWaiver(
                    OperationUpdateParams.Waiver.builder()
                        .expirationDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .hasExpired(false)
                        .issueDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .issuerName("John Smith")
                        .requesterName("Jane Doe")
                        .requesterPhoneNumber("808-123-4567")
                        .requestingUnit("2A1")
                        .waiverAppliesTo("C017A")
                        .waiverDescription("Example waiver description")
                        .waiverLastChangedBy("J. Appleseed")
                        .waiverLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
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
        val operationService = client.site().operations()

        val page = operationService.list(OperationListParams.builder().idSite("idSite").build())

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
        val operationService = client.site().operations()

        operationService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operationService = client.site().operations()

        operationService.count(
            OperationCountParams.builder().idSite("idSite").firstResult(0L).maxResults(0L).build()
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
        val operationService = client.site().operations()

        operationService.createBulk(
            OperationCreateBulkParams.builder()
                .addBody(
                    OperationCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(OperationCreateBulkParams.Body.DataMode.TEST)
                        .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                        .source("Bluestaq")
                        .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .addDailyOperation(
                            OperationCreateBulkParams.Body.DailyOperation.builder()
                                .dayOfWeek(
                                    OperationCreateBulkParams.Body.DailyOperation.DayOfWeek.MONDAY
                                )
                                .addOperatingHour(
                                    OperationCreateBulkParams.Body.DailyOperation.OperatingHour
                                        .builder()
                                        .opStartTime("12:00")
                                        .opStopTime("22:00")
                                        .build()
                                )
                                .operationName("Arrivals")
                                .ophrsLastChangedBy("John Smith")
                                .ophrsLastChangedDate(
                                    OffsetDateTime.parse("2024-01-01T16:00:00.123Z")
                                )
                                .build()
                        )
                        .dopsLastChangedBy("John Smith")
                        .dopsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .dopsLastChangedReason("Example reason for change.")
                        .idLaunchSite("b150b3ee-884b-b9ac-60a0-6408b4b16088")
                        .addMaximumOnGround(
                            OperationCreateBulkParams.Body.MaximumOnGround.builder()
                                .aircraftMds("C017A")
                                .contingencyMog(3)
                                .mogLastChangedBy("John Smith")
                                .mogLastChangedDate(
                                    OffsetDateTime.parse("2024-01-01T16:00:00.000Z")
                                )
                                .wideParkingMog(1)
                                .wideWorkingMog(1)
                                .build()
                        )
                        .mogsLastChangedBy("Jane Doe")
                        .mogsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .mogsLastChangedReason("Example reason for change.")
                        .addOperationalDeviation(
                            OperationCreateBulkParams.Body.OperationalDeviation.builder()
                                .affectedAircraftMds("C017A")
                                .affectedMog(1)
                                .aircraftOnGroundTime("14:00")
                                .crewRestTime("14:00")
                                .odLastChangedBy("John Smith")
                                .odLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .odRemark("Example remark about this operational deviation.")
                                .build()
                        )
                        .addOperationalPlanning(
                            OperationCreateBulkParams.Body.OperationalPlanning.builder()
                                .opEndDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .opLastChangedBy("John Smith")
                                .opLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .opRemark("Example planning remark")
                                .opSource("a3")
                                .opStartDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .opStatus("Verified")
                                .build()
                        )
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .addPathway(
                            OperationCreateBulkParams.Body.Pathway.builder()
                                .pwDefinition(
                                    "AGP: 14L, K6, K, G (ANG APRN TO TWY K), GUARD (MAIN)"
                                )
                                .pwLastChangedBy("John Smith")
                                .pwLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .pwType("Taxiway")
                                .pwUsage("Arrival")
                                .build()
                        )
                        .sourceDl("AXE")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .addWaiver(
                            OperationCreateBulkParams.Body.Waiver.builder()
                                .expirationDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .hasExpired(false)
                                .issueDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .issuerName("John Smith")
                                .requesterName("Jane Doe")
                                .requesterPhoneNumber("808-123-4567")
                                .requestingUnit("2A1")
                                .waiverAppliesTo("C017A")
                                .waiverDescription("Example waiver description")
                                .waiverLastChangedBy("J. Appleseed")
                                .waiverLastChangedDate(
                                    OffsetDateTime.parse("2024-01-01T16:00:00.000Z")
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        )
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val operationService = client.site().operations()

        val response = operationService.queryHelp()

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
        val operationService = client.site().operations()

        val response =
            operationService.tuple(
                OperationTupleParams.builder()
                    .columns("columns")
                    .idSite("idSite")
                    .firstResult(0L)
                    .maxResults(0L)
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
        val operationService = client.site().operations()

        operationService.unvalidatedPublish(
            OperationUnvalidatedPublishParams.builder()
                .addBody(
                    OperationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(OperationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                        .source("Bluestaq")
                        .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .addDailyOperation(
                            OperationUnvalidatedPublishParams.Body.DailyOperation.builder()
                                .dayOfWeek(
                                    OperationUnvalidatedPublishParams.Body.DailyOperation.DayOfWeek
                                        .MONDAY
                                )
                                .addOperatingHour(
                                    OperationUnvalidatedPublishParams.Body.DailyOperation
                                        .OperatingHour
                                        .builder()
                                        .opStartTime("12:00")
                                        .opStopTime("22:00")
                                        .build()
                                )
                                .operationName("Arrivals")
                                .ophrsLastChangedBy("John Smith")
                                .ophrsLastChangedDate(
                                    OffsetDateTime.parse("2024-01-01T16:00:00.123Z")
                                )
                                .build()
                        )
                        .dopsLastChangedBy("John Smith")
                        .dopsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .dopsLastChangedReason("Example reason for change.")
                        .idLaunchSite("b150b3ee-884b-b9ac-60a0-6408b4b16088")
                        .addMaximumOnGround(
                            OperationUnvalidatedPublishParams.Body.MaximumOnGround.builder()
                                .aircraftMds("C017A")
                                .contingencyMog(3)
                                .mogLastChangedBy("John Smith")
                                .mogLastChangedDate(
                                    OffsetDateTime.parse("2024-01-01T16:00:00.000Z")
                                )
                                .wideParkingMog(1)
                                .wideWorkingMog(1)
                                .build()
                        )
                        .mogsLastChangedBy("Jane Doe")
                        .mogsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                        .mogsLastChangedReason("Example reason for change.")
                        .addOperationalDeviation(
                            OperationUnvalidatedPublishParams.Body.OperationalDeviation.builder()
                                .affectedAircraftMds("C017A")
                                .affectedMog(1)
                                .aircraftOnGroundTime("14:00")
                                .crewRestTime("14:00")
                                .odLastChangedBy("John Smith")
                                .odLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .odRemark("Example remark about this operational deviation.")
                                .build()
                        )
                        .addOperationalPlanning(
                            OperationUnvalidatedPublishParams.Body.OperationalPlanning.builder()
                                .opEndDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .opLastChangedBy("John Smith")
                                .opLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .opRemark("Example planning remark")
                                .opSource("a3")
                                .opStartDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .opStatus("Verified")
                                .build()
                        )
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .addPathway(
                            OperationUnvalidatedPublishParams.Body.Pathway.builder()
                                .pwDefinition(
                                    "AGP: 14L, K6, K, G (ANG APRN TO TWY K), GUARD (MAIN)"
                                )
                                .pwLastChangedBy("John Smith")
                                .pwLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .pwType("Taxiway")
                                .pwUsage("Arrival")
                                .build()
                        )
                        .sourceDl("AXE")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .addWaiver(
                            OperationUnvalidatedPublishParams.Body.Waiver.builder()
                                .expirationDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .hasExpired(false)
                                .issueDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                                .issuerName("John Smith")
                                .requesterName("Jane Doe")
                                .requesterPhoneNumber("808-123-4567")
                                .requestingUnit("2A1")
                                .waiverAppliesTo("C017A")
                                .waiverDescription("Example waiver description")
                                .waiverLastChangedBy("J. Appleseed")
                                .waiverLastChangedDate(
                                    OffsetDateTime.parse("2024-01-01T16:00:00.000Z")
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        )
    }
}
