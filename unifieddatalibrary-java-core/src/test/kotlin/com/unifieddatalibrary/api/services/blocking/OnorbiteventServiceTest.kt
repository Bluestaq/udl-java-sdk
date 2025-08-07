// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventCountParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventCreateParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventGetParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventTupleParams
import com.unifieddatalibrary.api.models.onorbitevent.OnorbiteventUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbiteventServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbiteventService = client.onorbitevent()

        onorbiteventService.create(
            OnorbiteventCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbiteventCreateParams.DataMode.TEST)
                .eventTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .source("Bluestaq")
                .id("ONORBITEVENT-ID")
                .achievedFlightPhase("Phase 2")
                .ageAtEvent(5.23)
                .capabilityLoss(0.5)
                .capabilityLossNotes("Example notes")
                .capacityLoss(0.5)
                .consequentialEquipmentFailure("Example Equipment")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                .declassificationString("DECLASS_STRING")
                .derivedFrom("DERIVED_SOURCE")
                .description("Example notes")
                .equipmentAtFault("Example Equipment")
                .equipmentCausingLossNotes("Example notes")
                .equipmentPartAtFault("Example Equipment")
                .equipmentTypeAtFault("Example Equipment")
                .eventResult("Example results")
                .eventTimeNotes("Notes on validity")
                .eventType("Type1")
                .geoPosition(45.23)
                .idOnOrbit("ONORBIT-ID")
                .inclined(false)
                .injured(1)
                .insuranceCarriedNotes("Insurance notes")
                .insuranceLoss(0.5)
                .insuranceLossNotes("Insurance notes")
                .killed(23)
                .lesseeOrgId("LESSEEORG-ID")
                .lifeLost(0.5)
                .netAmount(10000.23)
                .objectStatus("Status1")
                .occurrenceFlightPhase("Phase 2")
                .officialLossDate(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .operatedOnBehalfOfOrgId("OPERATEDONBEHALFOFORG-ID")
                .operatorOrgId("OPERATORORG-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .ownerOrgId("OWNERORG-ID")
                .planeNumber("PL_1")
                .planeSlot("example_slot")
                .positionStatus("Stable")
                .remarks("Example remarks")
                .satellitePosition("Example description")
                .satNo(1)
                .stageAtFault("Phase 2")
                .thirdPartyInsuranceLoss(10000.23)
                .underlyingCause("CAUSE_EXAMPLE")
                .untilTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
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
        val onorbiteventService = client.onorbitevent()

        onorbiteventService.update(
            OnorbiteventUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(OnorbiteventUpdateParams.DataMode.TEST)
                .eventTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .source("Bluestaq")
                .bodyId("ONORBITEVENT-ID")
                .achievedFlightPhase("Phase 2")
                .ageAtEvent(5.23)
                .capabilityLoss(0.5)
                .capabilityLossNotes("Example notes")
                .capacityLoss(0.5)
                .consequentialEquipmentFailure("Example Equipment")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                .declassificationString("DECLASS_STRING")
                .derivedFrom("DERIVED_SOURCE")
                .description("Example notes")
                .equipmentAtFault("Example Equipment")
                .equipmentCausingLossNotes("Example notes")
                .equipmentPartAtFault("Example Equipment")
                .equipmentTypeAtFault("Example Equipment")
                .eventResult("Example results")
                .eventTimeNotes("Notes on validity")
                .eventType("Type1")
                .geoPosition(45.23)
                .idOnOrbit("ONORBIT-ID")
                .inclined(false)
                .injured(1)
                .insuranceCarriedNotes("Insurance notes")
                .insuranceLoss(0.5)
                .insuranceLossNotes("Insurance notes")
                .killed(23)
                .lesseeOrgId("LESSEEORG-ID")
                .lifeLost(0.5)
                .netAmount(10000.23)
                .objectStatus("Status1")
                .occurrenceFlightPhase("Phase 2")
                .officialLossDate(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .operatedOnBehalfOfOrgId("OPERATEDONBEHALFOFORG-ID")
                .operatorOrgId("OPERATORORG-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .ownerOrgId("OWNERORG-ID")
                .planeNumber("PL_1")
                .planeSlot("example_slot")
                .positionStatus("Stable")
                .remarks("Example remarks")
                .satellitePosition("Example description")
                .satNo(1)
                .stageAtFault("Phase 2")
                .thirdPartyInsuranceLoss(10000.23)
                .underlyingCause("CAUSE_EXAMPLE")
                .untilTime(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
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
        val onorbiteventService = client.onorbitevent()

        val page = onorbiteventService.list()

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
        val onorbiteventService = client.onorbitevent()

        onorbiteventService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbiteventService = client.onorbitevent()

        onorbiteventService.count(
            OnorbiteventCountParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbiteventService = client.onorbitevent()

        val onorbitevent =
            onorbiteventService.get(
                OnorbiteventGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        onorbitevent.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbiteventService = client.onorbitevent()

        val response = onorbiteventService.queryhelp()

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
        val onorbiteventService = client.onorbitevent()

        val response =
            onorbiteventService.tuple(
                OnorbiteventTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}
