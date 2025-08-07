// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogisticsSupportItemsFullTest {

    @Test
    fun create() {
        val logisticsSupportItemsFull =
            LogisticsSupportItemsFull.builder()
                .cannibalized(true)
                .deployPlanNumber("T89003")
                .description("HOIST ADAPTER KIT")
                .itemLastChangedDate(OffsetDateTime.parse("2023-07-17T19:04:00.123Z"))
                .jobControlNumber("231942400")
                .addLogisticsPart(
                    LogisticsPartsFull.builder()
                        .figureNumber("3")
                        .indexNumber("4")
                        .locationVerifier("JANE DOE")
                        .addLogisticsStock(
                            LogisticsStocksFull.builder()
                                .quantity(4)
                                .sourceIcao("PHIK")
                                .stockCheckTime(OffsetDateTime.parse("2023-07-13T13:47:00.123Z"))
                                .stockPoc("SMITH, JOHN J")
                                .build()
                        )
                        .measurementUnitCode("EA")
                        .nationalStockNumber("5310-00-045-3299")
                        .partNumber("MS35338-42")
                        .requestVerifier("JOHN SMITH")
                        .supplyDocumentNumber("J223FU31908300")
                        .technicalOrderText("1C-17A-4")
                        .workUnitCode("5611UU001")
                        .build()
                )
                .addLogisticsRemark(
                    LogisticsRemarksFull.builder()
                        .lastChanged(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                        .remark("EXAMPLE REMARK")
                        .username("JSMITH")
                        .build()
                )
                .addLogisticsSpecialty(
                    LogisticsSpecialtiesFull.builder()
                        .firstName("JOHN")
                        .last4Ssn("9999")
                        .lastName("SMITH")
                        .rankCode("MAJ")
                        .roleTypeCode("TC")
                        .skillLevel(3)
                        .specialty("ELEN")
                        .build()
                )
                .quantity(1)
                .readyTime(OffsetDateTime.parse("2023-07-17T19:04:00.123Z"))
                .receivedTime(OffsetDateTime.parse("2023-07-17T19:04:00.123Z"))
                .recoveryRequestTypeCode("E")
                .redeployPlanNumber("T89003")
                .redeployShipmentUnitId("X400LA31949108")
                .requestNumber("89208")
                .resupportFlag(true)
                .shipmentUnitId("FB44273196X501XXX")
                .siPoc("SMITH, JOHN J")
                .sourceIcao("PHIK")
                .build()

        assertThat(logisticsSupportItemsFull.cannibalized()).contains(true)
        assertThat(logisticsSupportItemsFull.deployPlanNumber()).contains("T89003")
        assertThat(logisticsSupportItemsFull.description()).contains("HOIST ADAPTER KIT")
        assertThat(logisticsSupportItemsFull.itemLastChangedDate())
            .contains(OffsetDateTime.parse("2023-07-17T19:04:00.123Z"))
        assertThat(logisticsSupportItemsFull.jobControlNumber()).contains("231942400")
        assertThat(logisticsSupportItemsFull.logisticsParts().getOrNull())
            .containsExactly(
                LogisticsPartsFull.builder()
                    .figureNumber("3")
                    .indexNumber("4")
                    .locationVerifier("JANE DOE")
                    .addLogisticsStock(
                        LogisticsStocksFull.builder()
                            .quantity(4)
                            .sourceIcao("PHIK")
                            .stockCheckTime(OffsetDateTime.parse("2023-07-13T13:47:00.123Z"))
                            .stockPoc("SMITH, JOHN J")
                            .build()
                    )
                    .measurementUnitCode("EA")
                    .nationalStockNumber("5310-00-045-3299")
                    .partNumber("MS35338-42")
                    .requestVerifier("JOHN SMITH")
                    .supplyDocumentNumber("J223FU31908300")
                    .technicalOrderText("1C-17A-4")
                    .workUnitCode("5611UU001")
                    .build()
            )
        assertThat(logisticsSupportItemsFull.logisticsRemarks().getOrNull())
            .containsExactly(
                LogisticsRemarksFull.builder()
                    .lastChanged(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                    .remark("EXAMPLE REMARK")
                    .username("JSMITH")
                    .build()
            )
        assertThat(logisticsSupportItemsFull.logisticsSpecialties().getOrNull())
            .containsExactly(
                LogisticsSpecialtiesFull.builder()
                    .firstName("JOHN")
                    .last4Ssn("9999")
                    .lastName("SMITH")
                    .rankCode("MAJ")
                    .roleTypeCode("TC")
                    .skillLevel(3)
                    .specialty("ELEN")
                    .build()
            )
        assertThat(logisticsSupportItemsFull.quantity()).contains(1)
        assertThat(logisticsSupportItemsFull.readyTime())
            .contains(OffsetDateTime.parse("2023-07-17T19:04:00.123Z"))
        assertThat(logisticsSupportItemsFull.receivedTime())
            .contains(OffsetDateTime.parse("2023-07-17T19:04:00.123Z"))
        assertThat(logisticsSupportItemsFull.recoveryRequestTypeCode()).contains("E")
        assertThat(logisticsSupportItemsFull.redeployPlanNumber()).contains("T89003")
        assertThat(logisticsSupportItemsFull.redeployShipmentUnitId()).contains("X400LA31949108")
        assertThat(logisticsSupportItemsFull.requestNumber()).contains("89208")
        assertThat(logisticsSupportItemsFull.resupportFlag()).contains(true)
        assertThat(logisticsSupportItemsFull.shipmentUnitId()).contains("FB44273196X501XXX")
        assertThat(logisticsSupportItemsFull.siPoc()).contains("SMITH, JOHN J")
        assertThat(logisticsSupportItemsFull.sourceIcao()).contains("PHIK")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logisticsSupportItemsFull =
            LogisticsSupportItemsFull.builder()
                .cannibalized(true)
                .deployPlanNumber("T89003")
                .description("HOIST ADAPTER KIT")
                .itemLastChangedDate(OffsetDateTime.parse("2023-07-17T19:04:00.123Z"))
                .jobControlNumber("231942400")
                .addLogisticsPart(
                    LogisticsPartsFull.builder()
                        .figureNumber("3")
                        .indexNumber("4")
                        .locationVerifier("JANE DOE")
                        .addLogisticsStock(
                            LogisticsStocksFull.builder()
                                .quantity(4)
                                .sourceIcao("PHIK")
                                .stockCheckTime(OffsetDateTime.parse("2023-07-13T13:47:00.123Z"))
                                .stockPoc("SMITH, JOHN J")
                                .build()
                        )
                        .measurementUnitCode("EA")
                        .nationalStockNumber("5310-00-045-3299")
                        .partNumber("MS35338-42")
                        .requestVerifier("JOHN SMITH")
                        .supplyDocumentNumber("J223FU31908300")
                        .technicalOrderText("1C-17A-4")
                        .workUnitCode("5611UU001")
                        .build()
                )
                .addLogisticsRemark(
                    LogisticsRemarksFull.builder()
                        .lastChanged(OffsetDateTime.parse("2023-07-17T10:30:00.123Z"))
                        .remark("EXAMPLE REMARK")
                        .username("JSMITH")
                        .build()
                )
                .addLogisticsSpecialty(
                    LogisticsSpecialtiesFull.builder()
                        .firstName("JOHN")
                        .last4Ssn("9999")
                        .lastName("SMITH")
                        .rankCode("MAJ")
                        .roleTypeCode("TC")
                        .skillLevel(3)
                        .specialty("ELEN")
                        .build()
                )
                .quantity(1)
                .readyTime(OffsetDateTime.parse("2023-07-17T19:04:00.123Z"))
                .receivedTime(OffsetDateTime.parse("2023-07-17T19:04:00.123Z"))
                .recoveryRequestTypeCode("E")
                .redeployPlanNumber("T89003")
                .redeployShipmentUnitId("X400LA31949108")
                .requestNumber("89208")
                .resupportFlag(true)
                .shipmentUnitId("FB44273196X501XXX")
                .siPoc("SMITH, JOHN J")
                .sourceIcao("PHIK")
                .build()

        val roundtrippedLogisticsSupportItemsFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logisticsSupportItemsFull),
                jacksonTypeRef<LogisticsSupportItemsFull>(),
            )

        assertThat(roundtrippedLogisticsSupportItemsFull).isEqualTo(logisticsSupportItemsFull)
    }
}
