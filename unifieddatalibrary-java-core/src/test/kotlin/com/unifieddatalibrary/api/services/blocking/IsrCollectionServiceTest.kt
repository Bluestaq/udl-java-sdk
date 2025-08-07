// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionCountParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionCreateBulkParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionListParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionTupleParams
import com.unifieddatalibrary.api.models.isrcollections.IsrCollectionUnvalidatedPublishParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IsrCollectionServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val isrCollectionService = client.isrCollections()

        val page =
            isrCollectionService.list(
                IsrCollectionListParams.builder().createdAt(LocalDate.parse("2019-12-27")).build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val isrCollectionService = client.isrCollections()

        isrCollectionService.count(
            IsrCollectionCountParams.builder()
                .createdAt(LocalDate.parse("2019-12-27"))
                .firstResult(0L)
                .maxResults(0L)
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
        val isrCollectionService = client.isrCollections()

        isrCollectionService.createBulk(
            IsrCollectionCreateBulkParams.builder()
                .addBody(
                    IsrCollectionCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(IsrCollectionCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .id("ISRCOLLECTION-ID")
                        .addCollectionRequirement(
                            IsrCollectionCreateBulkParams.Body.CollectionRequirement.builder()
                                .id("ISCRCOLLECTIONREQUIREMENTS")
                                .country("VE")
                                .cridNumbers("CRID")
                                .criticalTimes(
                                    IsrCollectionCreateBulkParams.Body.CollectionRequirement
                                        .CriticalTimes
                                        .builder()
                                        .earliestImagingTime(
                                            OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                        )
                                        .latestImagingTime(
                                            OffsetDateTime.parse("2021-01-19T01:11:15.001Z")
                                        )
                                        .build()
                                )
                                .emphasized(false)
                                .exploitationRequirement(
                                    IsrCollectionCreateBulkParams.Body.CollectionRequirement
                                        .ExploitationRequirement
                                        .builder()
                                        .id("ISRCOLLECTIONEXPLOITATIONREQUIREMENT")
                                        .amplification("AMPLIFICATION")
                                        .dissemination("EMAILS")
                                        .eei("ESSENTIAL_ELEMENTS")
                                        .poc(
                                            IsrCollectionCreateBulkParams.Body.CollectionRequirement
                                                .ExploitationRequirement
                                                .Poc
                                                .builder()
                                                .id("ISRCOLLECTIONPOC-ID")
                                                .callsign("CALLSIGN")
                                                .chatName("CHAT_NAME")
                                                .chatSystem("CHAT")
                                                .email("EMAIL")
                                                .name("NAME")
                                                .notes("NOTES")
                                                .phone("PHONE")
                                                .radioFrequency(123.23)
                                                .unit("UNIT")
                                                .build()
                                        )
                                        .reportingCriteria("CRITERIA")
                                        .build()
                                )
                                .hash("HASH")
                                .intelDiscipline("Sig")
                                .isPrismCr(true)
                                .operation("NAME")
                                .priority(20.23)
                                .reconSurvey("SURVEY_INFO")
                                .recordId("RECORD-ID")
                                .region("REGION")
                                .secondary(false)
                                .specialComGuidance("TEXT")
                                .start(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                                .stop(OffsetDateTime.parse("2021-01-19T01:20:01.001Z"))
                                .subregion("SUBREGION")
                                .supportedUnit("UNIT")
                                .addTargetList("string")
                                .type("COLLECTION_TYPE")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                        .createdBy("some.user")
                        .idexVersion(2)
                        .missionAor("Kandahar")
                        .missionCollectionArea("Example collection area")
                        .missionCountry("US")
                        .missionEmphasis("Mission emphasis")
                        .missionId("myTask-2020-04-23T00:00:00.000Z")
                        .missionJoa("Operation area")
                        .missionOperation("OP-HONEY-BADGER")
                        .missionPrimaryIntelDiscipline("Sig")
                        .missionPrimarySubCategory("FMV")
                        .missionPriority(1)
                        .missionRegion("Example Region")
                        .missionRole("Targeting of Lead Vehicle")
                        .missionSecondaryIntelDiscipline("Intelligence_2")
                        .missionSecondarySubCategory("Convoy")
                        .missionStartPointLat(45.23)
                        .missionStartPointLong(80.23)
                        .missionSubRegion("Example Subregion")
                        .missionSupportedUnit("ENVOYS")
                        .missionSyncMatrixBin("MATRIX")
                        .name("Example mission name")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .addTasking(
                            IsrCollectionCreateBulkParams.Body.Tasking.builder()
                                .id("ISRCOLLECTIONTASKINGS-ID")
                                .collectionPeriods(
                                    IsrCollectionCreateBulkParams.Body.Tasking.CollectionPeriods
                                        .builder()
                                        .addActual(
                                            IsrCollectionCreateBulkParams.Body.Tasking
                                                .CollectionPeriods
                                                .Actual
                                                .builder()
                                                .id("ISRCOLLECTIONACTUAL-ID")
                                                .start(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .stop(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .build()
                                        )
                                        .planned(
                                            IsrCollectionCreateBulkParams.Body.Tasking
                                                .CollectionPeriods
                                                .Planned
                                                .builder()
                                                .addAdditional(
                                                    IsrCollectionCreateBulkParams.Body.Tasking
                                                        .CollectionPeriods
                                                        .Planned
                                                        .Additional
                                                        .builder()
                                                        .id("ISRCOLLECTIONADDITIONAL")
                                                        .start(
                                                            OffsetDateTime.parse(
                                                                "2021-01-19T01:01:15.001Z"
                                                            )
                                                        )
                                                        .stop(
                                                            OffsetDateTime.parse(
                                                                "2021-01-19T01:01:15.001Z"
                                                            )
                                                        )
                                                        .build()
                                                )
                                                .start(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .stop(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .collectionType(
                                    IsrCollectionCreateBulkParams.Body.Tasking.CollectionType
                                        .SIMULTANEOUS
                                )
                                .eightLine("eightLine")
                                .specialComGuidance("TEXT")
                                .sroTrack("SRO")
                                .taskingAor("Kandahar")
                                .taskingCollectionArea("AREA")
                                .addTaskingCollectionRequirement(
                                    IsrCollectionCreateBulkParams.Body.Tasking
                                        .TaskingCollectionRequirement
                                        .builder()
                                        .id("ISCRCOLLECTIONREQUIREMENTS")
                                        .country("VE")
                                        .cridNumbers("CRID")
                                        .criticalTimes(
                                            IsrCollectionCreateBulkParams.Body.Tasking
                                                .TaskingCollectionRequirement
                                                .CriticalTimes
                                                .builder()
                                                .earliestImagingTime(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .latestImagingTime(
                                                    OffsetDateTime.parse("2021-01-19T01:11:15.001Z")
                                                )
                                                .build()
                                        )
                                        .emphasized(false)
                                        .exploitationRequirement(
                                            IsrCollectionCreateBulkParams.Body.Tasking
                                                .TaskingCollectionRequirement
                                                .ExploitationRequirement
                                                .builder()
                                                .id("ISRCOLLECTIONEXPLOITATIONREQUIREMENT")
                                                .amplification("AMPLIFICATION")
                                                .dissemination("EMAILS")
                                                .eei("ESSENTIAL_ELEMENTS")
                                                .poc(
                                                    IsrCollectionCreateBulkParams.Body.Tasking
                                                        .TaskingCollectionRequirement
                                                        .ExploitationRequirement
                                                        .Poc
                                                        .builder()
                                                        .id("ISRCOLLECTIONPOC-ID")
                                                        .callsign("CALLSIGN")
                                                        .chatName("CHAT_NAME")
                                                        .chatSystem("CHAT")
                                                        .email("EMAIL")
                                                        .name("NAME")
                                                        .notes("NOTES")
                                                        .phone("PHONE")
                                                        .radioFrequency(123.23)
                                                        .unit("UNIT")
                                                        .build()
                                                )
                                                .reportingCriteria("CRITERIA")
                                                .build()
                                        )
                                        .hash("HASH")
                                        .intelDiscipline("Sig")
                                        .isPrismCr(true)
                                        .operation("NAME")
                                        .priority(20.23)
                                        .reconSurvey("SURVEY_INFO")
                                        .recordId("RECORD-ID")
                                        .region("REGION")
                                        .secondary(false)
                                        .specialComGuidance("TEXT")
                                        .start(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                                        .stop(OffsetDateTime.parse("2021-01-19T01:20:01.001Z"))
                                        .subregion("SUBREGION")
                                        .supportedUnit("UNIT")
                                        .addTargetList("string")
                                        .type("COLLECTION_TYPE")
                                        .build()
                                )
                                .taskingCountry("CODE")
                                .taskingEmphasis("EMPHASIS")
                                .taskingJoa("AREA")
                                .taskingOperation("OP-HONEY-BADGER")
                                .taskingPrimaryIntelDiscipline("Sig")
                                .taskingPrimarySubCategory("FMV")
                                .taskingPriority(10.23)
                                .taskingRegion("REGION")
                                .taskingRetaskTime(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                                .taskingRole("Track Lead Vehicle")
                                .taskingSecondaryIntelDiscipline("Intelligence_2")
                                .taskingSecondarySubCategory("Convoy")
                                .taskingStartPointLat(45.23)
                                .taskingStartPointLong(45.23)
                                .taskingSubRegion("SUBREGION")
                                .taskingSupportedUnit("ENVOYS")
                                .taskingSyncMatrixBin("MATRIX")
                                .type(IsrCollectionCreateBulkParams.Body.Tasking.Type.DELIBERATE)
                                .build()
                        )
                        .addTransit(
                            IsrCollectionCreateBulkParams.Body.Transit.builder()
                                .id("ISRCOLLECTIONTRANSIT-ID")
                                .base("ENVOYS")
                                .duration(200.23)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val isrCollectionService = client.isrCollections()

        val response = isrCollectionService.queryhelp()

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
        val isrCollectionService = client.isrCollections()

        val response =
            isrCollectionService.tuple(
                IsrCollectionTupleParams.builder()
                    .columns("columns")
                    .createdAt(LocalDate.parse("2019-12-27"))
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
        val isrCollectionService = client.isrCollections()

        isrCollectionService.unvalidatedPublish(
            IsrCollectionUnvalidatedPublishParams.builder()
                .addBody(
                    IsrCollectionUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(IsrCollectionUnvalidatedPublishParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .id("ISRCOLLECTION-ID")
                        .addCollectionRequirement(
                            IsrCollectionUnvalidatedPublishParams.Body.CollectionRequirement
                                .builder()
                                .id("ISCRCOLLECTIONREQUIREMENTS")
                                .country("VE")
                                .cridNumbers("CRID")
                                .criticalTimes(
                                    IsrCollectionUnvalidatedPublishParams.Body.CollectionRequirement
                                        .CriticalTimes
                                        .builder()
                                        .earliestImagingTime(
                                            OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                        )
                                        .latestImagingTime(
                                            OffsetDateTime.parse("2021-01-19T01:11:15.001Z")
                                        )
                                        .build()
                                )
                                .emphasized(false)
                                .exploitationRequirement(
                                    IsrCollectionUnvalidatedPublishParams.Body.CollectionRequirement
                                        .ExploitationRequirement
                                        .builder()
                                        .id("ISRCOLLECTIONEXPLOITATIONREQUIREMENT")
                                        .amplification("AMPLIFICATION")
                                        .dissemination("EMAILS")
                                        .eei("ESSENTIAL_ELEMENTS")
                                        .poc(
                                            IsrCollectionUnvalidatedPublishParams.Body
                                                .CollectionRequirement
                                                .ExploitationRequirement
                                                .Poc
                                                .builder()
                                                .id("ISRCOLLECTIONPOC-ID")
                                                .callsign("CALLSIGN")
                                                .chatName("CHAT_NAME")
                                                .chatSystem("CHAT")
                                                .email("EMAIL")
                                                .name("NAME")
                                                .notes("NOTES")
                                                .phone("PHONE")
                                                .radioFrequency(123.23)
                                                .unit("UNIT")
                                                .build()
                                        )
                                        .reportingCriteria("CRITERIA")
                                        .build()
                                )
                                .hash("HASH")
                                .intelDiscipline("Sig")
                                .isPrismCr(true)
                                .operation("NAME")
                                .priority(20.23)
                                .reconSurvey("SURVEY_INFO")
                                .recordId("RECORD-ID")
                                .region("REGION")
                                .secondary(false)
                                .specialComGuidance("TEXT")
                                .start(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                                .stop(OffsetDateTime.parse("2021-01-19T01:20:01.001Z"))
                                .subregion("SUBREGION")
                                .supportedUnit("UNIT")
                                .addTargetList("string")
                                .type("COLLECTION_TYPE")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                        .createdBy("some.user")
                        .idexVersion(2)
                        .missionAor("Kandahar")
                        .missionCollectionArea("Example collection area")
                        .missionCountry("US")
                        .missionEmphasis("Mission emphasis")
                        .missionId("myTask-2020-04-23T00:00:00.000Z")
                        .missionJoa("Operation area")
                        .missionOperation("OP-HONEY-BADGER")
                        .missionPrimaryIntelDiscipline("Sig")
                        .missionPrimarySubCategory("FMV")
                        .missionPriority(1)
                        .missionRegion("Example Region")
                        .missionRole("Targeting of Lead Vehicle")
                        .missionSecondaryIntelDiscipline("Intelligence_2")
                        .missionSecondarySubCategory("Convoy")
                        .missionStartPointLat(45.23)
                        .missionStartPointLong(80.23)
                        .missionSubRegion("Example Subregion")
                        .missionSupportedUnit("ENVOYS")
                        .missionSyncMatrixBin("MATRIX")
                        .name("Example mission name")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .addTasking(
                            IsrCollectionUnvalidatedPublishParams.Body.Tasking.builder()
                                .id("ISRCOLLECTIONTASKINGS-ID")
                                .collectionPeriods(
                                    IsrCollectionUnvalidatedPublishParams.Body.Tasking
                                        .CollectionPeriods
                                        .builder()
                                        .addActual(
                                            IsrCollectionUnvalidatedPublishParams.Body.Tasking
                                                .CollectionPeriods
                                                .Actual
                                                .builder()
                                                .id("ISRCOLLECTIONACTUAL-ID")
                                                .start(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .stop(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .build()
                                        )
                                        .planned(
                                            IsrCollectionUnvalidatedPublishParams.Body.Tasking
                                                .CollectionPeriods
                                                .Planned
                                                .builder()
                                                .addAdditional(
                                                    IsrCollectionUnvalidatedPublishParams.Body
                                                        .Tasking
                                                        .CollectionPeriods
                                                        .Planned
                                                        .Additional
                                                        .builder()
                                                        .id("ISRCOLLECTIONADDITIONAL")
                                                        .start(
                                                            OffsetDateTime.parse(
                                                                "2021-01-19T01:01:15.001Z"
                                                            )
                                                        )
                                                        .stop(
                                                            OffsetDateTime.parse(
                                                                "2021-01-19T01:01:15.001Z"
                                                            )
                                                        )
                                                        .build()
                                                )
                                                .start(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .stop(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .collectionType(
                                    IsrCollectionUnvalidatedPublishParams.Body.Tasking
                                        .CollectionType
                                        .SIMULTANEOUS
                                )
                                .eightLine("eightLine")
                                .specialComGuidance("TEXT")
                                .sroTrack("SRO")
                                .taskingAor("Kandahar")
                                .taskingCollectionArea("AREA")
                                .addTaskingCollectionRequirement(
                                    IsrCollectionUnvalidatedPublishParams.Body.Tasking
                                        .TaskingCollectionRequirement
                                        .builder()
                                        .id("ISCRCOLLECTIONREQUIREMENTS")
                                        .country("VE")
                                        .cridNumbers("CRID")
                                        .criticalTimes(
                                            IsrCollectionUnvalidatedPublishParams.Body.Tasking
                                                .TaskingCollectionRequirement
                                                .CriticalTimes
                                                .builder()
                                                .earliestImagingTime(
                                                    OffsetDateTime.parse("2021-01-19T01:01:15.001Z")
                                                )
                                                .latestImagingTime(
                                                    OffsetDateTime.parse("2021-01-19T01:11:15.001Z")
                                                )
                                                .build()
                                        )
                                        .emphasized(false)
                                        .exploitationRequirement(
                                            IsrCollectionUnvalidatedPublishParams.Body.Tasking
                                                .TaskingCollectionRequirement
                                                .ExploitationRequirement
                                                .builder()
                                                .id("ISRCOLLECTIONEXPLOITATIONREQUIREMENT")
                                                .amplification("AMPLIFICATION")
                                                .dissemination("EMAILS")
                                                .eei("ESSENTIAL_ELEMENTS")
                                                .poc(
                                                    IsrCollectionUnvalidatedPublishParams.Body
                                                        .Tasking
                                                        .TaskingCollectionRequirement
                                                        .ExploitationRequirement
                                                        .Poc
                                                        .builder()
                                                        .id("ISRCOLLECTIONPOC-ID")
                                                        .callsign("CALLSIGN")
                                                        .chatName("CHAT_NAME")
                                                        .chatSystem("CHAT")
                                                        .email("EMAIL")
                                                        .name("NAME")
                                                        .notes("NOTES")
                                                        .phone("PHONE")
                                                        .radioFrequency(123.23)
                                                        .unit("UNIT")
                                                        .build()
                                                )
                                                .reportingCriteria("CRITERIA")
                                                .build()
                                        )
                                        .hash("HASH")
                                        .intelDiscipline("Sig")
                                        .isPrismCr(true)
                                        .operation("NAME")
                                        .priority(20.23)
                                        .reconSurvey("SURVEY_INFO")
                                        .recordId("RECORD-ID")
                                        .region("REGION")
                                        .secondary(false)
                                        .specialComGuidance("TEXT")
                                        .start(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                                        .stop(OffsetDateTime.parse("2021-01-19T01:20:01.001Z"))
                                        .subregion("SUBREGION")
                                        .supportedUnit("UNIT")
                                        .addTargetList("string")
                                        .type("COLLECTION_TYPE")
                                        .build()
                                )
                                .taskingCountry("CODE")
                                .taskingEmphasis("EMPHASIS")
                                .taskingJoa("AREA")
                                .taskingOperation("OP-HONEY-BADGER")
                                .taskingPrimaryIntelDiscipline("Sig")
                                .taskingPrimarySubCategory("FMV")
                                .taskingPriority(10.23)
                                .taskingRegion("REGION")
                                .taskingRetaskTime(OffsetDateTime.parse("2021-01-19T01:01:15.001Z"))
                                .taskingRole("Track Lead Vehicle")
                                .taskingSecondaryIntelDiscipline("Intelligence_2")
                                .taskingSecondarySubCategory("Convoy")
                                .taskingStartPointLat(45.23)
                                .taskingStartPointLong(45.23)
                                .taskingSubRegion("SUBREGION")
                                .taskingSupportedUnit("ENVOYS")
                                .taskingSyncMatrixBin("MATRIX")
                                .type(
                                    IsrCollectionUnvalidatedPublishParams.Body.Tasking.Type
                                        .DELIBERATE
                                )
                                .build()
                        )
                        .addTransit(
                            IsrCollectionUnvalidatedPublishParams.Body.Transit.builder()
                                .id("ISRCOLLECTIONTRANSIT-ID")
                                .base("ENVOYS")
                                .duration(200.23)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .build()
                )
                .build()
        )
    }
}
