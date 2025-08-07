// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site.operations

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationUnvalidatedPublishParamsTest {

    @Test
    fun create() {
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
                                OperationUnvalidatedPublishParams.Body.DailyOperation.OperatingHour
                                    .builder()
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
                        OperationUnvalidatedPublishParams.Body.MaximumOnGround.builder()
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
                    .origNetwork("ORIG")
                    .addPathway(
                        OperationUnvalidatedPublishParams.Body.Pathway.builder()
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
                            .waiverLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
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
                        .origNetwork("ORIG")
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

        val body = params._body()

        assertThat(body)
            .containsExactly(
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
                                OperationUnvalidatedPublishParams.Body.DailyOperation.OperatingHour
                                    .builder()
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
                        OperationUnvalidatedPublishParams.Body.MaximumOnGround.builder()
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
                    .origNetwork("ORIG")
                    .addPathway(
                        OperationUnvalidatedPublishParams.Body.Pathway.builder()
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
                            .waiverLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.000Z"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OperationUnvalidatedPublishParams.builder()
                .addBody(
                    OperationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(OperationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                OperationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(OperationUnvalidatedPublishParams.Body.DataMode.TEST)
                    .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                    .source("Bluestaq")
                    .build()
            )
    }
}
