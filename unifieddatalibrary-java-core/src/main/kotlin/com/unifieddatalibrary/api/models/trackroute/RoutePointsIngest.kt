// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackroute

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Points identified within the route. */
class RoutePointsIngest
private constructor(
    private val altCountryCode: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val dafifPt: JsonField<Boolean>,
    private val magDec: JsonField<Double>,
    private val navaid: JsonField<String>,
    private val navaidLength: JsonField<Double>,
    private val navaidType: JsonField<String>,
    private val ptLat: JsonField<Double>,
    private val ptLon: JsonField<Double>,
    private val ptSequenceId: JsonField<Int>,
    private val ptTypeCode: JsonField<String>,
    private val ptTypeName: JsonField<String>,
    private val waypointName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("altCountryCode")
        @ExcludeMissing
        altCountryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dafifPt") @ExcludeMissing dafifPt: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("magDec") @ExcludeMissing magDec: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("navaid") @ExcludeMissing navaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("navaidLength")
        @ExcludeMissing
        navaidLength: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("navaidType")
        @ExcludeMissing
        navaidType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ptLat") @ExcludeMissing ptLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ptLon") @ExcludeMissing ptLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ptSequenceId")
        @ExcludeMissing
        ptSequenceId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("ptTypeCode")
        @ExcludeMissing
        ptTypeCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ptTypeName")
        @ExcludeMissing
        ptTypeName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("waypointName")
        @ExcludeMissing
        waypointName: JsonField<String> = JsonMissing.of(),
    ) : this(
        altCountryCode,
        countryCode,
        dafifPt,
        magDec,
        navaid,
        navaidLength,
        navaidType,
        ptLat,
        ptLon,
        ptSequenceId,
        ptTypeCode,
        ptTypeName,
        waypointName,
        mutableMapOf(),
    )

    /**
     * Specifies an alternate country code if the data provider code is not part of an official
     * NAVAID Country Code standard such as ISO-3166 or FIPS. This field will be set to the value
     * provided by the source and should be used for all Queries specifying a Country Code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altCountryCode(): Optional<String> = altCountryCode.getOptional("altCountryCode")

    /**
     * The DoD Standard Country Code designator for the country where the route point resides. This
     * field should be set to "OTHR" if the source value does not match a UDL country code value
     * (ISO-3166-ALPHA-2).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * Flag indicating this is a Digital Aeronautical Flight Information File (DAFIF) point.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dafifPt(): Optional<Boolean> = dafifPt.getOptional("dafifPt")

    /**
     * The magnetic declination/variation of the route point location from true north, in degrees.
     * Positive values east of true north and negative values west of true north.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun magDec(): Optional<Double> = magDec.getOptional("magDec")

    /**
     * Navigational Aid (NAVAID) identification code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun navaid(): Optional<String> = navaid.getOptional("navaid")

    /**
     * The length of the course from the Navigational Aid (NAVAID) in nautical miles.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun navaidLength(): Optional<Double> = navaidLength.getOptional("navaidLength")

    /**
     * The NAVAID type of this route point (ex. VOR, VORTAC, TACAN, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun navaidType(): Optional<String> = navaidType.getOptional("navaidType")

    /**
     * WGS84 latitude of the point location, in degrees. -90 to 90 degrees (negative values south of
     * equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ptLat(): Optional<Double> = ptLat.getOptional("ptLat")

    /**
     * WGS84 longitude of the point location, in degrees. -180 to 180 degrees (negative values west
     * of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ptLon(): Optional<Double> = ptLon.getOptional("ptLon")

    /**
     * Sequencing field for the track route. This is the identifier representing the sequence of
     * waypoints associated to the track route.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ptSequenceId(): Optional<Int> = ptSequenceId.getOptional("ptSequenceId")

    /**
     * Code representation of the point within the track route (ex. EP, EX, CP, IP, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ptTypeCode(): Optional<String> = ptTypeCode.getOptional("ptTypeCode")

    /**
     * The name that represents the point within the track route (ex. ENTRY POINT, EXIT POINT,
     * CONTROL POINT, INITIAL POINT, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ptTypeName(): Optional<String> = ptTypeName.getOptional("ptTypeName")

    /**
     * Name of a waypoint which identifies the location of the point.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun waypointName(): Optional<String> = waypointName.getOptional("waypointName")

    /**
     * Returns the raw JSON value of [altCountryCode].
     *
     * Unlike [altCountryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altCountryCode")
    @ExcludeMissing
    fun _altCountryCode(): JsonField<String> = altCountryCode

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [dafifPt].
     *
     * Unlike [dafifPt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dafifPt") @ExcludeMissing fun _dafifPt(): JsonField<Boolean> = dafifPt

    /**
     * Returns the raw JSON value of [magDec].
     *
     * Unlike [magDec], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("magDec") @ExcludeMissing fun _magDec(): JsonField<Double> = magDec

    /**
     * Returns the raw JSON value of [navaid].
     *
     * Unlike [navaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("navaid") @ExcludeMissing fun _navaid(): JsonField<String> = navaid

    /**
     * Returns the raw JSON value of [navaidLength].
     *
     * Unlike [navaidLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("navaidLength")
    @ExcludeMissing
    fun _navaidLength(): JsonField<Double> = navaidLength

    /**
     * Returns the raw JSON value of [navaidType].
     *
     * Unlike [navaidType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("navaidType") @ExcludeMissing fun _navaidType(): JsonField<String> = navaidType

    /**
     * Returns the raw JSON value of [ptLat].
     *
     * Unlike [ptLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ptLat") @ExcludeMissing fun _ptLat(): JsonField<Double> = ptLat

    /**
     * Returns the raw JSON value of [ptLon].
     *
     * Unlike [ptLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ptLon") @ExcludeMissing fun _ptLon(): JsonField<Double> = ptLon

    /**
     * Returns the raw JSON value of [ptSequenceId].
     *
     * Unlike [ptSequenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ptSequenceId") @ExcludeMissing fun _ptSequenceId(): JsonField<Int> = ptSequenceId

    /**
     * Returns the raw JSON value of [ptTypeCode].
     *
     * Unlike [ptTypeCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ptTypeCode") @ExcludeMissing fun _ptTypeCode(): JsonField<String> = ptTypeCode

    /**
     * Returns the raw JSON value of [ptTypeName].
     *
     * Unlike [ptTypeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ptTypeName") @ExcludeMissing fun _ptTypeName(): JsonField<String> = ptTypeName

    /**
     * Returns the raw JSON value of [waypointName].
     *
     * Unlike [waypointName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("waypointName")
    @ExcludeMissing
    fun _waypointName(): JsonField<String> = waypointName

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

        /** Returns a mutable builder for constructing an instance of [RoutePointsIngest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoutePointsIngest]. */
    class Builder internal constructor() {

        private var altCountryCode: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var dafifPt: JsonField<Boolean> = JsonMissing.of()
        private var magDec: JsonField<Double> = JsonMissing.of()
        private var navaid: JsonField<String> = JsonMissing.of()
        private var navaidLength: JsonField<Double> = JsonMissing.of()
        private var navaidType: JsonField<String> = JsonMissing.of()
        private var ptLat: JsonField<Double> = JsonMissing.of()
        private var ptLon: JsonField<Double> = JsonMissing.of()
        private var ptSequenceId: JsonField<Int> = JsonMissing.of()
        private var ptTypeCode: JsonField<String> = JsonMissing.of()
        private var ptTypeName: JsonField<String> = JsonMissing.of()
        private var waypointName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routePointsIngest: RoutePointsIngest) = apply {
            altCountryCode = routePointsIngest.altCountryCode
            countryCode = routePointsIngest.countryCode
            dafifPt = routePointsIngest.dafifPt
            magDec = routePointsIngest.magDec
            navaid = routePointsIngest.navaid
            navaidLength = routePointsIngest.navaidLength
            navaidType = routePointsIngest.navaidType
            ptLat = routePointsIngest.ptLat
            ptLon = routePointsIngest.ptLon
            ptSequenceId = routePointsIngest.ptSequenceId
            ptTypeCode = routePointsIngest.ptTypeCode
            ptTypeName = routePointsIngest.ptTypeName
            waypointName = routePointsIngest.waypointName
            additionalProperties = routePointsIngest.additionalProperties.toMutableMap()
        }

        /**
         * Specifies an alternate country code if the data provider code is not part of an official
         * NAVAID Country Code standard such as ISO-3166 or FIPS. This field will be set to the
         * value provided by the source and should be used for all Queries specifying a Country
         * Code.
         */
        fun altCountryCode(altCountryCode: String) = altCountryCode(JsonField.of(altCountryCode))

        /**
         * Sets [Builder.altCountryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altCountryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun altCountryCode(altCountryCode: JsonField<String>) = apply {
            this.altCountryCode = altCountryCode
        }

        /**
         * The DoD Standard Country Code designator for the country where the route point resides.
         * This field should be set to "OTHR" if the source value does not match a UDL country code
         * value (ISO-3166-ALPHA-2).
         */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** Flag indicating this is a Digital Aeronautical Flight Information File (DAFIF) point. */
        fun dafifPt(dafifPt: Boolean) = dafifPt(JsonField.of(dafifPt))

        /**
         * Sets [Builder.dafifPt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dafifPt] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dafifPt(dafifPt: JsonField<Boolean>) = apply { this.dafifPt = dafifPt }

        /**
         * The magnetic declination/variation of the route point location from true north, in
         * degrees. Positive values east of true north and negative values west of true north.
         */
        fun magDec(magDec: Double) = magDec(JsonField.of(magDec))

        /**
         * Sets [Builder.magDec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.magDec] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun magDec(magDec: JsonField<Double>) = apply { this.magDec = magDec }

        /** Navigational Aid (NAVAID) identification code. */
        fun navaid(navaid: String) = navaid(JsonField.of(navaid))

        /**
         * Sets [Builder.navaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.navaid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun navaid(navaid: JsonField<String>) = apply { this.navaid = navaid }

        /** The length of the course from the Navigational Aid (NAVAID) in nautical miles. */
        fun navaidLength(navaidLength: Double) = navaidLength(JsonField.of(navaidLength))

        /**
         * Sets [Builder.navaidLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.navaidLength] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun navaidLength(navaidLength: JsonField<Double>) = apply {
            this.navaidLength = navaidLength
        }

        /** The NAVAID type of this route point (ex. VOR, VORTAC, TACAN, etc.). */
        fun navaidType(navaidType: String) = navaidType(JsonField.of(navaidType))

        /**
         * Sets [Builder.navaidType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.navaidType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun navaidType(navaidType: JsonField<String>) = apply { this.navaidType = navaidType }

        /**
         * WGS84 latitude of the point location, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         */
        fun ptLat(ptLat: Double) = ptLat(JsonField.of(ptLat))

        /**
         * Sets [Builder.ptLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ptLat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ptLat(ptLat: JsonField<Double>) = apply { this.ptLat = ptLat }

        /**
         * WGS84 longitude of the point location, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         */
        fun ptLon(ptLon: Double) = ptLon(JsonField.of(ptLon))

        /**
         * Sets [Builder.ptLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ptLon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ptLon(ptLon: JsonField<Double>) = apply { this.ptLon = ptLon }

        /**
         * Sequencing field for the track route. This is the identifier representing the sequence of
         * waypoints associated to the track route.
         */
        fun ptSequenceId(ptSequenceId: Int) = ptSequenceId(JsonField.of(ptSequenceId))

        /**
         * Sets [Builder.ptSequenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ptSequenceId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ptSequenceId(ptSequenceId: JsonField<Int>) = apply { this.ptSequenceId = ptSequenceId }

        /** Code representation of the point within the track route (ex. EP, EX, CP, IP, etc.). */
        fun ptTypeCode(ptTypeCode: String) = ptTypeCode(JsonField.of(ptTypeCode))

        /**
         * Sets [Builder.ptTypeCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ptTypeCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ptTypeCode(ptTypeCode: JsonField<String>) = apply { this.ptTypeCode = ptTypeCode }

        /**
         * The name that represents the point within the track route (ex. ENTRY POINT, EXIT POINT,
         * CONTROL POINT, INITIAL POINT, etc.).
         */
        fun ptTypeName(ptTypeName: String) = ptTypeName(JsonField.of(ptTypeName))

        /**
         * Sets [Builder.ptTypeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ptTypeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ptTypeName(ptTypeName: JsonField<String>) = apply { this.ptTypeName = ptTypeName }

        /** Name of a waypoint which identifies the location of the point. */
        fun waypointName(waypointName: String) = waypointName(JsonField.of(waypointName))

        /**
         * Sets [Builder.waypointName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waypointName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun waypointName(waypointName: JsonField<String>) = apply {
            this.waypointName = waypointName
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [RoutePointsIngest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RoutePointsIngest =
            RoutePointsIngest(
                altCountryCode,
                countryCode,
                dafifPt,
                magDec,
                navaid,
                navaidLength,
                navaidType,
                ptLat,
                ptLon,
                ptSequenceId,
                ptTypeCode,
                ptTypeName,
                waypointName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RoutePointsIngest = apply {
        if (validated) {
            return@apply
        }

        altCountryCode()
        countryCode()
        dafifPt()
        magDec()
        navaid()
        navaidLength()
        navaidType()
        ptLat()
        ptLon()
        ptSequenceId()
        ptTypeCode()
        ptTypeName()
        waypointName()
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
        (if (altCountryCode.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (dafifPt.asKnown().isPresent) 1 else 0) +
            (if (magDec.asKnown().isPresent) 1 else 0) +
            (if (navaid.asKnown().isPresent) 1 else 0) +
            (if (navaidLength.asKnown().isPresent) 1 else 0) +
            (if (navaidType.asKnown().isPresent) 1 else 0) +
            (if (ptLat.asKnown().isPresent) 1 else 0) +
            (if (ptLon.asKnown().isPresent) 1 else 0) +
            (if (ptSequenceId.asKnown().isPresent) 1 else 0) +
            (if (ptTypeCode.asKnown().isPresent) 1 else 0) +
            (if (ptTypeName.asKnown().isPresent) 1 else 0) +
            (if (waypointName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RoutePointsIngest &&
            altCountryCode == other.altCountryCode &&
            countryCode == other.countryCode &&
            dafifPt == other.dafifPt &&
            magDec == other.magDec &&
            navaid == other.navaid &&
            navaidLength == other.navaidLength &&
            navaidType == other.navaidType &&
            ptLat == other.ptLat &&
            ptLon == other.ptLon &&
            ptSequenceId == other.ptSequenceId &&
            ptTypeCode == other.ptTypeCode &&
            ptTypeName == other.ptTypeName &&
            waypointName == other.waypointName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            altCountryCode,
            countryCode,
            dafifPt,
            magDec,
            navaid,
            navaidLength,
            navaidType,
            ptLat,
            ptLon,
            ptSequenceId,
            ptTypeCode,
            ptTypeName,
            waypointName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutePointsIngest{altCountryCode=$altCountryCode, countryCode=$countryCode, dafifPt=$dafifPt, magDec=$magDec, navaid=$navaid, navaidLength=$navaidLength, navaidType=$navaidType, ptLat=$ptLat, ptLon=$ptLon, ptSequenceId=$ptSequenceId, ptTypeCode=$ptTypeCode, ptTypeName=$ptTypeName, waypointName=$waypointName, additionalProperties=$additionalProperties}"
}
