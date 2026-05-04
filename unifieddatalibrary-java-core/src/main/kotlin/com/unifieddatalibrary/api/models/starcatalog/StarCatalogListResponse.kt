// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.starcatalog

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The star catalog provides the position, proper motion, parallax, and photometric magnitudes at
 * various bandpasses of a star.
 */
class StarCatalogListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val astrometryOrigin: JsonField<String>,
    private val classificationMarking: JsonField<String>,
    private val csId: JsonField<Long>,
    private val dataMode: JsonField<DataMode>,
    private val dec: JsonField<Double>,
    private val ra: JsonField<Double>,
    private val source: JsonField<String>,
    private val starEpoch: JsonField<Double>,
    private val id: JsonField<String>,
    private val aavsoVsxId: JsonField<Int>,
    private val abgmag: JsonField<Double>,
    private val abgmagOrigin: JsonField<String>,
    private val abgmagUnc: JsonField<Double>,
    private val abimag: JsonField<Double>,
    private val abimagOrigin: JsonField<String>,
    private val abimagUnc: JsonField<Double>,
    private val abrmag: JsonField<Double>,
    private val abrmagOrigin: JsonField<String>,
    private val abrmagUnc: JsonField<Double>,
    private val abymag: JsonField<Double>,
    private val abymagOrigin: JsonField<String>,
    private val abymagUnc: JsonField<Double>,
    private val abzmag: JsonField<Double>,
    private val abzmagOrigin: JsonField<String>,
    private val abzmagUnc: JsonField<Double>,
    private val allWisEccInd: JsonField<String>,
    private val allWiseId: JsonField<String>,
    private val allWisEnaInd: JsonField<Int>,
    private val allWisEphQualInd: JsonField<String>,
    private val apassId: JsonField<String>,
    private val astrometricExcessNoise: JsonField<Double>,
    private val astrometricExcessNoiseSig: JsonField<Double>,
    private val bmag: JsonField<Double>,
    private val bmagOrigin: JsonField<String>,
    private val bmagUnc: JsonField<Double>,
    private val bpmag: JsonField<Double>,
    private val bpmagUnc: JsonField<Double>,
    private val carrascoCatId: JsonField<Int>,
    private val catVersion: JsonField<String>,
    private val catWise2020Id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val decUnc: JsonField<Double>,
    private val ducatiCatId: JsonField<String>,
    private val gaiadr3CatId: JsonField<Long>,
    private val gmag: JsonField<Double>,
    private val gmagUnc: JsonField<Double>,
    private val gncCatId: JsonField<Int>,
    private val healpixIndex: JsonField<Int>,
    private val hipCatId: JsonField<Int>,
    private val hmag: JsonField<Double>,
    private val hmagOrigin: JsonField<String>,
    private val hmagUnc: JsonField<Double>,
    private val imag: JsonField<Double>,
    private val imagOrigin: JsonField<String>,
    private val imagUnc: JsonField<Double>,
    private val jmag: JsonField<Double>,
    private val jmagOrigin: JsonField<String>,
    private val jmagUnc: JsonField<Double>,
    private val kmag: JsonField<Double>,
    private val kmagOrigin: JsonField<String>,
    private val kmagUnc: JsonField<Double>,
    private val morphologyInd: JsonField<Int>,
    private val multFlag: JsonField<Boolean>,
    private val multiplicity: JsonField<String>,
    private val neighborDec: JsonField<Double>,
    private val neighborDistance: JsonField<Double>,
    private val neighborFlag: JsonField<Boolean>,
    private val neighborId: JsonField<Long>,
    private val neighborRa: JsonField<Double>,
    private val nonSingleStar: JsonField<String>,
    private val numNeighbors: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val panStarrsId: JsonField<Long>,
    private val parallax: JsonField<Double>,
    private val parallaxUnc: JsonField<Double>,
    private val pmdec: JsonField<Double>,
    private val pmdecUnc: JsonField<Double>,
    private val pmra: JsonField<Double>,
    private val pmraUnc: JsonField<Double>,
    private val pmUncFlag: JsonField<Boolean>,
    private val posUncFlag: JsonField<Boolean>,
    private val ps1astrometryCorrectionFlag: JsonField<Int>,
    private val ps1ObjInfoFlag: JsonField<Int>,
    private val ps1QualityFlag: JsonField<Int>,
    private val raUnc: JsonField<Double>,
    private val rmag: JsonField<Double>,
    private val rmagOrigin: JsonField<String>,
    private val rmagUnc: JsonField<Double>,
    private val rpmag: JsonField<Double>,
    private val rpmagUnc: JsonField<Double>,
    private val ruwe: JsonField<Double>,
    private val sdaCatId: JsonField<Long>,
    private val sgmag: JsonField<Double>,
    private val sgmagUnc: JsonField<Double>,
    private val shift: JsonField<Double>,
    private val shiftFlag: JsonField<Boolean>,
    private val shiftFwhm1: JsonField<Double>,
    private val shiftFwhm6: JsonField<Double>,
    private val skyMapperId: JsonField<Int>,
    private val twoMassId: JsonField<String>,
    private val twoMassPhQualInd: JsonField<String>,
    private val twoMassReadFlag: JsonField<String>,
    private val twoMassXscId: JsonField<String>,
    private val tychoDscId: JsonField<Long>,
    private val uhsId: JsonField<Long>,
    private val ukidssGcsId: JsonField<Long>,
    private val ukidssGpsId: JsonField<Long>,
    private val ukidssLasId: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val varFlag: JsonField<Boolean>,
    private val variability: JsonField<String>,
    private val vhsId: JsonField<Long>,
    private val vmag: JsonField<Double>,
    private val vmagOrigin: JsonField<String>,
    private val vmagUnc: JsonField<Double>,
    private val w1mag: JsonField<Double>,
    private val w1magOrigin: JsonField<String>,
    private val w1magUnc: JsonField<Double>,
    private val w1sat: JsonField<Double>,
    private val w2mag: JsonField<Double>,
    private val w2magOrigin: JsonField<String>,
    private val w2magUnc: JsonField<Double>,
    private val w2sat: JsonField<Double>,
    private val w3mag: JsonField<Double>,
    private val w3magOrigin: JsonField<String>,
    private val w3magUnc: JsonField<Double>,
    private val w3sat: JsonField<Double>,
    private val w4mag: JsonField<Double>,
    private val w4magOrigin: JsonField<String>,
    private val w4magUnc: JsonField<Double>,
    private val w4sat: JsonField<Double>,
    private val wdsCatId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("astrometryOrigin")
        @ExcludeMissing
        astrometryOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("csId") @ExcludeMissing csId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("dec") @ExcludeMissing dec: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ra") @ExcludeMissing ra: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starEpoch") @ExcludeMissing starEpoch: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aavsoVsxId") @ExcludeMissing aavsoVsxId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("abgmag") @ExcludeMissing abgmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("abgmagOrigin")
        @ExcludeMissing
        abgmagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("abgmagUnc") @ExcludeMissing abgmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("abimag") @ExcludeMissing abimag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("abimagOrigin")
        @ExcludeMissing
        abimagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("abimagUnc") @ExcludeMissing abimagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("abrmag") @ExcludeMissing abrmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("abrmagOrigin")
        @ExcludeMissing
        abrmagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("abrmagUnc") @ExcludeMissing abrmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("abymag") @ExcludeMissing abymag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("abymagOrigin")
        @ExcludeMissing
        abymagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("abymagUnc") @ExcludeMissing abymagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("abzmag") @ExcludeMissing abzmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("abzmagOrigin")
        @ExcludeMissing
        abzmagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("abzmagUnc") @ExcludeMissing abzmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("allWISEccInd")
        @ExcludeMissing
        allWisEccInd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allWISEId") @ExcludeMissing allWiseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allWISEnaInd")
        @ExcludeMissing
        allWisEnaInd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("allWISEphQualInd")
        @ExcludeMissing
        allWisEphQualInd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("apassId") @ExcludeMissing apassId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("astrometricExcessNoise")
        @ExcludeMissing
        astrometricExcessNoise: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("astrometricExcessNoiseSig")
        @ExcludeMissing
        astrometricExcessNoiseSig: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bmag") @ExcludeMissing bmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bmagOrigin")
        @ExcludeMissing
        bmagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bmagUnc") @ExcludeMissing bmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bpmag") @ExcludeMissing bpmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bpmagUnc") @ExcludeMissing bpmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("carrascoCatId")
        @ExcludeMissing
        carrascoCatId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("catVersion")
        @ExcludeMissing
        catVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("catWise2020Id")
        @ExcludeMissing
        catWise2020Id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decUnc") @ExcludeMissing decUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ducatiCatId")
        @ExcludeMissing
        ducatiCatId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gaiadr3CatId")
        @ExcludeMissing
        gaiadr3CatId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("gmag") @ExcludeMissing gmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gmagUnc") @ExcludeMissing gmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("gncCatId") @ExcludeMissing gncCatId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("healpixIndex")
        @ExcludeMissing
        healpixIndex: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hipCatId") @ExcludeMissing hipCatId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hmag") @ExcludeMissing hmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hmagOrigin")
        @ExcludeMissing
        hmagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hmagUnc") @ExcludeMissing hmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("imag") @ExcludeMissing imag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("imagOrigin")
        @ExcludeMissing
        imagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imagUnc") @ExcludeMissing imagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("jmag") @ExcludeMissing jmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("jmagOrigin")
        @ExcludeMissing
        jmagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jmagUnc") @ExcludeMissing jmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("kmag") @ExcludeMissing kmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("kmagOrigin")
        @ExcludeMissing
        kmagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("kmagUnc") @ExcludeMissing kmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("morphologyInd")
        @ExcludeMissing
        morphologyInd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("multFlag") @ExcludeMissing multFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("multiplicity")
        @ExcludeMissing
        multiplicity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("neighborDec")
        @ExcludeMissing
        neighborDec: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("neighborDistance")
        @ExcludeMissing
        neighborDistance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("neighborFlag")
        @ExcludeMissing
        neighborFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("neighborId") @ExcludeMissing neighborId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("neighborRa")
        @ExcludeMissing
        neighborRa: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("nonSingleStar")
        @ExcludeMissing
        nonSingleStar: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numNeighbors")
        @ExcludeMissing
        numNeighbors: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("panStarrsId")
        @ExcludeMissing
        panStarrsId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parallax") @ExcludeMissing parallax: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("parallaxUnc")
        @ExcludeMissing
        parallaxUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pmdec") @ExcludeMissing pmdec: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pmdecUnc") @ExcludeMissing pmdecUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pmra") @ExcludeMissing pmra: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pmraUnc") @ExcludeMissing pmraUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pmUncFlag") @ExcludeMissing pmUncFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("posUncFlag")
        @ExcludeMissing
        posUncFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ps1astrometryCorrectionFlag")
        @ExcludeMissing
        ps1astrometryCorrectionFlag: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("ps1ObjInfoFlag")
        @ExcludeMissing
        ps1ObjInfoFlag: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("ps1QualityFlag")
        @ExcludeMissing
        ps1QualityFlag: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("raUnc") @ExcludeMissing raUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rmag") @ExcludeMissing rmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rmagOrigin")
        @ExcludeMissing
        rmagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rmagUnc") @ExcludeMissing rmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rpmag") @ExcludeMissing rpmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rpmagUnc") @ExcludeMissing rpmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ruwe") @ExcludeMissing ruwe: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sdaCatId") @ExcludeMissing sdaCatId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sgmag") @ExcludeMissing sgmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sgmagUnc") @ExcludeMissing sgmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("shift") @ExcludeMissing shift: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("shiftFlag") @ExcludeMissing shiftFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("shiftFWHM1")
        @ExcludeMissing
        shiftFwhm1: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("shiftFWHM6")
        @ExcludeMissing
        shiftFwhm6: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("skyMapperId") @ExcludeMissing skyMapperId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("twoMASSId") @ExcludeMissing twoMassId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("twoMassPHQualInd")
        @ExcludeMissing
        twoMassPhQualInd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("twoMassReadFlag")
        @ExcludeMissing
        twoMassReadFlag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("twoMassXscId")
        @ExcludeMissing
        twoMassXscId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tychoDscId") @ExcludeMissing tychoDscId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uhsId") @ExcludeMissing uhsId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ukidssGCSId")
        @ExcludeMissing
        ukidssGcsId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ukidssGPSId")
        @ExcludeMissing
        ukidssGpsId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ukidssLASId")
        @ExcludeMissing
        ukidssLasId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("varFlag") @ExcludeMissing varFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("variability")
        @ExcludeMissing
        variability: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vhsId") @ExcludeMissing vhsId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vmag") @ExcludeMissing vmag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("vmagOrigin")
        @ExcludeMissing
        vmagOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vmagUnc") @ExcludeMissing vmagUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w1mag") @ExcludeMissing w1mag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w1magOrigin")
        @ExcludeMissing
        w1magOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("w1magUnc") @ExcludeMissing w1magUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w1sat") @ExcludeMissing w1sat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w2mag") @ExcludeMissing w2mag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w2magOrigin")
        @ExcludeMissing
        w2magOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("w2magUnc") @ExcludeMissing w2magUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w2sat") @ExcludeMissing w2sat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w3mag") @ExcludeMissing w3mag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w3magOrigin")
        @ExcludeMissing
        w3magOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("w3magUnc") @ExcludeMissing w3magUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w3sat") @ExcludeMissing w3sat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w4mag") @ExcludeMissing w4mag: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w4magOrigin")
        @ExcludeMissing
        w4magOrigin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("w4magUnc") @ExcludeMissing w4magUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("w4sat") @ExcludeMissing w4sat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("wdsCatId") @ExcludeMissing wdsCatId: JsonField<String> = JsonMissing.of(),
    ) : this(
        astrometryOrigin,
        classificationMarking,
        csId,
        dataMode,
        dec,
        ra,
        source,
        starEpoch,
        id,
        aavsoVsxId,
        abgmag,
        abgmagOrigin,
        abgmagUnc,
        abimag,
        abimagOrigin,
        abimagUnc,
        abrmag,
        abrmagOrigin,
        abrmagUnc,
        abymag,
        abymagOrigin,
        abymagUnc,
        abzmag,
        abzmagOrigin,
        abzmagUnc,
        allWisEccInd,
        allWiseId,
        allWisEnaInd,
        allWisEphQualInd,
        apassId,
        astrometricExcessNoise,
        astrometricExcessNoiseSig,
        bmag,
        bmagOrigin,
        bmagUnc,
        bpmag,
        bpmagUnc,
        carrascoCatId,
        catVersion,
        catWise2020Id,
        createdAt,
        createdBy,
        decUnc,
        ducatiCatId,
        gaiadr3CatId,
        gmag,
        gmagUnc,
        gncCatId,
        healpixIndex,
        hipCatId,
        hmag,
        hmagOrigin,
        hmagUnc,
        imag,
        imagOrigin,
        imagUnc,
        jmag,
        jmagOrigin,
        jmagUnc,
        kmag,
        kmagOrigin,
        kmagUnc,
        morphologyInd,
        multFlag,
        multiplicity,
        neighborDec,
        neighborDistance,
        neighborFlag,
        neighborId,
        neighborRa,
        nonSingleStar,
        numNeighbors,
        origin,
        origNetwork,
        panStarrsId,
        parallax,
        parallaxUnc,
        pmdec,
        pmdecUnc,
        pmra,
        pmraUnc,
        pmUncFlag,
        posUncFlag,
        ps1astrometryCorrectionFlag,
        ps1ObjInfoFlag,
        ps1QualityFlag,
        raUnc,
        rmag,
        rmagOrigin,
        rmagUnc,
        rpmag,
        rpmagUnc,
        ruwe,
        sdaCatId,
        sgmag,
        sgmagUnc,
        shift,
        shiftFlag,
        shiftFwhm1,
        shiftFwhm6,
        skyMapperId,
        twoMassId,
        twoMassPhQualInd,
        twoMassReadFlag,
        twoMassXscId,
        tychoDscId,
        uhsId,
        ukidssGcsId,
        ukidssGpsId,
        ukidssLasId,
        updatedAt,
        updatedBy,
        varFlag,
        variability,
        vhsId,
        vmag,
        vmagOrigin,
        vmagUnc,
        w1mag,
        w1magOrigin,
        w1magUnc,
        w1sat,
        w2mag,
        w2magOrigin,
        w2magUnc,
        w2sat,
        w3mag,
        w3magOrigin,
        w3magUnc,
        w3sat,
        w4mag,
        w4magOrigin,
        w4magUnc,
        w4sat,
        wdsCatId,
        mutableMapOf(),
    )

    /**
     * Originating astrometric catalog for this object (GA (GAIA), HI (HIPPARCOS), UB (USNOBSC), AL,
     * AP, CA, CR, DU, FK6_I, FK6_III, PS, SK, TD, TP, TX, UC, UL, UH, UP, VH, VS, WD).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun astrometryOrigin(): String = astrometryOrigin.getRequired("astrometryOrigin")

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

    /**
     * The ID of this object in the specific catalog associated with this record. This field will
     * either contain the value in the gncCatId or sdaCatId field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun csId(): Long = csId.getRequired("csId")

    /**
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL: Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * TEST: Specific datasets used to evaluate compliance with specifications and requirements, and
     * for validating technical, functional, and performance characteristics.
     *
     * EXERCISE: Data pertaining to a government or military exercise. The data may include both
     * real and simulated data.
     *
     * SIMULATED: Synthetic data generated by a model to mimic real-world datasets.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Barycentric declination of the source in International Celestial Reference System (ICRS) at
     * the reference epoch, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dec(): Double = dec.getRequired("dec")

    /**
     * Barycentric right ascension of the source in the International Celestial Reference System
     * (ICRS) frame at the reference epoch, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ra(): Double = ra.getRequired("ra")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Reference epoch to which the astrometric source parameters are referred, expressed as Julian
     * Year in Barycentric Coordinate Time (TCB).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun starEpoch(): Double = starEpoch.getRequired("starEpoch")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The American Association of Variable Star Observers (AAVSO) Variable Star Index (VSX) (VX)
     * object ID of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aavsoVsxId(): Optional<Int> = aavsoVsxId.getOptional("aavsoVsxId")

    /**
     * Optical AB g magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abgmag(): Optional<Double> = abgmag.getOptional("abgmag")

    /**
     * Catalog of origin of optical AB g magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abgmagOrigin(): Optional<String> = abgmagOrigin.getOptional("abgmagOrigin")

    /**
     * Uncertainty of optical AB g magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abgmagUnc(): Optional<Double> = abgmagUnc.getOptional("abgmagUnc")

    /**
     * Optical AB i magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abimag(): Optional<Double> = abimag.getOptional("abimag")

    /**
     * Catalog of origin of optical AB i magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abimagOrigin(): Optional<String> = abimagOrigin.getOptional("abimagOrigin")

    /**
     * Uncertainty of optical AB i magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abimagUnc(): Optional<Double> = abimagUnc.getOptional("abimagUnc")

    /**
     * Optical AB r magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abrmag(): Optional<Double> = abrmag.getOptional("abrmag")

    /**
     * Catalog of origin of optical AB r magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abrmagOrigin(): Optional<String> = abrmagOrigin.getOptional("abrmagOrigin")

    /**
     * Uncertainty of optical AB r magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abrmagUnc(): Optional<Double> = abrmagUnc.getOptional("abrmagUnc")

    /**
     * Optical AB y magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abymag(): Optional<Double> = abymag.getOptional("abymag")

    /**
     * Catalog of origin of optical AB y magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abymagOrigin(): Optional<String> = abymagOrigin.getOptional("abymagOrigin")

    /**
     * Uncertainty of optical AB y magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abymagUnc(): Optional<Double> = abymagUnc.getOptional("abymagUnc")

    /**
     * Optical AB z magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abzmag(): Optional<Double> = abzmag.getOptional("abzmag")

    /**
     * Catalog of origin of optical AB z magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abzmagOrigin(): Optional<String> = abzmagOrigin.getOptional("abzmagOrigin")

    /**
     * Uncertainty of optical AB z magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun abzmagUnc(): Optional<Double> = abzmagUnc.getOptional("abzmagUnc")

    /**
     * Contamination and confusion indicator in AllWISE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun allWisEccInd(): Optional<String> = allWisEccInd.getOptional("allWISEccInd")

    /**
     * The designation of this object in the All Wide-field Infrared Survey Explorer (AllWISE)
     * catalog (AL).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun allWiseId(): Optional<String> = allWiseId.getOptional("allWISEId")

    /**
     * Active deblending indicator in AllWISE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun allWisEnaInd(): Optional<Int> = allWisEnaInd.getOptional("allWISEnaInd")

    /**
     * Photometric quality indicator in AllWISE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun allWisEphQualInd(): Optional<String> = allWisEphQualInd.getOptional("allWISEphQualInd")

    /**
     * The American Association of Variable Star Observers (AAVSO) Photometric All-Sky Survey
     * (APASS) (AP) name of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun apassId(): Optional<String> = apassId.getOptional("apassId")

    /**
     * Astrometric excess noise in the Gaia catalog measured in milliarcseconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun astrometricExcessNoise(): Optional<Double> =
        astrometricExcessNoise.getOptional("astrometricExcessNoise")

    /**
     * Astrometric excess noise sigma in Gaia.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun astrometricExcessNoiseSig(): Optional<Double> =
        astrometricExcessNoiseSig.getOptional("astrometricExcessNoiseSig")

    /**
     * Optical Johnson B magnitude measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bmag(): Optional<Double> = bmag.getOptional("bmag")

    /**
     * Catalog of origin of optical Johnson B magnitude (AP, CR, HI).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bmagOrigin(): Optional<String> = bmagOrigin.getOptional("bmagOrigin")

    /**
     * Uncertainty of optical Johnson B magnitude measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bmagUnc(): Optional<Double> = bmagUnc.getOptional("bmagUnc")

    /**
     * Gaia optical photometric Bp-band in the Vega scale measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bpmag(): Optional<Double> = bpmag.getOptional("bpmag")

    /**
     * Gaia optical Bp-band uncertainty in the Vega scale measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bpmagUnc(): Optional<Double> = bpmagUnc.getOptional("bpmagUnc")

    /**
     * The Carrasco catalog (CR) identifier of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun carrascoCatId(): Optional<Int> = carrascoCatId.getOptional("carrascoCatId")

    /**
     * The version of the catalog associated with this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun catVersion(): Optional<String> = catVersion.getOptional("catVersion")

    /**
     * The CatWISE2020 (CA) catalog source ID of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun catWise2020Id(): Optional<String> = catWise2020Id.getOptional("catWise2020Id")

    /**
     * Time the row was created in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Uncertainty of the declination of the source, in milliarcseconds, at the reference epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun decUnc(): Optional<Double> = decUnc.getOptional("decUnc")

    /**
     * The Ducati catalog (DU) name of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ducatiCatId(): Optional<String> = ducatiCatId.getOptional("ducatiCatId")

    /**
     * The source ID of this object in the Gaia DR3 Catalog (GA).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gaiadr3CatId(): Optional<Long> = gaiadr3CatId.getOptional("gaiadr3CatId")

    /**
     * Gaia optical photometric G-band in the Vega scale measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gmag(): Optional<Double> = gmag.getOptional("gmag")

    /**
     * Gaia optical photometric G-band uncertainty in the Vega scale measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gmagUnc(): Optional<Double> = gmagUnc.getOptional("gmagUnc")

    /**
     * The ID of this object in the Guidance and Navigation Control (GNC) Catalog. If this field is
     * populated it shall match the csId field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gncCatId(): Optional<Int> = gncCatId.getOptional("gncCatId")

    /**
     * The Healpix index. Consumers should contact the provider for details on the indexing scheme.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun healpixIndex(): Optional<Int> = healpixIndex.getOptional("healpixIndex")

    /**
     * The HIP ID of this object in the Hipparcos Catalog (HI).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hipCatId(): Optional<Int> = hipCatId.getOptional("hipCatId")

    /**
     * Near-infrared photometric H-band magnitude in the Vega scale measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hmag(): Optional<Double> = hmag.getOptional("hmag")

    /**
     * Near-infrared photometric H-band catalog of origin in the Vega scale (TP, UC, UL, UP, VH).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hmagOrigin(): Optional<String> = hmagOrigin.getOptional("hmagOrigin")

    /**
     * Near-infrared photometric H-band magnitude uncertainty in the Vega scale measured in
     * magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hmagUnc(): Optional<Double> = hmagUnc.getOptional("hmagUnc")

    /**
     * Optical Johnson I magnitude measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun imag(): Optional<Double> = imag.getOptional("imag")

    /**
     * Catalog of origin of optical Johnson I magnitude (CR, GA, HI).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun imagOrigin(): Optional<String> = imagOrigin.getOptional("imagOrigin")

    /**
     * Uncertainty of optical Johnson I magnitude measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun imagUnc(): Optional<Double> = imagUnc.getOptional("imagUnc")

    /**
     * Near-infrared photometric J-band magnitude in the Vega scale measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jmag(): Optional<Double> = jmag.getOptional("jmag")

    /**
     * Near-infrared photometric J-band catalog of origin in the Vega scale (TP, UH, UL, UP, VH).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jmagOrigin(): Optional<String> = jmagOrigin.getOptional("jmagOrigin")

    /**
     * Near-infrared photometric J-band magnitude uncertainty in the Vega scale measured in
     * magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jmagUnc(): Optional<Double> = jmagUnc.getOptional("jmagUnc")

    /**
     * Near-infrared photometric K-band magnitude in the Vega scale measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun kmag(): Optional<Double> = kmag.getOptional("kmag")

    /**
     * Near-infrared photometric K-band catalog of origin in the Vega scale (TP, UC, UH, UL, UP,
     * VH).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun kmagOrigin(): Optional<String> = kmagOrigin.getOptional("kmagOrigin")

    /**
     * Near-infrared photometric K-band magnitude uncertainty in the Vega scale measured in
     * magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun kmagUnc(): Optional<Double> = kmagUnc.getOptional("kmagUnc")

    /**
     * Morphology indicator. Consumers should contact the provider for details on the
     * specifications.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun morphologyInd(): Optional<Int> = morphologyInd.getOptional("morphologyInd")

    /**
     * Flag indicating that this is a multiple object source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun multFlag(): Optional<Boolean> = multFlag.getOptional("multFlag")

    /**
     * Identifier indicating multiplicity is detected. Consumers should contact the provider for
     * details on the specifications.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun multiplicity(): Optional<String> = multiplicity.getOptional("multiplicity")

    /**
     * Dec of nearest neighbor measured in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun neighborDec(): Optional<Double> = neighborDec.getOptional("neighborDec")

    /**
     * Distance between source and nearest neighbor, in arcseconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun neighborDistance(): Optional<Double> = neighborDistance.getOptional("neighborDistance")

    /**
     * Flag indicating that the nearest catalog neighbor is closer than 4.6 arcseconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun neighborFlag(): Optional<Boolean> = neighborFlag.getOptional("neighborFlag")

    /**
     * The catalog ID of the nearest neighbor to this source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun neighborId(): Optional<Long> = neighborId.getOptional("neighborId")

    /**
     * RA of nearest neighbor measured in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun neighborRa(): Optional<Double> = neighborRa.getOptional("neighborRa")

    /**
     * Identifier indicating the source is a non-single star in gaia (additional information is
     * available in non-single star tables. Consumers should contact the provider for details on the
     * specifications).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nonSingleStar(): Optional<String> = nonSingleStar.getOptional("nonSingleStar")

    /**
     * Number of neighbors.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numNeighbors(): Optional<Int> = numNeighbors.getOptional("numNeighbors")

    /**
     * Originating system or organization which produced the data, if different from the source. The
     * origin may be different than the source if the source was a mediating system which forwarded
     * the data on behalf of the origin system. If null, the source may be assumed to be the origin.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origin(): Optional<String> = origin.getOptional("origin")

    /**
     * The originating source network on which this record was created, auto-populated by the
     * system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

    /**
     * The Panoramic Survey Telescope and Rapid Response System (Pan-STARRS) (PS) object ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun panStarrsId(): Optional<Long> = panStarrsId.getOptional("panStarrsId")

    /**
     * Absolute stellar parallax of the source, in milliarcseconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun parallax(): Optional<Double> = parallax.getOptional("parallax")

    /**
     * Uncertainty of the stellar parallax, in milliarcseconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun parallaxUnc(): Optional<Double> = parallaxUnc.getOptional("parallaxUnc")

    /**
     * Proper motion in declination of the source, in milliarcseconds per year, at the reference
     * epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pmdec(): Optional<Double> = pmdec.getOptional("pmdec")

    /**
     * Uncertainty of proper motion in declination, in milliarcseconds per year.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pmdecUnc(): Optional<Double> = pmdecUnc.getOptional("pmdecUnc")

    /**
     * Proper motion in right ascension of the source, in milliarcseconds per year, at the reference
     * epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pmra(): Optional<Double> = pmra.getOptional("pmra")

    /**
     * Uncertainty of proper motion in right ascension, in milliarcseconds per year.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pmraUnc(): Optional<Double> = pmraUnc.getOptional("pmraUnc")

    /**
     * Flag indicating that the proper motion uncertainty in either ra or dec is greater than 10
     * milliarcseconds per year.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pmUncFlag(): Optional<Boolean> = pmUncFlag.getOptional("pmUncFlag")

    /**
     * Flag indicating that the position uncertainty in either ra or dec is greater than 100
     * milliarcseconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun posUncFlag(): Optional<Boolean> = posUncFlag.getOptional("posUncFlag")

    /**
     * Astrometry correction flag in Pan-STARRS.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ps1astrometryCorrectionFlag(): Optional<Int> =
        ps1astrometryCorrectionFlag.getOptional("ps1astrometryCorrectionFlag")

    /**
     * Object information flag in Pan-STARRS.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ps1ObjInfoFlag(): Optional<Int> = ps1ObjInfoFlag.getOptional("ps1ObjInfoFlag")

    /**
     * Quality flag in Pan-STARRS.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ps1QualityFlag(): Optional<Int> = ps1QualityFlag.getOptional("ps1QualityFlag")

    /**
     * Uncertainty of the right ascension of the source, in milliarcseconds, at the reference epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun raUnc(): Optional<Double> = raUnc.getOptional("raUnc")

    /**
     * Optical Johnson R magnitude measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rmag(): Optional<Double> = rmag.getOptional("rmag")

    /**
     * Catalog of origin of the Optical Johnson R magnitude (CR, GA).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rmagOrigin(): Optional<String> = rmagOrigin.getOptional("rmagOrigin")

    /**
     * Uncertainty of the Optical Johnson R magnitude measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rmagUnc(): Optional<Double> = rmagUnc.getOptional("rmagUnc")

    /**
     * Gaia optical Rp-band in the Vega scale measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rpmag(): Optional<Double> = rpmag.getOptional("rpmag")

    /**
     * Gaia optical photometric Rp-band uncertainty in the Vega scale measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rpmagUnc(): Optional<Double> = rpmagUnc.getOptional("rpmagUnc")

    /**
     * RUWE in Gaia.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ruwe(): Optional<Double> = ruwe.getOptional("ruwe")

    /**
     * The ID of this object in the Space Domain Awareness (SDA) Catalog. If this field is populated
     * it shall match the csId field.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sdaCatId(): Optional<Long> = sdaCatId.getOptional("sdaCatId")

    /**
     * Original G magnitude if the source is in Gaia, otherwise the magnitude is converted from
     * other photometric passbands, when possible, measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sgmag(): Optional<Double> = sgmag.getOptional("sgmag")

    /**
     * Uncertainty of sgmag measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sgmagUnc(): Optional<Double> = sgmagUnc.getOptional("sgmagUnc")

    /**
     * Photocentric shift caused by neighbors, in arcseconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shift(): Optional<Double> = shift.getOptional("shift")

    /**
     * Flag indicating that the photocentric shift is greater than 50 milliarcseconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shiftFlag(): Optional<Boolean> = shiftFlag.getOptional("shiftFlag")

    /**
     * Photocentric shift caused by neighbors, in arcseconds. This value is constrained to a Point
     * Spread Function (PSF) with Full Width at Half Maximum (FWHM) of one arcsecond.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shiftFwhm1(): Optional<Double> = shiftFwhm1.getOptional("shiftFWHM1")

    /**
     * Photocentric shift caused by neighbors, in arcseconds. This value is constrained to a Point
     * Spread Function (PSF) with Full Width at Half Maximum (FWHM) of six arcseconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shiftFwhm6(): Optional<Double> = shiftFwhm6.getOptional("shiftFWHM6")

    /**
     * The SkyMapper (SK) catalog object ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun skyMapperId(): Optional<Int> = skyMapperId.getOptional("skyMapperId")

    /**
     * The designation of this object in the Two Micron All Sky Survey (2MASS) Point Source Catalog
     * (TP).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun twoMassId(): Optional<String> = twoMassId.getOptional("twoMASSId")

    /**
     * Photometric (PH) quality indicator in 2MASS PSC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun twoMassPhQualInd(): Optional<String> = twoMassPhQualInd.getOptional("twoMassPHQualInd")

    /**
     * Read flag in 2MASS PSC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun twoMassReadFlag(): Optional<String> = twoMassReadFlag.getOptional("twoMassReadFlag")

    /**
     * The Two Micron All Sky Survey (2MASS) Extended Source Catalog (XSC) (TX) designation of this
     * object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun twoMassXscId(): Optional<String> = twoMassXscId.getOptional("twoMassXscId")

    /**
     * The Tycho Double Star Catalog (TD) identifier (specified as Tycho-2 ID) of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tychoDscId(): Optional<Long> = tychoDscId.getOptional("tychoDscId")

    /**
     * The United Kingdom Infrared Telescope (UKIRT) Hemispheric Survey (UHS) (UH) source ID of this
     * object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun uhsId(): Optional<Long> = uhsId.getOptional("uhsId")

    /**
     * The United Kingdom Infrared Deep Sky Survey (UKIDSS) Galactic Clusters Survey (GCS) (UC)
     * source ID of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ukidssGcsId(): Optional<Long> = ukidssGcsId.getOptional("ukidssGCSId")

    /**
     * The United Kingdom Infrared Deep Sky Survey (UKIDSS) Galactic Plane Survey (GPS) (UP) source
     * ID of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ukidssGpsId(): Optional<Long> = ukidssGpsId.getOptional("ukidssGPSId")

    /**
     * The United Kingdom Infrared Deep Sky Survey (UKIDSS) Large Area Survey (LAS) (UL) source ID
     * of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ukidssLasId(): Optional<Long> = ukidssLasId.getOptional("ukidssLASId")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

    /**
     * Flag indicating that the source exhibits variable magnitude.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun varFlag(): Optional<Boolean> = varFlag.getOptional("varFlag")

    /**
     * Identifier indicating variability is present in the photometric data. Consumers should
     * contact the provider for details on the specifications.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun variability(): Optional<String> = variability.getOptional("variability")

    /**
     * The Visible and Infrared Survey Telescope for Astronomy (VISTA) Hemisphere Survey (VHS) (VS)
     * source ID of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vhsId(): Optional<Long> = vhsId.getOptional("vhsId")

    /**
     * Optical Johnson V magnitude measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vmag(): Optional<Double> = vmag.getOptional("vmag")

    /**
     * Catalog of origin of Optical Johnson V magnitude (AP, CR, DU, GA, HI).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vmagOrigin(): Optional<String> = vmagOrigin.getOptional("vmagOrigin")

    /**
     * Uncertainty of the Optical Johnson V magnitude measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vmagUnc(): Optional<Double> = vmagUnc.getOptional("vmagUnc")

    /**
     * Mid-infrared photometric W1-band (3.4 microns) magnitude in the Vega system measured in
     * magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w1mag(): Optional<Double> = w1mag.getOptional("w1mag")

    /**
     * Mid-infrared photometric W1-band (3.4 microns) catalog of origin in the Vega system (AL, CA).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w1magOrigin(): Optional<String> = w1magOrigin.getOptional("w1magOrigin")

    /**
     * Mid-infrared photometric W1-band (3.4 microns) magnitude uncertainty in the Vega system
     * measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w1magUnc(): Optional<Double> = w1magUnc.getOptional("w1magUnc")

    /**
     * Mid-infrared photometric W1-band (3.4 microns) saturated pixel fraction in the Vega system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w1sat(): Optional<Double> = w1sat.getOptional("w1sat")

    /**
     * Mid-infrared photometric W2-band (4.6 microns) magnitude in the Vega system measured in
     * magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w2mag(): Optional<Double> = w2mag.getOptional("w2mag")

    /**
     * Mid-infrared photometric W2-band (4.6 microns) catalog of origin in the Vega system (AL, CA).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w2magOrigin(): Optional<String> = w2magOrigin.getOptional("w2magOrigin")

    /**
     * Mid-infrared photometric W2-band (4.6 microns) magnitude uncertainty in the Vega system
     * measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w2magUnc(): Optional<Double> = w2magUnc.getOptional("w2magUnc")

    /**
     * Mid-infrared photometric W2-band (4.6 microns) saturated pixel fraction in the Vega system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w2sat(): Optional<Double> = w2sat.getOptional("w2sat")

    /**
     * Mid-infrared photometric W3-band (12 microns) magnitude in the Vega system measured in
     * magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w3mag(): Optional<Double> = w3mag.getOptional("w3mag")

    /**
     * Mid-infrared photometric W3-band (12 microns) catalog of origin in the Vega system (AL).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w3magOrigin(): Optional<String> = w3magOrigin.getOptional("w3magOrigin")

    /**
     * Mid-infrared photometric W3-band (12 microns) magnitude uncertainty in the Vega system
     * measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w3magUnc(): Optional<Double> = w3magUnc.getOptional("w3magUnc")

    /**
     * Mid-infrared photometric W3-band (12 microns) saturated pixel fraction in the Vega system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w3sat(): Optional<Double> = w3sat.getOptional("w3sat")

    /**
     * Mid-infrared photometric W4-band (22 microns) magnitude in the Vega system measured in
     * magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w4mag(): Optional<Double> = w4mag.getOptional("w4mag")

    /**
     * Mid-infrared photometric W4-band (22 microns) catalog of origin in the Vega system (AL).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w4magOrigin(): Optional<String> = w4magOrigin.getOptional("w4magOrigin")

    /**
     * Mid-infrared photometric W4-band (22 microns) magnitude uncertainty in the Vega system
     * measured in magnitudes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w4magUnc(): Optional<Double> = w4magUnc.getOptional("w4magUnc")

    /**
     * Mid-infrared photometric W4-band (22 microns) saturated pixel fraction in the Vega system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun w4sat(): Optional<Double> = w4sat.getOptional("w4sat")

    /**
     * The Washington Double Star Catalog (WD) identifier of this object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wdsCatId(): Optional<String> = wdsCatId.getOptional("wdsCatId")

    /**
     * Returns the raw JSON value of [astrometryOrigin].
     *
     * Unlike [astrometryOrigin], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("astrometryOrigin")
    @ExcludeMissing
    fun _astrometryOrigin(): JsonField<String> = astrometryOrigin

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("classificationMarking")
    @ExcludeMissing
    fun _classificationMarking(): JsonField<String> = classificationMarking

    /**
     * Returns the raw JSON value of [csId].
     *
     * Unlike [csId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("csId") @ExcludeMissing fun _csId(): JsonField<Long> = csId

    /**
     * Returns the raw JSON value of [dataMode].
     *
     * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

    /**
     * Returns the raw JSON value of [dec].
     *
     * Unlike [dec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dec") @ExcludeMissing fun _dec(): JsonField<Double> = dec

    /**
     * Returns the raw JSON value of [ra].
     *
     * Unlike [ra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ra") @ExcludeMissing fun _ra(): JsonField<Double> = ra

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [starEpoch].
     *
     * Unlike [starEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starEpoch") @ExcludeMissing fun _starEpoch(): JsonField<Double> = starEpoch

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [aavsoVsxId].
     *
     * Unlike [aavsoVsxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aavsoVsxId") @ExcludeMissing fun _aavsoVsxId(): JsonField<Int> = aavsoVsxId

    /**
     * Returns the raw JSON value of [abgmag].
     *
     * Unlike [abgmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abgmag") @ExcludeMissing fun _abgmag(): JsonField<Double> = abgmag

    /**
     * Returns the raw JSON value of [abgmagOrigin].
     *
     * Unlike [abgmagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abgmagOrigin")
    @ExcludeMissing
    fun _abgmagOrigin(): JsonField<String> = abgmagOrigin

    /**
     * Returns the raw JSON value of [abgmagUnc].
     *
     * Unlike [abgmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abgmagUnc") @ExcludeMissing fun _abgmagUnc(): JsonField<Double> = abgmagUnc

    /**
     * Returns the raw JSON value of [abimag].
     *
     * Unlike [abimag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abimag") @ExcludeMissing fun _abimag(): JsonField<Double> = abimag

    /**
     * Returns the raw JSON value of [abimagOrigin].
     *
     * Unlike [abimagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abimagOrigin")
    @ExcludeMissing
    fun _abimagOrigin(): JsonField<String> = abimagOrigin

    /**
     * Returns the raw JSON value of [abimagUnc].
     *
     * Unlike [abimagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abimagUnc") @ExcludeMissing fun _abimagUnc(): JsonField<Double> = abimagUnc

    /**
     * Returns the raw JSON value of [abrmag].
     *
     * Unlike [abrmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abrmag") @ExcludeMissing fun _abrmag(): JsonField<Double> = abrmag

    /**
     * Returns the raw JSON value of [abrmagOrigin].
     *
     * Unlike [abrmagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abrmagOrigin")
    @ExcludeMissing
    fun _abrmagOrigin(): JsonField<String> = abrmagOrigin

    /**
     * Returns the raw JSON value of [abrmagUnc].
     *
     * Unlike [abrmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abrmagUnc") @ExcludeMissing fun _abrmagUnc(): JsonField<Double> = abrmagUnc

    /**
     * Returns the raw JSON value of [abymag].
     *
     * Unlike [abymag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abymag") @ExcludeMissing fun _abymag(): JsonField<Double> = abymag

    /**
     * Returns the raw JSON value of [abymagOrigin].
     *
     * Unlike [abymagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abymagOrigin")
    @ExcludeMissing
    fun _abymagOrigin(): JsonField<String> = abymagOrigin

    /**
     * Returns the raw JSON value of [abymagUnc].
     *
     * Unlike [abymagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abymagUnc") @ExcludeMissing fun _abymagUnc(): JsonField<Double> = abymagUnc

    /**
     * Returns the raw JSON value of [abzmag].
     *
     * Unlike [abzmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abzmag") @ExcludeMissing fun _abzmag(): JsonField<Double> = abzmag

    /**
     * Returns the raw JSON value of [abzmagOrigin].
     *
     * Unlike [abzmagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abzmagOrigin")
    @ExcludeMissing
    fun _abzmagOrigin(): JsonField<String> = abzmagOrigin

    /**
     * Returns the raw JSON value of [abzmagUnc].
     *
     * Unlike [abzmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abzmagUnc") @ExcludeMissing fun _abzmagUnc(): JsonField<Double> = abzmagUnc

    /**
     * Returns the raw JSON value of [allWisEccInd].
     *
     * Unlike [allWisEccInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allWISEccInd")
    @ExcludeMissing
    fun _allWisEccInd(): JsonField<String> = allWisEccInd

    /**
     * Returns the raw JSON value of [allWiseId].
     *
     * Unlike [allWiseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allWISEId") @ExcludeMissing fun _allWiseId(): JsonField<String> = allWiseId

    /**
     * Returns the raw JSON value of [allWisEnaInd].
     *
     * Unlike [allWisEnaInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allWISEnaInd") @ExcludeMissing fun _allWisEnaInd(): JsonField<Int> = allWisEnaInd

    /**
     * Returns the raw JSON value of [allWisEphQualInd].
     *
     * Unlike [allWisEphQualInd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allWISEphQualInd")
    @ExcludeMissing
    fun _allWisEphQualInd(): JsonField<String> = allWisEphQualInd

    /**
     * Returns the raw JSON value of [apassId].
     *
     * Unlike [apassId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apassId") @ExcludeMissing fun _apassId(): JsonField<String> = apassId

    /**
     * Returns the raw JSON value of [astrometricExcessNoise].
     *
     * Unlike [astrometricExcessNoise], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("astrometricExcessNoise")
    @ExcludeMissing
    fun _astrometricExcessNoise(): JsonField<Double> = astrometricExcessNoise

    /**
     * Returns the raw JSON value of [astrometricExcessNoiseSig].
     *
     * Unlike [astrometricExcessNoiseSig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("astrometricExcessNoiseSig")
    @ExcludeMissing
    fun _astrometricExcessNoiseSig(): JsonField<Double> = astrometricExcessNoiseSig

    /**
     * Returns the raw JSON value of [bmag].
     *
     * Unlike [bmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bmag") @ExcludeMissing fun _bmag(): JsonField<Double> = bmag

    /**
     * Returns the raw JSON value of [bmagOrigin].
     *
     * Unlike [bmagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bmagOrigin") @ExcludeMissing fun _bmagOrigin(): JsonField<String> = bmagOrigin

    /**
     * Returns the raw JSON value of [bmagUnc].
     *
     * Unlike [bmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bmagUnc") @ExcludeMissing fun _bmagUnc(): JsonField<Double> = bmagUnc

    /**
     * Returns the raw JSON value of [bpmag].
     *
     * Unlike [bpmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bpmag") @ExcludeMissing fun _bpmag(): JsonField<Double> = bpmag

    /**
     * Returns the raw JSON value of [bpmagUnc].
     *
     * Unlike [bpmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bpmagUnc") @ExcludeMissing fun _bpmagUnc(): JsonField<Double> = bpmagUnc

    /**
     * Returns the raw JSON value of [carrascoCatId].
     *
     * Unlike [carrascoCatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("carrascoCatId")
    @ExcludeMissing
    fun _carrascoCatId(): JsonField<Int> = carrascoCatId

    /**
     * Returns the raw JSON value of [catVersion].
     *
     * Unlike [catVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("catVersion") @ExcludeMissing fun _catVersion(): JsonField<String> = catVersion

    /**
     * Returns the raw JSON value of [catWise2020Id].
     *
     * Unlike [catWise2020Id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("catWise2020Id")
    @ExcludeMissing
    fun _catWise2020Id(): JsonField<String> = catWise2020Id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [decUnc].
     *
     * Unlike [decUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decUnc") @ExcludeMissing fun _decUnc(): JsonField<Double> = decUnc

    /**
     * Returns the raw JSON value of [ducatiCatId].
     *
     * Unlike [ducatiCatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ducatiCatId") @ExcludeMissing fun _ducatiCatId(): JsonField<String> = ducatiCatId

    /**
     * Returns the raw JSON value of [gaiadr3CatId].
     *
     * Unlike [gaiadr3CatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gaiadr3CatId")
    @ExcludeMissing
    fun _gaiadr3CatId(): JsonField<Long> = gaiadr3CatId

    /**
     * Returns the raw JSON value of [gmag].
     *
     * Unlike [gmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gmag") @ExcludeMissing fun _gmag(): JsonField<Double> = gmag

    /**
     * Returns the raw JSON value of [gmagUnc].
     *
     * Unlike [gmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gmagUnc") @ExcludeMissing fun _gmagUnc(): JsonField<Double> = gmagUnc

    /**
     * Returns the raw JSON value of [gncCatId].
     *
     * Unlike [gncCatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gncCatId") @ExcludeMissing fun _gncCatId(): JsonField<Int> = gncCatId

    /**
     * Returns the raw JSON value of [healpixIndex].
     *
     * Unlike [healpixIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("healpixIndex") @ExcludeMissing fun _healpixIndex(): JsonField<Int> = healpixIndex

    /**
     * Returns the raw JSON value of [hipCatId].
     *
     * Unlike [hipCatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hipCatId") @ExcludeMissing fun _hipCatId(): JsonField<Int> = hipCatId

    /**
     * Returns the raw JSON value of [hmag].
     *
     * Unlike [hmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hmag") @ExcludeMissing fun _hmag(): JsonField<Double> = hmag

    /**
     * Returns the raw JSON value of [hmagOrigin].
     *
     * Unlike [hmagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hmagOrigin") @ExcludeMissing fun _hmagOrigin(): JsonField<String> = hmagOrigin

    /**
     * Returns the raw JSON value of [hmagUnc].
     *
     * Unlike [hmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hmagUnc") @ExcludeMissing fun _hmagUnc(): JsonField<Double> = hmagUnc

    /**
     * Returns the raw JSON value of [imag].
     *
     * Unlike [imag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imag") @ExcludeMissing fun _imag(): JsonField<Double> = imag

    /**
     * Returns the raw JSON value of [imagOrigin].
     *
     * Unlike [imagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imagOrigin") @ExcludeMissing fun _imagOrigin(): JsonField<String> = imagOrigin

    /**
     * Returns the raw JSON value of [imagUnc].
     *
     * Unlike [imagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imagUnc") @ExcludeMissing fun _imagUnc(): JsonField<Double> = imagUnc

    /**
     * Returns the raw JSON value of [jmag].
     *
     * Unlike [jmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jmag") @ExcludeMissing fun _jmag(): JsonField<Double> = jmag

    /**
     * Returns the raw JSON value of [jmagOrigin].
     *
     * Unlike [jmagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jmagOrigin") @ExcludeMissing fun _jmagOrigin(): JsonField<String> = jmagOrigin

    /**
     * Returns the raw JSON value of [jmagUnc].
     *
     * Unlike [jmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jmagUnc") @ExcludeMissing fun _jmagUnc(): JsonField<Double> = jmagUnc

    /**
     * Returns the raw JSON value of [kmag].
     *
     * Unlike [kmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kmag") @ExcludeMissing fun _kmag(): JsonField<Double> = kmag

    /**
     * Returns the raw JSON value of [kmagOrigin].
     *
     * Unlike [kmagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kmagOrigin") @ExcludeMissing fun _kmagOrigin(): JsonField<String> = kmagOrigin

    /**
     * Returns the raw JSON value of [kmagUnc].
     *
     * Unlike [kmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kmagUnc") @ExcludeMissing fun _kmagUnc(): JsonField<Double> = kmagUnc

    /**
     * Returns the raw JSON value of [morphologyInd].
     *
     * Unlike [morphologyInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("morphologyInd")
    @ExcludeMissing
    fun _morphologyInd(): JsonField<Int> = morphologyInd

    /**
     * Returns the raw JSON value of [multFlag].
     *
     * Unlike [multFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multFlag") @ExcludeMissing fun _multFlag(): JsonField<Boolean> = multFlag

    /**
     * Returns the raw JSON value of [multiplicity].
     *
     * Unlike [multiplicity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multiplicity")
    @ExcludeMissing
    fun _multiplicity(): JsonField<String> = multiplicity

    /**
     * Returns the raw JSON value of [neighborDec].
     *
     * Unlike [neighborDec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("neighborDec") @ExcludeMissing fun _neighborDec(): JsonField<Double> = neighborDec

    /**
     * Returns the raw JSON value of [neighborDistance].
     *
     * Unlike [neighborDistance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("neighborDistance")
    @ExcludeMissing
    fun _neighborDistance(): JsonField<Double> = neighborDistance

    /**
     * Returns the raw JSON value of [neighborFlag].
     *
     * Unlike [neighborFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("neighborFlag")
    @ExcludeMissing
    fun _neighborFlag(): JsonField<Boolean> = neighborFlag

    /**
     * Returns the raw JSON value of [neighborId].
     *
     * Unlike [neighborId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("neighborId") @ExcludeMissing fun _neighborId(): JsonField<Long> = neighborId

    /**
     * Returns the raw JSON value of [neighborRa].
     *
     * Unlike [neighborRa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("neighborRa") @ExcludeMissing fun _neighborRa(): JsonField<Double> = neighborRa

    /**
     * Returns the raw JSON value of [nonSingleStar].
     *
     * Unlike [nonSingleStar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nonSingleStar")
    @ExcludeMissing
    fun _nonSingleStar(): JsonField<String> = nonSingleStar

    /**
     * Returns the raw JSON value of [numNeighbors].
     *
     * Unlike [numNeighbors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numNeighbors") @ExcludeMissing fun _numNeighbors(): JsonField<Int> = numNeighbors

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [origNetwork].
     *
     * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origNetwork") @ExcludeMissing fun _origNetwork(): JsonField<String> = origNetwork

    /**
     * Returns the raw JSON value of [panStarrsId].
     *
     * Unlike [panStarrsId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("panStarrsId") @ExcludeMissing fun _panStarrsId(): JsonField<Long> = panStarrsId

    /**
     * Returns the raw JSON value of [parallax].
     *
     * Unlike [parallax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parallax") @ExcludeMissing fun _parallax(): JsonField<Double> = parallax

    /**
     * Returns the raw JSON value of [parallaxUnc].
     *
     * Unlike [parallaxUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parallaxUnc") @ExcludeMissing fun _parallaxUnc(): JsonField<Double> = parallaxUnc

    /**
     * Returns the raw JSON value of [pmdec].
     *
     * Unlike [pmdec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pmdec") @ExcludeMissing fun _pmdec(): JsonField<Double> = pmdec

    /**
     * Returns the raw JSON value of [pmdecUnc].
     *
     * Unlike [pmdecUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pmdecUnc") @ExcludeMissing fun _pmdecUnc(): JsonField<Double> = pmdecUnc

    /**
     * Returns the raw JSON value of [pmra].
     *
     * Unlike [pmra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pmra") @ExcludeMissing fun _pmra(): JsonField<Double> = pmra

    /**
     * Returns the raw JSON value of [pmraUnc].
     *
     * Unlike [pmraUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pmraUnc") @ExcludeMissing fun _pmraUnc(): JsonField<Double> = pmraUnc

    /**
     * Returns the raw JSON value of [pmUncFlag].
     *
     * Unlike [pmUncFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pmUncFlag") @ExcludeMissing fun _pmUncFlag(): JsonField<Boolean> = pmUncFlag

    /**
     * Returns the raw JSON value of [posUncFlag].
     *
     * Unlike [posUncFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posUncFlag") @ExcludeMissing fun _posUncFlag(): JsonField<Boolean> = posUncFlag

    /**
     * Returns the raw JSON value of [ps1astrometryCorrectionFlag].
     *
     * Unlike [ps1astrometryCorrectionFlag], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ps1astrometryCorrectionFlag")
    @ExcludeMissing
    fun _ps1astrometryCorrectionFlag(): JsonField<Int> = ps1astrometryCorrectionFlag

    /**
     * Returns the raw JSON value of [ps1ObjInfoFlag].
     *
     * Unlike [ps1ObjInfoFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ps1ObjInfoFlag")
    @ExcludeMissing
    fun _ps1ObjInfoFlag(): JsonField<Int> = ps1ObjInfoFlag

    /**
     * Returns the raw JSON value of [ps1QualityFlag].
     *
     * Unlike [ps1QualityFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ps1QualityFlag")
    @ExcludeMissing
    fun _ps1QualityFlag(): JsonField<Int> = ps1QualityFlag

    /**
     * Returns the raw JSON value of [raUnc].
     *
     * Unlike [raUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raUnc") @ExcludeMissing fun _raUnc(): JsonField<Double> = raUnc

    /**
     * Returns the raw JSON value of [rmag].
     *
     * Unlike [rmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rmag") @ExcludeMissing fun _rmag(): JsonField<Double> = rmag

    /**
     * Returns the raw JSON value of [rmagOrigin].
     *
     * Unlike [rmagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rmagOrigin") @ExcludeMissing fun _rmagOrigin(): JsonField<String> = rmagOrigin

    /**
     * Returns the raw JSON value of [rmagUnc].
     *
     * Unlike [rmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rmagUnc") @ExcludeMissing fun _rmagUnc(): JsonField<Double> = rmagUnc

    /**
     * Returns the raw JSON value of [rpmag].
     *
     * Unlike [rpmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpmag") @ExcludeMissing fun _rpmag(): JsonField<Double> = rpmag

    /**
     * Returns the raw JSON value of [rpmagUnc].
     *
     * Unlike [rpmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpmagUnc") @ExcludeMissing fun _rpmagUnc(): JsonField<Double> = rpmagUnc

    /**
     * Returns the raw JSON value of [ruwe].
     *
     * Unlike [ruwe], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruwe") @ExcludeMissing fun _ruwe(): JsonField<Double> = ruwe

    /**
     * Returns the raw JSON value of [sdaCatId].
     *
     * Unlike [sdaCatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sdaCatId") @ExcludeMissing fun _sdaCatId(): JsonField<Long> = sdaCatId

    /**
     * Returns the raw JSON value of [sgmag].
     *
     * Unlike [sgmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sgmag") @ExcludeMissing fun _sgmag(): JsonField<Double> = sgmag

    /**
     * Returns the raw JSON value of [sgmagUnc].
     *
     * Unlike [sgmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sgmagUnc") @ExcludeMissing fun _sgmagUnc(): JsonField<Double> = sgmagUnc

    /**
     * Returns the raw JSON value of [shift].
     *
     * Unlike [shift], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shift") @ExcludeMissing fun _shift(): JsonField<Double> = shift

    /**
     * Returns the raw JSON value of [shiftFlag].
     *
     * Unlike [shiftFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shiftFlag") @ExcludeMissing fun _shiftFlag(): JsonField<Boolean> = shiftFlag

    /**
     * Returns the raw JSON value of [shiftFwhm1].
     *
     * Unlike [shiftFwhm1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shiftFWHM1") @ExcludeMissing fun _shiftFwhm1(): JsonField<Double> = shiftFwhm1

    /**
     * Returns the raw JSON value of [shiftFwhm6].
     *
     * Unlike [shiftFwhm6], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shiftFWHM6") @ExcludeMissing fun _shiftFwhm6(): JsonField<Double> = shiftFwhm6

    /**
     * Returns the raw JSON value of [skyMapperId].
     *
     * Unlike [skyMapperId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skyMapperId") @ExcludeMissing fun _skyMapperId(): JsonField<Int> = skyMapperId

    /**
     * Returns the raw JSON value of [twoMassId].
     *
     * Unlike [twoMassId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("twoMASSId") @ExcludeMissing fun _twoMassId(): JsonField<String> = twoMassId

    /**
     * Returns the raw JSON value of [twoMassPhQualInd].
     *
     * Unlike [twoMassPhQualInd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("twoMassPHQualInd")
    @ExcludeMissing
    fun _twoMassPhQualInd(): JsonField<String> = twoMassPhQualInd

    /**
     * Returns the raw JSON value of [twoMassReadFlag].
     *
     * Unlike [twoMassReadFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("twoMassReadFlag")
    @ExcludeMissing
    fun _twoMassReadFlag(): JsonField<String> = twoMassReadFlag

    /**
     * Returns the raw JSON value of [twoMassXscId].
     *
     * Unlike [twoMassXscId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("twoMassXscId")
    @ExcludeMissing
    fun _twoMassXscId(): JsonField<String> = twoMassXscId

    /**
     * Returns the raw JSON value of [tychoDscId].
     *
     * Unlike [tychoDscId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tychoDscId") @ExcludeMissing fun _tychoDscId(): JsonField<Long> = tychoDscId

    /**
     * Returns the raw JSON value of [uhsId].
     *
     * Unlike [uhsId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uhsId") @ExcludeMissing fun _uhsId(): JsonField<Long> = uhsId

    /**
     * Returns the raw JSON value of [ukidssGcsId].
     *
     * Unlike [ukidssGcsId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ukidssGCSId") @ExcludeMissing fun _ukidssGcsId(): JsonField<Long> = ukidssGcsId

    /**
     * Returns the raw JSON value of [ukidssGpsId].
     *
     * Unlike [ukidssGpsId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ukidssGPSId") @ExcludeMissing fun _ukidssGpsId(): JsonField<Long> = ukidssGpsId

    /**
     * Returns the raw JSON value of [ukidssLasId].
     *
     * Unlike [ukidssLasId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ukidssLASId") @ExcludeMissing fun _ukidssLasId(): JsonField<Long> = ukidssLasId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedBy") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

    /**
     * Returns the raw JSON value of [varFlag].
     *
     * Unlike [varFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("varFlag") @ExcludeMissing fun _varFlag(): JsonField<Boolean> = varFlag

    /**
     * Returns the raw JSON value of [variability].
     *
     * Unlike [variability], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variability") @ExcludeMissing fun _variability(): JsonField<String> = variability

    /**
     * Returns the raw JSON value of [vhsId].
     *
     * Unlike [vhsId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vhsId") @ExcludeMissing fun _vhsId(): JsonField<Long> = vhsId

    /**
     * Returns the raw JSON value of [vmag].
     *
     * Unlike [vmag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vmag") @ExcludeMissing fun _vmag(): JsonField<Double> = vmag

    /**
     * Returns the raw JSON value of [vmagOrigin].
     *
     * Unlike [vmagOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vmagOrigin") @ExcludeMissing fun _vmagOrigin(): JsonField<String> = vmagOrigin

    /**
     * Returns the raw JSON value of [vmagUnc].
     *
     * Unlike [vmagUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vmagUnc") @ExcludeMissing fun _vmagUnc(): JsonField<Double> = vmagUnc

    /**
     * Returns the raw JSON value of [w1mag].
     *
     * Unlike [w1mag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w1mag") @ExcludeMissing fun _w1mag(): JsonField<Double> = w1mag

    /**
     * Returns the raw JSON value of [w1magOrigin].
     *
     * Unlike [w1magOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w1magOrigin") @ExcludeMissing fun _w1magOrigin(): JsonField<String> = w1magOrigin

    /**
     * Returns the raw JSON value of [w1magUnc].
     *
     * Unlike [w1magUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w1magUnc") @ExcludeMissing fun _w1magUnc(): JsonField<Double> = w1magUnc

    /**
     * Returns the raw JSON value of [w1sat].
     *
     * Unlike [w1sat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w1sat") @ExcludeMissing fun _w1sat(): JsonField<Double> = w1sat

    /**
     * Returns the raw JSON value of [w2mag].
     *
     * Unlike [w2mag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w2mag") @ExcludeMissing fun _w2mag(): JsonField<Double> = w2mag

    /**
     * Returns the raw JSON value of [w2magOrigin].
     *
     * Unlike [w2magOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w2magOrigin") @ExcludeMissing fun _w2magOrigin(): JsonField<String> = w2magOrigin

    /**
     * Returns the raw JSON value of [w2magUnc].
     *
     * Unlike [w2magUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w2magUnc") @ExcludeMissing fun _w2magUnc(): JsonField<Double> = w2magUnc

    /**
     * Returns the raw JSON value of [w2sat].
     *
     * Unlike [w2sat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w2sat") @ExcludeMissing fun _w2sat(): JsonField<Double> = w2sat

    /**
     * Returns the raw JSON value of [w3mag].
     *
     * Unlike [w3mag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w3mag") @ExcludeMissing fun _w3mag(): JsonField<Double> = w3mag

    /**
     * Returns the raw JSON value of [w3magOrigin].
     *
     * Unlike [w3magOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w3magOrigin") @ExcludeMissing fun _w3magOrigin(): JsonField<String> = w3magOrigin

    /**
     * Returns the raw JSON value of [w3magUnc].
     *
     * Unlike [w3magUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w3magUnc") @ExcludeMissing fun _w3magUnc(): JsonField<Double> = w3magUnc

    /**
     * Returns the raw JSON value of [w3sat].
     *
     * Unlike [w3sat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w3sat") @ExcludeMissing fun _w3sat(): JsonField<Double> = w3sat

    /**
     * Returns the raw JSON value of [w4mag].
     *
     * Unlike [w4mag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w4mag") @ExcludeMissing fun _w4mag(): JsonField<Double> = w4mag

    /**
     * Returns the raw JSON value of [w4magOrigin].
     *
     * Unlike [w4magOrigin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w4magOrigin") @ExcludeMissing fun _w4magOrigin(): JsonField<String> = w4magOrigin

    /**
     * Returns the raw JSON value of [w4magUnc].
     *
     * Unlike [w4magUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w4magUnc") @ExcludeMissing fun _w4magUnc(): JsonField<Double> = w4magUnc

    /**
     * Returns the raw JSON value of [w4sat].
     *
     * Unlike [w4sat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("w4sat") @ExcludeMissing fun _w4sat(): JsonField<Double> = w4sat

    /**
     * Returns the raw JSON value of [wdsCatId].
     *
     * Unlike [wdsCatId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wdsCatId") @ExcludeMissing fun _wdsCatId(): JsonField<String> = wdsCatId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StarCatalogListResponse].
         *
         * The following fields are required:
         * ```java
         * .astrometryOrigin()
         * .classificationMarking()
         * .csId()
         * .dataMode()
         * .dec()
         * .ra()
         * .source()
         * .starEpoch()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StarCatalogListResponse]. */
    class Builder internal constructor() {

        private var astrometryOrigin: JsonField<String>? = null
        private var classificationMarking: JsonField<String>? = null
        private var csId: JsonField<Long>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var dec: JsonField<Double>? = null
        private var ra: JsonField<Double>? = null
        private var source: JsonField<String>? = null
        private var starEpoch: JsonField<Double>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var aavsoVsxId: JsonField<Int> = JsonMissing.of()
        private var abgmag: JsonField<Double> = JsonMissing.of()
        private var abgmagOrigin: JsonField<String> = JsonMissing.of()
        private var abgmagUnc: JsonField<Double> = JsonMissing.of()
        private var abimag: JsonField<Double> = JsonMissing.of()
        private var abimagOrigin: JsonField<String> = JsonMissing.of()
        private var abimagUnc: JsonField<Double> = JsonMissing.of()
        private var abrmag: JsonField<Double> = JsonMissing.of()
        private var abrmagOrigin: JsonField<String> = JsonMissing.of()
        private var abrmagUnc: JsonField<Double> = JsonMissing.of()
        private var abymag: JsonField<Double> = JsonMissing.of()
        private var abymagOrigin: JsonField<String> = JsonMissing.of()
        private var abymagUnc: JsonField<Double> = JsonMissing.of()
        private var abzmag: JsonField<Double> = JsonMissing.of()
        private var abzmagOrigin: JsonField<String> = JsonMissing.of()
        private var abzmagUnc: JsonField<Double> = JsonMissing.of()
        private var allWisEccInd: JsonField<String> = JsonMissing.of()
        private var allWiseId: JsonField<String> = JsonMissing.of()
        private var allWisEnaInd: JsonField<Int> = JsonMissing.of()
        private var allWisEphQualInd: JsonField<String> = JsonMissing.of()
        private var apassId: JsonField<String> = JsonMissing.of()
        private var astrometricExcessNoise: JsonField<Double> = JsonMissing.of()
        private var astrometricExcessNoiseSig: JsonField<Double> = JsonMissing.of()
        private var bmag: JsonField<Double> = JsonMissing.of()
        private var bmagOrigin: JsonField<String> = JsonMissing.of()
        private var bmagUnc: JsonField<Double> = JsonMissing.of()
        private var bpmag: JsonField<Double> = JsonMissing.of()
        private var bpmagUnc: JsonField<Double> = JsonMissing.of()
        private var carrascoCatId: JsonField<Int> = JsonMissing.of()
        private var catVersion: JsonField<String> = JsonMissing.of()
        private var catWise2020Id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var decUnc: JsonField<Double> = JsonMissing.of()
        private var ducatiCatId: JsonField<String> = JsonMissing.of()
        private var gaiadr3CatId: JsonField<Long> = JsonMissing.of()
        private var gmag: JsonField<Double> = JsonMissing.of()
        private var gmagUnc: JsonField<Double> = JsonMissing.of()
        private var gncCatId: JsonField<Int> = JsonMissing.of()
        private var healpixIndex: JsonField<Int> = JsonMissing.of()
        private var hipCatId: JsonField<Int> = JsonMissing.of()
        private var hmag: JsonField<Double> = JsonMissing.of()
        private var hmagOrigin: JsonField<String> = JsonMissing.of()
        private var hmagUnc: JsonField<Double> = JsonMissing.of()
        private var imag: JsonField<Double> = JsonMissing.of()
        private var imagOrigin: JsonField<String> = JsonMissing.of()
        private var imagUnc: JsonField<Double> = JsonMissing.of()
        private var jmag: JsonField<Double> = JsonMissing.of()
        private var jmagOrigin: JsonField<String> = JsonMissing.of()
        private var jmagUnc: JsonField<Double> = JsonMissing.of()
        private var kmag: JsonField<Double> = JsonMissing.of()
        private var kmagOrigin: JsonField<String> = JsonMissing.of()
        private var kmagUnc: JsonField<Double> = JsonMissing.of()
        private var morphologyInd: JsonField<Int> = JsonMissing.of()
        private var multFlag: JsonField<Boolean> = JsonMissing.of()
        private var multiplicity: JsonField<String> = JsonMissing.of()
        private var neighborDec: JsonField<Double> = JsonMissing.of()
        private var neighborDistance: JsonField<Double> = JsonMissing.of()
        private var neighborFlag: JsonField<Boolean> = JsonMissing.of()
        private var neighborId: JsonField<Long> = JsonMissing.of()
        private var neighborRa: JsonField<Double> = JsonMissing.of()
        private var nonSingleStar: JsonField<String> = JsonMissing.of()
        private var numNeighbors: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var panStarrsId: JsonField<Long> = JsonMissing.of()
        private var parallax: JsonField<Double> = JsonMissing.of()
        private var parallaxUnc: JsonField<Double> = JsonMissing.of()
        private var pmdec: JsonField<Double> = JsonMissing.of()
        private var pmdecUnc: JsonField<Double> = JsonMissing.of()
        private var pmra: JsonField<Double> = JsonMissing.of()
        private var pmraUnc: JsonField<Double> = JsonMissing.of()
        private var pmUncFlag: JsonField<Boolean> = JsonMissing.of()
        private var posUncFlag: JsonField<Boolean> = JsonMissing.of()
        private var ps1astrometryCorrectionFlag: JsonField<Int> = JsonMissing.of()
        private var ps1ObjInfoFlag: JsonField<Int> = JsonMissing.of()
        private var ps1QualityFlag: JsonField<Int> = JsonMissing.of()
        private var raUnc: JsonField<Double> = JsonMissing.of()
        private var rmag: JsonField<Double> = JsonMissing.of()
        private var rmagOrigin: JsonField<String> = JsonMissing.of()
        private var rmagUnc: JsonField<Double> = JsonMissing.of()
        private var rpmag: JsonField<Double> = JsonMissing.of()
        private var rpmagUnc: JsonField<Double> = JsonMissing.of()
        private var ruwe: JsonField<Double> = JsonMissing.of()
        private var sdaCatId: JsonField<Long> = JsonMissing.of()
        private var sgmag: JsonField<Double> = JsonMissing.of()
        private var sgmagUnc: JsonField<Double> = JsonMissing.of()
        private var shift: JsonField<Double> = JsonMissing.of()
        private var shiftFlag: JsonField<Boolean> = JsonMissing.of()
        private var shiftFwhm1: JsonField<Double> = JsonMissing.of()
        private var shiftFwhm6: JsonField<Double> = JsonMissing.of()
        private var skyMapperId: JsonField<Int> = JsonMissing.of()
        private var twoMassId: JsonField<String> = JsonMissing.of()
        private var twoMassPhQualInd: JsonField<String> = JsonMissing.of()
        private var twoMassReadFlag: JsonField<String> = JsonMissing.of()
        private var twoMassXscId: JsonField<String> = JsonMissing.of()
        private var tychoDscId: JsonField<Long> = JsonMissing.of()
        private var uhsId: JsonField<Long> = JsonMissing.of()
        private var ukidssGcsId: JsonField<Long> = JsonMissing.of()
        private var ukidssGpsId: JsonField<Long> = JsonMissing.of()
        private var ukidssLasId: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var varFlag: JsonField<Boolean> = JsonMissing.of()
        private var variability: JsonField<String> = JsonMissing.of()
        private var vhsId: JsonField<Long> = JsonMissing.of()
        private var vmag: JsonField<Double> = JsonMissing.of()
        private var vmagOrigin: JsonField<String> = JsonMissing.of()
        private var vmagUnc: JsonField<Double> = JsonMissing.of()
        private var w1mag: JsonField<Double> = JsonMissing.of()
        private var w1magOrigin: JsonField<String> = JsonMissing.of()
        private var w1magUnc: JsonField<Double> = JsonMissing.of()
        private var w1sat: JsonField<Double> = JsonMissing.of()
        private var w2mag: JsonField<Double> = JsonMissing.of()
        private var w2magOrigin: JsonField<String> = JsonMissing.of()
        private var w2magUnc: JsonField<Double> = JsonMissing.of()
        private var w2sat: JsonField<Double> = JsonMissing.of()
        private var w3mag: JsonField<Double> = JsonMissing.of()
        private var w3magOrigin: JsonField<String> = JsonMissing.of()
        private var w3magUnc: JsonField<Double> = JsonMissing.of()
        private var w3sat: JsonField<Double> = JsonMissing.of()
        private var w4mag: JsonField<Double> = JsonMissing.of()
        private var w4magOrigin: JsonField<String> = JsonMissing.of()
        private var w4magUnc: JsonField<Double> = JsonMissing.of()
        private var w4sat: JsonField<Double> = JsonMissing.of()
        private var wdsCatId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(starCatalogListResponse: StarCatalogListResponse) = apply {
            astrometryOrigin = starCatalogListResponse.astrometryOrigin
            classificationMarking = starCatalogListResponse.classificationMarking
            csId = starCatalogListResponse.csId
            dataMode = starCatalogListResponse.dataMode
            dec = starCatalogListResponse.dec
            ra = starCatalogListResponse.ra
            source = starCatalogListResponse.source
            starEpoch = starCatalogListResponse.starEpoch
            id = starCatalogListResponse.id
            aavsoVsxId = starCatalogListResponse.aavsoVsxId
            abgmag = starCatalogListResponse.abgmag
            abgmagOrigin = starCatalogListResponse.abgmagOrigin
            abgmagUnc = starCatalogListResponse.abgmagUnc
            abimag = starCatalogListResponse.abimag
            abimagOrigin = starCatalogListResponse.abimagOrigin
            abimagUnc = starCatalogListResponse.abimagUnc
            abrmag = starCatalogListResponse.abrmag
            abrmagOrigin = starCatalogListResponse.abrmagOrigin
            abrmagUnc = starCatalogListResponse.abrmagUnc
            abymag = starCatalogListResponse.abymag
            abymagOrigin = starCatalogListResponse.abymagOrigin
            abymagUnc = starCatalogListResponse.abymagUnc
            abzmag = starCatalogListResponse.abzmag
            abzmagOrigin = starCatalogListResponse.abzmagOrigin
            abzmagUnc = starCatalogListResponse.abzmagUnc
            allWisEccInd = starCatalogListResponse.allWisEccInd
            allWiseId = starCatalogListResponse.allWiseId
            allWisEnaInd = starCatalogListResponse.allWisEnaInd
            allWisEphQualInd = starCatalogListResponse.allWisEphQualInd
            apassId = starCatalogListResponse.apassId
            astrometricExcessNoise = starCatalogListResponse.astrometricExcessNoise
            astrometricExcessNoiseSig = starCatalogListResponse.astrometricExcessNoiseSig
            bmag = starCatalogListResponse.bmag
            bmagOrigin = starCatalogListResponse.bmagOrigin
            bmagUnc = starCatalogListResponse.bmagUnc
            bpmag = starCatalogListResponse.bpmag
            bpmagUnc = starCatalogListResponse.bpmagUnc
            carrascoCatId = starCatalogListResponse.carrascoCatId
            catVersion = starCatalogListResponse.catVersion
            catWise2020Id = starCatalogListResponse.catWise2020Id
            createdAt = starCatalogListResponse.createdAt
            createdBy = starCatalogListResponse.createdBy
            decUnc = starCatalogListResponse.decUnc
            ducatiCatId = starCatalogListResponse.ducatiCatId
            gaiadr3CatId = starCatalogListResponse.gaiadr3CatId
            gmag = starCatalogListResponse.gmag
            gmagUnc = starCatalogListResponse.gmagUnc
            gncCatId = starCatalogListResponse.gncCatId
            healpixIndex = starCatalogListResponse.healpixIndex
            hipCatId = starCatalogListResponse.hipCatId
            hmag = starCatalogListResponse.hmag
            hmagOrigin = starCatalogListResponse.hmagOrigin
            hmagUnc = starCatalogListResponse.hmagUnc
            imag = starCatalogListResponse.imag
            imagOrigin = starCatalogListResponse.imagOrigin
            imagUnc = starCatalogListResponse.imagUnc
            jmag = starCatalogListResponse.jmag
            jmagOrigin = starCatalogListResponse.jmagOrigin
            jmagUnc = starCatalogListResponse.jmagUnc
            kmag = starCatalogListResponse.kmag
            kmagOrigin = starCatalogListResponse.kmagOrigin
            kmagUnc = starCatalogListResponse.kmagUnc
            morphologyInd = starCatalogListResponse.morphologyInd
            multFlag = starCatalogListResponse.multFlag
            multiplicity = starCatalogListResponse.multiplicity
            neighborDec = starCatalogListResponse.neighborDec
            neighborDistance = starCatalogListResponse.neighborDistance
            neighborFlag = starCatalogListResponse.neighborFlag
            neighborId = starCatalogListResponse.neighborId
            neighborRa = starCatalogListResponse.neighborRa
            nonSingleStar = starCatalogListResponse.nonSingleStar
            numNeighbors = starCatalogListResponse.numNeighbors
            origin = starCatalogListResponse.origin
            origNetwork = starCatalogListResponse.origNetwork
            panStarrsId = starCatalogListResponse.panStarrsId
            parallax = starCatalogListResponse.parallax
            parallaxUnc = starCatalogListResponse.parallaxUnc
            pmdec = starCatalogListResponse.pmdec
            pmdecUnc = starCatalogListResponse.pmdecUnc
            pmra = starCatalogListResponse.pmra
            pmraUnc = starCatalogListResponse.pmraUnc
            pmUncFlag = starCatalogListResponse.pmUncFlag
            posUncFlag = starCatalogListResponse.posUncFlag
            ps1astrometryCorrectionFlag = starCatalogListResponse.ps1astrometryCorrectionFlag
            ps1ObjInfoFlag = starCatalogListResponse.ps1ObjInfoFlag
            ps1QualityFlag = starCatalogListResponse.ps1QualityFlag
            raUnc = starCatalogListResponse.raUnc
            rmag = starCatalogListResponse.rmag
            rmagOrigin = starCatalogListResponse.rmagOrigin
            rmagUnc = starCatalogListResponse.rmagUnc
            rpmag = starCatalogListResponse.rpmag
            rpmagUnc = starCatalogListResponse.rpmagUnc
            ruwe = starCatalogListResponse.ruwe
            sdaCatId = starCatalogListResponse.sdaCatId
            sgmag = starCatalogListResponse.sgmag
            sgmagUnc = starCatalogListResponse.sgmagUnc
            shift = starCatalogListResponse.shift
            shiftFlag = starCatalogListResponse.shiftFlag
            shiftFwhm1 = starCatalogListResponse.shiftFwhm1
            shiftFwhm6 = starCatalogListResponse.shiftFwhm6
            skyMapperId = starCatalogListResponse.skyMapperId
            twoMassId = starCatalogListResponse.twoMassId
            twoMassPhQualInd = starCatalogListResponse.twoMassPhQualInd
            twoMassReadFlag = starCatalogListResponse.twoMassReadFlag
            twoMassXscId = starCatalogListResponse.twoMassXscId
            tychoDscId = starCatalogListResponse.tychoDscId
            uhsId = starCatalogListResponse.uhsId
            ukidssGcsId = starCatalogListResponse.ukidssGcsId
            ukidssGpsId = starCatalogListResponse.ukidssGpsId
            ukidssLasId = starCatalogListResponse.ukidssLasId
            updatedAt = starCatalogListResponse.updatedAt
            updatedBy = starCatalogListResponse.updatedBy
            varFlag = starCatalogListResponse.varFlag
            variability = starCatalogListResponse.variability
            vhsId = starCatalogListResponse.vhsId
            vmag = starCatalogListResponse.vmag
            vmagOrigin = starCatalogListResponse.vmagOrigin
            vmagUnc = starCatalogListResponse.vmagUnc
            w1mag = starCatalogListResponse.w1mag
            w1magOrigin = starCatalogListResponse.w1magOrigin
            w1magUnc = starCatalogListResponse.w1magUnc
            w1sat = starCatalogListResponse.w1sat
            w2mag = starCatalogListResponse.w2mag
            w2magOrigin = starCatalogListResponse.w2magOrigin
            w2magUnc = starCatalogListResponse.w2magUnc
            w2sat = starCatalogListResponse.w2sat
            w3mag = starCatalogListResponse.w3mag
            w3magOrigin = starCatalogListResponse.w3magOrigin
            w3magUnc = starCatalogListResponse.w3magUnc
            w3sat = starCatalogListResponse.w3sat
            w4mag = starCatalogListResponse.w4mag
            w4magOrigin = starCatalogListResponse.w4magOrigin
            w4magUnc = starCatalogListResponse.w4magUnc
            w4sat = starCatalogListResponse.w4sat
            wdsCatId = starCatalogListResponse.wdsCatId
            additionalProperties = starCatalogListResponse.additionalProperties.toMutableMap()
        }

        /**
         * Originating astrometric catalog for this object (GA (GAIA), HI (HIPPARCOS), UB (USNOBSC),
         * AL, AP, CA, CR, DU, FK6_I, FK6_III, PS, SK, TD, TP, TX, UC, UL, UH, UP, VH, VS, WD).
         */
        fun astrometryOrigin(astrometryOrigin: String) =
            astrometryOrigin(JsonField.of(astrometryOrigin))

        /**
         * Sets [Builder.astrometryOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.astrometryOrigin] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun astrometryOrigin(astrometryOrigin: JsonField<String>) = apply {
            this.astrometryOrigin = astrometryOrigin
        }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classificationMarking(classificationMarking: String) =
            classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) = apply {
            this.classificationMarking = classificationMarking
        }

        /**
         * The ID of this object in the specific catalog associated with this record. This field
         * will either contain the value in the gncCatId or sdaCatId field.
         */
        fun csId(csId: Long) = csId(JsonField.of(csId))

        /**
         * Sets [Builder.csId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.csId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun csId(csId: JsonField<Long>) = apply { this.csId = csId }

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL: Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST: Specific datasets used to evaluate compliance with specifications and requirements,
         * and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE: Data pertaining to a government or military exercise. The data may include both
         * real and simulated data.
         *
         * SIMULATED: Synthetic data generated by a model to mimic real-world datasets.
         */
        fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

        /**
         * Sets [Builder.dataMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

        /**
         * Barycentric declination of the source in International Celestial Reference System (ICRS)
         * at the reference epoch, in degrees.
         */
        fun dec(dec: Double) = dec(JsonField.of(dec))

        /**
         * Sets [Builder.dec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dec] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dec(dec: JsonField<Double>) = apply { this.dec = dec }

        /**
         * Barycentric right ascension of the source in the International Celestial Reference System
         * (ICRS) frame at the reference epoch, in degrees.
         */
        fun ra(ra: Double) = ra(JsonField.of(ra))

        /**
         * Sets [Builder.ra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ra] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ra(ra: JsonField<Double>) = apply { this.ra = ra }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /**
         * Reference epoch to which the astrometric source parameters are referred, expressed as
         * Julian Year in Barycentric Coordinate Time (TCB).
         */
        fun starEpoch(starEpoch: Double) = starEpoch(JsonField.of(starEpoch))

        /**
         * Sets [Builder.starEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.starEpoch] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun starEpoch(starEpoch: JsonField<Double>) = apply { this.starEpoch = starEpoch }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The American Association of Variable Star Observers (AAVSO) Variable Star Index (VSX)
         * (VX) object ID of this object.
         */
        fun aavsoVsxId(aavsoVsxId: Int) = aavsoVsxId(JsonField.of(aavsoVsxId))

        /**
         * Sets [Builder.aavsoVsxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aavsoVsxId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aavsoVsxId(aavsoVsxId: JsonField<Int>) = apply { this.aavsoVsxId = aavsoVsxId }

        /** Optical AB g magnitude. */
        fun abgmag(abgmag: Double) = abgmag(JsonField.of(abgmag))

        /**
         * Sets [Builder.abgmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abgmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun abgmag(abgmag: JsonField<Double>) = apply { this.abgmag = abgmag }

        /** Catalog of origin of optical AB g magnitude. */
        fun abgmagOrigin(abgmagOrigin: String) = abgmagOrigin(JsonField.of(abgmagOrigin))

        /**
         * Sets [Builder.abgmagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abgmagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abgmagOrigin(abgmagOrigin: JsonField<String>) = apply {
            this.abgmagOrigin = abgmagOrigin
        }

        /** Uncertainty of optical AB g magnitude. */
        fun abgmagUnc(abgmagUnc: Double) = abgmagUnc(JsonField.of(abgmagUnc))

        /**
         * Sets [Builder.abgmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abgmagUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abgmagUnc(abgmagUnc: JsonField<Double>) = apply { this.abgmagUnc = abgmagUnc }

        /** Optical AB i magnitude. */
        fun abimag(abimag: Double) = abimag(JsonField.of(abimag))

        /**
         * Sets [Builder.abimag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abimag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun abimag(abimag: JsonField<Double>) = apply { this.abimag = abimag }

        /** Catalog of origin of optical AB i magnitude. */
        fun abimagOrigin(abimagOrigin: String) = abimagOrigin(JsonField.of(abimagOrigin))

        /**
         * Sets [Builder.abimagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abimagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abimagOrigin(abimagOrigin: JsonField<String>) = apply {
            this.abimagOrigin = abimagOrigin
        }

        /** Uncertainty of optical AB i magnitude. */
        fun abimagUnc(abimagUnc: Double) = abimagUnc(JsonField.of(abimagUnc))

        /**
         * Sets [Builder.abimagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abimagUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abimagUnc(abimagUnc: JsonField<Double>) = apply { this.abimagUnc = abimagUnc }

        /** Optical AB r magnitude. */
        fun abrmag(abrmag: Double) = abrmag(JsonField.of(abrmag))

        /**
         * Sets [Builder.abrmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abrmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun abrmag(abrmag: JsonField<Double>) = apply { this.abrmag = abrmag }

        /** Catalog of origin of optical AB r magnitude. */
        fun abrmagOrigin(abrmagOrigin: String) = abrmagOrigin(JsonField.of(abrmagOrigin))

        /**
         * Sets [Builder.abrmagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abrmagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abrmagOrigin(abrmagOrigin: JsonField<String>) = apply {
            this.abrmagOrigin = abrmagOrigin
        }

        /** Uncertainty of optical AB r magnitude. */
        fun abrmagUnc(abrmagUnc: Double) = abrmagUnc(JsonField.of(abrmagUnc))

        /**
         * Sets [Builder.abrmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abrmagUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abrmagUnc(abrmagUnc: JsonField<Double>) = apply { this.abrmagUnc = abrmagUnc }

        /** Optical AB y magnitude. */
        fun abymag(abymag: Double) = abymag(JsonField.of(abymag))

        /**
         * Sets [Builder.abymag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abymag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun abymag(abymag: JsonField<Double>) = apply { this.abymag = abymag }

        /** Catalog of origin of optical AB y magnitude. */
        fun abymagOrigin(abymagOrigin: String) = abymagOrigin(JsonField.of(abymagOrigin))

        /**
         * Sets [Builder.abymagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abymagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abymagOrigin(abymagOrigin: JsonField<String>) = apply {
            this.abymagOrigin = abymagOrigin
        }

        /** Uncertainty of optical AB y magnitude. */
        fun abymagUnc(abymagUnc: Double) = abymagUnc(JsonField.of(abymagUnc))

        /**
         * Sets [Builder.abymagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abymagUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abymagUnc(abymagUnc: JsonField<Double>) = apply { this.abymagUnc = abymagUnc }

        /** Optical AB z magnitude. */
        fun abzmag(abzmag: Double) = abzmag(JsonField.of(abzmag))

        /**
         * Sets [Builder.abzmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abzmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun abzmag(abzmag: JsonField<Double>) = apply { this.abzmag = abzmag }

        /** Catalog of origin of optical AB z magnitude. */
        fun abzmagOrigin(abzmagOrigin: String) = abzmagOrigin(JsonField.of(abzmagOrigin))

        /**
         * Sets [Builder.abzmagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abzmagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abzmagOrigin(abzmagOrigin: JsonField<String>) = apply {
            this.abzmagOrigin = abzmagOrigin
        }

        /** Uncertainty of optical AB z magnitude. */
        fun abzmagUnc(abzmagUnc: Double) = abzmagUnc(JsonField.of(abzmagUnc))

        /**
         * Sets [Builder.abzmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abzmagUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abzmagUnc(abzmagUnc: JsonField<Double>) = apply { this.abzmagUnc = abzmagUnc }

        /** Contamination and confusion indicator in AllWISE. */
        fun allWisEccInd(allWisEccInd: String) = allWisEccInd(JsonField.of(allWisEccInd))

        /**
         * Sets [Builder.allWisEccInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allWisEccInd] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun allWisEccInd(allWisEccInd: JsonField<String>) = apply {
            this.allWisEccInd = allWisEccInd
        }

        /**
         * The designation of this object in the All Wide-field Infrared Survey Explorer (AllWISE)
         * catalog (AL).
         */
        fun allWiseId(allWiseId: String) = allWiseId(JsonField.of(allWiseId))

        /**
         * Sets [Builder.allWiseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allWiseId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun allWiseId(allWiseId: JsonField<String>) = apply { this.allWiseId = allWiseId }

        /** Active deblending indicator in AllWISE. */
        fun allWisEnaInd(allWisEnaInd: Int) = allWisEnaInd(JsonField.of(allWisEnaInd))

        /**
         * Sets [Builder.allWisEnaInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allWisEnaInd] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun allWisEnaInd(allWisEnaInd: JsonField<Int>) = apply { this.allWisEnaInd = allWisEnaInd }

        /** Photometric quality indicator in AllWISE. */
        fun allWisEphQualInd(allWisEphQualInd: String) =
            allWisEphQualInd(JsonField.of(allWisEphQualInd))

        /**
         * Sets [Builder.allWisEphQualInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allWisEphQualInd] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allWisEphQualInd(allWisEphQualInd: JsonField<String>) = apply {
            this.allWisEphQualInd = allWisEphQualInd
        }

        /**
         * The American Association of Variable Star Observers (AAVSO) Photometric All-Sky Survey
         * (APASS) (AP) name of this object.
         */
        fun apassId(apassId: String) = apassId(JsonField.of(apassId))

        /**
         * Sets [Builder.apassId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apassId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apassId(apassId: JsonField<String>) = apply { this.apassId = apassId }

        /** Astrometric excess noise in the Gaia catalog measured in milliarcseconds. */
        fun astrometricExcessNoise(astrometricExcessNoise: Double) =
            astrometricExcessNoise(JsonField.of(astrometricExcessNoise))

        /**
         * Sets [Builder.astrometricExcessNoise] to an arbitrary JSON value.
         *
         * You should usually call [Builder.astrometricExcessNoise] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun astrometricExcessNoise(astrometricExcessNoise: JsonField<Double>) = apply {
            this.astrometricExcessNoise = astrometricExcessNoise
        }

        /** Astrometric excess noise sigma in Gaia. */
        fun astrometricExcessNoiseSig(astrometricExcessNoiseSig: Double) =
            astrometricExcessNoiseSig(JsonField.of(astrometricExcessNoiseSig))

        /**
         * Sets [Builder.astrometricExcessNoiseSig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.astrometricExcessNoiseSig] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun astrometricExcessNoiseSig(astrometricExcessNoiseSig: JsonField<Double>) = apply {
            this.astrometricExcessNoiseSig = astrometricExcessNoiseSig
        }

        /** Optical Johnson B magnitude measured in magnitudes. */
        fun bmag(bmag: Double) = bmag(JsonField.of(bmag))

        /**
         * Sets [Builder.bmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bmag(bmag: JsonField<Double>) = apply { this.bmag = bmag }

        /** Catalog of origin of optical Johnson B magnitude (AP, CR, HI). */
        fun bmagOrigin(bmagOrigin: String) = bmagOrigin(JsonField.of(bmagOrigin))

        /**
         * Sets [Builder.bmagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bmagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bmagOrigin(bmagOrigin: JsonField<String>) = apply { this.bmagOrigin = bmagOrigin }

        /** Uncertainty of optical Johnson B magnitude measured in magnitudes. */
        fun bmagUnc(bmagUnc: Double) = bmagUnc(JsonField.of(bmagUnc))

        /**
         * Sets [Builder.bmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bmagUnc(bmagUnc: JsonField<Double>) = apply { this.bmagUnc = bmagUnc }

        /** Gaia optical photometric Bp-band in the Vega scale measured in magnitudes. */
        fun bpmag(bpmag: Double) = bpmag(JsonField.of(bpmag))

        /**
         * Sets [Builder.bpmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bpmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bpmag(bpmag: JsonField<Double>) = apply { this.bpmag = bpmag }

        /** Gaia optical Bp-band uncertainty in the Vega scale measured in magnitudes. */
        fun bpmagUnc(bpmagUnc: Double) = bpmagUnc(JsonField.of(bpmagUnc))

        /**
         * Sets [Builder.bpmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bpmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bpmagUnc(bpmagUnc: JsonField<Double>) = apply { this.bpmagUnc = bpmagUnc }

        /** The Carrasco catalog (CR) identifier of this object. */
        fun carrascoCatId(carrascoCatId: Int) = carrascoCatId(JsonField.of(carrascoCatId))

        /**
         * Sets [Builder.carrascoCatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrascoCatId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun carrascoCatId(carrascoCatId: JsonField<Int>) = apply {
            this.carrascoCatId = carrascoCatId
        }

        /** The version of the catalog associated with this object. */
        fun catVersion(catVersion: String) = catVersion(JsonField.of(catVersion))

        /**
         * Sets [Builder.catVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.catVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun catVersion(catVersion: JsonField<String>) = apply { this.catVersion = catVersion }

        /** The CatWISE2020 (CA) catalog source ID of this object. */
        fun catWise2020Id(catWise2020Id: String) = catWise2020Id(JsonField.of(catWise2020Id))

        /**
         * Sets [Builder.catWise2020Id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.catWise2020Id] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun catWise2020Id(catWise2020Id: JsonField<String>) = apply {
            this.catWise2020Id = catWise2020Id
        }

        /** Time the row was created in the database, auto-populated by the system. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Application user who created the row in the database, auto-populated by the system. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * Uncertainty of the declination of the source, in milliarcseconds, at the reference epoch.
         */
        fun decUnc(decUnc: Double) = decUnc(JsonField.of(decUnc))

        /**
         * Sets [Builder.decUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun decUnc(decUnc: JsonField<Double>) = apply { this.decUnc = decUnc }

        /** The Ducati catalog (DU) name of this object. */
        fun ducatiCatId(ducatiCatId: String) = ducatiCatId(JsonField.of(ducatiCatId))

        /**
         * Sets [Builder.ducatiCatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ducatiCatId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ducatiCatId(ducatiCatId: JsonField<String>) = apply { this.ducatiCatId = ducatiCatId }

        /** The source ID of this object in the Gaia DR3 Catalog (GA). */
        fun gaiadr3CatId(gaiadr3CatId: Long) = gaiadr3CatId(JsonField.of(gaiadr3CatId))

        /**
         * Sets [Builder.gaiadr3CatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gaiadr3CatId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun gaiadr3CatId(gaiadr3CatId: JsonField<Long>) = apply { this.gaiadr3CatId = gaiadr3CatId }

        /** Gaia optical photometric G-band in the Vega scale measured in magnitudes. */
        fun gmag(gmag: Double) = gmag(JsonField.of(gmag))

        /**
         * Sets [Builder.gmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gmag(gmag: JsonField<Double>) = apply { this.gmag = gmag }

        /** Gaia optical photometric G-band uncertainty in the Vega scale measured in magnitudes. */
        fun gmagUnc(gmagUnc: Double) = gmagUnc(JsonField.of(gmagUnc))

        /**
         * Sets [Builder.gmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gmagUnc(gmagUnc: JsonField<Double>) = apply { this.gmagUnc = gmagUnc }

        /**
         * The ID of this object in the Guidance and Navigation Control (GNC) Catalog. If this field
         * is populated it shall match the csId field.
         */
        fun gncCatId(gncCatId: Int) = gncCatId(JsonField.of(gncCatId))

        /**
         * Sets [Builder.gncCatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gncCatId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gncCatId(gncCatId: JsonField<Int>) = apply { this.gncCatId = gncCatId }

        /**
         * The Healpix index. Consumers should contact the provider for details on the indexing
         * scheme.
         */
        fun healpixIndex(healpixIndex: Int) = healpixIndex(JsonField.of(healpixIndex))

        /**
         * Sets [Builder.healpixIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.healpixIndex] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun healpixIndex(healpixIndex: JsonField<Int>) = apply { this.healpixIndex = healpixIndex }

        /** The HIP ID of this object in the Hipparcos Catalog (HI). */
        fun hipCatId(hipCatId: Int) = hipCatId(JsonField.of(hipCatId))

        /**
         * Sets [Builder.hipCatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hipCatId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hipCatId(hipCatId: JsonField<Int>) = apply { this.hipCatId = hipCatId }

        /** Near-infrared photometric H-band magnitude in the Vega scale measured in magnitudes. */
        fun hmag(hmag: Double) = hmag(JsonField.of(hmag))

        /**
         * Sets [Builder.hmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hmag(hmag: JsonField<Double>) = apply { this.hmag = hmag }

        /**
         * Near-infrared photometric H-band catalog of origin in the Vega scale (TP, UC, UL, UP,
         * VH).
         */
        fun hmagOrigin(hmagOrigin: String) = hmagOrigin(JsonField.of(hmagOrigin))

        /**
         * Sets [Builder.hmagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hmagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hmagOrigin(hmagOrigin: JsonField<String>) = apply { this.hmagOrigin = hmagOrigin }

        /**
         * Near-infrared photometric H-band magnitude uncertainty in the Vega scale measured in
         * magnitudes.
         */
        fun hmagUnc(hmagUnc: Double) = hmagUnc(JsonField.of(hmagUnc))

        /**
         * Sets [Builder.hmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hmagUnc(hmagUnc: JsonField<Double>) = apply { this.hmagUnc = hmagUnc }

        /** Optical Johnson I magnitude measured in magnitudes. */
        fun imag(imag: Double) = imag(JsonField.of(imag))

        /**
         * Sets [Builder.imag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imag(imag: JsonField<Double>) = apply { this.imag = imag }

        /** Catalog of origin of optical Johnson I magnitude (CR, GA, HI). */
        fun imagOrigin(imagOrigin: String) = imagOrigin(JsonField.of(imagOrigin))

        /**
         * Sets [Builder.imagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun imagOrigin(imagOrigin: JsonField<String>) = apply { this.imagOrigin = imagOrigin }

        /** Uncertainty of optical Johnson I magnitude measured in magnitudes. */
        fun imagUnc(imagUnc: Double) = imagUnc(JsonField.of(imagUnc))

        /**
         * Sets [Builder.imagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imagUnc(imagUnc: JsonField<Double>) = apply { this.imagUnc = imagUnc }

        /** Near-infrared photometric J-band magnitude in the Vega scale measured in magnitudes. */
        fun jmag(jmag: Double) = jmag(JsonField.of(jmag))

        /**
         * Sets [Builder.jmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jmag(jmag: JsonField<Double>) = apply { this.jmag = jmag }

        /**
         * Near-infrared photometric J-band catalog of origin in the Vega scale (TP, UH, UL, UP,
         * VH).
         */
        fun jmagOrigin(jmagOrigin: String) = jmagOrigin(JsonField.of(jmagOrigin))

        /**
         * Sets [Builder.jmagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jmagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jmagOrigin(jmagOrigin: JsonField<String>) = apply { this.jmagOrigin = jmagOrigin }

        /**
         * Near-infrared photometric J-band magnitude uncertainty in the Vega scale measured in
         * magnitudes.
         */
        fun jmagUnc(jmagUnc: Double) = jmagUnc(JsonField.of(jmagUnc))

        /**
         * Sets [Builder.jmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jmagUnc(jmagUnc: JsonField<Double>) = apply { this.jmagUnc = jmagUnc }

        /** Near-infrared photometric K-band magnitude in the Vega scale measured in magnitudes. */
        fun kmag(kmag: Double) = kmag(JsonField.of(kmag))

        /**
         * Sets [Builder.kmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kmag(kmag: JsonField<Double>) = apply { this.kmag = kmag }

        /**
         * Near-infrared photometric K-band catalog of origin in the Vega scale (TP, UC, UH, UL, UP,
         * VH).
         */
        fun kmagOrigin(kmagOrigin: String) = kmagOrigin(JsonField.of(kmagOrigin))

        /**
         * Sets [Builder.kmagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kmagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun kmagOrigin(kmagOrigin: JsonField<String>) = apply { this.kmagOrigin = kmagOrigin }

        /**
         * Near-infrared photometric K-band magnitude uncertainty in the Vega scale measured in
         * magnitudes.
         */
        fun kmagUnc(kmagUnc: Double) = kmagUnc(JsonField.of(kmagUnc))

        /**
         * Sets [Builder.kmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kmagUnc(kmagUnc: JsonField<Double>) = apply { this.kmagUnc = kmagUnc }

        /**
         * Morphology indicator. Consumers should contact the provider for details on the
         * specifications.
         */
        fun morphologyInd(morphologyInd: Int) = morphologyInd(JsonField.of(morphologyInd))

        /**
         * Sets [Builder.morphologyInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.morphologyInd] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun morphologyInd(morphologyInd: JsonField<Int>) = apply {
            this.morphologyInd = morphologyInd
        }

        /** Flag indicating that this is a multiple object source. */
        fun multFlag(multFlag: Boolean) = multFlag(JsonField.of(multFlag))

        /**
         * Sets [Builder.multFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multFlag] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun multFlag(multFlag: JsonField<Boolean>) = apply { this.multFlag = multFlag }

        /**
         * Identifier indicating multiplicity is detected. Consumers should contact the provider for
         * details on the specifications.
         */
        fun multiplicity(multiplicity: String) = multiplicity(JsonField.of(multiplicity))

        /**
         * Sets [Builder.multiplicity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplicity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun multiplicity(multiplicity: JsonField<String>) = apply {
            this.multiplicity = multiplicity
        }

        /** Dec of nearest neighbor measured in degrees. */
        fun neighborDec(neighborDec: Double) = neighborDec(JsonField.of(neighborDec))

        /**
         * Sets [Builder.neighborDec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.neighborDec] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun neighborDec(neighborDec: JsonField<Double>) = apply { this.neighborDec = neighborDec }

        /** Distance between source and nearest neighbor, in arcseconds. */
        fun neighborDistance(neighborDistance: Double) =
            neighborDistance(JsonField.of(neighborDistance))

        /**
         * Sets [Builder.neighborDistance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.neighborDistance] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun neighborDistance(neighborDistance: JsonField<Double>) = apply {
            this.neighborDistance = neighborDistance
        }

        /** Flag indicating that the nearest catalog neighbor is closer than 4.6 arcseconds. */
        fun neighborFlag(neighborFlag: Boolean) = neighborFlag(JsonField.of(neighborFlag))

        /**
         * Sets [Builder.neighborFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.neighborFlag] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun neighborFlag(neighborFlag: JsonField<Boolean>) = apply {
            this.neighborFlag = neighborFlag
        }

        /** The catalog ID of the nearest neighbor to this source. */
        fun neighborId(neighborId: Long) = neighborId(JsonField.of(neighborId))

        /**
         * Sets [Builder.neighborId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.neighborId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun neighborId(neighborId: JsonField<Long>) = apply { this.neighborId = neighborId }

        /** RA of nearest neighbor measured in degrees. */
        fun neighborRa(neighborRa: Double) = neighborRa(JsonField.of(neighborRa))

        /**
         * Sets [Builder.neighborRa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.neighborRa] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun neighborRa(neighborRa: JsonField<Double>) = apply { this.neighborRa = neighborRa }

        /**
         * Identifier indicating the source is a non-single star in gaia (additional information is
         * available in non-single star tables. Consumers should contact the provider for details on
         * the specifications).
         */
        fun nonSingleStar(nonSingleStar: String) = nonSingleStar(JsonField.of(nonSingleStar))

        /**
         * Sets [Builder.nonSingleStar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonSingleStar] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nonSingleStar(nonSingleStar: JsonField<String>) = apply {
            this.nonSingleStar = nonSingleStar
        }

        /** Number of neighbors. */
        fun numNeighbors(numNeighbors: Int) = numNeighbors(JsonField.of(numNeighbors))

        /**
         * Sets [Builder.numNeighbors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numNeighbors] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numNeighbors(numNeighbors: JsonField<Int>) = apply { this.numNeighbors = numNeighbors }

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         */
        fun origin(origin: String) = origin(JsonField.of(origin))

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun origin(origin: JsonField<String>) = apply { this.origin = origin }

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         */
        fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

        /**
         * Sets [Builder.origNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origNetwork(origNetwork: JsonField<String>) = apply { this.origNetwork = origNetwork }

        /** The Panoramic Survey Telescope and Rapid Response System (Pan-STARRS) (PS) object ID. */
        fun panStarrsId(panStarrsId: Long) = panStarrsId(JsonField.of(panStarrsId))

        /**
         * Sets [Builder.panStarrsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.panStarrsId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun panStarrsId(panStarrsId: JsonField<Long>) = apply { this.panStarrsId = panStarrsId }

        /** Absolute stellar parallax of the source, in milliarcseconds. */
        fun parallax(parallax: Double) = parallax(JsonField.of(parallax))

        /**
         * Sets [Builder.parallax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parallax] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parallax(parallax: JsonField<Double>) = apply { this.parallax = parallax }

        /** Uncertainty of the stellar parallax, in milliarcseconds. */
        fun parallaxUnc(parallaxUnc: Double) = parallaxUnc(JsonField.of(parallaxUnc))

        /**
         * Sets [Builder.parallaxUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parallaxUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parallaxUnc(parallaxUnc: JsonField<Double>) = apply { this.parallaxUnc = parallaxUnc }

        /**
         * Proper motion in declination of the source, in milliarcseconds per year, at the reference
         * epoch.
         */
        fun pmdec(pmdec: Double) = pmdec(JsonField.of(pmdec))

        /**
         * Sets [Builder.pmdec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pmdec] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pmdec(pmdec: JsonField<Double>) = apply { this.pmdec = pmdec }

        /** Uncertainty of proper motion in declination, in milliarcseconds per year. */
        fun pmdecUnc(pmdecUnc: Double) = pmdecUnc(JsonField.of(pmdecUnc))

        /**
         * Sets [Builder.pmdecUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pmdecUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pmdecUnc(pmdecUnc: JsonField<Double>) = apply { this.pmdecUnc = pmdecUnc }

        /**
         * Proper motion in right ascension of the source, in milliarcseconds per year, at the
         * reference epoch.
         */
        fun pmra(pmra: Double) = pmra(JsonField.of(pmra))

        /**
         * Sets [Builder.pmra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pmra] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pmra(pmra: JsonField<Double>) = apply { this.pmra = pmra }

        /** Uncertainty of proper motion in right ascension, in milliarcseconds per year. */
        fun pmraUnc(pmraUnc: Double) = pmraUnc(JsonField.of(pmraUnc))

        /**
         * Sets [Builder.pmraUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pmraUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pmraUnc(pmraUnc: JsonField<Double>) = apply { this.pmraUnc = pmraUnc }

        /**
         * Flag indicating that the proper motion uncertainty in either ra or dec is greater than 10
         * milliarcseconds per year.
         */
        fun pmUncFlag(pmUncFlag: Boolean) = pmUncFlag(JsonField.of(pmUncFlag))

        /**
         * Sets [Builder.pmUncFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pmUncFlag] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pmUncFlag(pmUncFlag: JsonField<Boolean>) = apply { this.pmUncFlag = pmUncFlag }

        /**
         * Flag indicating that the position uncertainty in either ra or dec is greater than 100
         * milliarcseconds.
         */
        fun posUncFlag(posUncFlag: Boolean) = posUncFlag(JsonField.of(posUncFlag))

        /**
         * Sets [Builder.posUncFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posUncFlag] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun posUncFlag(posUncFlag: JsonField<Boolean>) = apply { this.posUncFlag = posUncFlag }

        /** Astrometry correction flag in Pan-STARRS. */
        fun ps1astrometryCorrectionFlag(ps1astrometryCorrectionFlag: Int) =
            ps1astrometryCorrectionFlag(JsonField.of(ps1astrometryCorrectionFlag))

        /**
         * Sets [Builder.ps1astrometryCorrectionFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ps1astrometryCorrectionFlag] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ps1astrometryCorrectionFlag(ps1astrometryCorrectionFlag: JsonField<Int>) = apply {
            this.ps1astrometryCorrectionFlag = ps1astrometryCorrectionFlag
        }

        /** Object information flag in Pan-STARRS. */
        fun ps1ObjInfoFlag(ps1ObjInfoFlag: Int) = ps1ObjInfoFlag(JsonField.of(ps1ObjInfoFlag))

        /**
         * Sets [Builder.ps1ObjInfoFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ps1ObjInfoFlag] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ps1ObjInfoFlag(ps1ObjInfoFlag: JsonField<Int>) = apply {
            this.ps1ObjInfoFlag = ps1ObjInfoFlag
        }

        /** Quality flag in Pan-STARRS. */
        fun ps1QualityFlag(ps1QualityFlag: Int) = ps1QualityFlag(JsonField.of(ps1QualityFlag))

        /**
         * Sets [Builder.ps1QualityFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ps1QualityFlag] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ps1QualityFlag(ps1QualityFlag: JsonField<Int>) = apply {
            this.ps1QualityFlag = ps1QualityFlag
        }

        /**
         * Uncertainty of the right ascension of the source, in milliarcseconds, at the reference
         * epoch.
         */
        fun raUnc(raUnc: Double) = raUnc(JsonField.of(raUnc))

        /**
         * Sets [Builder.raUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.raUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun raUnc(raUnc: JsonField<Double>) = apply { this.raUnc = raUnc }

        /** Optical Johnson R magnitude measured in magnitudes. */
        fun rmag(rmag: Double) = rmag(JsonField.of(rmag))

        /**
         * Sets [Builder.rmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rmag(rmag: JsonField<Double>) = apply { this.rmag = rmag }

        /** Catalog of origin of the Optical Johnson R magnitude (CR, GA). */
        fun rmagOrigin(rmagOrigin: String) = rmagOrigin(JsonField.of(rmagOrigin))

        /**
         * Sets [Builder.rmagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rmagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rmagOrigin(rmagOrigin: JsonField<String>) = apply { this.rmagOrigin = rmagOrigin }

        /** Uncertainty of the Optical Johnson R magnitude measured in magnitudes. */
        fun rmagUnc(rmagUnc: Double) = rmagUnc(JsonField.of(rmagUnc))

        /**
         * Sets [Builder.rmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rmagUnc(rmagUnc: JsonField<Double>) = apply { this.rmagUnc = rmagUnc }

        /** Gaia optical Rp-band in the Vega scale measured in magnitudes. */
        fun rpmag(rpmag: Double) = rpmag(JsonField.of(rpmag))

        /**
         * Sets [Builder.rpmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmag(rpmag: JsonField<Double>) = apply { this.rpmag = rpmag }

        /**
         * Gaia optical photometric Rp-band uncertainty in the Vega scale measured in magnitudes.
         */
        fun rpmagUnc(rpmagUnc: Double) = rpmagUnc(JsonField.of(rpmagUnc))

        /**
         * Sets [Builder.rpmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmagUnc(rpmagUnc: JsonField<Double>) = apply { this.rpmagUnc = rpmagUnc }

        /** RUWE in Gaia. */
        fun ruwe(ruwe: Double) = ruwe(JsonField.of(ruwe))

        /**
         * Sets [Builder.ruwe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruwe] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ruwe(ruwe: JsonField<Double>) = apply { this.ruwe = ruwe }

        /**
         * The ID of this object in the Space Domain Awareness (SDA) Catalog. If this field is
         * populated it shall match the csId field.
         */
        fun sdaCatId(sdaCatId: Long) = sdaCatId(JsonField.of(sdaCatId))

        /**
         * Sets [Builder.sdaCatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sdaCatId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sdaCatId(sdaCatId: JsonField<Long>) = apply { this.sdaCatId = sdaCatId }

        /**
         * Original G magnitude if the source is in Gaia, otherwise the magnitude is converted from
         * other photometric passbands, when possible, measured in magnitudes.
         */
        fun sgmag(sgmag: Double) = sgmag(JsonField.of(sgmag))

        /**
         * Sets [Builder.sgmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sgmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sgmag(sgmag: JsonField<Double>) = apply { this.sgmag = sgmag }

        /** Uncertainty of sgmag measured in magnitudes. */
        fun sgmagUnc(sgmagUnc: Double) = sgmagUnc(JsonField.of(sgmagUnc))

        /**
         * Sets [Builder.sgmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sgmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sgmagUnc(sgmagUnc: JsonField<Double>) = apply { this.sgmagUnc = sgmagUnc }

        /** Photocentric shift caused by neighbors, in arcseconds. */
        fun shift(shift: Double) = shift(JsonField.of(shift))

        /**
         * Sets [Builder.shift] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shift] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shift(shift: JsonField<Double>) = apply { this.shift = shift }

        /** Flag indicating that the photocentric shift is greater than 50 milliarcseconds. */
        fun shiftFlag(shiftFlag: Boolean) = shiftFlag(JsonField.of(shiftFlag))

        /**
         * Sets [Builder.shiftFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shiftFlag] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shiftFlag(shiftFlag: JsonField<Boolean>) = apply { this.shiftFlag = shiftFlag }

        /**
         * Photocentric shift caused by neighbors, in arcseconds. This value is constrained to a
         * Point Spread Function (PSF) with Full Width at Half Maximum (FWHM) of one arcsecond.
         */
        fun shiftFwhm1(shiftFwhm1: Double) = shiftFwhm1(JsonField.of(shiftFwhm1))

        /**
         * Sets [Builder.shiftFwhm1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shiftFwhm1] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shiftFwhm1(shiftFwhm1: JsonField<Double>) = apply { this.shiftFwhm1 = shiftFwhm1 }

        /**
         * Photocentric shift caused by neighbors, in arcseconds. This value is constrained to a
         * Point Spread Function (PSF) with Full Width at Half Maximum (FWHM) of six arcseconds.
         */
        fun shiftFwhm6(shiftFwhm6: Double) = shiftFwhm6(JsonField.of(shiftFwhm6))

        /**
         * Sets [Builder.shiftFwhm6] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shiftFwhm6] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shiftFwhm6(shiftFwhm6: JsonField<Double>) = apply { this.shiftFwhm6 = shiftFwhm6 }

        /** The SkyMapper (SK) catalog object ID. */
        fun skyMapperId(skyMapperId: Int) = skyMapperId(JsonField.of(skyMapperId))

        /**
         * Sets [Builder.skyMapperId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skyMapperId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun skyMapperId(skyMapperId: JsonField<Int>) = apply { this.skyMapperId = skyMapperId }

        /**
         * The designation of this object in the Two Micron All Sky Survey (2MASS) Point Source
         * Catalog (TP).
         */
        fun twoMassId(twoMassId: String) = twoMassId(JsonField.of(twoMassId))

        /**
         * Sets [Builder.twoMassId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.twoMassId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun twoMassId(twoMassId: JsonField<String>) = apply { this.twoMassId = twoMassId }

        /** Photometric (PH) quality indicator in 2MASS PSC. */
        fun twoMassPhQualInd(twoMassPhQualInd: String) =
            twoMassPhQualInd(JsonField.of(twoMassPhQualInd))

        /**
         * Sets [Builder.twoMassPhQualInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.twoMassPhQualInd] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun twoMassPhQualInd(twoMassPhQualInd: JsonField<String>) = apply {
            this.twoMassPhQualInd = twoMassPhQualInd
        }

        /** Read flag in 2MASS PSC. */
        fun twoMassReadFlag(twoMassReadFlag: String) =
            twoMassReadFlag(JsonField.of(twoMassReadFlag))

        /**
         * Sets [Builder.twoMassReadFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.twoMassReadFlag] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun twoMassReadFlag(twoMassReadFlag: JsonField<String>) = apply {
            this.twoMassReadFlag = twoMassReadFlag
        }

        /**
         * The Two Micron All Sky Survey (2MASS) Extended Source Catalog (XSC) (TX) designation of
         * this object.
         */
        fun twoMassXscId(twoMassXscId: String) = twoMassXscId(JsonField.of(twoMassXscId))

        /**
         * Sets [Builder.twoMassXscId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.twoMassXscId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun twoMassXscId(twoMassXscId: JsonField<String>) = apply {
            this.twoMassXscId = twoMassXscId
        }

        /**
         * The Tycho Double Star Catalog (TD) identifier (specified as Tycho-2 ID) of this object.
         */
        fun tychoDscId(tychoDscId: Long) = tychoDscId(JsonField.of(tychoDscId))

        /**
         * Sets [Builder.tychoDscId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tychoDscId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tychoDscId(tychoDscId: JsonField<Long>) = apply { this.tychoDscId = tychoDscId }

        /**
         * The United Kingdom Infrared Telescope (UKIRT) Hemispheric Survey (UHS) (UH) source ID of
         * this object.
         */
        fun uhsId(uhsId: Long) = uhsId(JsonField.of(uhsId))

        /**
         * Sets [Builder.uhsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uhsId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uhsId(uhsId: JsonField<Long>) = apply { this.uhsId = uhsId }

        /**
         * The United Kingdom Infrared Deep Sky Survey (UKIDSS) Galactic Clusters Survey (GCS) (UC)
         * source ID of this object.
         */
        fun ukidssGcsId(ukidssGcsId: Long) = ukidssGcsId(JsonField.of(ukidssGcsId))

        /**
         * Sets [Builder.ukidssGcsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ukidssGcsId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ukidssGcsId(ukidssGcsId: JsonField<Long>) = apply { this.ukidssGcsId = ukidssGcsId }

        /**
         * The United Kingdom Infrared Deep Sky Survey (UKIDSS) Galactic Plane Survey (GPS) (UP)
         * source ID of this object.
         */
        fun ukidssGpsId(ukidssGpsId: Long) = ukidssGpsId(JsonField.of(ukidssGpsId))

        /**
         * Sets [Builder.ukidssGpsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ukidssGpsId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ukidssGpsId(ukidssGpsId: JsonField<Long>) = apply { this.ukidssGpsId = ukidssGpsId }

        /**
         * The United Kingdom Infrared Deep Sky Survey (UKIDSS) Large Area Survey (LAS) (UL) source
         * ID of this object.
         */
        fun ukidssLasId(ukidssLasId: Long) = ukidssLasId(JsonField.of(ukidssLasId))

        /**
         * Sets [Builder.ukidssLasId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ukidssLasId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ukidssLasId(ukidssLasId: JsonField<Long>) = apply { this.ukidssLasId = ukidssLasId }

        /** Time the row was last updated in the database, auto-populated by the system. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Application user who updated the row in the database, auto-populated by the system. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

        /** Flag indicating that the source exhibits variable magnitude. */
        fun varFlag(varFlag: Boolean) = varFlag(JsonField.of(varFlag))

        /**
         * Sets [Builder.varFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.varFlag] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun varFlag(varFlag: JsonField<Boolean>) = apply { this.varFlag = varFlag }

        /**
         * Identifier indicating variability is present in the photometric data. Consumers should
         * contact the provider for details on the specifications.
         */
        fun variability(variability: String) = variability(JsonField.of(variability))

        /**
         * Sets [Builder.variability] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variability] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun variability(variability: JsonField<String>) = apply { this.variability = variability }

        /**
         * The Visible and Infrared Survey Telescope for Astronomy (VISTA) Hemisphere Survey (VHS)
         * (VS) source ID of this object.
         */
        fun vhsId(vhsId: Long) = vhsId(JsonField.of(vhsId))

        /**
         * Sets [Builder.vhsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vhsId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vhsId(vhsId: JsonField<Long>) = apply { this.vhsId = vhsId }

        /** Optical Johnson V magnitude measured in magnitudes. */
        fun vmag(vmag: Double) = vmag(JsonField.of(vmag))

        /**
         * Sets [Builder.vmag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vmag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vmag(vmag: JsonField<Double>) = apply { this.vmag = vmag }

        /** Catalog of origin of Optical Johnson V magnitude (AP, CR, DU, GA, HI). */
        fun vmagOrigin(vmagOrigin: String) = vmagOrigin(JsonField.of(vmagOrigin))

        /**
         * Sets [Builder.vmagOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vmagOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vmagOrigin(vmagOrigin: JsonField<String>) = apply { this.vmagOrigin = vmagOrigin }

        /** Uncertainty of the Optical Johnson V magnitude measured in magnitudes. */
        fun vmagUnc(vmagUnc: Double) = vmagUnc(JsonField.of(vmagUnc))

        /**
         * Sets [Builder.vmagUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vmagUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vmagUnc(vmagUnc: JsonField<Double>) = apply { this.vmagUnc = vmagUnc }

        /**
         * Mid-infrared photometric W1-band (3.4 microns) magnitude in the Vega system measured in
         * magnitudes.
         */
        fun w1mag(w1mag: Double) = w1mag(JsonField.of(w1mag))

        /**
         * Sets [Builder.w1mag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w1mag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w1mag(w1mag: JsonField<Double>) = apply { this.w1mag = w1mag }

        /**
         * Mid-infrared photometric W1-band (3.4 microns) catalog of origin in the Vega system (AL,
         * CA).
         */
        fun w1magOrigin(w1magOrigin: String) = w1magOrigin(JsonField.of(w1magOrigin))

        /**
         * Sets [Builder.w1magOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w1magOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun w1magOrigin(w1magOrigin: JsonField<String>) = apply { this.w1magOrigin = w1magOrigin }

        /**
         * Mid-infrared photometric W1-band (3.4 microns) magnitude uncertainty in the Vega system
         * measured in magnitudes.
         */
        fun w1magUnc(w1magUnc: Double) = w1magUnc(JsonField.of(w1magUnc))

        /**
         * Sets [Builder.w1magUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w1magUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w1magUnc(w1magUnc: JsonField<Double>) = apply { this.w1magUnc = w1magUnc }

        /**
         * Mid-infrared photometric W1-band (3.4 microns) saturated pixel fraction in the Vega
         * system.
         */
        fun w1sat(w1sat: Double) = w1sat(JsonField.of(w1sat))

        /**
         * Sets [Builder.w1sat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w1sat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w1sat(w1sat: JsonField<Double>) = apply { this.w1sat = w1sat }

        /**
         * Mid-infrared photometric W2-band (4.6 microns) magnitude in the Vega system measured in
         * magnitudes.
         */
        fun w2mag(w2mag: Double) = w2mag(JsonField.of(w2mag))

        /**
         * Sets [Builder.w2mag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w2mag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w2mag(w2mag: JsonField<Double>) = apply { this.w2mag = w2mag }

        /**
         * Mid-infrared photometric W2-band (4.6 microns) catalog of origin in the Vega system (AL,
         * CA).
         */
        fun w2magOrigin(w2magOrigin: String) = w2magOrigin(JsonField.of(w2magOrigin))

        /**
         * Sets [Builder.w2magOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w2magOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun w2magOrigin(w2magOrigin: JsonField<String>) = apply { this.w2magOrigin = w2magOrigin }

        /**
         * Mid-infrared photometric W2-band (4.6 microns) magnitude uncertainty in the Vega system
         * measured in magnitudes.
         */
        fun w2magUnc(w2magUnc: Double) = w2magUnc(JsonField.of(w2magUnc))

        /**
         * Sets [Builder.w2magUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w2magUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w2magUnc(w2magUnc: JsonField<Double>) = apply { this.w2magUnc = w2magUnc }

        /**
         * Mid-infrared photometric W2-band (4.6 microns) saturated pixel fraction in the Vega
         * system.
         */
        fun w2sat(w2sat: Double) = w2sat(JsonField.of(w2sat))

        /**
         * Sets [Builder.w2sat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w2sat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w2sat(w2sat: JsonField<Double>) = apply { this.w2sat = w2sat }

        /**
         * Mid-infrared photometric W3-band (12 microns) magnitude in the Vega system measured in
         * magnitudes.
         */
        fun w3mag(w3mag: Double) = w3mag(JsonField.of(w3mag))

        /**
         * Sets [Builder.w3mag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w3mag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w3mag(w3mag: JsonField<Double>) = apply { this.w3mag = w3mag }

        /**
         * Mid-infrared photometric W3-band (12 microns) catalog of origin in the Vega system (AL).
         */
        fun w3magOrigin(w3magOrigin: String) = w3magOrigin(JsonField.of(w3magOrigin))

        /**
         * Sets [Builder.w3magOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w3magOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun w3magOrigin(w3magOrigin: JsonField<String>) = apply { this.w3magOrigin = w3magOrigin }

        /**
         * Mid-infrared photometric W3-band (12 microns) magnitude uncertainty in the Vega system
         * measured in magnitudes.
         */
        fun w3magUnc(w3magUnc: Double) = w3magUnc(JsonField.of(w3magUnc))

        /**
         * Sets [Builder.w3magUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w3magUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w3magUnc(w3magUnc: JsonField<Double>) = apply { this.w3magUnc = w3magUnc }

        /**
         * Mid-infrared photometric W3-band (12 microns) saturated pixel fraction in the Vega
         * system.
         */
        fun w3sat(w3sat: Double) = w3sat(JsonField.of(w3sat))

        /**
         * Sets [Builder.w3sat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w3sat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w3sat(w3sat: JsonField<Double>) = apply { this.w3sat = w3sat }

        /**
         * Mid-infrared photometric W4-band (22 microns) magnitude in the Vega system measured in
         * magnitudes.
         */
        fun w4mag(w4mag: Double) = w4mag(JsonField.of(w4mag))

        /**
         * Sets [Builder.w4mag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w4mag] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w4mag(w4mag: JsonField<Double>) = apply { this.w4mag = w4mag }

        /**
         * Mid-infrared photometric W4-band (22 microns) catalog of origin in the Vega system (AL).
         */
        fun w4magOrigin(w4magOrigin: String) = w4magOrigin(JsonField.of(w4magOrigin))

        /**
         * Sets [Builder.w4magOrigin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w4magOrigin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun w4magOrigin(w4magOrigin: JsonField<String>) = apply { this.w4magOrigin = w4magOrigin }

        /**
         * Mid-infrared photometric W4-band (22 microns) magnitude uncertainty in the Vega system
         * measured in magnitudes.
         */
        fun w4magUnc(w4magUnc: Double) = w4magUnc(JsonField.of(w4magUnc))

        /**
         * Sets [Builder.w4magUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w4magUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w4magUnc(w4magUnc: JsonField<Double>) = apply { this.w4magUnc = w4magUnc }

        /**
         * Mid-infrared photometric W4-band (22 microns) saturated pixel fraction in the Vega
         * system.
         */
        fun w4sat(w4sat: Double) = w4sat(JsonField.of(w4sat))

        /**
         * Sets [Builder.w4sat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.w4sat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun w4sat(w4sat: JsonField<Double>) = apply { this.w4sat = w4sat }

        /** The Washington Double Star Catalog (WD) identifier of this object. */
        fun wdsCatId(wdsCatId: String) = wdsCatId(JsonField.of(wdsCatId))

        /**
         * Sets [Builder.wdsCatId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wdsCatId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun wdsCatId(wdsCatId: JsonField<String>) = apply { this.wdsCatId = wdsCatId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [StarCatalogListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .astrometryOrigin()
         * .classificationMarking()
         * .csId()
         * .dataMode()
         * .dec()
         * .ra()
         * .source()
         * .starEpoch()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StarCatalogListResponse =
            StarCatalogListResponse(
                checkRequired("astrometryOrigin", astrometryOrigin),
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("csId", csId),
                checkRequired("dataMode", dataMode),
                checkRequired("dec", dec),
                checkRequired("ra", ra),
                checkRequired("source", source),
                checkRequired("starEpoch", starEpoch),
                id,
                aavsoVsxId,
                abgmag,
                abgmagOrigin,
                abgmagUnc,
                abimag,
                abimagOrigin,
                abimagUnc,
                abrmag,
                abrmagOrigin,
                abrmagUnc,
                abymag,
                abymagOrigin,
                abymagUnc,
                abzmag,
                abzmagOrigin,
                abzmagUnc,
                allWisEccInd,
                allWiseId,
                allWisEnaInd,
                allWisEphQualInd,
                apassId,
                astrometricExcessNoise,
                astrometricExcessNoiseSig,
                bmag,
                bmagOrigin,
                bmagUnc,
                bpmag,
                bpmagUnc,
                carrascoCatId,
                catVersion,
                catWise2020Id,
                createdAt,
                createdBy,
                decUnc,
                ducatiCatId,
                gaiadr3CatId,
                gmag,
                gmagUnc,
                gncCatId,
                healpixIndex,
                hipCatId,
                hmag,
                hmagOrigin,
                hmagUnc,
                imag,
                imagOrigin,
                imagUnc,
                jmag,
                jmagOrigin,
                jmagUnc,
                kmag,
                kmagOrigin,
                kmagUnc,
                morphologyInd,
                multFlag,
                multiplicity,
                neighborDec,
                neighborDistance,
                neighborFlag,
                neighborId,
                neighborRa,
                nonSingleStar,
                numNeighbors,
                origin,
                origNetwork,
                panStarrsId,
                parallax,
                parallaxUnc,
                pmdec,
                pmdecUnc,
                pmra,
                pmraUnc,
                pmUncFlag,
                posUncFlag,
                ps1astrometryCorrectionFlag,
                ps1ObjInfoFlag,
                ps1QualityFlag,
                raUnc,
                rmag,
                rmagOrigin,
                rmagUnc,
                rpmag,
                rpmagUnc,
                ruwe,
                sdaCatId,
                sgmag,
                sgmagUnc,
                shift,
                shiftFlag,
                shiftFwhm1,
                shiftFwhm6,
                skyMapperId,
                twoMassId,
                twoMassPhQualInd,
                twoMassReadFlag,
                twoMassXscId,
                tychoDscId,
                uhsId,
                ukidssGcsId,
                ukidssGpsId,
                ukidssLasId,
                updatedAt,
                updatedBy,
                varFlag,
                variability,
                vhsId,
                vmag,
                vmagOrigin,
                vmagUnc,
                w1mag,
                w1magOrigin,
                w1magUnc,
                w1sat,
                w2mag,
                w2magOrigin,
                w2magUnc,
                w2sat,
                w3mag,
                w3magOrigin,
                w3magUnc,
                w3sat,
                w4mag,
                w4magOrigin,
                w4magUnc,
                w4sat,
                wdsCatId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws UnifieddatalibraryInvalidDataException if any value type in this object doesn't match
     *   its expected type.
     */
    fun validate(): StarCatalogListResponse = apply {
        if (validated) {
            return@apply
        }

        astrometryOrigin()
        classificationMarking()
        csId()
        dataMode().validate()
        dec()
        ra()
        source()
        starEpoch()
        id()
        aavsoVsxId()
        abgmag()
        abgmagOrigin()
        abgmagUnc()
        abimag()
        abimagOrigin()
        abimagUnc()
        abrmag()
        abrmagOrigin()
        abrmagUnc()
        abymag()
        abymagOrigin()
        abymagUnc()
        abzmag()
        abzmagOrigin()
        abzmagUnc()
        allWisEccInd()
        allWiseId()
        allWisEnaInd()
        allWisEphQualInd()
        apassId()
        astrometricExcessNoise()
        astrometricExcessNoiseSig()
        bmag()
        bmagOrigin()
        bmagUnc()
        bpmag()
        bpmagUnc()
        carrascoCatId()
        catVersion()
        catWise2020Id()
        createdAt()
        createdBy()
        decUnc()
        ducatiCatId()
        gaiadr3CatId()
        gmag()
        gmagUnc()
        gncCatId()
        healpixIndex()
        hipCatId()
        hmag()
        hmagOrigin()
        hmagUnc()
        imag()
        imagOrigin()
        imagUnc()
        jmag()
        jmagOrigin()
        jmagUnc()
        kmag()
        kmagOrigin()
        kmagUnc()
        morphologyInd()
        multFlag()
        multiplicity()
        neighborDec()
        neighborDistance()
        neighborFlag()
        neighborId()
        neighborRa()
        nonSingleStar()
        numNeighbors()
        origin()
        origNetwork()
        panStarrsId()
        parallax()
        parallaxUnc()
        pmdec()
        pmdecUnc()
        pmra()
        pmraUnc()
        pmUncFlag()
        posUncFlag()
        ps1astrometryCorrectionFlag()
        ps1ObjInfoFlag()
        ps1QualityFlag()
        raUnc()
        rmag()
        rmagOrigin()
        rmagUnc()
        rpmag()
        rpmagUnc()
        ruwe()
        sdaCatId()
        sgmag()
        sgmagUnc()
        shift()
        shiftFlag()
        shiftFwhm1()
        shiftFwhm6()
        skyMapperId()
        twoMassId()
        twoMassPhQualInd()
        twoMassReadFlag()
        twoMassXscId()
        tychoDscId()
        uhsId()
        ukidssGcsId()
        ukidssGpsId()
        ukidssLasId()
        updatedAt()
        updatedBy()
        varFlag()
        variability()
        vhsId()
        vmag()
        vmagOrigin()
        vmagUnc()
        w1mag()
        w1magOrigin()
        w1magUnc()
        w1sat()
        w2mag()
        w2magOrigin()
        w2magUnc()
        w2sat()
        w3mag()
        w3magOrigin()
        w3magUnc()
        w3sat()
        w4mag()
        w4magOrigin()
        w4magUnc()
        w4sat()
        wdsCatId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: UnifieddatalibraryInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (astrometryOrigin.asKnown().isPresent) 1 else 0) +
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (if (csId.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dec.asKnown().isPresent) 1 else 0) +
            (if (ra.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (starEpoch.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (aavsoVsxId.asKnown().isPresent) 1 else 0) +
            (if (abgmag.asKnown().isPresent) 1 else 0) +
            (if (abgmagOrigin.asKnown().isPresent) 1 else 0) +
            (if (abgmagUnc.asKnown().isPresent) 1 else 0) +
            (if (abimag.asKnown().isPresent) 1 else 0) +
            (if (abimagOrigin.asKnown().isPresent) 1 else 0) +
            (if (abimagUnc.asKnown().isPresent) 1 else 0) +
            (if (abrmag.asKnown().isPresent) 1 else 0) +
            (if (abrmagOrigin.asKnown().isPresent) 1 else 0) +
            (if (abrmagUnc.asKnown().isPresent) 1 else 0) +
            (if (abymag.asKnown().isPresent) 1 else 0) +
            (if (abymagOrigin.asKnown().isPresent) 1 else 0) +
            (if (abymagUnc.asKnown().isPresent) 1 else 0) +
            (if (abzmag.asKnown().isPresent) 1 else 0) +
            (if (abzmagOrigin.asKnown().isPresent) 1 else 0) +
            (if (abzmagUnc.asKnown().isPresent) 1 else 0) +
            (if (allWisEccInd.asKnown().isPresent) 1 else 0) +
            (if (allWiseId.asKnown().isPresent) 1 else 0) +
            (if (allWisEnaInd.asKnown().isPresent) 1 else 0) +
            (if (allWisEphQualInd.asKnown().isPresent) 1 else 0) +
            (if (apassId.asKnown().isPresent) 1 else 0) +
            (if (astrometricExcessNoise.asKnown().isPresent) 1 else 0) +
            (if (astrometricExcessNoiseSig.asKnown().isPresent) 1 else 0) +
            (if (bmag.asKnown().isPresent) 1 else 0) +
            (if (bmagOrigin.asKnown().isPresent) 1 else 0) +
            (if (bmagUnc.asKnown().isPresent) 1 else 0) +
            (if (bpmag.asKnown().isPresent) 1 else 0) +
            (if (bpmagUnc.asKnown().isPresent) 1 else 0) +
            (if (carrascoCatId.asKnown().isPresent) 1 else 0) +
            (if (catVersion.asKnown().isPresent) 1 else 0) +
            (if (catWise2020Id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (decUnc.asKnown().isPresent) 1 else 0) +
            (if (ducatiCatId.asKnown().isPresent) 1 else 0) +
            (if (gaiadr3CatId.asKnown().isPresent) 1 else 0) +
            (if (gmag.asKnown().isPresent) 1 else 0) +
            (if (gmagUnc.asKnown().isPresent) 1 else 0) +
            (if (gncCatId.asKnown().isPresent) 1 else 0) +
            (if (healpixIndex.asKnown().isPresent) 1 else 0) +
            (if (hipCatId.asKnown().isPresent) 1 else 0) +
            (if (hmag.asKnown().isPresent) 1 else 0) +
            (if (hmagOrigin.asKnown().isPresent) 1 else 0) +
            (if (hmagUnc.asKnown().isPresent) 1 else 0) +
            (if (imag.asKnown().isPresent) 1 else 0) +
            (if (imagOrigin.asKnown().isPresent) 1 else 0) +
            (if (imagUnc.asKnown().isPresent) 1 else 0) +
            (if (jmag.asKnown().isPresent) 1 else 0) +
            (if (jmagOrigin.asKnown().isPresent) 1 else 0) +
            (if (jmagUnc.asKnown().isPresent) 1 else 0) +
            (if (kmag.asKnown().isPresent) 1 else 0) +
            (if (kmagOrigin.asKnown().isPresent) 1 else 0) +
            (if (kmagUnc.asKnown().isPresent) 1 else 0) +
            (if (morphologyInd.asKnown().isPresent) 1 else 0) +
            (if (multFlag.asKnown().isPresent) 1 else 0) +
            (if (multiplicity.asKnown().isPresent) 1 else 0) +
            (if (neighborDec.asKnown().isPresent) 1 else 0) +
            (if (neighborDistance.asKnown().isPresent) 1 else 0) +
            (if (neighborFlag.asKnown().isPresent) 1 else 0) +
            (if (neighborId.asKnown().isPresent) 1 else 0) +
            (if (neighborRa.asKnown().isPresent) 1 else 0) +
            (if (nonSingleStar.asKnown().isPresent) 1 else 0) +
            (if (numNeighbors.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (panStarrsId.asKnown().isPresent) 1 else 0) +
            (if (parallax.asKnown().isPresent) 1 else 0) +
            (if (parallaxUnc.asKnown().isPresent) 1 else 0) +
            (if (pmdec.asKnown().isPresent) 1 else 0) +
            (if (pmdecUnc.asKnown().isPresent) 1 else 0) +
            (if (pmra.asKnown().isPresent) 1 else 0) +
            (if (pmraUnc.asKnown().isPresent) 1 else 0) +
            (if (pmUncFlag.asKnown().isPresent) 1 else 0) +
            (if (posUncFlag.asKnown().isPresent) 1 else 0) +
            (if (ps1astrometryCorrectionFlag.asKnown().isPresent) 1 else 0) +
            (if (ps1ObjInfoFlag.asKnown().isPresent) 1 else 0) +
            (if (ps1QualityFlag.asKnown().isPresent) 1 else 0) +
            (if (raUnc.asKnown().isPresent) 1 else 0) +
            (if (rmag.asKnown().isPresent) 1 else 0) +
            (if (rmagOrigin.asKnown().isPresent) 1 else 0) +
            (if (rmagUnc.asKnown().isPresent) 1 else 0) +
            (if (rpmag.asKnown().isPresent) 1 else 0) +
            (if (rpmagUnc.asKnown().isPresent) 1 else 0) +
            (if (ruwe.asKnown().isPresent) 1 else 0) +
            (if (sdaCatId.asKnown().isPresent) 1 else 0) +
            (if (sgmag.asKnown().isPresent) 1 else 0) +
            (if (sgmagUnc.asKnown().isPresent) 1 else 0) +
            (if (shift.asKnown().isPresent) 1 else 0) +
            (if (shiftFlag.asKnown().isPresent) 1 else 0) +
            (if (shiftFwhm1.asKnown().isPresent) 1 else 0) +
            (if (shiftFwhm6.asKnown().isPresent) 1 else 0) +
            (if (skyMapperId.asKnown().isPresent) 1 else 0) +
            (if (twoMassId.asKnown().isPresent) 1 else 0) +
            (if (twoMassPhQualInd.asKnown().isPresent) 1 else 0) +
            (if (twoMassReadFlag.asKnown().isPresent) 1 else 0) +
            (if (twoMassXscId.asKnown().isPresent) 1 else 0) +
            (if (tychoDscId.asKnown().isPresent) 1 else 0) +
            (if (uhsId.asKnown().isPresent) 1 else 0) +
            (if (ukidssGcsId.asKnown().isPresent) 1 else 0) +
            (if (ukidssGpsId.asKnown().isPresent) 1 else 0) +
            (if (ukidssLasId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (varFlag.asKnown().isPresent) 1 else 0) +
            (if (variability.asKnown().isPresent) 1 else 0) +
            (if (vhsId.asKnown().isPresent) 1 else 0) +
            (if (vmag.asKnown().isPresent) 1 else 0) +
            (if (vmagOrigin.asKnown().isPresent) 1 else 0) +
            (if (vmagUnc.asKnown().isPresent) 1 else 0) +
            (if (w1mag.asKnown().isPresent) 1 else 0) +
            (if (w1magOrigin.asKnown().isPresent) 1 else 0) +
            (if (w1magUnc.asKnown().isPresent) 1 else 0) +
            (if (w1sat.asKnown().isPresent) 1 else 0) +
            (if (w2mag.asKnown().isPresent) 1 else 0) +
            (if (w2magOrigin.asKnown().isPresent) 1 else 0) +
            (if (w2magUnc.asKnown().isPresent) 1 else 0) +
            (if (w2sat.asKnown().isPresent) 1 else 0) +
            (if (w3mag.asKnown().isPresent) 1 else 0) +
            (if (w3magOrigin.asKnown().isPresent) 1 else 0) +
            (if (w3magUnc.asKnown().isPresent) 1 else 0) +
            (if (w3sat.asKnown().isPresent) 1 else 0) +
            (if (w4mag.asKnown().isPresent) 1 else 0) +
            (if (w4magOrigin.asKnown().isPresent) 1 else 0) +
            (if (w4magUnc.asKnown().isPresent) 1 else 0) +
            (if (w4sat.asKnown().isPresent) 1 else 0) +
            (if (wdsCatId.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL: Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * TEST: Specific datasets used to evaluate compliance with specifications and requirements, and
     * for validating technical, functional, and performance characteristics.
     *
     * EXERCISE: Data pertaining to a government or military exercise. The data may include both
     * real and simulated data.
     *
     * SIMULATED: Synthetic data generated by a model to mimic real-world datasets.
     */
    class DataMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val REAL = of("REAL")

            @JvmField val TEST = of("TEST")

            @JvmField val EXERCISE = of("EXERCISE")

            @JvmField val SIMULATED = of("SIMULATED")

            @JvmStatic fun of(value: String) = DataMode(JsonField.of(value))
        }

        /** An enum containing [DataMode]'s known values. */
        enum class Known {
            REAL,
            TEST,
            EXERCISE,
            SIMULATED,
        }

        /**
         * An enum containing [DataMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REAL,
            TEST,
            EXERCISE,
            SIMULATED,
            /** An enum member indicating that [DataMode] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                REAL -> Value.REAL
                TEST -> Value.TEST
                EXERCISE -> Value.EXERCISE
                SIMULATED -> Value.SIMULATED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                REAL -> Known.REAL
                TEST -> Known.TEST
                EXERCISE -> Known.EXERCISE
                SIMULATED -> Known.SIMULATED
                else -> throw UnifieddatalibraryInvalidDataException("Unknown DataMode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws UnifieddatalibraryInvalidDataException if any value type in this object doesn't
         *   match its expected type.
         */
        fun validate(): DataMode = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StarCatalogListResponse &&
            astrometryOrigin == other.astrometryOrigin &&
            classificationMarking == other.classificationMarking &&
            csId == other.csId &&
            dataMode == other.dataMode &&
            dec == other.dec &&
            ra == other.ra &&
            source == other.source &&
            starEpoch == other.starEpoch &&
            id == other.id &&
            aavsoVsxId == other.aavsoVsxId &&
            abgmag == other.abgmag &&
            abgmagOrigin == other.abgmagOrigin &&
            abgmagUnc == other.abgmagUnc &&
            abimag == other.abimag &&
            abimagOrigin == other.abimagOrigin &&
            abimagUnc == other.abimagUnc &&
            abrmag == other.abrmag &&
            abrmagOrigin == other.abrmagOrigin &&
            abrmagUnc == other.abrmagUnc &&
            abymag == other.abymag &&
            abymagOrigin == other.abymagOrigin &&
            abymagUnc == other.abymagUnc &&
            abzmag == other.abzmag &&
            abzmagOrigin == other.abzmagOrigin &&
            abzmagUnc == other.abzmagUnc &&
            allWisEccInd == other.allWisEccInd &&
            allWiseId == other.allWiseId &&
            allWisEnaInd == other.allWisEnaInd &&
            allWisEphQualInd == other.allWisEphQualInd &&
            apassId == other.apassId &&
            astrometricExcessNoise == other.astrometricExcessNoise &&
            astrometricExcessNoiseSig == other.astrometricExcessNoiseSig &&
            bmag == other.bmag &&
            bmagOrigin == other.bmagOrigin &&
            bmagUnc == other.bmagUnc &&
            bpmag == other.bpmag &&
            bpmagUnc == other.bpmagUnc &&
            carrascoCatId == other.carrascoCatId &&
            catVersion == other.catVersion &&
            catWise2020Id == other.catWise2020Id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            decUnc == other.decUnc &&
            ducatiCatId == other.ducatiCatId &&
            gaiadr3CatId == other.gaiadr3CatId &&
            gmag == other.gmag &&
            gmagUnc == other.gmagUnc &&
            gncCatId == other.gncCatId &&
            healpixIndex == other.healpixIndex &&
            hipCatId == other.hipCatId &&
            hmag == other.hmag &&
            hmagOrigin == other.hmagOrigin &&
            hmagUnc == other.hmagUnc &&
            imag == other.imag &&
            imagOrigin == other.imagOrigin &&
            imagUnc == other.imagUnc &&
            jmag == other.jmag &&
            jmagOrigin == other.jmagOrigin &&
            jmagUnc == other.jmagUnc &&
            kmag == other.kmag &&
            kmagOrigin == other.kmagOrigin &&
            kmagUnc == other.kmagUnc &&
            morphologyInd == other.morphologyInd &&
            multFlag == other.multFlag &&
            multiplicity == other.multiplicity &&
            neighborDec == other.neighborDec &&
            neighborDistance == other.neighborDistance &&
            neighborFlag == other.neighborFlag &&
            neighborId == other.neighborId &&
            neighborRa == other.neighborRa &&
            nonSingleStar == other.nonSingleStar &&
            numNeighbors == other.numNeighbors &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            panStarrsId == other.panStarrsId &&
            parallax == other.parallax &&
            parallaxUnc == other.parallaxUnc &&
            pmdec == other.pmdec &&
            pmdecUnc == other.pmdecUnc &&
            pmra == other.pmra &&
            pmraUnc == other.pmraUnc &&
            pmUncFlag == other.pmUncFlag &&
            posUncFlag == other.posUncFlag &&
            ps1astrometryCorrectionFlag == other.ps1astrometryCorrectionFlag &&
            ps1ObjInfoFlag == other.ps1ObjInfoFlag &&
            ps1QualityFlag == other.ps1QualityFlag &&
            raUnc == other.raUnc &&
            rmag == other.rmag &&
            rmagOrigin == other.rmagOrigin &&
            rmagUnc == other.rmagUnc &&
            rpmag == other.rpmag &&
            rpmagUnc == other.rpmagUnc &&
            ruwe == other.ruwe &&
            sdaCatId == other.sdaCatId &&
            sgmag == other.sgmag &&
            sgmagUnc == other.sgmagUnc &&
            shift == other.shift &&
            shiftFlag == other.shiftFlag &&
            shiftFwhm1 == other.shiftFwhm1 &&
            shiftFwhm6 == other.shiftFwhm6 &&
            skyMapperId == other.skyMapperId &&
            twoMassId == other.twoMassId &&
            twoMassPhQualInd == other.twoMassPhQualInd &&
            twoMassReadFlag == other.twoMassReadFlag &&
            twoMassXscId == other.twoMassXscId &&
            tychoDscId == other.tychoDscId &&
            uhsId == other.uhsId &&
            ukidssGcsId == other.ukidssGcsId &&
            ukidssGpsId == other.ukidssGpsId &&
            ukidssLasId == other.ukidssLasId &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            varFlag == other.varFlag &&
            variability == other.variability &&
            vhsId == other.vhsId &&
            vmag == other.vmag &&
            vmagOrigin == other.vmagOrigin &&
            vmagUnc == other.vmagUnc &&
            w1mag == other.w1mag &&
            w1magOrigin == other.w1magOrigin &&
            w1magUnc == other.w1magUnc &&
            w1sat == other.w1sat &&
            w2mag == other.w2mag &&
            w2magOrigin == other.w2magOrigin &&
            w2magUnc == other.w2magUnc &&
            w2sat == other.w2sat &&
            w3mag == other.w3mag &&
            w3magOrigin == other.w3magOrigin &&
            w3magUnc == other.w3magUnc &&
            w3sat == other.w3sat &&
            w4mag == other.w4mag &&
            w4magOrigin == other.w4magOrigin &&
            w4magUnc == other.w4magUnc &&
            w4sat == other.w4sat &&
            wdsCatId == other.wdsCatId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            astrometryOrigin,
            classificationMarking,
            csId,
            dataMode,
            dec,
            ra,
            source,
            starEpoch,
            id,
            aavsoVsxId,
            abgmag,
            abgmagOrigin,
            abgmagUnc,
            abimag,
            abimagOrigin,
            abimagUnc,
            abrmag,
            abrmagOrigin,
            abrmagUnc,
            abymag,
            abymagOrigin,
            abymagUnc,
            abzmag,
            abzmagOrigin,
            abzmagUnc,
            allWisEccInd,
            allWiseId,
            allWisEnaInd,
            allWisEphQualInd,
            apassId,
            astrometricExcessNoise,
            astrometricExcessNoiseSig,
            bmag,
            bmagOrigin,
            bmagUnc,
            bpmag,
            bpmagUnc,
            carrascoCatId,
            catVersion,
            catWise2020Id,
            createdAt,
            createdBy,
            decUnc,
            ducatiCatId,
            gaiadr3CatId,
            gmag,
            gmagUnc,
            gncCatId,
            healpixIndex,
            hipCatId,
            hmag,
            hmagOrigin,
            hmagUnc,
            imag,
            imagOrigin,
            imagUnc,
            jmag,
            jmagOrigin,
            jmagUnc,
            kmag,
            kmagOrigin,
            kmagUnc,
            morphologyInd,
            multFlag,
            multiplicity,
            neighborDec,
            neighborDistance,
            neighborFlag,
            neighborId,
            neighborRa,
            nonSingleStar,
            numNeighbors,
            origin,
            origNetwork,
            panStarrsId,
            parallax,
            parallaxUnc,
            pmdec,
            pmdecUnc,
            pmra,
            pmraUnc,
            pmUncFlag,
            posUncFlag,
            ps1astrometryCorrectionFlag,
            ps1ObjInfoFlag,
            ps1QualityFlag,
            raUnc,
            rmag,
            rmagOrigin,
            rmagUnc,
            rpmag,
            rpmagUnc,
            ruwe,
            sdaCatId,
            sgmag,
            sgmagUnc,
            shift,
            shiftFlag,
            shiftFwhm1,
            shiftFwhm6,
            skyMapperId,
            twoMassId,
            twoMassPhQualInd,
            twoMassReadFlag,
            twoMassXscId,
            tychoDscId,
            uhsId,
            ukidssGcsId,
            ukidssGpsId,
            ukidssLasId,
            updatedAt,
            updatedBy,
            varFlag,
            variability,
            vhsId,
            vmag,
            vmagOrigin,
            vmagUnc,
            w1mag,
            w1magOrigin,
            w1magUnc,
            w1sat,
            w2mag,
            w2magOrigin,
            w2magUnc,
            w2sat,
            w3mag,
            w3magOrigin,
            w3magUnc,
            w3sat,
            w4mag,
            w4magOrigin,
            w4magUnc,
            w4sat,
            wdsCatId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StarCatalogListResponse{astrometryOrigin=$astrometryOrigin, classificationMarking=$classificationMarking, csId=$csId, dataMode=$dataMode, dec=$dec, ra=$ra, source=$source, starEpoch=$starEpoch, id=$id, aavsoVsxId=$aavsoVsxId, abgmag=$abgmag, abgmagOrigin=$abgmagOrigin, abgmagUnc=$abgmagUnc, abimag=$abimag, abimagOrigin=$abimagOrigin, abimagUnc=$abimagUnc, abrmag=$abrmag, abrmagOrigin=$abrmagOrigin, abrmagUnc=$abrmagUnc, abymag=$abymag, abymagOrigin=$abymagOrigin, abymagUnc=$abymagUnc, abzmag=$abzmag, abzmagOrigin=$abzmagOrigin, abzmagUnc=$abzmagUnc, allWisEccInd=$allWisEccInd, allWiseId=$allWiseId, allWisEnaInd=$allWisEnaInd, allWisEphQualInd=$allWisEphQualInd, apassId=$apassId, astrometricExcessNoise=$astrometricExcessNoise, astrometricExcessNoiseSig=$astrometricExcessNoiseSig, bmag=$bmag, bmagOrigin=$bmagOrigin, bmagUnc=$bmagUnc, bpmag=$bpmag, bpmagUnc=$bpmagUnc, carrascoCatId=$carrascoCatId, catVersion=$catVersion, catWise2020Id=$catWise2020Id, createdAt=$createdAt, createdBy=$createdBy, decUnc=$decUnc, ducatiCatId=$ducatiCatId, gaiadr3CatId=$gaiadr3CatId, gmag=$gmag, gmagUnc=$gmagUnc, gncCatId=$gncCatId, healpixIndex=$healpixIndex, hipCatId=$hipCatId, hmag=$hmag, hmagOrigin=$hmagOrigin, hmagUnc=$hmagUnc, imag=$imag, imagOrigin=$imagOrigin, imagUnc=$imagUnc, jmag=$jmag, jmagOrigin=$jmagOrigin, jmagUnc=$jmagUnc, kmag=$kmag, kmagOrigin=$kmagOrigin, kmagUnc=$kmagUnc, morphologyInd=$morphologyInd, multFlag=$multFlag, multiplicity=$multiplicity, neighborDec=$neighborDec, neighborDistance=$neighborDistance, neighborFlag=$neighborFlag, neighborId=$neighborId, neighborRa=$neighborRa, nonSingleStar=$nonSingleStar, numNeighbors=$numNeighbors, origin=$origin, origNetwork=$origNetwork, panStarrsId=$panStarrsId, parallax=$parallax, parallaxUnc=$parallaxUnc, pmdec=$pmdec, pmdecUnc=$pmdecUnc, pmra=$pmra, pmraUnc=$pmraUnc, pmUncFlag=$pmUncFlag, posUncFlag=$posUncFlag, ps1astrometryCorrectionFlag=$ps1astrometryCorrectionFlag, ps1ObjInfoFlag=$ps1ObjInfoFlag, ps1QualityFlag=$ps1QualityFlag, raUnc=$raUnc, rmag=$rmag, rmagOrigin=$rmagOrigin, rmagUnc=$rmagUnc, rpmag=$rpmag, rpmagUnc=$rpmagUnc, ruwe=$ruwe, sdaCatId=$sdaCatId, sgmag=$sgmag, sgmagUnc=$sgmagUnc, shift=$shift, shiftFlag=$shiftFlag, shiftFwhm1=$shiftFwhm1, shiftFwhm6=$shiftFwhm6, skyMapperId=$skyMapperId, twoMassId=$twoMassId, twoMassPhQualInd=$twoMassPhQualInd, twoMassReadFlag=$twoMassReadFlag, twoMassXscId=$twoMassXscId, tychoDscId=$tychoDscId, uhsId=$uhsId, ukidssGcsId=$ukidssGcsId, ukidssGpsId=$ukidssGpsId, ukidssLasId=$ukidssLasId, updatedAt=$updatedAt, updatedBy=$updatedBy, varFlag=$varFlag, variability=$variability, vhsId=$vhsId, vmag=$vmag, vmagOrigin=$vmagOrigin, vmagUnc=$vmagUnc, w1mag=$w1mag, w1magOrigin=$w1magOrigin, w1magUnc=$w1magUnc, w1sat=$w1sat, w2mag=$w2mag, w2magOrigin=$w2magOrigin, w2magUnc=$w2magUnc, w2sat=$w2sat, w3mag=$w3mag, w3magOrigin=$w3magOrigin, w3magUnc=$w3magUnc, w3sat=$w3sat, w4mag=$w4mag, w4magOrigin=$w4magOrigin, w4magUnc=$w4magUnc, w4sat=$w4sat, wdsCatId=$wdsCatId, additionalProperties=$additionalProperties}"
}
