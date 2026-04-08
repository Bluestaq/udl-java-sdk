// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.client

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.AiServiceAsync
import com.unifieddatalibrary.api.services.async.AirEventServiceAsync
import com.unifieddatalibrary.api.services.async.AirOperationServiceAsync
import com.unifieddatalibrary.api.services.async.AirTransportMissionServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftSortyServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftStatusRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldSlotConsumptionServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldSlotServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldStatusServiceAsync
import com.unifieddatalibrary.api.services.async.AirloadPlanServiceAsync
import com.unifieddatalibrary.api.services.async.AirspaceControlOrderServiceAsync
import com.unifieddatalibrary.api.services.async.AisObjectServiceAsync
import com.unifieddatalibrary.api.services.async.AnalyticImageryServiceAsync
import com.unifieddatalibrary.api.services.async.AntennaServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeDataServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsync
import com.unifieddatalibrary.api.services.async.AviationRiskManagementServiceAsync
import com.unifieddatalibrary.api.services.async.BatteryServiceAsync
import com.unifieddatalibrary.api.services.async.BatterydetailServiceAsync
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsync
import com.unifieddatalibrary.api.services.async.BeamServiceAsync
import com.unifieddatalibrary.api.services.async.BusServiceAsync
import com.unifieddatalibrary.api.services.async.ChannelServiceAsync
import com.unifieddatalibrary.api.services.async.CloselyspacedobjectServiceAsync
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.CommServiceAsync
import com.unifieddatalibrary.api.services.async.ConjunctionServiceAsync
import com.unifieddatalibrary.api.services.async.CotServiceAsync
import com.unifieddatalibrary.api.services.async.CountryServiceAsync
import com.unifieddatalibrary.api.services.async.CrewServiceAsync
import com.unifieddatalibrary.api.services.async.DeconflictsetServiceAsync
import com.unifieddatalibrary.api.services.async.DiffOfArrivalServiceAsync
import com.unifieddatalibrary.api.services.async.DiplomaticClearanceServiceAsync
import com.unifieddatalibrary.api.services.async.DriftHistoryServiceAsync
import com.unifieddatalibrary.api.services.async.DropzoneServiceAsync
import com.unifieddatalibrary.api.services.async.EcpedrServiceAsync
import com.unifieddatalibrary.api.services.async.EffectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.EffectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.ElsetServiceAsync
import com.unifieddatalibrary.api.services.async.EmireportServiceAsync
import com.unifieddatalibrary.api.services.async.EmitterGeolocationServiceAsync
import com.unifieddatalibrary.api.services.async.EngineDetailServiceAsync
import com.unifieddatalibrary.api.services.async.EngineServiceAsync
import com.unifieddatalibrary.api.services.async.EntityServiceAsync
import com.unifieddatalibrary.api.services.async.EopServiceAsync
import com.unifieddatalibrary.api.services.async.EphemerisServiceAsync
import com.unifieddatalibrary.api.services.async.EphemerisSetServiceAsync
import com.unifieddatalibrary.api.services.async.EquipmentRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsync
import com.unifieddatalibrary.api.services.async.EvacServiceAsync
import com.unifieddatalibrary.api.services.async.EventEvolutionServiceAsync
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsync
import com.unifieddatalibrary.api.services.async.FlightplanServiceAsync
import com.unifieddatalibrary.api.services.async.GeoStatusServiceAsync
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsync
import com.unifieddatalibrary.api.services.async.GnssObservationServiceAsync
import com.unifieddatalibrary.api.services.async.GnssObservationsetServiceAsync
import com.unifieddatalibrary.api.services.async.GnssRawIfServiceAsync
import com.unifieddatalibrary.api.services.async.GroundImageryServiceAsync
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsync
import com.unifieddatalibrary.api.services.async.H3GeoServiceAsync
import com.unifieddatalibrary.api.services.async.HazardServiceAsync
import com.unifieddatalibrary.api.services.async.IonoObservationServiceAsync
import com.unifieddatalibrary.api.services.async.IrServiceAsync
import com.unifieddatalibrary.api.services.async.IsrCollectionServiceAsync
import com.unifieddatalibrary.api.services.async.ItemServiceAsync
import com.unifieddatalibrary.api.services.async.ItemTrackingServiceAsync
import com.unifieddatalibrary.api.services.async.LaserdeconflictrequestServiceAsync
import com.unifieddatalibrary.api.services.async.LaseremitterServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchDetectionServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchEventServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchSiteDetailServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchSiteServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchVehicleDetailServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchVehicleServiceAsync
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsync
import com.unifieddatalibrary.api.services.async.LinkstatusServiceAsync
import com.unifieddatalibrary.api.services.async.LocationServiceAsync
import com.unifieddatalibrary.api.services.async.LogisticsSupportServiceAsync
import com.unifieddatalibrary.api.services.async.ManeuverServiceAsync
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsync
import com.unifieddatalibrary.api.services.async.ManifoldelsetServiceAsync
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsync
import com.unifieddatalibrary.api.services.async.MissionAssignmentServiceAsync
import com.unifieddatalibrary.api.services.async.MtiServiceAsync
import com.unifieddatalibrary.api.services.async.NavigationServiceAsync
import com.unifieddatalibrary.api.services.async.NavigationalObstructionServiceAsync
import com.unifieddatalibrary.api.services.async.NotificationServiceAsync
import com.unifieddatalibrary.api.services.async.ObjectOfInterestServiceAsync
import com.unifieddatalibrary.api.services.async.ObservationServiceAsync
import com.unifieddatalibrary.api.services.async.OnboardnavigationServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitantennaServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitassessmentServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitbatteryServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitdetailServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbiteventServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsync
import com.unifieddatalibrary.api.services.async.OperatingunitServiceAsync
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsync
import com.unifieddatalibrary.api.services.async.OrbitdeterminationServiceAsync
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsync
import com.unifieddatalibrary.api.services.async.OrganizationServiceAsync
import com.unifieddatalibrary.api.services.async.OrganizationdetailServiceAsync
import com.unifieddatalibrary.api.services.async.PersonnelrecoveryServiceAsync
import com.unifieddatalibrary.api.services.async.PoiServiceAsync
import com.unifieddatalibrary.api.services.async.PortServiceAsync
import com.unifieddatalibrary.api.services.async.ReportAndActivityServiceAsync
import com.unifieddatalibrary.api.services.async.RfBandServiceAsync
import com.unifieddatalibrary.api.services.async.RfBandTypeServiceAsync
import com.unifieddatalibrary.api.services.async.RfEmitterServiceAsync
import com.unifieddatalibrary.api.services.async.RouteStatServiceAsync
import com.unifieddatalibrary.api.services.async.SarObservationServiceAsync
import com.unifieddatalibrary.api.services.async.ScServiceAsync
import com.unifieddatalibrary.api.services.async.ScientificServiceAsync
import com.unifieddatalibrary.api.services.async.SecureMessagingServiceAsync
import com.unifieddatalibrary.api.services.async.SensorMaintenanceServiceAsync
import com.unifieddatalibrary.api.services.async.SensorObservationTypeServiceAsync
import com.unifieddatalibrary.api.services.async.SensorPlanServiceAsync
import com.unifieddatalibrary.api.services.async.SensorServiceAsync
import com.unifieddatalibrary.api.services.async.SensorStatingServiceAsync
import com.unifieddatalibrary.api.services.async.SensorTypeServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataCommDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataEarlyWarningServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataOpticalPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataRadarPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataSigintPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataSpacecraftDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SgiServiceAsync
import com.unifieddatalibrary.api.services.async.SigactServiceAsync
import com.unifieddatalibrary.api.services.async.SiteRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.SiteServiceAsync
import com.unifieddatalibrary.api.services.async.SiteStatusServiceAsync
import com.unifieddatalibrary.api.services.async.SkyImageryServiceAsync
import com.unifieddatalibrary.api.services.async.SoiObservationSetServiceAsync
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SolarArrayServiceAsync
import com.unifieddatalibrary.api.services.async.SortiePprServiceAsync
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsync
import com.unifieddatalibrary.api.services.async.StageServiceAsync
import com.unifieddatalibrary.api.services.async.StarCatalogServiceAsync
import com.unifieddatalibrary.api.services.async.StateVectorServiceAsync
import com.unifieddatalibrary.api.services.async.StatusServiceAsync
import com.unifieddatalibrary.api.services.async.SubstatusServiceAsync
import com.unifieddatalibrary.api.services.async.SupportingDataServiceAsync
import com.unifieddatalibrary.api.services.async.SurfaceObstructionServiceAsync
import com.unifieddatalibrary.api.services.async.SurfaceServiceAsync
import com.unifieddatalibrary.api.services.async.SwirServiceAsync
import com.unifieddatalibrary.api.services.async.TaiUtcServiceAsync
import com.unifieddatalibrary.api.services.async.TdoaFdoaServiceAsync
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsync
import com.unifieddatalibrary.api.services.async.TrackRouteServiceAsync
import com.unifieddatalibrary.api.services.async.TrackServiceAsync
import com.unifieddatalibrary.api.services.async.TransponderServiceAsync
import com.unifieddatalibrary.api.services.async.UserServiceAsync
import com.unifieddatalibrary.api.services.async.VesselServiceAsync
import com.unifieddatalibrary.api.services.async.VideoServiceAsync
import com.unifieddatalibrary.api.services.async.WeatherDataServiceAsync
import com.unifieddatalibrary.api.services.async.WeatherReportServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Unifieddatalibrary REST API asynchronously. You can also switch
 * to synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface UnifieddatalibraryClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): UnifieddatalibraryClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnifieddatalibraryClientAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun airEvents(): AirEventServiceAsync

    fun airOperations(): AirOperationServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun airTransportMissions(): AirTransportMissionServiceAsync

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    fun aircraft(): AircraftServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun aircraftSorties(): AircraftSortyServiceAsync

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    fun aircraftStatusRemarks(): AircraftStatusRemarkServiceAsync

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    fun aircraftStatuses(): AircraftStatusServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun airfieldSlotConsumptions(): AirfieldSlotConsumptionServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun airfieldSlots(): AirfieldSlotServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun airfieldStatus(): AirfieldStatusServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun airfields(): AirfieldServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun airloadPlans(): AirloadPlanServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun airspaceControlOrders(): AirspaceControlOrderServiceAsync

    /**
     * These services provide for posting and querying of self-reported information obtained from
     * the Automatic Identification System (AIS) equipment. This contains information such as unique
     * identification, status, position, course, and speed. The AIS is an automatic tracking system
     * that uses transceivers on ships and is used by vessel traffic services. Although technically
     * and operationally distinct, the AIS system is analogous to ADS-B which performs a similar
     * function for aircraft. AIS is intended to assist a vessel's watchstanding officers and allow
     * maritime authorities to track and monitor vessel movements. AIS integrates a standardized VHF
     * transceiver with a positioning system, such as Global Positioning System receiver, with other
     * electronic navigation sensors, such as gyrocompass or rate of turn indicator. Vessels fitted
     * with AIS transceivers can be tracked by AIS base stations located along coastlines or, when
     * out of range of terrestrial networks, through a growing number of satellites that are fitted
     * with special AIS receivers that are capable of deconflicting a large number of signatures.
     */
    fun ais(): AiServiceAsync

    /**
     * These services provide for posting and querying of self-reported information obtained from
     * the Automatic Identification System (AIS) equipment. This contains information such as unique
     * identification, status, position, course, and speed. The AIS is an automatic tracking system
     * that uses transceivers on ships and is used by vessel traffic services. Although technically
     * and operationally distinct, the AIS system is analogous to ADS-B which performs a similar
     * function for aircraft. AIS is intended to assist a vessel's watchstanding officers and allow
     * maritime authorities to track and monitor vessel movements. AIS integrates a standardized VHF
     * transceiver with a positioning system, such as Global Positioning System receiver, with other
     * electronic navigation sensors, such as gyrocompass or rate of turn indicator. Vessels fitted
     * with AIS transceivers can be tracked by AIS base stations located along coastlines or, when
     * out of range of terrestrial networks, through a growing number of satellites that are fitted
     * with special AIS receivers that are capable of deconflicting a large number of signatures.
     */
    fun aisObjects(): AisObjectServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun analyticImagery(): AnalyticImageryServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun antennas(): AntennaServiceAsync

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    fun attitudeData(): AttitudeDataServiceAsync

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    fun attitudeSets(): AttitudeSetServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun aviationRiskManagement(): AviationRiskManagementServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun batteries(): BatteryServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun batterydetails(): BatterydetailServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of satellite
     * antenna beams, and querying of beam contours and service areas. Beam contours are the
     * geographic representation of the relative gain levels of beam power off of the maximum gain
     * boresight points. Similarly, service areas are the geographic footprints of the areas served
     * by a particular beam, and may be made up of multiple service regions. Well-Known Text (WKT)
     * and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    fun beam(): BeamServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of satellite
     * antenna beams, and querying of beam contours and service areas. Beam contours are the
     * geographic representation of the relative gain levels of beam power off of the maximum gain
     * boresight points. Similarly, service areas are the geographic footprints of the areas served
     * by a particular beam, and may be made up of multiple service regions. Well-Known Text (WKT)
     * and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    fun beamContours(): BeamContourServiceAsync

    /**
     * Services for querying and manipulation of satellite buses. A bus is the physical and software
     * infrastructure backbone to which on-orbit satellite payloads are attached for power, control,
     * and other support functions.
     */
    fun buses(): BusServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    fun channels(): ChannelServiceAsync

    /**
     * This collection of services provides operations for manipulating and querying of closely
     * spaced objects (on orbit) operations including docking, rendezvous, proximity and reporting
     * of payload zone engagements observed and characterized over a period of time.
     */
    fun closelyspacedobjects(): CloselyspacedobjectServiceAsync

    /** These services provide operations for posting and querying Sensor Tasking data. */
    fun collectRequests(): CollectRequestServiceAsync

    /** These services provide operations for posting and querying Sensor Tasking data. */
    fun collectResponses(): CollectResponseServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    fun comm(): CommServiceAsync

    /** These services provide operations for manipulation and querying of conjunctions. */
    fun conjunctions(): ConjunctionServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun cots(): CotServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun countries(): CountryServiceAsync

    /**
     * These services provide operations for posting and querying crew data. Crew data contains
     * information about its members and their assignments.
     */
    fun crew(): CrewServiceAsync

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun deconflictset(): DeconflictsetServiceAsync

    /**
     * These services provide operations for querying and manipulation of Signal time and frequency
     * difference of arrival (TDOA/FDOA) information obtained by using passive RF based sensor
     * phenomenologies and sensor triangulation. The J2000 coordinate frame is the preferred frame
     * for all observations, but in some cases observations may be in another frame depending on the
     * provider.
     */
    fun diffOfArrival(): DiffOfArrivalServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun diplomaticClearance(): DiplomaticClearanceServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun driftHistory(): DriftHistoryServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun dropzone(): DropzoneServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun ecpedr(): EcpedrServiceAsync

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun effectRequests(): EffectRequestServiceAsync

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun effectResponses(): EffectResponseServiceAsync

    /**
     * These services provide operations for querying and manipulation of element set data
     * describing orbital characteristics of on-orbit objects. An element set is a collection of
     * parameters that are used, along with an orbit propagator, to predict the motion of a
     * satellite. The element set, or elset for short, consists of identification data, the
     * classical elements and drag parameters.
     */
    fun elsets(): ElsetServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun emireport(): EmireportServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun emitterGeolocation(): EmitterGeolocationServiceAsync

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun engineDetails(): EngineDetailServiceAsync

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun engines(): EngineServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun entities(): EntityServiceAsync

    /**
     * This service provides operations for manipulation and querying of earth orientation parameter
     * (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS (International Earth
     * Rotation and Reference Systems Service). Earth Orientation Parameters describe the
     * irregularities of the earth's rotation. Technically, they are the parameters which provide
     * the rotation of the ITRS (International Terrestrial Reference System) to the ICRS
     * (International Celestial Reference System) as a function of time. Universal time -- Universal
     * time (UT1) is the time of the earth clock, which performs one revolution in about 24h. It is
     * practically proportional to the sidereal time. The excess revolution time is called length of
     * day (LOD). Coordinates of the pole -- x and y are the coordinates of the Celestial Ephemeris
     * Pole (CEP) relative to the IRP, the IERS Reference Pole. The CEP differs from the
     * instantaneous rotation axis by quasi-diurnal terms with amplitudes under 0.01" (see
     * Seidelmann, 1982). The x-axis is in the direction of the ITRF zero-meridian; the y-axis is in
     * the direction 90 degrees West longitude. Celestial pole offsets -- Celestial pole offsets are
     * described in the IAU Precession and Nutation models. The observed differences with respect to
     * the conventional celestial pole position defined by the models are monitored and reported by
     * the IERS. IERS Bulletins A and B provide current information on the Earth's orientation in
     * the IERS Reference System. This includes Universal Time, coordinates of the terrestrial pole,
     * and celestial pole offsets. Bulletin A gives an advanced solution updated weekly; the
     * standard solution is given monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B
     * values. All solutions are continuous within their respective uncertainties. Bulletin A is
     * issued by the IERS Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington,
     * DC and Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory.
     * IERS Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
     * offsets at daily intervals based on a combination of contributed analysis results using data
     * from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
     * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
     * variations a year into the future are also provided. Meteorological predictions of variations
     * in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of near-term UT1-UTC
     * changes. This publication is prepared by the IERS Rapid Service/Prediction Center.
     */
    fun eop(): EopServiceAsync

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    fun ephemeris(): EphemerisServiceAsync

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    fun ephemerisSets(): EphemerisSetServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of equipment
     * related data.
     */
    fun equipment(): EquipmentServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of equipment
     * related data.
     */
    fun equipmentRemarks(): EquipmentRemarkServiceAsync

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun evac(): EvacServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun eventEvolution(): EventEvolutionServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun featureAssessment(): FeatureAssessmentServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun flightplan(): FlightplanServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun geoStatus(): GeoStatusServiceAsync

    /**
     * Models and Simulations is a collection of services that allow consumers to interact with data
     * products representing independent models of various phenomenon, artificial intelligence
     * models and predictions, or of mathematical parameters meant to feed mod and sim tools to
     * produce estimates of environmental entities such as atmospheric models and heat maps.
     */
    fun globalAtmosphericModel(): GlobalAtmosphericModelServiceAsync

    fun gnssObservations(): GnssObservationServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun gnssObservationset(): GnssObservationsetServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun gnssRawIf(): GnssRawIfServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of ground
     * imagery of terrestrial regions from on-orbit, air, and other sensors. Includes metadata on
     * the image (time, region, source, etc) as well as binary content (typically GeoTIFF). Binary
     * content must be downloaded individually by ID using the 'getFile' operation. Well-Known Text
     * (WKT) and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    fun groundImagery(): GroundImageryServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun h3Geo(): H3GeoServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun h3GeoHexCell(): H3GeoHexCellServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun hazard(): HazardServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun ionoObservations(): IonoObservationServiceAsync

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun ir(): IrServiceAsync

    /** These services provide operations for posting and querying Sensor Tasking data. */
    fun isrCollections(): IsrCollectionServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun item(): ItemServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun itemTrackings(): ItemTrackingServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of laser
     * related information to include the laser emitters, the laser deconflict requests, and laser
     * deconflict responses.
     */
    fun laserdeconflictrequest(): LaserdeconflictrequestServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of laser
     * related information to include the laser emitters, the laser deconflict requests, and laser
     * deconflict responses.
     */
    fun laseremitter(): LaseremitterServiceAsync

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchDetection(): LaunchDetectionServiceAsync

    /**
     * These services provide operations for manipulation and querying of LaunchEvent data. Launch
     * Event data are known space launches, either future or historic records containing items such
     * as the launch site, launch epoch, and object.
     */
    fun launchEvent(): LaunchEventServiceAsync

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchSite(): LaunchSiteServiceAsync

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchSiteDetails(): LaunchSiteDetailServiceAsync

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchVehicle(): LaunchVehicleServiceAsync

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchVehicleDetails(): LaunchVehicleDetailServiceAsync

    /**
     * These services provide operations for manipulation and querying tactical data links and link
     * statuses of beams or a satellite constellation. Communication link statuses provide
     * definitions and status such as, positional endpoints, where each endpoint may be associated
     * with a specific beam or with a satellite constellation. Data links provide detailed
     * instructions regarding the operational use of a tactical data link and interface coordination
     * through various message formats.
     */
    fun linkStatus(): LinkStatusServiceAsync

    /**
     * These services provide operations for manipulation and querying tactical data links and link
     * statuses of beams or a satellite constellation. Communication link statuses provide
     * definitions and status such as, positional endpoints, where each endpoint may be associated
     * with a specific beam or with a satellite constellation. Data links provide detailed
     * instructions regarding the operational use of a tactical data link and interface coordination
     * through various message formats.
     */
    fun linkstatus(): LinkstatusServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun location(): LocationServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun logisticsSupport(): LogisticsSupportServiceAsync

    /**
     * This service provides operations for querying and manipulation of detected/possible/confirmed
     * on-orbit maneuvers. The J2000 coordinate frame is the preferred frame for all maneuver data,
     * but in some cases data may be in another frame depending on the provider. Check the
     * Storefront 'Data Products' section under the 'Discover' tab for maneuver data provider
     * information.
     */
    fun maneuvers(): ManeuverServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun manifold(): ManifoldServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun manifoldelset(): ManifoldelsetServiceAsync

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    fun missileTracks(): MissileTrackServiceAsync

    /**
     * These services provide operations for manipulation and querying of mission assignment
     * objects. MissionAssignment is used by C2 JUs and, optionally, non-C2 JUs to assign missions,
     * designate targets, and provide target information to non-C2 JU platforms. Provision is made
     * for the non-C2 JU platforms to acknowledge the message through receipt/compliance action.
     */
    fun missionAssignment(): MissionAssignmentServiceAsync

    /**
     * These services provide operations for posting and querying Moving Target Indicator (MTI)
     * STANAG 4607 data. Detailed MTI data supports activities such as targeting or less detailed
     * data for applications such as situational awareness used/derived by exploitation systems.
     */
    fun mti(): MtiServiceAsync

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun navigation(): NavigationServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun navigationalObstruction(): NavigationalObstructionServiceAsync

    /**
     * A Notification Service allowing the broadcast of generic messages to the community. Users can
     * send free-form messages, publish lists, and notify the community about events or alerts
     * across various domains. Notifications and alerts are categorized by a 'msgType' field and are
     * accessible via the UDL Secure Messaging API and REST API services.
     */
    fun notification(): NotificationServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun objectOfInterest(): ObjectOfInterestServiceAsync

    fun observations(): ObservationServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun onboardnavigation(): OnboardnavigationServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbit(): OnorbitServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitantenna(): OnorbitantennaServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitbattery(): OnorbitbatteryServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitdetails(): OnorbitdetailServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitevent(): OnorbiteventServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitlist(): OnorbitlistServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitsolararray(): OnorbitsolararrayServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitthruster(): OnorbitthrusterServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitthrusterstatus(): OnorbitthrusterstatusServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun onorbitassessment(): OnorbitassessmentServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun operatingunit(): OperatingunitServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun operatingunitremark(): OperatingunitremarkServiceAsync

    /**
     * These services provide operations for manipulating and querying Orbit Determination (OD)
     * data. Orbit Determination data contains algorithm results that describe General Perturbations
     * or Special Perturbations orbital updates.
     */
    fun orbitdetermination(): OrbitdeterminationServiceAsync

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    fun orbittrack(): OrbittrackServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun organization(): OrganizationServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun organizationdetails(): OrganizationdetailServiceAsync

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun personnelrecovery(): PersonnelrecoveryServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun poi(): PoiServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun port(): PortServiceAsync

    fun reportAndActivities(): ReportAndActivityServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    fun rfBand(): RfBandServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    fun rfBandType(): RfBandTypeServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    fun rfEmitter(): RfEmitterServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun routeStats(): RouteStatServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun sarObservation(): SarObservationServiceAsync

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun scientific(): ScientificServiceAsync

    fun scs(): ScServiceAsync

    /**
     * Secure Messaging is based on Apache Kafka which is an open-source stream-processing software
     * platform developed by the Apache Software Foundation, written in Scala and Java. Kafka
     * provides a unified, high-throughput, low-latency platform for handling real-time data feeds.
     * All messaging is secured; consumers will not receive messages unless authorized to do so.
     * J2000 is the preferred coordinate frame for all observations, but in some cases observations
     * may be in another frame depending on the provider. Please see the 'Discover' tab in the
     * storefront to confirm coordinate frames by data provider.
     */
    fun secureMessaging(): SecureMessagingServiceAsync

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensor(): SensorServiceAsync

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensorStating(): SensorStatingServiceAsync

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensorMaintenance(): SensorMaintenanceServiceAsync

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensorObservationType(): SensorObservationTypeServiceAsync

    /** These services provide operations for posting and querying Sensor Tasking data. */
    fun sensorPlan(): SensorPlanServiceAsync

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensorType(): SensorTypeServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    fun seraDataCommDetails(): SeraDataCommDetailServiceAsync

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun seraDataEarlyWarning(): SeraDataEarlyWarningServiceAsync

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun seraDataNavigation(): SeraDataNavigationServiceAsync

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun seradataOpticalPayload(): SeradataOpticalPayloadServiceAsync

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun seradataRadarPayload(): SeradataRadarPayloadServiceAsync

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun seradataSigintPayload(): SeradataSigintPayloadServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun seradataSpacecraftDetails(): SeradataSpacecraftDetailServiceAsync

    /**
     * This service provides operations for manipulation and querying of space weather/solar,
     * geomagnetic, and radiation belt index data.
     */
    fun sgi(): SgiServiceAsync

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun sigact(): SigactServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun site(): SiteServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun siteRemark(): SiteRemarkServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun siteStatus(): SiteStatusServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of sky imagery
     * data. Sky imagery is ground or space based telescope imagery of RSO's and includes metadata
     * on the image (time, source, etc) as well as binary image content (e.g. FITS, EOSSA, EOCHIP,
     * MP4). Binary content must be downloaded individually by ID using the 'getFile' operation.
     */
    fun skyImagery(): SkyImageryServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun soiObservationSet(): SoiObservationSetServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun solarArray(): SolarArrayServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun solarArrayDetails(): SolarArrayDetailServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun sortiePpr(): SortiePprServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun spaceEnvObservation(): SpaceEnvObservationServiceAsync

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun stage(): StageServiceAsync

    /**
     * These services provide operations for posting and querying Star Catalog data. The Star
     * Catalog model is a representation of astronomical data and photometric data for stars.
     * Astronomical data includes positional information, proper motions, parallaxes and their
     * respective uncertainties. Photometric data contains optical and near-infrared magnitudes, and
     * their uncertainties across multiple bandpasses. Note: Multiple source catalogs may contribute
     * to a single record.
     */
    fun starCatalog(): StarCatalogServiceAsync

    /**
     * This service provides operations for querying and manipulation of state vectors for On-orbit
     * objects. State vectors are cartesian vectors of position (r) and velocity (v) that together
     * with their time (epoch) (t) uniquely determine the trajectory of the orbiting body in space.
     * J2000 is the preferred coordinate frame for all state vector positions/velocities in UDL, but
     * in some cases data may be in another frame depending on the provider and/or datatype. Please
     * see the 'Discover' tab in the storefront to confirm coordinate frames by data provider.
     */
    fun stateVector(): StateVectorServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun status(): StatusServiceAsync

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun substatus(): SubstatusServiceAsync

    fun supportingData(): SupportingDataServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun surface(): SurfaceServiceAsync

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun surfaceObstruction(): SurfaceObstructionServiceAsync

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun swir(): SwirServiceAsync

    /**
     * This service provides operations for manipulation and querying of earth orientation parameter
     * (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS (International Earth
     * Rotation and Reference Systems Service). Earth Orientation Parameters describe the
     * irregularities of the earth's rotation. Technically, they are the parameters which provide
     * the rotation of the ITRS (International Terrestrial Reference System) to the ICRS
     * (International Celestial Reference System) as a function of time. Universal time -- Universal
     * time (UT1) is the time of the earth clock, which performs one revolution in about 24h. It is
     * practically proportional to the sidereal time. The excess revolution time is called length of
     * day (LOD). Coordinates of the pole -- x and y are the coordinates of the Celestial Ephemeris
     * Pole (CEP) relative to the IRP, the IERS Reference Pole. The CEP differs from the
     * instantaneous rotation axis by quasi-diurnal terms with amplitudes under 0.01" (see
     * Seidelmann, 1982). The x-axis is in the direction of the ITRF zero-meridian; the y-axis is in
     * the direction 90 degrees West longitude. Celestial pole offsets -- Celestial pole offsets are
     * described in the IAU Precession and Nutation models. The observed differences with respect to
     * the conventional celestial pole position defined by the models are monitored and reported by
     * the IERS. IERS Bulletins A and B provide current information on the Earth's orientation in
     * the IERS Reference System. This includes Universal Time, coordinates of the terrestrial pole,
     * and celestial pole offsets. Bulletin A gives an advanced solution updated weekly; the
     * standard solution is given monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B
     * values. All solutions are continuous within their respective uncertainties. Bulletin A is
     * issued by the IERS Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington,
     * DC and Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory.
     * IERS Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
     * offsets at daily intervals based on a combination of contributed analysis results using data
     * from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
     * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
     * variations a year into the future are also provided. Meteorological predictions of variations
     * in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of near-term UT1-UTC
     * changes. This publication is prepared by the IERS Rapid Service/Prediction Center.
     */
    fun taiUtc(): TaiUtcServiceAsync

    fun tdoaFdoa(): TdoaFdoaServiceAsync

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    fun track(): TrackServiceAsync

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    fun trackDetails(): TrackDetailServiceAsync

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun trackRoute(): TrackRouteServiceAsync

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    fun transponder(): TransponderServiceAsync

    fun user(): UserServiceAsync

    /**
     * This service provides operations for manipulation and querying of maritime Vessel and Vessel
     * Status data. Vessel contains the static data of the specific vessel: mmsi, cruise speed, max
     * speed, etc.
     */
    fun vessel(): VesselServiceAsync

    fun video(): VideoServiceAsync

    /**
     * These services provide for posting and querying terrestrial weather conditions over a target
     * area or region and raw sensor data used to produce condition reports. Weather Reports
     * describe current weather conditions over a target point or region to include general
     * temperatures, pressures, and moisture accumulation, as well as navigational considerations
     * such as altimeter settings, visibility, wind speeds, and cloud heights etc. Weather Data
     * contains algorithmic parameters and dynamic, raw measurements collected by individual sensors
     * such as signal power, noise level, etc., which are generally processed across multiple
     * sensors to produce weather reports.
     */
    fun weatherData(): WeatherDataServiceAsync

    /**
     * These services provide for posting and querying terrestrial weather conditions over a target
     * area or region and raw sensor data used to produce condition reports. Weather Reports
     * describe current weather conditions over a target point or region to include general
     * temperatures, pressures, and moisture accumulation, as well as navigational considerations
     * such as altimeter settings, visibility, wind speeds, and cloud heights etc. Weather Data
     * contains algorithmic parameters and dynamic, raw measurements collected by individual sensors
     * such as signal power, noise level, etc., which are generally processed across multiple
     * sensors to produce weather reports.
     */
    fun weatherReport(): WeatherReportServiceAsync

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [UnifieddatalibraryClientAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UnifieddatalibraryClientAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun airEvents(): AirEventServiceAsync.WithRawResponse

        fun airOperations(): AirOperationServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun airTransportMissions(): AirTransportMissionServiceAsync.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        fun aircraft(): AircraftServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun aircraftSorties(): AircraftSortyServiceAsync.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        fun aircraftStatusRemarks(): AircraftStatusRemarkServiceAsync.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        fun aircraftStatuses(): AircraftStatusServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun airfieldSlotConsumptions(): AirfieldSlotConsumptionServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun airfieldSlots(): AirfieldSlotServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun airfieldStatus(): AirfieldStatusServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun airfields(): AirfieldServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun airloadPlans(): AirloadPlanServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun airspaceControlOrders(): AirspaceControlOrderServiceAsync.WithRawResponse

        /**
         * These services provide for posting and querying of self-reported information obtained
         * from the Automatic Identification System (AIS) equipment. This contains information such
         * as unique identification, status, position, course, and speed. The AIS is an automatic
         * tracking system that uses transceivers on ships and is used by vessel traffic services.
         * Although technically and operationally distinct, the AIS system is analogous to ADS-B
         * which performs a similar function for aircraft. AIS is intended to assist a vessel's
         * watchstanding officers and allow maritime authorities to track and monitor vessel
         * movements. AIS integrates a standardized VHF transceiver with a positioning system, such
         * as Global Positioning System receiver, with other electronic navigation sensors, such as
         * gyrocompass or rate of turn indicator. Vessels fitted with AIS transceivers can be
         * tracked by AIS base stations located along coastlines or, when out of range of
         * terrestrial networks, through a growing number of satellites that are fitted with special
         * AIS receivers that are capable of deconflicting a large number of signatures.
         */
        fun ais(): AiServiceAsync.WithRawResponse

        /**
         * These services provide for posting and querying of self-reported information obtained
         * from the Automatic Identification System (AIS) equipment. This contains information such
         * as unique identification, status, position, course, and speed. The AIS is an automatic
         * tracking system that uses transceivers on ships and is used by vessel traffic services.
         * Although technically and operationally distinct, the AIS system is analogous to ADS-B
         * which performs a similar function for aircraft. AIS is intended to assist a vessel's
         * watchstanding officers and allow maritime authorities to track and monitor vessel
         * movements. AIS integrates a standardized VHF transceiver with a positioning system, such
         * as Global Positioning System receiver, with other electronic navigation sensors, such as
         * gyrocompass or rate of turn indicator. Vessels fitted with AIS transceivers can be
         * tracked by AIS base stations located along coastlines or, when out of range of
         * terrestrial networks, through a growing number of satellites that are fitted with special
         * AIS receivers that are capable of deconflicting a large number of signatures.
         */
        fun aisObjects(): AisObjectServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun analyticImagery(): AnalyticImageryServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun antennas(): AntennaServiceAsync.WithRawResponse

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        fun attitudeData(): AttitudeDataServiceAsync.WithRawResponse

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        fun attitudeSets(): AttitudeSetServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun aviationRiskManagement(): AviationRiskManagementServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun batteries(): BatteryServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun batterydetails(): BatterydetailServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * satellite antenna beams, and querying of beam contours and service areas. Beam contours
         * are the geographic representation of the relative gain levels of beam power off of the
         * maximum gain boresight points. Similarly, service areas are the geographic footprints of
         * the areas served by a particular beam, and may be made up of multiple service regions.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        fun beam(): BeamServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * satellite antenna beams, and querying of beam contours and service areas. Beam contours
         * are the geographic representation of the relative gain levels of beam power off of the
         * maximum gain boresight points. Similarly, service areas are the geographic footprints of
         * the areas served by a particular beam, and may be made up of multiple service regions.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        fun beamContours(): BeamContourServiceAsync.WithRawResponse

        /**
         * Services for querying and manipulation of satellite buses. A bus is the physical and
         * software infrastructure backbone to which on-orbit satellite payloads are attached for
         * power, control, and other support functions.
         */
        fun buses(): BusServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        fun channels(): ChannelServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for manipulating and querying of closely
         * spaced objects (on orbit) operations including docking, rendezvous, proximity and
         * reporting of payload zone engagements observed and characterized over a period of time.
         */
        fun closelyspacedobjects(): CloselyspacedobjectServiceAsync.WithRawResponse

        /** These services provide operations for posting and querying Sensor Tasking data. */
        fun collectRequests(): CollectRequestServiceAsync.WithRawResponse

        /** These services provide operations for posting and querying Sensor Tasking data. */
        fun collectResponses(): CollectResponseServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        fun comm(): CommServiceAsync.WithRawResponse

        /** These services provide operations for manipulation and querying of conjunctions. */
        fun conjunctions(): ConjunctionServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun cots(): CotServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun countries(): CountryServiceAsync.WithRawResponse

        /**
         * These services provide operations for posting and querying crew data. Crew data contains
         * information about its members and their assignments.
         */
        fun crew(): CrewServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun deconflictset(): DeconflictsetServiceAsync.WithRawResponse

        /**
         * These services provide operations for querying and manipulation of Signal time and
         * frequency difference of arrival (TDOA/FDOA) information obtained by using passive RF
         * based sensor phenomenologies and sensor triangulation. The J2000 coordinate frame is the
         * preferred frame for all observations, but in some cases observations may be in another
         * frame depending on the provider.
         */
        fun diffOfArrival(): DiffOfArrivalServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun diplomaticClearance(): DiplomaticClearanceServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun driftHistory(): DriftHistoryServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun dropzone(): DropzoneServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun ecpedr(): EcpedrServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun effectRequests(): EffectRequestServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun effectResponses(): EffectResponseServiceAsync.WithRawResponse

        /**
         * These services provide operations for querying and manipulation of element set data
         * describing orbital characteristics of on-orbit objects. An element set is a collection of
         * parameters that are used, along with an orbit propagator, to predict the motion of a
         * satellite. The element set, or elset for short, consists of identification data, the
         * classical elements and drag parameters.
         */
        fun elsets(): ElsetServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun emireport(): EmireportServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun emitterGeolocation(): EmitterGeolocationServiceAsync.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun engineDetails(): EngineDetailServiceAsync.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun engines(): EngineServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun entities(): EntityServiceAsync.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of earth orientation
         * parameter (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS
         * (International Earth Rotation and Reference Systems Service). Earth Orientation
         * Parameters describe the irregularities of the earth's rotation. Technically, they are the
         * parameters which provide the rotation of the ITRS (International Terrestrial Reference
         * System) to the ICRS (International Celestial Reference System) as a function of time.
         * Universal time -- Universal time (UT1) is the time of the earth clock, which performs one
         * revolution in about 24h. It is practically proportional to the sidereal time. The excess
         * revolution time is called length of day (LOD). Coordinates of the pole -- x and y are the
         * coordinates of the Celestial Ephemeris Pole (CEP) relative to the IRP, the IERS Reference
         * Pole. The CEP differs from the instantaneous rotation axis by quasi-diurnal terms with
         * amplitudes under 0.01" (see Seidelmann, 1982). The x-axis is in the direction of the ITRF
         * zero-meridian; the y-axis is in the direction 90 degrees West longitude. Celestial pole
         * offsets -- Celestial pole offsets are described in the IAU Precession and Nutation
         * models. The observed differences with respect to the conventional celestial pole position
         * defined by the models are monitored and reported by the IERS. IERS Bulletins A and B
         * provide current information on the Earth's orientation in the IERS Reference System. This
         * includes Universal Time, coordinates of the terrestrial pole, and celestial pole offsets.
         * Bulletin A gives an advanced solution updated weekly; the standard solution is given
         * monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B values. All solutions
         * are continuous within their respective uncertainties. Bulletin A is issued by the IERS
         * Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington, DC and
         * Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory. IERS
         * Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
         * offsets at daily intervals based on a combination of contributed analysis results using
         * data from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
         * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
         * variations a year into the future are also provided. Meteorological predictions of
         * variations in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of
         * near-term UT1-UTC changes. This publication is prepared by the IERS Rapid
         * Service/Prediction Center.
         */
        fun eop(): EopServiceAsync.WithRawResponse

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        fun ephemeris(): EphemerisServiceAsync.WithRawResponse

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        fun ephemerisSets(): EphemerisSetServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of equipment
         * related data.
         */
        fun equipment(): EquipmentServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of equipment
         * related data.
         */
        fun equipmentRemarks(): EquipmentRemarkServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun evac(): EvacServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun eventEvolution(): EventEvolutionServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun featureAssessment(): FeatureAssessmentServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun flightplan(): FlightplanServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun geoStatus(): GeoStatusServiceAsync.WithRawResponse

        /**
         * Models and Simulations is a collection of services that allow consumers to interact with
         * data products representing independent models of various phenomenon, artificial
         * intelligence models and predictions, or of mathematical parameters meant to feed mod and
         * sim tools to produce estimates of environmental entities such as atmospheric models and
         * heat maps.
         */
        fun globalAtmosphericModel(): GlobalAtmosphericModelServiceAsync.WithRawResponse

        fun gnssObservations(): GnssObservationServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun gnssObservationset(): GnssObservationsetServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun gnssRawIf(): GnssRawIfServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of ground
         * imagery of terrestrial regions from on-orbit, air, and other sensors. Includes metadata
         * on the image (time, region, source, etc) as well as binary content (typically GeoTIFF).
         * Binary content must be downloaded individually by ID using the 'getFile' operation.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        fun groundImagery(): GroundImageryServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun h3Geo(): H3GeoServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun h3GeoHexCell(): H3GeoHexCellServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun hazard(): HazardServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun ionoObservations(): IonoObservationServiceAsync.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun ir(): IrServiceAsync.WithRawResponse

        /** These services provide operations for posting and querying Sensor Tasking data. */
        fun isrCollections(): IsrCollectionServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun item(): ItemServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun itemTrackings(): ItemTrackingServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of laser
         * related information to include the laser emitters, the laser deconflict requests, and
         * laser deconflict responses.
         */
        fun laserdeconflictrequest(): LaserdeconflictrequestServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of laser
         * related information to include the laser emitters, the laser deconflict requests, and
         * laser deconflict responses.
         */
        fun laseremitter(): LaseremitterServiceAsync.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchDetection(): LaunchDetectionServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of LaunchEvent data.
         * Launch Event data are known space launches, either future or historic records containing
         * items such as the launch site, launch epoch, and object.
         */
        fun launchEvent(): LaunchEventServiceAsync.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchSite(): LaunchSiteServiceAsync.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchSiteDetails(): LaunchSiteDetailServiceAsync.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchVehicle(): LaunchVehicleServiceAsync.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchVehicleDetails(): LaunchVehicleDetailServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying tactical data links and
         * link statuses of beams or a satellite constellation. Communication link statuses provide
         * definitions and status such as, positional endpoints, where each endpoint may be
         * associated with a specific beam or with a satellite constellation. Data links provide
         * detailed instructions regarding the operational use of a tactical data link and interface
         * coordination through various message formats.
         */
        fun linkStatus(): LinkStatusServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying tactical data links and
         * link statuses of beams or a satellite constellation. Communication link statuses provide
         * definitions and status such as, positional endpoints, where each endpoint may be
         * associated with a specific beam or with a satellite constellation. Data links provide
         * detailed instructions regarding the operational use of a tactical data link and interface
         * coordination through various message formats.
         */
        fun linkstatus(): LinkstatusServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun location(): LocationServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun logisticsSupport(): LogisticsSupportServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of
         * detected/possible/confirmed on-orbit maneuvers. The J2000 coordinate frame is the
         * preferred frame for all maneuver data, but in some cases data may be in another frame
         * depending on the provider. Check the Storefront 'Data Products' section under the
         * 'Discover' tab for maneuver data provider information.
         */
        fun maneuvers(): ManeuverServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun manifold(): ManifoldServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun manifoldelset(): ManifoldelsetServiceAsync.WithRawResponse

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        fun missileTracks(): MissileTrackServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of mission assignment
         * objects. MissionAssignment is used by C2 JUs and, optionally, non-C2 JUs to assign
         * missions, designate targets, and provide target information to non-C2 JU platforms.
         * Provision is made for the non-C2 JU platforms to acknowledge the message through
         * receipt/compliance action.
         */
        fun missionAssignment(): MissionAssignmentServiceAsync.WithRawResponse

        /**
         * These services provide operations for posting and querying Moving Target Indicator (MTI)
         * STANAG 4607 data. Detailed MTI data supports activities such as targeting or less
         * detailed data for applications such as situational awareness used/derived by exploitation
         * systems.
         */
        fun mti(): MtiServiceAsync.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun navigation(): NavigationServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun navigationalObstruction(): NavigationalObstructionServiceAsync.WithRawResponse

        /**
         * A Notification Service allowing the broadcast of generic messages to the community. Users
         * can send free-form messages, publish lists, and notify the community about events or
         * alerts across various domains. Notifications and alerts are categorized by a 'msgType'
         * field and are accessible via the UDL Secure Messaging API and REST API services.
         */
        fun notification(): NotificationServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun objectOfInterest(): ObjectOfInterestServiceAsync.WithRawResponse

        fun observations(): ObservationServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun onboardnavigation(): OnboardnavigationServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbit(): OnorbitServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitantenna(): OnorbitantennaServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitbattery(): OnorbitbatteryServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitdetails(): OnorbitdetailServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitevent(): OnorbiteventServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitlist(): OnorbitlistServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitsolararray(): OnorbitsolararrayServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitthruster(): OnorbitthrusterServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitthrusterstatus(): OnorbitthrusterstatusServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun onorbitassessment(): OnorbitassessmentServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun operatingunit(): OperatingunitServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun operatingunitremark(): OperatingunitremarkServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Orbit Determination (OD)
         * data. Orbit Determination data contains algorithm results that describe General
         * Perturbations or Special Perturbations orbital updates.
         */
        fun orbitdetermination(): OrbitdeterminationServiceAsync.WithRawResponse

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        fun orbittrack(): OrbittrackServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun organization(): OrganizationServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun organizationdetails(): OrganizationdetailServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun personnelrecovery(): PersonnelrecoveryServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun poi(): PoiServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun port(): PortServiceAsync.WithRawResponse

        fun reportAndActivities(): ReportAndActivityServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        fun rfBand(): RfBandServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        fun rfBandType(): RfBandTypeServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        fun rfEmitter(): RfEmitterServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun routeStats(): RouteStatServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun sarObservation(): SarObservationServiceAsync.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun scientific(): ScientificServiceAsync.WithRawResponse

        fun scs(): ScServiceAsync.WithRawResponse

        /**
         * Secure Messaging is based on Apache Kafka which is an open-source stream-processing
         * software platform developed by the Apache Software Foundation, written in Scala and Java.
         * Kafka provides a unified, high-throughput, low-latency platform for handling real-time
         * data feeds. All messaging is secured; consumers will not receive messages unless
         * authorized to do so. J2000 is the preferred coordinate frame for all observations, but in
         * some cases observations may be in another frame depending on the provider. Please see the
         * 'Discover' tab in the storefront to confirm coordinate frames by data provider.
         */
        fun secureMessaging(): SecureMessagingServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensor(): SensorServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensorStating(): SensorStatingServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensorMaintenance(): SensorMaintenanceServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensorObservationType(): SensorObservationTypeServiceAsync.WithRawResponse

        /** These services provide operations for posting and querying Sensor Tasking data. */
        fun sensorPlan(): SensorPlanServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensorType(): SensorTypeServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        fun seraDataCommDetails(): SeraDataCommDetailServiceAsync.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun seraDataEarlyWarning(): SeraDataEarlyWarningServiceAsync.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun seraDataNavigation(): SeraDataNavigationServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun seradataOpticalPayload(): SeradataOpticalPayloadServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun seradataRadarPayload(): SeradataRadarPayloadServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun seradataSigintPayload(): SeradataSigintPayloadServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun seradataSpacecraftDetails(): SeradataSpacecraftDetailServiceAsync.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of space weather/solar,
         * geomagnetic, and radiation belt index data.
         */
        fun sgi(): SgiServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun sigact(): SigactServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun site(): SiteServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun siteRemark(): SiteRemarkServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun siteStatus(): SiteStatusServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of sky
         * imagery data. Sky imagery is ground or space based telescope imagery of RSO's and
         * includes metadata on the image (time, source, etc) as well as binary image content (e.g.
         * FITS, EOSSA, EOCHIP, MP4). Binary content must be downloaded individually by ID using the
         * 'getFile' operation.
         */
        fun skyImagery(): SkyImageryServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun soiObservationSet(): SoiObservationSetServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun solarArray(): SolarArrayServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun solarArrayDetails(): SolarArrayDetailServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun sortiePpr(): SortiePprServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun spaceEnvObservation(): SpaceEnvObservationServiceAsync.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun stage(): StageServiceAsync.WithRawResponse

        /**
         * These services provide operations for posting and querying Star Catalog data. The Star
         * Catalog model is a representation of astronomical data and photometric data for stars.
         * Astronomical data includes positional information, proper motions, parallaxes and their
         * respective uncertainties. Photometric data contains optical and near-infrared magnitudes,
         * and their uncertainties across multiple bandpasses. Note: Multiple source catalogs may
         * contribute to a single record.
         */
        fun starCatalog(): StarCatalogServiceAsync.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of state vectors for
         * On-orbit objects. State vectors are cartesian vectors of position (r) and velocity (v)
         * that together with their time (epoch) (t) uniquely determine the trajectory of the
         * orbiting body in space. J2000 is the preferred coordinate frame for all state vector
         * positions/velocities in UDL, but in some cases data may be in another frame depending on
         * the provider and/or datatype. Please see the 'Discover' tab in the storefront to confirm
         * coordinate frames by data provider.
         */
        fun stateVector(): StateVectorServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun status(): StatusServiceAsync.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun substatus(): SubstatusServiceAsync.WithRawResponse

        fun supportingData(): SupportingDataServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun surface(): SurfaceServiceAsync.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun surfaceObstruction(): SurfaceObstructionServiceAsync.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun swir(): SwirServiceAsync.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of earth orientation
         * parameter (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS
         * (International Earth Rotation and Reference Systems Service). Earth Orientation
         * Parameters describe the irregularities of the earth's rotation. Technically, they are the
         * parameters which provide the rotation of the ITRS (International Terrestrial Reference
         * System) to the ICRS (International Celestial Reference System) as a function of time.
         * Universal time -- Universal time (UT1) is the time of the earth clock, which performs one
         * revolution in about 24h. It is practically proportional to the sidereal time. The excess
         * revolution time is called length of day (LOD). Coordinates of the pole -- x and y are the
         * coordinates of the Celestial Ephemeris Pole (CEP) relative to the IRP, the IERS Reference
         * Pole. The CEP differs from the instantaneous rotation axis by quasi-diurnal terms with
         * amplitudes under 0.01" (see Seidelmann, 1982). The x-axis is in the direction of the ITRF
         * zero-meridian; the y-axis is in the direction 90 degrees West longitude. Celestial pole
         * offsets -- Celestial pole offsets are described in the IAU Precession and Nutation
         * models. The observed differences with respect to the conventional celestial pole position
         * defined by the models are monitored and reported by the IERS. IERS Bulletins A and B
         * provide current information on the Earth's orientation in the IERS Reference System. This
         * includes Universal Time, coordinates of the terrestrial pole, and celestial pole offsets.
         * Bulletin A gives an advanced solution updated weekly; the standard solution is given
         * monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B values. All solutions
         * are continuous within their respective uncertainties. Bulletin A is issued by the IERS
         * Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington, DC and
         * Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory. IERS
         * Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
         * offsets at daily intervals based on a combination of contributed analysis results using
         * data from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
         * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
         * variations a year into the future are also provided. Meteorological predictions of
         * variations in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of
         * near-term UT1-UTC changes. This publication is prepared by the IERS Rapid
         * Service/Prediction Center.
         */
        fun taiUtc(): TaiUtcServiceAsync.WithRawResponse

        fun tdoaFdoa(): TdoaFdoaServiceAsync.WithRawResponse

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        fun track(): TrackServiceAsync.WithRawResponse

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        fun trackDetails(): TrackDetailServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun trackRoute(): TrackRouteServiceAsync.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        fun transponder(): TransponderServiceAsync.WithRawResponse

        fun user(): UserServiceAsync.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of maritime Vessel and
         * Vessel Status data. Vessel contains the static data of the specific vessel: mmsi, cruise
         * speed, max speed, etc.
         */
        fun vessel(): VesselServiceAsync.WithRawResponse

        fun video(): VideoServiceAsync.WithRawResponse

        /**
         * These services provide for posting and querying terrestrial weather conditions over a
         * target area or region and raw sensor data used to produce condition reports. Weather
         * Reports describe current weather conditions over a target point or region to include
         * general temperatures, pressures, and moisture accumulation, as well as navigational
         * considerations such as altimeter settings, visibility, wind speeds, and cloud heights
         * etc. Weather Data contains algorithmic parameters and dynamic, raw measurements collected
         * by individual sensors such as signal power, noise level, etc., which are generally
         * processed across multiple sensors to produce weather reports.
         */
        fun weatherData(): WeatherDataServiceAsync.WithRawResponse

        /**
         * These services provide for posting and querying terrestrial weather conditions over a
         * target area or region and raw sensor data used to produce condition reports. Weather
         * Reports describe current weather conditions over a target point or region to include
         * general temperatures, pressures, and moisture accumulation, as well as navigational
         * considerations such as altimeter settings, visibility, wind speeds, and cloud heights
         * etc. Weather Data contains algorithmic parameters and dynamic, raw measurements collected
         * by individual sensors such as signal power, noise level, etc., which are generally
         * processed across multiple sensors to produce weather reports.
         */
        fun weatherReport(): WeatherReportServiceAsync.WithRawResponse
    }
}
