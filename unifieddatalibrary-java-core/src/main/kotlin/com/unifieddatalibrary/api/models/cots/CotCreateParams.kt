// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.cots

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This service enables posting CoT messages to the UDL TAK server. CoT data will be persisted in
 * the UDL POI schema as well as federated to connected TAK servers.
 */
class CotCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * WGS-84 latitude of the POI, in degrees (+N, -S), -90 to 90.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lat(): Double = body.lat()

    /**
     * WGS-84 longitude of the POI, in degrees (+E, -W), -180 to 180.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lon(): Double = body.lon()

    /**
     * Point height above ellipsoid (WGS-84), in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt(): Optional<Double> = body.alt()

    /**
     * Optional list of call signs to send message to directly.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun callSigns(): Optional<List<String>> = body.callSigns()

    /**
     * Radius of circular area about lat/lon point, in meters (1-sigma, if representing error).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ce(): Optional<Double> = body.ce()

    /**
     * Schema for the CotChatData to post.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cotChatData(): Optional<CotChatData> = body.cotChatData()

    /**
     * Schema for the CotPositionData to post.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cotPositionData(): Optional<CotPositionData> = body.cotPositionData()

    /**
     * Optional set of groups to send message to specifically. If not specified, the message will be
     * sent to the default _ANON_ group.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun groups(): Optional<List<String>> = body.groups()

    /**
     * How the event point was generated, in CoT object heirarchy notation (optional, CoT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun how(): Optional<String> = body.how()

    /**
     * Height above lat/lon point, in meters (1-sigma, if representing linear error).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun le(): Optional<Double> = body.le()

    /**
     * Identifier of the sender of the cot message which should remain the same on subsequent POI
     * records of the same point of interest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senderUid(): Optional<String> = body.senderUid()

    /**
     * Stale timestamp (optional), in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stale(): Optional<OffsetDateTime> = body.stale()

    /**
     * Start time of event validity (optional), in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun start(): Optional<OffsetDateTime> = body.start()

    /**
     * Event type, in CoT object heirarchy notation (optional, CoT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = body.type()

    /**
     * Optional list of TAK user ids to send message to directly.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun uids(): Optional<List<String>> = body.uids()

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lat(): JsonField<Double> = body._lat()

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lon(): JsonField<Double> = body._lon()

    /**
     * Returns the raw JSON value of [alt].
     *
     * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alt(): JsonField<Double> = body._alt()

    /**
     * Returns the raw JSON value of [callSigns].
     *
     * Unlike [callSigns], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callSigns(): JsonField<List<String>> = body._callSigns()

    /**
     * Returns the raw JSON value of [ce].
     *
     * Unlike [ce], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ce(): JsonField<Double> = body._ce()

    /**
     * Returns the raw JSON value of [cotChatData].
     *
     * Unlike [cotChatData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cotChatData(): JsonField<CotChatData> = body._cotChatData()

    /**
     * Returns the raw JSON value of [cotPositionData].
     *
     * Unlike [cotPositionData], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cotPositionData(): JsonField<CotPositionData> = body._cotPositionData()

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groups(): JsonField<List<String>> = body._groups()

    /**
     * Returns the raw JSON value of [how].
     *
     * Unlike [how], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _how(): JsonField<String> = body._how()

    /**
     * Returns the raw JSON value of [le].
     *
     * Unlike [le], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _le(): JsonField<Double> = body._le()

    /**
     * Returns the raw JSON value of [senderUid].
     *
     * Unlike [senderUid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _senderUid(): JsonField<String> = body._senderUid()

    /**
     * Returns the raw JSON value of [stale].
     *
     * Unlike [stale], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stale(): JsonField<OffsetDateTime> = body._stale()

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _start(): JsonField<OffsetDateTime> = body._start()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<String> = body._type()

    /**
     * Returns the raw JSON value of [uids].
     *
     * Unlike [uids], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _uids(): JsonField<List<String>> = body._uids()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CotCreateParams].
         *
         * The following fields are required:
         * ```java
         * .lat()
         * .lon()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CotCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cotCreateParams: CotCreateParams) = apply {
            body = cotCreateParams.body.toBuilder()
            additionalHeaders = cotCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cotCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [lat]
         * - [lon]
         * - [alt]
         * - [callSigns]
         * - [ce]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** WGS-84 latitude of the POI, in degrees (+N, -S), -90 to 90. */
        fun lat(lat: Double) = apply { body.lat(lat) }

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { body.lat(lat) }

        /** WGS-84 longitude of the POI, in degrees (+E, -W), -180 to 180. */
        fun lon(lon: Double) = apply { body.lon(lon) }

        /**
         * Sets [Builder.lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lon(lon: JsonField<Double>) = apply { body.lon(lon) }

        /** Point height above ellipsoid (WGS-84), in meters. */
        fun alt(alt: Double) = apply { body.alt(alt) }

        /**
         * Sets [Builder.alt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alt(alt: JsonField<Double>) = apply { body.alt(alt) }

        /** Optional list of call signs to send message to directly. */
        fun callSigns(callSigns: List<String>) = apply { body.callSigns(callSigns) }

        /**
         * Sets [Builder.callSigns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSigns] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callSigns(callSigns: JsonField<List<String>>) = apply { body.callSigns(callSigns) }

        /**
         * Adds a single [String] to [callSigns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallSign(callSign: String) = apply { body.addCallSign(callSign) }

        /**
         * Radius of circular area about lat/lon point, in meters (1-sigma, if representing error).
         */
        fun ce(ce: Double) = apply { body.ce(ce) }

        /**
         * Sets [Builder.ce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ce] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ce(ce: JsonField<Double>) = apply { body.ce(ce) }

        /** Schema for the CotChatData to post. */
        fun cotChatData(cotChatData: CotChatData) = apply { body.cotChatData(cotChatData) }

        /**
         * Sets [Builder.cotChatData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cotChatData] with a well-typed [CotChatData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cotChatData(cotChatData: JsonField<CotChatData>) = apply {
            body.cotChatData(cotChatData)
        }

        /** Schema for the CotPositionData to post. */
        fun cotPositionData(cotPositionData: CotPositionData) = apply {
            body.cotPositionData(cotPositionData)
        }

        /**
         * Sets [Builder.cotPositionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cotPositionData] with a well-typed [CotPositionData]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cotPositionData(cotPositionData: JsonField<CotPositionData>) = apply {
            body.cotPositionData(cotPositionData)
        }

        /**
         * Optional set of groups to send message to specifically. If not specified, the message
         * will be sent to the default _ANON_ group.
         */
        fun groups(groups: List<String>) = apply { body.groups(groups) }

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groups(groups: JsonField<List<String>>) = apply { body.groups(groups) }

        /**
         * Adds a single [String] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: String) = apply { body.addGroup(group) }

        /** How the event point was generated, in CoT object heirarchy notation (optional, CoT). */
        fun how(how: String) = apply { body.how(how) }

        /**
         * Sets [Builder.how] to an arbitrary JSON value.
         *
         * You should usually call [Builder.how] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun how(how: JsonField<String>) = apply { body.how(how) }

        /** Height above lat/lon point, in meters (1-sigma, if representing linear error). */
        fun le(le: Double) = apply { body.le(le) }

        /**
         * Sets [Builder.le] to an arbitrary JSON value.
         *
         * You should usually call [Builder.le] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun le(le: JsonField<Double>) = apply { body.le(le) }

        /**
         * Identifier of the sender of the cot message which should remain the same on subsequent
         * POI records of the same point of interest.
         */
        fun senderUid(senderUid: String) = apply { body.senderUid(senderUid) }

        /**
         * Sets [Builder.senderUid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderUid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senderUid(senderUid: JsonField<String>) = apply { body.senderUid(senderUid) }

        /** Stale timestamp (optional), in ISO8601 UTC format. */
        fun stale(stale: OffsetDateTime) = apply { body.stale(stale) }

        /**
         * Sets [Builder.stale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stale] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stale(stale: JsonField<OffsetDateTime>) = apply { body.stale(stale) }

        /** Start time of event validity (optional), in ISO8601 UTC format. */
        fun start(start: OffsetDateTime) = apply { body.start(start) }

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun start(start: JsonField<OffsetDateTime>) = apply { body.start(start) }

        /** Event type, in CoT object heirarchy notation (optional, CoT). */
        fun type(type: String) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { body.type(type) }

        /** Optional list of TAK user ids to send message to directly. */
        fun uids(uids: List<String>) = apply { body.uids(uids) }

        /**
         * Sets [Builder.uids] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uids] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uids(uids: JsonField<List<String>>) = apply { body.uids(uids) }

        /**
         * Adds a single [String] to [uids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUid(uid: String) = apply { body.addUid(uid) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CotCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lat()
         * .lon()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CotCreateParams =
            CotCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Schema for the CotData to post. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val lat: JsonField<Double>,
        private val lon: JsonField<Double>,
        private val alt: JsonField<Double>,
        private val callSigns: JsonField<List<String>>,
        private val ce: JsonField<Double>,
        private val cotChatData: JsonField<CotChatData>,
        private val cotPositionData: JsonField<CotPositionData>,
        private val groups: JsonField<List<String>>,
        private val how: JsonField<String>,
        private val le: JsonField<Double>,
        private val senderUid: JsonField<String>,
        private val stale: JsonField<OffsetDateTime>,
        private val start: JsonField<OffsetDateTime>,
        private val type: JsonField<String>,
        private val uids: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("alt") @ExcludeMissing alt: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("callSigns")
            @ExcludeMissing
            callSigns: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ce") @ExcludeMissing ce: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cotChatData")
            @ExcludeMissing
            cotChatData: JsonField<CotChatData> = JsonMissing.of(),
            @JsonProperty("cotPositionData")
            @ExcludeMissing
            cotPositionData: JsonField<CotPositionData> = JsonMissing.of(),
            @JsonProperty("groups")
            @ExcludeMissing
            groups: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("how") @ExcludeMissing how: JsonField<String> = JsonMissing.of(),
            @JsonProperty("le") @ExcludeMissing le: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("senderUid")
            @ExcludeMissing
            senderUid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stale")
            @ExcludeMissing
            stale: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start")
            @ExcludeMissing
            start: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uids") @ExcludeMissing uids: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            lat,
            lon,
            alt,
            callSigns,
            ce,
            cotChatData,
            cotPositionData,
            groups,
            how,
            le,
            senderUid,
            stale,
            start,
            type,
            uids,
            mutableMapOf(),
        )

        /**
         * WGS-84 latitude of the POI, in degrees (+N, -S), -90 to 90.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun lat(): Double = lat.getRequired("lat")

        /**
         * WGS-84 longitude of the POI, in degrees (+E, -W), -180 to 180.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun lon(): Double = lon.getRequired("lon")

        /**
         * Point height above ellipsoid (WGS-84), in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alt(): Optional<Double> = alt.getOptional("alt")

        /**
         * Optional list of call signs to send message to directly.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun callSigns(): Optional<List<String>> = callSigns.getOptional("callSigns")

        /**
         * Radius of circular area about lat/lon point, in meters (1-sigma, if representing error).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ce(): Optional<Double> = ce.getOptional("ce")

        /**
         * Schema for the CotChatData to post.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cotChatData(): Optional<CotChatData> = cotChatData.getOptional("cotChatData")

        /**
         * Schema for the CotPositionData to post.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cotPositionData(): Optional<CotPositionData> =
            cotPositionData.getOptional("cotPositionData")

        /**
         * Optional set of groups to send message to specifically. If not specified, the message
         * will be sent to the default _ANON_ group.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun groups(): Optional<List<String>> = groups.getOptional("groups")

        /**
         * How the event point was generated, in CoT object heirarchy notation (optional, CoT).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun how(): Optional<String> = how.getOptional("how")

        /**
         * Height above lat/lon point, in meters (1-sigma, if representing linear error).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun le(): Optional<Double> = le.getOptional("le")

        /**
         * Identifier of the sender of the cot message which should remain the same on subsequent
         * POI records of the same point of interest.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senderUid(): Optional<String> = senderUid.getOptional("senderUid")

        /**
         * Stale timestamp (optional), in ISO8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stale(): Optional<OffsetDateTime> = stale.getOptional("stale")

        /**
         * Start time of event validity (optional), in ISO8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun start(): Optional<OffsetDateTime> = start.getOptional("start")

        /**
         * Event type, in CoT object heirarchy notation (optional, CoT).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Optional list of TAK user ids to send message to directly.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun uids(): Optional<List<String>> = uids.getOptional("uids")

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

        /**
         * Returns the raw JSON value of [alt].
         *
         * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

        /**
         * Returns the raw JSON value of [callSigns].
         *
         * Unlike [callSigns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callSigns")
        @ExcludeMissing
        fun _callSigns(): JsonField<List<String>> = callSigns

        /**
         * Returns the raw JSON value of [ce].
         *
         * Unlike [ce], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ce") @ExcludeMissing fun _ce(): JsonField<Double> = ce

        /**
         * Returns the raw JSON value of [cotChatData].
         *
         * Unlike [cotChatData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cotChatData")
        @ExcludeMissing
        fun _cotChatData(): JsonField<CotChatData> = cotChatData

        /**
         * Returns the raw JSON value of [cotPositionData].
         *
         * Unlike [cotPositionData], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cotPositionData")
        @ExcludeMissing
        fun _cotPositionData(): JsonField<CotPositionData> = cotPositionData

        /**
         * Returns the raw JSON value of [groups].
         *
         * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<List<String>> = groups

        /**
         * Returns the raw JSON value of [how].
         *
         * Unlike [how], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("how") @ExcludeMissing fun _how(): JsonField<String> = how

        /**
         * Returns the raw JSON value of [le].
         *
         * Unlike [le], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("le") @ExcludeMissing fun _le(): JsonField<Double> = le

        /**
         * Returns the raw JSON value of [senderUid].
         *
         * Unlike [senderUid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senderUid") @ExcludeMissing fun _senderUid(): JsonField<String> = senderUid

        /**
         * Returns the raw JSON value of [stale].
         *
         * Unlike [stale], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stale") @ExcludeMissing fun _stale(): JsonField<OffsetDateTime> = stale

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [uids].
         *
         * Unlike [uids], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uids") @ExcludeMissing fun _uids(): JsonField<List<String>> = uids

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .lat()
             * .lon()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var lat: JsonField<Double>? = null
            private var lon: JsonField<Double>? = null
            private var alt: JsonField<Double> = JsonMissing.of()
            private var callSigns: JsonField<MutableList<String>>? = null
            private var ce: JsonField<Double> = JsonMissing.of()
            private var cotChatData: JsonField<CotChatData> = JsonMissing.of()
            private var cotPositionData: JsonField<CotPositionData> = JsonMissing.of()
            private var groups: JsonField<MutableList<String>>? = null
            private var how: JsonField<String> = JsonMissing.of()
            private var le: JsonField<Double> = JsonMissing.of()
            private var senderUid: JsonField<String> = JsonMissing.of()
            private var stale: JsonField<OffsetDateTime> = JsonMissing.of()
            private var start: JsonField<OffsetDateTime> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var uids: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                lat = body.lat
                lon = body.lon
                alt = body.alt
                callSigns = body.callSigns.map { it.toMutableList() }
                ce = body.ce
                cotChatData = body.cotChatData
                cotPositionData = body.cotPositionData
                groups = body.groups.map { it.toMutableList() }
                how = body.how
                le = body.le
                senderUid = body.senderUid
                stale = body.stale
                start = body.start
                type = body.type
                uids = body.uids.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** WGS-84 latitude of the POI, in degrees (+N, -S), -90 to 90. */
            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            /** WGS-84 longitude of the POI, in degrees (+E, -W), -180 to 180. */
            fun lon(lon: Double) = lon(JsonField.of(lon))

            /**
             * Sets [Builder.lon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

            /** Point height above ellipsoid (WGS-84), in meters. */
            fun alt(alt: Double) = alt(JsonField.of(alt))

            /**
             * Sets [Builder.alt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alt] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun alt(alt: JsonField<Double>) = apply { this.alt = alt }

            /** Optional list of call signs to send message to directly. */
            fun callSigns(callSigns: List<String>) = callSigns(JsonField.of(callSigns))

            /**
             * Sets [Builder.callSigns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSigns] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSigns(callSigns: JsonField<List<String>>) = apply {
                this.callSigns = callSigns.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [callSigns].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCallSign(callSign: String) = apply {
                callSigns =
                    (callSigns ?: JsonField.of(mutableListOf())).also {
                        checkKnown("callSigns", it).add(callSign)
                    }
            }

            /**
             * Radius of circular area about lat/lon point, in meters (1-sigma, if representing
             * error).
             */
            fun ce(ce: Double) = ce(JsonField.of(ce))

            /**
             * Sets [Builder.ce] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ce] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ce(ce: JsonField<Double>) = apply { this.ce = ce }

            /** Schema for the CotChatData to post. */
            fun cotChatData(cotChatData: CotChatData) = cotChatData(JsonField.of(cotChatData))

            /**
             * Sets [Builder.cotChatData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cotChatData] with a well-typed [CotChatData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cotChatData(cotChatData: JsonField<CotChatData>) = apply {
                this.cotChatData = cotChatData
            }

            /** Schema for the CotPositionData to post. */
            fun cotPositionData(cotPositionData: CotPositionData) =
                cotPositionData(JsonField.of(cotPositionData))

            /**
             * Sets [Builder.cotPositionData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cotPositionData] with a well-typed [CotPositionData]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cotPositionData(cotPositionData: JsonField<CotPositionData>) = apply {
                this.cotPositionData = cotPositionData
            }

            /**
             * Optional set of groups to send message to specifically. If not specified, the message
             * will be sent to the default _ANON_ group.
             */
            fun groups(groups: List<String>) = groups(JsonField.of(groups))

            /**
             * Sets [Builder.groups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groups] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groups(groups: JsonField<List<String>>) = apply {
                this.groups = groups.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [groups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroup(group: String) = apply {
                groups =
                    (groups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groups", it).add(group)
                    }
            }

            /**
             * How the event point was generated, in CoT object heirarchy notation (optional, CoT).
             */
            fun how(how: String) = how(JsonField.of(how))

            /**
             * Sets [Builder.how] to an arbitrary JSON value.
             *
             * You should usually call [Builder.how] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun how(how: JsonField<String>) = apply { this.how = how }

            /** Height above lat/lon point, in meters (1-sigma, if representing linear error). */
            fun le(le: Double) = le(JsonField.of(le))

            /**
             * Sets [Builder.le] to an arbitrary JSON value.
             *
             * You should usually call [Builder.le] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun le(le: JsonField<Double>) = apply { this.le = le }

            /**
             * Identifier of the sender of the cot message which should remain the same on
             * subsequent POI records of the same point of interest.
             */
            fun senderUid(senderUid: String) = senderUid(JsonField.of(senderUid))

            /**
             * Sets [Builder.senderUid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderUid] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senderUid(senderUid: JsonField<String>) = apply { this.senderUid = senderUid }

            /** Stale timestamp (optional), in ISO8601 UTC format. */
            fun stale(stale: OffsetDateTime) = stale(JsonField.of(stale))

            /**
             * Sets [Builder.stale] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stale] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stale(stale: JsonField<OffsetDateTime>) = apply { this.stale = stale }

            /** Start time of event validity (optional), in ISO8601 UTC format. */
            fun start(start: OffsetDateTime) = start(JsonField.of(start))

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

            /** Event type, in CoT object heirarchy notation (optional, CoT). */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Optional list of TAK user ids to send message to directly. */
            fun uids(uids: List<String>) = uids(JsonField.of(uids))

            /**
             * Sets [Builder.uids] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uids] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uids(uids: JsonField<List<String>>) = apply {
                this.uids = uids.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [uids].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUid(uid: String) = apply {
                uids =
                    (uids ?: JsonField.of(mutableListOf())).also { checkKnown("uids", it).add(uid) }
            }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .lat()
             * .lon()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("lat", lat),
                    checkRequired("lon", lon),
                    alt,
                    (callSigns ?: JsonMissing.of()).map { it.toImmutable() },
                    ce,
                    cotChatData,
                    cotPositionData,
                    (groups ?: JsonMissing.of()).map { it.toImmutable() },
                    how,
                    le,
                    senderUid,
                    stale,
                    start,
                    type,
                    (uids ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            lat()
            lon()
            alt()
            callSigns()
            ce()
            cotChatData().ifPresent { it.validate() }
            cotPositionData().ifPresent { it.validate() }
            groups()
            how()
            le()
            senderUid()
            stale()
            start()
            type()
            uids()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (lat.asKnown().isPresent) 1 else 0) +
                (if (lon.asKnown().isPresent) 1 else 0) +
                (if (alt.asKnown().isPresent) 1 else 0) +
                (callSigns.asKnown().getOrNull()?.size ?: 0) +
                (if (ce.asKnown().isPresent) 1 else 0) +
                (cotChatData.asKnown().getOrNull()?.validity() ?: 0) +
                (cotPositionData.asKnown().getOrNull()?.validity() ?: 0) +
                (groups.asKnown().getOrNull()?.size ?: 0) +
                (if (how.asKnown().isPresent) 1 else 0) +
                (if (le.asKnown().isPresent) 1 else 0) +
                (if (senderUid.asKnown().isPresent) 1 else 0) +
                (if (stale.asKnown().isPresent) 1 else 0) +
                (if (start.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (uids.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                lat == other.lat &&
                lon == other.lon &&
                alt == other.alt &&
                callSigns == other.callSigns &&
                ce == other.ce &&
                cotChatData == other.cotChatData &&
                cotPositionData == other.cotPositionData &&
                groups == other.groups &&
                how == other.how &&
                le == other.le &&
                senderUid == other.senderUid &&
                stale == other.stale &&
                start == other.start &&
                type == other.type &&
                uids == other.uids &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                lat,
                lon,
                alt,
                callSigns,
                ce,
                cotChatData,
                cotPositionData,
                groups,
                how,
                le,
                senderUid,
                stale,
                start,
                type,
                uids,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{lat=$lat, lon=$lon, alt=$alt, callSigns=$callSigns, ce=$ce, cotChatData=$cotChatData, cotPositionData=$cotPositionData, groups=$groups, how=$how, le=$le, senderUid=$senderUid, stale=$stale, start=$start, type=$type, uids=$uids, additionalProperties=$additionalProperties}"
    }

    /** Schema for the CotChatData to post. */
    class CotChatData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val chatMsg: JsonField<String>,
        private val chatRoom: JsonField<String>,
        private val chatSenderCallSign: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("chatMsg") @ExcludeMissing chatMsg: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chatRoom")
            @ExcludeMissing
            chatRoom: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chatSenderCallSign")
            @ExcludeMissing
            chatSenderCallSign: JsonField<String> = JsonMissing.of(),
        ) : this(chatMsg, chatRoom, chatSenderCallSign, mutableMapOf())

        /**
         * Contents of a chat message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chatMsg(): Optional<String> = chatMsg.getOptional("chatMsg")

        /**
         * Chat room name to send chat message to.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chatRoom(): Optional<String> = chatRoom.getOptional("chatRoom")

        /**
         * Callsign of chat sender.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chatSenderCallSign(): Optional<String> =
            chatSenderCallSign.getOptional("chatSenderCallSign")

        /**
         * Returns the raw JSON value of [chatMsg].
         *
         * Unlike [chatMsg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chatMsg") @ExcludeMissing fun _chatMsg(): JsonField<String> = chatMsg

        /**
         * Returns the raw JSON value of [chatRoom].
         *
         * Unlike [chatRoom], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chatRoom") @ExcludeMissing fun _chatRoom(): JsonField<String> = chatRoom

        /**
         * Returns the raw JSON value of [chatSenderCallSign].
         *
         * Unlike [chatSenderCallSign], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("chatSenderCallSign")
        @ExcludeMissing
        fun _chatSenderCallSign(): JsonField<String> = chatSenderCallSign

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

            /** Returns a mutable builder for constructing an instance of [CotChatData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CotChatData]. */
        class Builder internal constructor() {

            private var chatMsg: JsonField<String> = JsonMissing.of()
            private var chatRoom: JsonField<String> = JsonMissing.of()
            private var chatSenderCallSign: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cotChatData: CotChatData) = apply {
                chatMsg = cotChatData.chatMsg
                chatRoom = cotChatData.chatRoom
                chatSenderCallSign = cotChatData.chatSenderCallSign
                additionalProperties = cotChatData.additionalProperties.toMutableMap()
            }

            /** Contents of a chat message. */
            fun chatMsg(chatMsg: String) = chatMsg(JsonField.of(chatMsg))

            /**
             * Sets [Builder.chatMsg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chatMsg] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chatMsg(chatMsg: JsonField<String>) = apply { this.chatMsg = chatMsg }

            /** Chat room name to send chat message to. */
            fun chatRoom(chatRoom: String) = chatRoom(JsonField.of(chatRoom))

            /**
             * Sets [Builder.chatRoom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chatRoom] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chatRoom(chatRoom: JsonField<String>) = apply { this.chatRoom = chatRoom }

            /** Callsign of chat sender. */
            fun chatSenderCallSign(chatSenderCallSign: String) =
                chatSenderCallSign(JsonField.of(chatSenderCallSign))

            /**
             * Sets [Builder.chatSenderCallSign] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chatSenderCallSign] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chatSenderCallSign(chatSenderCallSign: JsonField<String>) = apply {
                this.chatSenderCallSign = chatSenderCallSign
            }

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
             * Returns an immutable instance of [CotChatData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CotChatData =
                CotChatData(
                    chatMsg,
                    chatRoom,
                    chatSenderCallSign,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CotChatData = apply {
            if (validated) {
                return@apply
            }

            chatMsg()
            chatRoom()
            chatSenderCallSign()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (chatMsg.asKnown().isPresent) 1 else 0) +
                (if (chatRoom.asKnown().isPresent) 1 else 0) +
                (if (chatSenderCallSign.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CotChatData &&
                chatMsg == other.chatMsg &&
                chatRoom == other.chatRoom &&
                chatSenderCallSign == other.chatSenderCallSign &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(chatMsg, chatRoom, chatSenderCallSign, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CotChatData{chatMsg=$chatMsg, chatRoom=$chatRoom, chatSenderCallSign=$chatSenderCallSign, additionalProperties=$additionalProperties}"
    }

    /** Schema for the CotPositionData to post. */
    class CotPositionData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val callSign: JsonField<String>,
        private val team: JsonField<String>,
        private val teamRole: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("callSign")
            @ExcludeMissing
            callSign: JsonField<String> = JsonMissing.of(),
            @JsonProperty("team") @ExcludeMissing team: JsonField<String> = JsonMissing.of(),
            @JsonProperty("teamRole") @ExcludeMissing teamRole: JsonField<String> = JsonMissing.of(),
        ) : this(callSign, team, teamRole, mutableMapOf())

        /**
         * Name of the POI target Object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun callSign(): String = callSign.getRequired("callSign")

        /**
         * Description of the POI target Object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun team(): String = team.getRequired("team")

        /**
         * Team role (Team Member| Team Lead | HQ | Sniper | Medic | Forward Observer | RTO | K9).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun teamRole(): String = teamRole.getRequired("teamRole")

        /**
         * Returns the raw JSON value of [callSign].
         *
         * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

        /**
         * Returns the raw JSON value of [team].
         *
         * Unlike [team], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team") @ExcludeMissing fun _team(): JsonField<String> = team

        /**
         * Returns the raw JSON value of [teamRole].
         *
         * Unlike [teamRole], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("teamRole") @ExcludeMissing fun _teamRole(): JsonField<String> = teamRole

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
             * Returns a mutable builder for constructing an instance of [CotPositionData].
             *
             * The following fields are required:
             * ```java
             * .callSign()
             * .team()
             * .teamRole()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CotPositionData]. */
        class Builder internal constructor() {

            private var callSign: JsonField<String>? = null
            private var team: JsonField<String>? = null
            private var teamRole: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cotPositionData: CotPositionData) = apply {
                callSign = cotPositionData.callSign
                team = cotPositionData.team
                teamRole = cotPositionData.teamRole
                additionalProperties = cotPositionData.additionalProperties.toMutableMap()
            }

            /** Name of the POI target Object. */
            fun callSign(callSign: String) = callSign(JsonField.of(callSign))

            /**
             * Sets [Builder.callSign] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSign] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

            /** Description of the POI target Object. */
            fun team(team: String) = team(JsonField.of(team))

            /**
             * Sets [Builder.team] to an arbitrary JSON value.
             *
             * You should usually call [Builder.team] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun team(team: JsonField<String>) = apply { this.team = team }

            /**
             * Team role (Team Member| Team Lead | HQ | Sniper | Medic | Forward Observer | RTO |
             * K9).
             */
            fun teamRole(teamRole: String) = teamRole(JsonField.of(teamRole))

            /**
             * Sets [Builder.teamRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamRole] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamRole(teamRole: JsonField<String>) = apply { this.teamRole = teamRole }

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
             * Returns an immutable instance of [CotPositionData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .callSign()
             * .team()
             * .teamRole()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CotPositionData =
                CotPositionData(
                    checkRequired("callSign", callSign),
                    checkRequired("team", team),
                    checkRequired("teamRole", teamRole),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CotPositionData = apply {
            if (validated) {
                return@apply
            }

            callSign()
            team()
            teamRole()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (callSign.asKnown().isPresent) 1 else 0) +
                (if (team.asKnown().isPresent) 1 else 0) +
                (if (teamRole.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CotPositionData &&
                callSign == other.callSign &&
                team == other.team &&
                teamRole == other.teamRole &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(callSign, team, teamRole, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CotPositionData{callSign=$callSign, team=$team, teamRole=$teamRole, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CotCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CotCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
