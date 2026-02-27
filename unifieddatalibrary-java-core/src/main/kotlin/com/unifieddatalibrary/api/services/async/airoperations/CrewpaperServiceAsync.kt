// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUnpublishParams
import com.unifieddatalibrary.api.models.airoperations.crewpapers.CrewpaperUploadPdfParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
 * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
 * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking Order,
 * Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation Risk
 * Management data. Aircraft Sortie information contains static and dynamic aircraft assignments,
 * departure and arrival times, and remarks. Aircraft Mission information contains static data for
 * mission planning to include assigned aircraft and crews, cargo pickup and dropoff locations,
 * unique identifiers, and prioritization. Item Tracking information contains data for tracking an
 * item from its origin to destination and how it may be configured during transport. Flight Plan
 * information contains schedule and route details. Air Event provides information concerning
 * various aerial events such as fuel transfer and air drops, as well as the associated aircraft
 * involved. Sortie PPR information contains details on operational access to a runway, taxiway, or
 * airport service. Diplomatic Clearance information contains details on the issuance and
 * coordination of aircraft clearance requests. Diplomatic Clearance Country provides information
 * such as entry/exit points, requirements, and points of contact for countries diplomatic
 * clearances are being created for. Airspace Control Order provides information concerning the
 * allocation, restriction, and deconfliction of airspace. Air Tasking Order information contains
 * details on the coordination of air missions and their tasks, resources, and timelines.
 * Navigational Obstruction provides the locations, characteristics, and boundaries of obstacles and
 * structures that can restrict or interfere with navigation. Logistics Support contains information
 * regarding the transport and maintenance of resources and equipment to sustain air operations.
 * Track Route information defines specific flight paths used by aircraft during the transport of
 * fuel and other resources. Air Load Plan information provides mission actuals concerning the
 * loading and air transport of cargo and passengers. Aviation Risk Management information help aid
 * in mission planning by accounting for factors such as mission complexity and crew fatigue.
 */
interface CrewpaperServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrewpaperServiceAsync

    /**
     * Service operation to remove supporting PDF from an aircraft sortie or sorties. A specific
     * role is required to perform this service operation. Please contact the UDL team for
     * assistance.
     */
    fun unpublish(params: CrewpaperUnpublishParams): CompletableFuture<Void?> =
        unpublish(params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        params: CrewpaperUnpublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Service operation to upload a supporting PDF for the aircraft sortie. A specific role is
     * required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun uploadPdf(fileContent: String, params: CrewpaperUploadPdfParams): CompletableFuture<Void?> =
        uploadPdf(fileContent, params, RequestOptions.none())

    /** @see uploadPdf */
    fun uploadPdf(
        fileContent: String,
        params: CrewpaperUploadPdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        uploadPdf(params.toBuilder().fileContent(fileContent).build(), requestOptions)

    /** @see uploadPdf */
    fun uploadPdf(params: CrewpaperUploadPdfParams): CompletableFuture<Void?> =
        uploadPdf(params, RequestOptions.none())

    /** @see uploadPdf */
    fun uploadPdf(
        params: CrewpaperUploadPdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [CrewpaperServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrewpaperServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/crewpapers/unpublish`, but is otherwise the
         * same as [CrewpaperServiceAsync.unpublish].
         */
        fun unpublish(params: CrewpaperUnpublishParams): CompletableFuture<HttpResponse> =
            unpublish(params, RequestOptions.none())

        /** @see unpublish */
        fun unpublish(
            params: CrewpaperUnpublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /filedrop/crewpapers`, but is otherwise the same as
         * [CrewpaperServiceAsync.uploadPdf].
         */
        fun uploadPdf(
            fileContent: String,
            params: CrewpaperUploadPdfParams,
        ): CompletableFuture<HttpResponse> = uploadPdf(fileContent, params, RequestOptions.none())

        /** @see uploadPdf */
        fun uploadPdf(
            fileContent: String,
            params: CrewpaperUploadPdfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            uploadPdf(params.toBuilder().fileContent(fileContent).build(), requestOptions)

        /** @see uploadPdf */
        fun uploadPdf(params: CrewpaperUploadPdfParams): CompletableFuture<HttpResponse> =
            uploadPdf(params, RequestOptions.none())

        /** @see uploadPdf */
        fun uploadPdf(
            params: CrewpaperUploadPdfParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
