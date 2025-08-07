// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.stage.StageCountParams
import com.unifieddatalibrary.api.models.stage.StageCreateParams
import com.unifieddatalibrary.api.models.stage.StageGetParams
import com.unifieddatalibrary.api.models.stage.StageTupleParams
import com.unifieddatalibrary.api.models.stage.StageUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StageServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stageServiceAsync = client.stage()

        val future =
            stageServiceAsync.create(
                StageCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(StageCreateParams.DataMode.TEST)
                    .idEngine("ENGINE-ID")
                    .idLaunchVehicle("LAUNCHVEHICLE-ID")
                    .source("Bluestaq")
                    .id("STAGE-ID")
                    .avionicsNotes("Sample Notes")
                    .burnTime(256.3)
                    .controlThruster1("controlThruster1")
                    .controlThruster2("controlThruster2")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .diameter(3.95)
                    .length(25.13)
                    .mainEngineThrustSeaLevel(733.4)
                    .mainEngineThrustVacuum(733.4)
                    .manufacturerOrgId("5feed5d7-d131-57e5-a3fd-acc173bca736")
                    .mass(9956.1)
                    .notes("Sample Notes")
                    .numBurns(1)
                    .numControlThruster1(1)
                    .numControlThruster2(1)
                    .numEngines(1)
                    .numStageElements(2)
                    .numVernier(3)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .addPhotoUrl("photoURL")
                    .restartable(true)
                    .reusable(true)
                    .stageNumber(2)
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .thrustSeaLevel(733.4)
                    .thrustVacuum(733.4)
                    .type("Electrostatic Ion")
                    .vernier("vernier")
                    .vernierBurnTime(1.1)
                    .vernierNumBurns(4)
                    .vernierThrustSeaLevel(4.1)
                    .vernierThrustVacuum(3.2)
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
        val stageServiceAsync = client.stage()

        val future =
            stageServiceAsync.update(
                StageUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(StageUpdateParams.DataMode.TEST)
                    .idEngine("ENGINE-ID")
                    .idLaunchVehicle("LAUNCHVEHICLE-ID")
                    .source("Bluestaq")
                    .bodyId("STAGE-ID")
                    .avionicsNotes("Sample Notes")
                    .burnTime(256.3)
                    .controlThruster1("controlThruster1")
                    .controlThruster2("controlThruster2")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .diameter(3.95)
                    .length(25.13)
                    .mainEngineThrustSeaLevel(733.4)
                    .mainEngineThrustVacuum(733.4)
                    .manufacturerOrgId("5feed5d7-d131-57e5-a3fd-acc173bca736")
                    .mass(9956.1)
                    .notes("Sample Notes")
                    .numBurns(1)
                    .numControlThruster1(1)
                    .numControlThruster2(1)
                    .numEngines(1)
                    .numStageElements(2)
                    .numVernier(3)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .addPhotoUrl("photoURL")
                    .restartable(true)
                    .reusable(true)
                    .stageNumber(2)
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .thrustSeaLevel(733.4)
                    .thrustVacuum(733.4)
                    .type("Electrostatic Ion")
                    .vernier("vernier")
                    .vernierBurnTime(1.1)
                    .vernierNumBurns(4)
                    .vernierThrustSeaLevel(4.1)
                    .vernierThrustVacuum(3.2)
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
        val stageServiceAsync = client.stage()

        val pageFuture = stageServiceAsync.list()

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
        val stageServiceAsync = client.stage()

        val future = stageServiceAsync.delete("id")

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
        val stageServiceAsync = client.stage()

        val responseFuture =
            stageServiceAsync.count(
                StageCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stageServiceAsync = client.stage()

        val stageFuture =
            stageServiceAsync.get(
                StageGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val stage = stageFuture.get()
        stage.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val stageServiceAsync = client.stage()

        val responseFuture = stageServiceAsync.queryhelp()

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
        val stageServiceAsync = client.stage()

        val responseFuture =
            stageServiceAsync.tuple(
                StageTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
