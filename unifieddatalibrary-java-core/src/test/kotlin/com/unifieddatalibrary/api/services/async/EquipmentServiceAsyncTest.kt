// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.equipment.EquipmentCountParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateBulkParams
import com.unifieddatalibrary.api.models.equipment.EquipmentCreateParams
import com.unifieddatalibrary.api.models.equipment.EquipmentRetrieveParams
import com.unifieddatalibrary.api.models.equipment.EquipmentTupleParams
import com.unifieddatalibrary.api.models.equipment.EquipmentUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EquipmentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentServiceAsync = client.equipment()

        val future =
            equipmentServiceAsync.create(
                EquipmentCreateParams.builder()
                    .classificationMarking("U")
                    .countryCode("IQ")
                    .dataMode(EquipmentCreateParams.DataMode.TEST)
                    .lat(39.019242)
                    .lon(-104.251659)
                    .source("Bluestaq")
                    .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .airDefArea("AL006")
                    .allegiance("OTHR")
                    .altAllegiance("HL")
                    .altCountryCode("IZ")
                    .altEqpId("ORIG-EQP-ID")
                    .classRating("1")
                    .condition("RDY")
                    .conditionAvail("A")
                    .coord("340000000N0430000000E")
                    .coordDatum("WGS")
                    .coordDerivAcc(12.345)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .elevMsl(123.45)
                    .elevMslConfLvl(50)
                    .elevMslDerivAcc(12.34)
                    .eqpCode("X12345")
                    .eqpIdNum("001")
                    .eval(7)
                    .fpa("NOB")
                    .function("OCC")
                    .functPrimary("JG")
                    .geoidalMslSep(12.34)
                    .ident("FRIEND")
                    .idOperatingUnit("UNIT-ID")
                    .idParentEquipment("PARENT-EQUIPMENT-ID")
                    .idSite("SITE-ID")
                    .locReason("GR")
                    .milGrid("4QFJ12345678")
                    .milGridSys("UTM")
                    .nomen("AMPHIBIOUS WARFARE SHIP")
                    .operAreaPrimary("Territorial Sea")
                    .operStatus("OPR")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .polSubdiv("IZ07")
                    .qtyOh(7)
                    .recStatus("A")
                    .referenceDoc("Provider Reference Documentation")
                    .resProd("RT")
                    .reviewDate(LocalDate.parse("2008-06-10"))
                    .seqNum(5)
                    .addSrcId("SRC_ID_1")
                    .addSrcTyp("AIRCRAFT")
                    .symCode("SOGPU----------")
                    .utm("19P4390691376966")
                    .wac("0427")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentServiceAsync = client.equipment()

        val equipmentFullFuture =
            equipmentServiceAsync.retrieve(
                EquipmentRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val equipmentFull = equipmentFullFuture.get()
        equipmentFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentServiceAsync = client.equipment()

        val future =
            equipmentServiceAsync.update(
                EquipmentUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .countryCode("IQ")
                    .dataMode(EquipmentUpdateParams.DataMode.TEST)
                    .lat(39.019242)
                    .lon(-104.251659)
                    .source("Bluestaq")
                    .bodyId("0167f577-e06c-358e-85aa-0a07a730bdd0")
                    .airDefArea("AL006")
                    .allegiance("OTHR")
                    .altAllegiance("HL")
                    .altCountryCode("IZ")
                    .altEqpId("ORIG-EQP-ID")
                    .classRating("1")
                    .condition("RDY")
                    .conditionAvail("A")
                    .coord("340000000N0430000000E")
                    .coordDatum("WGS")
                    .coordDerivAcc(12.345)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .elevMsl(123.45)
                    .elevMslConfLvl(50)
                    .elevMslDerivAcc(12.34)
                    .eqpCode("X12345")
                    .eqpIdNum("001")
                    .eval(7)
                    .fpa("NOB")
                    .function("OCC")
                    .functPrimary("JG")
                    .geoidalMslSep(12.34)
                    .ident("FRIEND")
                    .idOperatingUnit("UNIT-ID")
                    .idParentEquipment("PARENT-EQUIPMENT-ID")
                    .idSite("SITE-ID")
                    .locReason("GR")
                    .milGrid("4QFJ12345678")
                    .milGridSys("UTM")
                    .nomen("AMPHIBIOUS WARFARE SHIP")
                    .operAreaPrimary("Territorial Sea")
                    .operStatus("OPR")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .polSubdiv("IZ07")
                    .qtyOh(7)
                    .recStatus("A")
                    .referenceDoc("Provider Reference Documentation")
                    .resProd("RT")
                    .reviewDate(LocalDate.parse("2008-06-10"))
                    .seqNum(5)
                    .addSrcId("SRC_ID_1")
                    .addSrcTyp("AIRCRAFT")
                    .symCode("SOGPU----------")
                    .utm("19P4390691376966")
                    .wac("0427")
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
        val equipmentServiceAsync = client.equipment()

        val pageFuture = equipmentServiceAsync.list()

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
        val equipmentServiceAsync = client.equipment()

        val future = equipmentServiceAsync.delete("id")

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
        val equipmentServiceAsync = client.equipment()

        val responseFuture =
            equipmentServiceAsync.count(
                EquipmentCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val equipmentServiceAsync = client.equipment()

        val future =
            equipmentServiceAsync.createBulk(
                EquipmentCreateBulkParams.builder()
                    .addBody(
                        EquipmentCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .countryCode("IQ")
                            .dataMode(EquipmentCreateBulkParams.Body.DataMode.TEST)
                            .lat(39.019242)
                            .lon(-104.251659)
                            .source("Bluestaq")
                            .id("0167f577-e06c-358e-85aa-0a07a730bdd0")
                            .airDefArea("AL006")
                            .allegiance("OTHR")
                            .altAllegiance("HL")
                            .altCountryCode("IZ")
                            .altEqpId("ORIG-EQP-ID")
                            .classRating("1")
                            .condition("RDY")
                            .conditionAvail("A")
                            .coord("340000000N0430000000E")
                            .coordDatum("WGS")
                            .coordDerivAcc(12.345)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .elevMsl(123.45)
                            .elevMslConfLvl(50)
                            .elevMslDerivAcc(12.34)
                            .eqpCode("X12345")
                            .eqpIdNum("001")
                            .eval(7)
                            .fpa("NOB")
                            .function("OCC")
                            .functPrimary("JG")
                            .geoidalMslSep(12.34)
                            .ident("FRIEND")
                            .idOperatingUnit("UNIT-ID")
                            .idParentEquipment("PARENT-EQUIPMENT-ID")
                            .idSite("SITE-ID")
                            .locReason("GR")
                            .milGrid("4QFJ12345678")
                            .milGridSys("UTM")
                            .nomen("AMPHIBIOUS WARFARE SHIP")
                            .operAreaPrimary("Territorial Sea")
                            .operStatus("OPR")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .polSubdiv("IZ07")
                            .qtyOh(7)
                            .recStatus("A")
                            .referenceDoc("Provider Reference Documentation")
                            .resProd("RT")
                            .reviewDate(LocalDate.parse("2008-06-10"))
                            .seqNum(5)
                            .addSrcId("SRC_ID_1")
                            .addSrcTyp("AIRCRAFT")
                            .symCode("SOGPU----------")
                            .utm("19P4390691376966")
                            .wac("0427")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val equipmentServiceAsync = client.equipment()

        val responseFuture = equipmentServiceAsync.queryHelp()

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
        val equipmentServiceAsync = client.equipment()

        val equipmentFullsFuture =
            equipmentServiceAsync.tuple(
                EquipmentTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val equipmentFulls = equipmentFullsFuture.get()
        equipmentFulls.forEach { it.validate() }
    }
}
