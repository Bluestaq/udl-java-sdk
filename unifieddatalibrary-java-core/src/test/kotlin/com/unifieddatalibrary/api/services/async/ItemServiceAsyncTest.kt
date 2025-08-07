// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.item.ItemCountParams
import com.unifieddatalibrary.api.models.item.ItemCreateParams
import com.unifieddatalibrary.api.models.item.ItemGetParams
import com.unifieddatalibrary.api.models.item.ItemTupleParams
import com.unifieddatalibrary.api.models.item.ItemUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.item.ItemUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ItemServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val itemServiceAsync = client.item()

        val future =
            itemServiceAsync.create(
                ItemCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(ItemCreateParams.DataMode.TEST)
                    .scanCode("12345ABCD")
                    .source("Bluestaq")
                    .type("CARGO")
                    .id("22f1f6da-a568-655a-ea37-76d013d04853")
                    .addAccSysKey("System key1")
                    .addAccSysKey("System key2")
                    .accSysNotes("Accepting System Notes")
                    .accSystem("Accepting System")
                    .addAccSysValue("System value1")
                    .addAccSysValue("System value2")
                    .airdrop(true)
                    .altDataFormat("Alt Data Format")
                    .cargoType("PALLET")
                    .centerlineOffset(3.1)
                    .cg(112.014)
                    .commodityCode("2304116")
                    .commoditySys("STCC")
                    .container(true)
                    .createdAt(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
                    .createdBy("some.user")
                    .departure("CHS")
                    .destination("RMS")
                    .dvCode("DV-2")
                    .fs(412.1)
                    .addHazCode(1.1)
                    .addHazCode(1.2)
                    .height(1.1)
                    .idAirLoadPlan("1038c389-d38e-270f-51cc-6a12e905abe8")
                    .addItemContain("2UJ8843K")
                    .addItemContain("745YV1T65")
                    .addKey("key1")
                    .addKey("key2")
                    .lastArrDate(LocalDate.parse("2023-03-13"))
                    .length(1.1)
                    .moment(4000.1)
                    .name("Product Name")
                    .netExpWt(51.437)
                    .notes("Example notes")
                    .numPalletPos(2)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .productCode("530500234")
                    .productSys("NSN")
                    .receivingBranch("Air Force")
                    .receivingUnit("50 SBN")
                    .scGenTool("bID")
                    .sourceDl("AXE")
                    .tcn("M1358232245912XXX")
                    .uln("T01ME01")
                    .addValue("value1")
                    .addValue("value2")
                    .volume(7.8902)
                    .weight(5443.335)
                    .weightTs(OffsetDateTime.parse("2023-03-13T16:06:00.123Z"))
                    .width(1.1)
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
        val itemServiceAsync = client.item()

        val future =
            itemServiceAsync.update(
                ItemUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(ItemUpdateParams.DataMode.TEST)
                    .scanCode("12345ABCD")
                    .source("Bluestaq")
                    .type("CARGO")
                    .bodyId("22f1f6da-a568-655a-ea37-76d013d04853")
                    .addAccSysKey("System key1")
                    .addAccSysKey("System key2")
                    .accSysNotes("Accepting System Notes")
                    .accSystem("Accepting System")
                    .addAccSysValue("System value1")
                    .addAccSysValue("System value2")
                    .airdrop(true)
                    .altDataFormat("Alt Data Format")
                    .cargoType("PALLET")
                    .centerlineOffset(3.1)
                    .cg(112.014)
                    .commodityCode("2304116")
                    .commoditySys("STCC")
                    .container(true)
                    .createdAt(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
                    .createdBy("some.user")
                    .departure("CHS")
                    .destination("RMS")
                    .dvCode("DV-2")
                    .fs(412.1)
                    .addHazCode(1.1)
                    .addHazCode(1.2)
                    .height(1.1)
                    .idAirLoadPlan("1038c389-d38e-270f-51cc-6a12e905abe8")
                    .addItemContain("2UJ8843K")
                    .addItemContain("745YV1T65")
                    .addKey("key1")
                    .addKey("key2")
                    .lastArrDate(LocalDate.parse("2023-03-13"))
                    .length(1.1)
                    .moment(4000.1)
                    .name("Product Name")
                    .netExpWt(51.437)
                    .notes("Example notes")
                    .numPalletPos(2)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .productCode("530500234")
                    .productSys("NSN")
                    .receivingBranch("Air Force")
                    .receivingUnit("50 SBN")
                    .scGenTool("bID")
                    .sourceDl("AXE")
                    .tcn("M1358232245912XXX")
                    .uln("T01ME01")
                    .addValue("value1")
                    .addValue("value2")
                    .volume(7.8902)
                    .weight(5443.335)
                    .weightTs(OffsetDateTime.parse("2023-03-13T16:06:00.123Z"))
                    .width(1.1)
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
        val itemServiceAsync = client.item()

        val pageFuture = itemServiceAsync.list()

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
        val itemServiceAsync = client.item()

        val future = itemServiceAsync.delete("id")

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
        val itemServiceAsync = client.item()

        val responseFuture =
            itemServiceAsync.count(ItemCountParams.builder().firstResult(0L).maxResults(0L).build())

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
        val itemServiceAsync = client.item()

        val itemFuture =
            itemServiceAsync.get(
                ItemGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val item = itemFuture.get()
        item.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val itemServiceAsync = client.item()

        val responseFuture = itemServiceAsync.queryhelp()

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
        val itemServiceAsync = client.item()

        val responseFuture =
            itemServiceAsync.tuple(
                ItemTupleParams.builder().columns("columns").firstResult(0L).maxResults(0L).build()
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
        val itemServiceAsync = client.item()

        val future =
            itemServiceAsync.unvalidatedPublish(
                ItemUnvalidatedPublishParams.builder()
                    .addBody(
                        ItemUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(ItemUnvalidatedPublishParams.Body.DataMode.TEST)
                            .scanCode("12345ABCD")
                            .source("Bluestaq")
                            .type("CARGO")
                            .id("22f1f6da-a568-655a-ea37-76d013d04853")
                            .addAccSysKey("System key1")
                            .addAccSysKey("System key2")
                            .accSysNotes("Accepting System Notes")
                            .accSystem("Accepting System")
                            .addAccSysValue("System value1")
                            .addAccSysValue("System value2")
                            .airdrop(true)
                            .altDataFormat("Alt Data Format")
                            .cargoType("PALLET")
                            .centerlineOffset(3.1)
                            .cg(112.014)
                            .commodityCode("2304116")
                            .commoditySys("STCC")
                            .container(true)
                            .createdAt(OffsetDateTime.parse("2023-03-21T16:00:00.123Z"))
                            .createdBy("some.user")
                            .departure("CHS")
                            .destination("RMS")
                            .dvCode("DV-2")
                            .fs(412.1)
                            .addHazCode(1.1)
                            .addHazCode(1.2)
                            .height(1.1)
                            .idAirLoadPlan("1038c389-d38e-270f-51cc-6a12e905abe8")
                            .addItemContain("2UJ8843K")
                            .addItemContain("745YV1T65")
                            .addKey("key1")
                            .addKey("key2")
                            .lastArrDate(LocalDate.parse("2023-03-13"))
                            .length(1.1)
                            .moment(4000.1)
                            .name("Product Name")
                            .netExpWt(51.437)
                            .notes("Example notes")
                            .numPalletPos(2)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .productCode("530500234")
                            .productSys("NSN")
                            .receivingBranch("Air Force")
                            .receivingUnit("50 SBN")
                            .scGenTool("bID")
                            .sourceDl("AXE")
                            .tcn("M1358232245912XXX")
                            .uln("T01ME01")
                            .addValue("value1")
                            .addValue("value2")
                            .volume(7.8902)
                            .weight(5443.335)
                            .weightTs(OffsetDateTime.parse("2023-03-13T16:06:00.123Z"))
                            .width(1.1)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
