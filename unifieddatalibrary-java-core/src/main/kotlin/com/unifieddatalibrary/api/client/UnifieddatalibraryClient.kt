// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.client

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.AiService
import com.unifieddatalibrary.api.services.blocking.AirEventService
import com.unifieddatalibrary.api.services.blocking.AirOperationService
import com.unifieddatalibrary.api.services.blocking.AirTransportMissionService
import com.unifieddatalibrary.api.services.blocking.AircraftService
import com.unifieddatalibrary.api.services.blocking.AircraftSortyService
import com.unifieddatalibrary.api.services.blocking.AircraftStatusRemarkService
import com.unifieddatalibrary.api.services.blocking.AircraftStatusService
import com.unifieddatalibrary.api.services.blocking.AirfieldService
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotConsumptionService
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotService
import com.unifieddatalibrary.api.services.blocking.AirfieldStatusService
import com.unifieddatalibrary.api.services.blocking.AirloadPlanService
import com.unifieddatalibrary.api.services.blocking.AirspaceControlOrderService
import com.unifieddatalibrary.api.services.blocking.AisObjectService
import com.unifieddatalibrary.api.services.blocking.AnalyticImageryService
import com.unifieddatalibrary.api.services.blocking.AntennaService
import com.unifieddatalibrary.api.services.blocking.AttitudeDataService
import com.unifieddatalibrary.api.services.blocking.AttitudeSetService
import com.unifieddatalibrary.api.services.blocking.AviationRiskManagementService
import com.unifieddatalibrary.api.services.blocking.BatteryService
import com.unifieddatalibrary.api.services.blocking.BatterydetailService
import com.unifieddatalibrary.api.services.blocking.BeamContourService
import com.unifieddatalibrary.api.services.blocking.BeamService
import com.unifieddatalibrary.api.services.blocking.BusService
import com.unifieddatalibrary.api.services.blocking.ChannelService
import com.unifieddatalibrary.api.services.blocking.CloselyspacedobjectService
import com.unifieddatalibrary.api.services.blocking.CollectRequestService
import com.unifieddatalibrary.api.services.blocking.CollectResponseService
import com.unifieddatalibrary.api.services.blocking.CommService
import com.unifieddatalibrary.api.services.blocking.ConjunctionService
import com.unifieddatalibrary.api.services.blocking.CotService
import com.unifieddatalibrary.api.services.blocking.CountryService
import com.unifieddatalibrary.api.services.blocking.CrewService
import com.unifieddatalibrary.api.services.blocking.DeconflictsetService
import com.unifieddatalibrary.api.services.blocking.DiffOfArrivalService
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceService
import com.unifieddatalibrary.api.services.blocking.DriftHistoryService
import com.unifieddatalibrary.api.services.blocking.DropzoneService
import com.unifieddatalibrary.api.services.blocking.EcpedrService
import com.unifieddatalibrary.api.services.blocking.EffectRequestService
import com.unifieddatalibrary.api.services.blocking.EffectResponseService
import com.unifieddatalibrary.api.services.blocking.ElsetService
import com.unifieddatalibrary.api.services.blocking.EmireportService
import com.unifieddatalibrary.api.services.blocking.EmitterGeolocationService
import com.unifieddatalibrary.api.services.blocking.EngineDetailService
import com.unifieddatalibrary.api.services.blocking.EngineService
import com.unifieddatalibrary.api.services.blocking.EntityService
import com.unifieddatalibrary.api.services.blocking.EopService
import com.unifieddatalibrary.api.services.blocking.EphemerisService
import com.unifieddatalibrary.api.services.blocking.EphemerisSetService
import com.unifieddatalibrary.api.services.blocking.EquipmentRemarkService
import com.unifieddatalibrary.api.services.blocking.EquipmentService
import com.unifieddatalibrary.api.services.blocking.EvacService
import com.unifieddatalibrary.api.services.blocking.EventEvolutionService
import com.unifieddatalibrary.api.services.blocking.FeatureAssessmentService
import com.unifieddatalibrary.api.services.blocking.FlightplanService
import com.unifieddatalibrary.api.services.blocking.GeoStatusService
import com.unifieddatalibrary.api.services.blocking.GlobalAtmosphericModelService
import com.unifieddatalibrary.api.services.blocking.GnssObservationService
import com.unifieddatalibrary.api.services.blocking.GnssObservationsetService
import com.unifieddatalibrary.api.services.blocking.GnssRawIfService
import com.unifieddatalibrary.api.services.blocking.GroundImageryService
import com.unifieddatalibrary.api.services.blocking.H3GeoHexCellService
import com.unifieddatalibrary.api.services.blocking.H3GeoService
import com.unifieddatalibrary.api.services.blocking.HazardService
import com.unifieddatalibrary.api.services.blocking.IonoObservationService
import com.unifieddatalibrary.api.services.blocking.IrService
import com.unifieddatalibrary.api.services.blocking.IsrCollectionService
import com.unifieddatalibrary.api.services.blocking.ItemService
import com.unifieddatalibrary.api.services.blocking.ItemTrackingService
import com.unifieddatalibrary.api.services.blocking.LaserdeconflictrequestService
import com.unifieddatalibrary.api.services.blocking.LaseremitterService
import com.unifieddatalibrary.api.services.blocking.LaunchDetectionService
import com.unifieddatalibrary.api.services.blocking.LaunchEventService
import com.unifieddatalibrary.api.services.blocking.LaunchSiteDetailService
import com.unifieddatalibrary.api.services.blocking.LaunchSiteService
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleDetailService
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleService
import com.unifieddatalibrary.api.services.blocking.LinkStatusService
import com.unifieddatalibrary.api.services.blocking.LinkstatusService
import com.unifieddatalibrary.api.services.blocking.LocationService
import com.unifieddatalibrary.api.services.blocking.LogisticsSupportService
import com.unifieddatalibrary.api.services.blocking.ManeuverService
import com.unifieddatalibrary.api.services.blocking.ManifoldService
import com.unifieddatalibrary.api.services.blocking.ManifoldelsetService
import com.unifieddatalibrary.api.services.blocking.MissileTrackService
import com.unifieddatalibrary.api.services.blocking.MissionAssignmentService
import com.unifieddatalibrary.api.services.blocking.MtiService
import com.unifieddatalibrary.api.services.blocking.NavigationService
import com.unifieddatalibrary.api.services.blocking.NavigationalObstructionService
import com.unifieddatalibrary.api.services.blocking.NotificationService
import com.unifieddatalibrary.api.services.blocking.ObjectOfInterestService
import com.unifieddatalibrary.api.services.blocking.ObservationService
import com.unifieddatalibrary.api.services.blocking.OnboardnavigationService
import com.unifieddatalibrary.api.services.blocking.OnorbitService
import com.unifieddatalibrary.api.services.blocking.OnorbitantennaService
import com.unifieddatalibrary.api.services.blocking.OnorbitassessmentService
import com.unifieddatalibrary.api.services.blocking.OnorbitbatteryService
import com.unifieddatalibrary.api.services.blocking.OnorbitdetailService
import com.unifieddatalibrary.api.services.blocking.OnorbiteventService
import com.unifieddatalibrary.api.services.blocking.OnorbitlistService
import com.unifieddatalibrary.api.services.blocking.OnorbitsolararrayService
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterService
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterstatusService
import com.unifieddatalibrary.api.services.blocking.OperatingunitService
import com.unifieddatalibrary.api.services.blocking.OperatingunitremarkService
import com.unifieddatalibrary.api.services.blocking.OrbitdeterminationService
import com.unifieddatalibrary.api.services.blocking.OrbittrackService
import com.unifieddatalibrary.api.services.blocking.OrganizationService
import com.unifieddatalibrary.api.services.blocking.OrganizationdetailService
import com.unifieddatalibrary.api.services.blocking.PersonnelrecoveryService
import com.unifieddatalibrary.api.services.blocking.PoiService
import com.unifieddatalibrary.api.services.blocking.PortService
import com.unifieddatalibrary.api.services.blocking.ReportAndActivityService
import com.unifieddatalibrary.api.services.blocking.RfBandService
import com.unifieddatalibrary.api.services.blocking.RfBandTypeService
import com.unifieddatalibrary.api.services.blocking.RfEmitterService
import com.unifieddatalibrary.api.services.blocking.RouteStatService
import com.unifieddatalibrary.api.services.blocking.SarObservationService
import com.unifieddatalibrary.api.services.blocking.ScService
import com.unifieddatalibrary.api.services.blocking.ScientificService
import com.unifieddatalibrary.api.services.blocking.SecureMessagingService
import com.unifieddatalibrary.api.services.blocking.SensorMaintenanceService
import com.unifieddatalibrary.api.services.blocking.SensorObservationTypeService
import com.unifieddatalibrary.api.services.blocking.SensorPlanService
import com.unifieddatalibrary.api.services.blocking.SensorService
import com.unifieddatalibrary.api.services.blocking.SensorStatingService
import com.unifieddatalibrary.api.services.blocking.SensorTypeService
import com.unifieddatalibrary.api.services.blocking.SeraDataCommDetailService
import com.unifieddatalibrary.api.services.blocking.SeraDataEarlyWarningService
import com.unifieddatalibrary.api.services.blocking.SeraDataNavigationService
import com.unifieddatalibrary.api.services.blocking.SeradataOpticalPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataRadarPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataSigintPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataSpacecraftDetailService
import com.unifieddatalibrary.api.services.blocking.SgiService
import com.unifieddatalibrary.api.services.blocking.SigactService
import com.unifieddatalibrary.api.services.blocking.SiteRemarkService
import com.unifieddatalibrary.api.services.blocking.SiteService
import com.unifieddatalibrary.api.services.blocking.SiteStatusService
import com.unifieddatalibrary.api.services.blocking.SkyImageryService
import com.unifieddatalibrary.api.services.blocking.SoiObservationSetService
import com.unifieddatalibrary.api.services.blocking.SolarArrayDetailService
import com.unifieddatalibrary.api.services.blocking.SolarArrayService
import com.unifieddatalibrary.api.services.blocking.SortiePprService
import com.unifieddatalibrary.api.services.blocking.SpaceEnvObservationService
import com.unifieddatalibrary.api.services.blocking.StageService
import com.unifieddatalibrary.api.services.blocking.StarCatalogService
import com.unifieddatalibrary.api.services.blocking.StateVectorService
import com.unifieddatalibrary.api.services.blocking.StatusService
import com.unifieddatalibrary.api.services.blocking.SubstatusService
import com.unifieddatalibrary.api.services.blocking.SupportingDataService
import com.unifieddatalibrary.api.services.blocking.SurfaceObstructionService
import com.unifieddatalibrary.api.services.blocking.SurfaceService
import com.unifieddatalibrary.api.services.blocking.SwirService
import com.unifieddatalibrary.api.services.blocking.TaiUtcService
import com.unifieddatalibrary.api.services.blocking.TdoaFdoaService
import com.unifieddatalibrary.api.services.blocking.TrackDetailService
import com.unifieddatalibrary.api.services.blocking.TrackRouteService
import com.unifieddatalibrary.api.services.blocking.TrackService
import com.unifieddatalibrary.api.services.blocking.TransponderService
import com.unifieddatalibrary.api.services.blocking.UserService
import com.unifieddatalibrary.api.services.blocking.VesselService
import com.unifieddatalibrary.api.services.blocking.WeatherDataService
import com.unifieddatalibrary.api.services.blocking.WeatherReportService
import java.util.function.Consumer

/**
 * A client for interacting with the Unifieddatalibrary REST API synchronously. You can also switch
 * to asynchronous execution via the [async] method.
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
interface UnifieddatalibraryClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): UnifieddatalibraryClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnifieddatalibraryClient

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
    fun airEvents(): AirEventService

    fun airOperations(): AirOperationService

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
    fun airTransportMissions(): AirTransportMissionService

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    fun aircraft(): AircraftService

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
    fun aircraftSorties(): AircraftSortyService

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    fun aircraftStatusRemarks(): AircraftStatusRemarkService

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    fun aircraftStatuses(): AircraftStatusService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun airfieldSlotConsumptions(): AirfieldSlotConsumptionService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun airfieldSlots(): AirfieldSlotService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun airfieldStatus(): AirfieldStatusService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun airfields(): AirfieldService

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
    fun airloadPlans(): AirloadPlanService

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
    fun airspaceControlOrders(): AirspaceControlOrderService

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
    fun ais(): AiService

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
    fun aisObjects(): AisObjectService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun analyticImagery(): AnalyticImageryService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun antennas(): AntennaService

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
    fun attitudeData(): AttitudeDataService

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
    fun attitudeSets(): AttitudeSetService

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
    fun aviationRiskManagement(): AviationRiskManagementService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun batteries(): BatteryService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun batterydetails(): BatterydetailService

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
    fun beam(): BeamService

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
    fun beamContours(): BeamContourService

    /**
     * Services for querying and manipulation of satellite buses. A bus is the physical and software
     * infrastructure backbone to which on-orbit satellite payloads are attached for power, control,
     * and other support functions.
     */
    fun buses(): BusService

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    fun channels(): ChannelService

    /**
     * This collection of services provides operations for manipulating and querying of closely
     * spaced objects (on orbit) operations including docking, rendezvous, proximity and reporting
     * of payload zone engagements observed and characterized over a period of time.
     */
    fun closelyspacedobjects(): CloselyspacedobjectService

    /** These services provide operations for posting and querying Sensor Tasking data. */
    fun collectRequests(): CollectRequestService

    /** These services provide operations for posting and querying Sensor Tasking data. */
    fun collectResponses(): CollectResponseService

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    fun comm(): CommService

    /** These services provide operations for manipulation and querying of conjunctions. */
    fun conjunctions(): ConjunctionService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun cots(): CotService

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun countries(): CountryService

    /**
     * These services provide operations for posting and querying crew data. Crew data contains
     * information about its members and their assignments.
     */
    fun crew(): CrewService

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun deconflictset(): DeconflictsetService

    /**
     * These services provide operations for querying and manipulation of Signal time and frequency
     * difference of arrival (TDOA/FDOA) information obtained by using passive RF based sensor
     * phenomenologies and sensor triangulation. The J2000 coordinate frame is the preferred frame
     * for all observations, but in some cases observations may be in another frame depending on the
     * provider.
     */
    fun diffOfArrival(): DiffOfArrivalService

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
    fun diplomaticClearance(): DiplomaticClearanceService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun driftHistory(): DriftHistoryService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun dropzone(): DropzoneService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun ecpedr(): EcpedrService

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun effectRequests(): EffectRequestService

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun effectResponses(): EffectResponseService

    /**
     * These services provide operations for querying and manipulation of element set data
     * describing orbital characteristics of on-orbit objects. An element set is a collection of
     * parameters that are used, along with an orbit propagator, to predict the motion of a
     * satellite. The element set, or elset for short, consists of identification data, the
     * classical elements and drag parameters.
     */
    fun elsets(): ElsetService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun emireport(): EmireportService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun emitterGeolocation(): EmitterGeolocationService

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun engineDetails(): EngineDetailService

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun engines(): EngineService

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun entities(): EntityService

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
    fun eop(): EopService

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
    fun ephemeris(): EphemerisService

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
    fun ephemerisSets(): EphemerisSetService

    /**
     * This collection of services provide operations for manipulating and querying of equipment
     * related data.
     */
    fun equipment(): EquipmentService

    /**
     * This collection of services provide operations for manipulating and querying of equipment
     * related data.
     */
    fun equipmentRemarks(): EquipmentRemarkService

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun evac(): EvacService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun eventEvolution(): EventEvolutionService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun featureAssessment(): FeatureAssessmentService

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
    fun flightplan(): FlightplanService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun geoStatus(): GeoStatusService

    /**
     * Models and Simulations is a collection of services that allow consumers to interact with data
     * products representing independent models of various phenomenon, artificial intelligence
     * models and predictions, or of mathematical parameters meant to feed mod and sim tools to
     * produce estimates of environmental entities such as atmospheric models and heat maps.
     */
    fun globalAtmosphericModel(): GlobalAtmosphericModelService

    fun gnssObservations(): GnssObservationService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun gnssObservationset(): GnssObservationsetService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun gnssRawIf(): GnssRawIfService

    /**
     * This collection of services provides operations for querying and manipulation of ground
     * imagery of terrestrial regions from on-orbit, air, and other sensors. Includes metadata on
     * the image (time, region, source, etc) as well as binary content (typically GeoTIFF). Binary
     * content must be downloaded individually by ID using the 'getFile' operation. Well-Known Text
     * (WKT) and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    fun groundImagery(): GroundImageryService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun h3Geo(): H3GeoService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun h3GeoHexCell(): H3GeoHexCellService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun hazard(): HazardService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun ionoObservations(): IonoObservationService

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun ir(): IrService

    /** These services provide operations for posting and querying Sensor Tasking data. */
    fun isrCollections(): IsrCollectionService

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
    fun item(): ItemService

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
    fun itemTrackings(): ItemTrackingService

    /**
     * This collection of services provides operations for querying and manipulation of laser
     * related information to include the laser emitters, the laser deconflict requests, and laser
     * deconflict responses.
     */
    fun laserdeconflictrequest(): LaserdeconflictrequestService

    /**
     * This collection of services provides operations for querying and manipulation of laser
     * related information to include the laser emitters, the laser deconflict requests, and laser
     * deconflict responses.
     */
    fun laseremitter(): LaseremitterService

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchDetection(): LaunchDetectionService

    /**
     * These services provide operations for manipulation and querying of LaunchEvent data. Launch
     * Event data are known space launches, either future or historic records containing items such
     * as the launch site, launch epoch, and object.
     */
    fun launchEvent(): LaunchEventService

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchSite(): LaunchSiteService

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchSiteDetails(): LaunchSiteDetailService

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchVehicle(): LaunchVehicleService

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun launchVehicleDetails(): LaunchVehicleDetailService

    /**
     * These services provide operations for manipulation and querying tactical data links and link
     * statuses of beams or a satellite constellation. Communication link statuses provide
     * definitions and status such as, positional endpoints, where each endpoint may be associated
     * with a specific beam or with a satellite constellation. Data links provide detailed
     * instructions regarding the operational use of a tactical data link and interface coordination
     * through various message formats.
     */
    fun linkStatus(): LinkStatusService

    /**
     * These services provide operations for manipulation and querying tactical data links and link
     * statuses of beams or a satellite constellation. Communication link statuses provide
     * definitions and status such as, positional endpoints, where each endpoint may be associated
     * with a specific beam or with a satellite constellation. Data links provide detailed
     * instructions regarding the operational use of a tactical data link and interface coordination
     * through various message formats.
     */
    fun linkstatus(): LinkstatusService

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun location(): LocationService

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
    fun logisticsSupport(): LogisticsSupportService

    /**
     * This service provides operations for querying and manipulation of detected/possible/confirmed
     * on-orbit maneuvers. The J2000 coordinate frame is the preferred frame for all maneuver data,
     * but in some cases data may be in another frame depending on the provider. Check the
     * Storefront 'Data Products' section under the 'Discover' tab for maneuver data provider
     * information.
     */
    fun maneuvers(): ManeuverService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun manifold(): ManifoldService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun manifoldelset(): ManifoldelsetService

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    fun missileTracks(): MissileTrackService

    /**
     * These services provide operations for manipulation and querying of mission assignment
     * objects. MissionAssignment is used by C2 JUs and, optionally, non-C2 JUs to assign missions,
     * designate targets, and provide target information to non-C2 JU platforms. Provision is made
     * for the non-C2 JU platforms to acknowledge the message through receipt/compliance action.
     */
    fun missionAssignment(): MissionAssignmentService

    /**
     * These services provide operations for posting and querying Moving Target Indicator (MTI)
     * STANAG 4607 data. Detailed MTI data supports activities such as targeting or less detailed
     * data for applications such as situational awareness used/derived by exploitation systems.
     */
    fun mti(): MtiService

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun navigation(): NavigationService

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
    fun navigationalObstruction(): NavigationalObstructionService

    /**
     * A Notification Service allowing the broadcast of generic messages to the community. Users can
     * send free-form messages, publish lists, and notify the community about events or alerts
     * across various domains. Notifications and alerts are categorized by a 'msgType' field and are
     * accessible via the UDL Secure Messaging API and REST API services.
     */
    fun notification(): NotificationService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun objectOfInterest(): ObjectOfInterestService

    fun observations(): ObservationService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun onboardnavigation(): OnboardnavigationService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbit(): OnorbitService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitantenna(): OnorbitantennaService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitbattery(): OnorbitbatteryService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitdetails(): OnorbitdetailService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitevent(): OnorbiteventService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitlist(): OnorbitlistService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitsolararray(): OnorbitsolararrayService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitthruster(): OnorbitthrusterService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun onorbitthrusterstatus(): OnorbitthrusterstatusService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun onorbitassessment(): OnorbitassessmentService

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun operatingunit(): OperatingunitService

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun operatingunitremark(): OperatingunitremarkService

    /**
     * These services provide operations for manipulating and querying Orbit Determination (OD)
     * data. Orbit Determination data contains algorithm results that describe General Perturbations
     * or Special Perturbations orbital updates.
     */
    fun orbitdetermination(): OrbitdeterminationService

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    fun orbittrack(): OrbittrackService

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun organization(): OrganizationService

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun organizationdetails(): OrganizationdetailService

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    fun personnelrecovery(): PersonnelrecoveryService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun poi(): PoiService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun port(): PortService

    fun reportAndActivities(): ReportAndActivityService

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    fun rfBand(): RfBandService

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    fun rfBandType(): RfBandTypeService

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    fun rfEmitter(): RfEmitterService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun routeStats(): RouteStatService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun sarObservation(): SarObservationService

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun scientific(): ScientificService

    fun scs(): ScService

    /**
     * Secure Messaging is based on Apache Kafka which is an open-source stream-processing software
     * platform developed by the Apache Software Foundation, written in Scala and Java. Kafka
     * provides a unified, high-throughput, low-latency platform for handling real-time data feeds.
     * All messaging is secured; consumers will not receive messages unless authorized to do so.
     * J2000 is the preferred coordinate frame for all observations, but in some cases observations
     * may be in another frame depending on the provider. Please see the 'Discover' tab in the
     * storefront to confirm coordinate frames by data provider.
     */
    fun secureMessaging(): SecureMessagingService

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensor(): SensorService

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensorStating(): SensorStatingService

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensorMaintenance(): SensorMaintenanceService

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensorObservationType(): SensorObservationTypeService

    /** These services provide operations for posting and querying Sensor Tasking data. */
    fun sensorPlan(): SensorPlanService

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun sensorType(): SensorTypeService

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    fun seraDataCommDetails(): SeraDataCommDetailService

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun seraDataEarlyWarning(): SeraDataEarlyWarningService

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    fun seraDataNavigation(): SeraDataNavigationService

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun seradataOpticalPayload(): SeradataOpticalPayloadService

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun seradataRadarPayload(): SeradataRadarPayloadService

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    fun seradataSigintPayload(): SeradataSigintPayloadService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun seradataSpacecraftDetails(): SeradataSpacecraftDetailService

    /**
     * This service provides operations for manipulation and querying of space weather/solar,
     * geomagnetic, and radiation belt index data.
     */
    fun sgi(): SgiService

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    fun sigact(): SigactService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun site(): SiteService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun siteRemark(): SiteRemarkService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun siteStatus(): SiteStatusService

    /**
     * This collection of services provides operations for querying and manipulation of sky imagery
     * data. Sky imagery is ground or space based telescope imagery of RSO's and includes metadata
     * on the image (time, source, etc) as well as binary image content (e.g. FITS, EOSSA, EOCHIP,
     * MP4). Binary content must be downloaded individually by ID using the 'getFile' operation.
     */
    fun skyImagery(): SkyImageryService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun soiObservationSet(): SoiObservationSetService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun solarArray(): SolarArrayService

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    fun solarArrayDetails(): SolarArrayDetailService

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
    fun sortiePpr(): SortiePprService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun spaceEnvObservation(): SpaceEnvObservationService

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    fun stage(): StageService

    /**
     * These services provide operations for posting and querying Star Catalog data. The Star
     * Catalog model is a representation of astronomical data and photometric data for stars.
     * Astronomical data includes positional information, proper motions, parallaxes and their
     * respective uncertainties. Photometric data contains optical and near-infrared magnitudes, and
     * their uncertainties across multiple bandpasses. Note: Multiple source catalogs may contribute
     * to a single record.
     */
    fun starCatalog(): StarCatalogService

    /**
     * This service provides operations for querying and manipulation of state vectors for On-orbit
     * objects. State vectors are cartesian vectors of position (r) and velocity (v) that together
     * with their time (epoch) (t) uniquely determine the trajectory of the orbiting body in space.
     * J2000 is the preferred coordinate frame for all state vector positions/velocities in UDL, but
     * in some cases data may be in another frame depending on the provider and/or datatype. Please
     * see the 'Discover' tab in the storefront to confirm coordinate frames by data provider.
     */
    fun stateVector(): StateVectorService

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun status(): StatusService

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    fun substatus(): SubstatusService

    fun supportingData(): SupportingDataService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun surface(): SurfaceService

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    fun surfaceObstruction(): SurfaceObstructionService

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    fun swir(): SwirService

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
    fun taiUtc(): TaiUtcService

    fun tdoaFdoa(): TdoaFdoaService

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    fun track(): TrackService

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    fun trackDetails(): TrackDetailService

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
    fun trackRoute(): TrackRouteService

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    fun transponder(): TransponderService

    fun user(): UserService

    /**
     * This service provides operations for manipulation and querying of maritime Vessel and Vessel
     * Status data. Vessel contains the static data of the specific vessel: mmsi, cruise speed, max
     * speed, etc.
     */
    fun vessel(): VesselService

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
    fun weatherData(): WeatherDataService

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
    fun weatherReport(): WeatherReportService

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
     * A view of [UnifieddatalibraryClient] that provides access to raw HTTP responses for each
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
        ): UnifieddatalibraryClient.WithRawResponse

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
        fun airEvents(): AirEventService.WithRawResponse

        fun airOperations(): AirOperationService.WithRawResponse

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
        fun airTransportMissions(): AirTransportMissionService.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        fun aircraft(): AircraftService.WithRawResponse

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
        fun aircraftSorties(): AircraftSortyService.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        fun aircraftStatusRemarks(): AircraftStatusRemarkService.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        fun aircraftStatuses(): AircraftStatusService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun airfieldSlotConsumptions(): AirfieldSlotConsumptionService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun airfieldSlots(): AirfieldSlotService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun airfieldStatus(): AirfieldStatusService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun airfields(): AirfieldService.WithRawResponse

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
        fun airloadPlans(): AirloadPlanService.WithRawResponse

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
        fun airspaceControlOrders(): AirspaceControlOrderService.WithRawResponse

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
        fun ais(): AiService.WithRawResponse

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
        fun aisObjects(): AisObjectService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun analyticImagery(): AnalyticImageryService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun antennas(): AntennaService.WithRawResponse

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
        fun attitudeData(): AttitudeDataService.WithRawResponse

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
        fun attitudeSets(): AttitudeSetService.WithRawResponse

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
        fun aviationRiskManagement(): AviationRiskManagementService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun batteries(): BatteryService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun batterydetails(): BatterydetailService.WithRawResponse

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
        fun beam(): BeamService.WithRawResponse

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
        fun beamContours(): BeamContourService.WithRawResponse

        /**
         * Services for querying and manipulation of satellite buses. A bus is the physical and
         * software infrastructure backbone to which on-orbit satellite payloads are attached for
         * power, control, and other support functions.
         */
        fun buses(): BusService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        fun channels(): ChannelService.WithRawResponse

        /**
         * This collection of services provides operations for manipulating and querying of closely
         * spaced objects (on orbit) operations including docking, rendezvous, proximity and
         * reporting of payload zone engagements observed and characterized over a period of time.
         */
        fun closelyspacedobjects(): CloselyspacedobjectService.WithRawResponse

        /** These services provide operations for posting and querying Sensor Tasking data. */
        fun collectRequests(): CollectRequestService.WithRawResponse

        /** These services provide operations for posting and querying Sensor Tasking data. */
        fun collectResponses(): CollectResponseService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        fun comm(): CommService.WithRawResponse

        /** These services provide operations for manipulation and querying of conjunctions. */
        fun conjunctions(): ConjunctionService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun cots(): CotService.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun countries(): CountryService.WithRawResponse

        /**
         * These services provide operations for posting and querying crew data. Crew data contains
         * information about its members and their assignments.
         */
        fun crew(): CrewService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun deconflictset(): DeconflictsetService.WithRawResponse

        /**
         * These services provide operations for querying and manipulation of Signal time and
         * frequency difference of arrival (TDOA/FDOA) information obtained by using passive RF
         * based sensor phenomenologies and sensor triangulation. The J2000 coordinate frame is the
         * preferred frame for all observations, but in some cases observations may be in another
         * frame depending on the provider.
         */
        fun diffOfArrival(): DiffOfArrivalService.WithRawResponse

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
        fun diplomaticClearance(): DiplomaticClearanceService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun driftHistory(): DriftHistoryService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun dropzone(): DropzoneService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun ecpedr(): EcpedrService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun effectRequests(): EffectRequestService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun effectResponses(): EffectResponseService.WithRawResponse

        /**
         * These services provide operations for querying and manipulation of element set data
         * describing orbital characteristics of on-orbit objects. An element set is a collection of
         * parameters that are used, along with an orbit propagator, to predict the motion of a
         * satellite. The element set, or elset for short, consists of identification data, the
         * classical elements and drag parameters.
         */
        fun elsets(): ElsetService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun emireport(): EmireportService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun emitterGeolocation(): EmitterGeolocationService.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun engineDetails(): EngineDetailService.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun engines(): EngineService.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun entities(): EntityService.WithRawResponse

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
        fun eop(): EopService.WithRawResponse

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
        fun ephemeris(): EphemerisService.WithRawResponse

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
        fun ephemerisSets(): EphemerisSetService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of equipment
         * related data.
         */
        fun equipment(): EquipmentService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of equipment
         * related data.
         */
        fun equipmentRemarks(): EquipmentRemarkService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun evac(): EvacService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun eventEvolution(): EventEvolutionService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun featureAssessment(): FeatureAssessmentService.WithRawResponse

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
        fun flightplan(): FlightplanService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun geoStatus(): GeoStatusService.WithRawResponse

        /**
         * Models and Simulations is a collection of services that allow consumers to interact with
         * data products representing independent models of various phenomenon, artificial
         * intelligence models and predictions, or of mathematical parameters meant to feed mod and
         * sim tools to produce estimates of environmental entities such as atmospheric models and
         * heat maps.
         */
        fun globalAtmosphericModel(): GlobalAtmosphericModelService.WithRawResponse

        fun gnssObservations(): GnssObservationService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun gnssObservationset(): GnssObservationsetService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun gnssRawIf(): GnssRawIfService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of ground
         * imagery of terrestrial regions from on-orbit, air, and other sensors. Includes metadata
         * on the image (time, region, source, etc) as well as binary content (typically GeoTIFF).
         * Binary content must be downloaded individually by ID using the 'getFile' operation.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        fun groundImagery(): GroundImageryService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun h3Geo(): H3GeoService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun h3GeoHexCell(): H3GeoHexCellService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun hazard(): HazardService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun ionoObservations(): IonoObservationService.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun ir(): IrService.WithRawResponse

        /** These services provide operations for posting and querying Sensor Tasking data. */
        fun isrCollections(): IsrCollectionService.WithRawResponse

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
        fun item(): ItemService.WithRawResponse

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
        fun itemTrackings(): ItemTrackingService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of laser
         * related information to include the laser emitters, the laser deconflict requests, and
         * laser deconflict responses.
         */
        fun laserdeconflictrequest(): LaserdeconflictrequestService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of laser
         * related information to include the laser emitters, the laser deconflict requests, and
         * laser deconflict responses.
         */
        fun laseremitter(): LaseremitterService.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchDetection(): LaunchDetectionService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of LaunchEvent data.
         * Launch Event data are known space launches, either future or historic records containing
         * items such as the launch site, launch epoch, and object.
         */
        fun launchEvent(): LaunchEventService.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchSite(): LaunchSiteService.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchSiteDetails(): LaunchSiteDetailService.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchVehicle(): LaunchVehicleService.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun launchVehicleDetails(): LaunchVehicleDetailService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying tactical data links and
         * link statuses of beams or a satellite constellation. Communication link statuses provide
         * definitions and status such as, positional endpoints, where each endpoint may be
         * associated with a specific beam or with a satellite constellation. Data links provide
         * detailed instructions regarding the operational use of a tactical data link and interface
         * coordination through various message formats.
         */
        fun linkStatus(): LinkStatusService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying tactical data links and
         * link statuses of beams or a satellite constellation. Communication link statuses provide
         * definitions and status such as, positional endpoints, where each endpoint may be
         * associated with a specific beam or with a satellite constellation. Data links provide
         * detailed instructions regarding the operational use of a tactical data link and interface
         * coordination through various message formats.
         */
        fun linkstatus(): LinkstatusService.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun location(): LocationService.WithRawResponse

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
        fun logisticsSupport(): LogisticsSupportService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of
         * detected/possible/confirmed on-orbit maneuvers. The J2000 coordinate frame is the
         * preferred frame for all maneuver data, but in some cases data may be in another frame
         * depending on the provider. Check the Storefront 'Data Products' section under the
         * 'Discover' tab for maneuver data provider information.
         */
        fun maneuvers(): ManeuverService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun manifold(): ManifoldService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun manifoldelset(): ManifoldelsetService.WithRawResponse

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        fun missileTracks(): MissileTrackService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of mission assignment
         * objects. MissionAssignment is used by C2 JUs and, optionally, non-C2 JUs to assign
         * missions, designate targets, and provide target information to non-C2 JU platforms.
         * Provision is made for the non-C2 JU platforms to acknowledge the message through
         * receipt/compliance action.
         */
        fun missionAssignment(): MissionAssignmentService.WithRawResponse

        /**
         * These services provide operations for posting and querying Moving Target Indicator (MTI)
         * STANAG 4607 data. Detailed MTI data supports activities such as targeting or less
         * detailed data for applications such as situational awareness used/derived by exploitation
         * systems.
         */
        fun mti(): MtiService.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun navigation(): NavigationService.WithRawResponse

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
        fun navigationalObstruction(): NavigationalObstructionService.WithRawResponse

        /**
         * A Notification Service allowing the broadcast of generic messages to the community. Users
         * can send free-form messages, publish lists, and notify the community about events or
         * alerts across various domains. Notifications and alerts are categorized by a 'msgType'
         * field and are accessible via the UDL Secure Messaging API and REST API services.
         */
        fun notification(): NotificationService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun objectOfInterest(): ObjectOfInterestService.WithRawResponse

        fun observations(): ObservationService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun onboardnavigation(): OnboardnavigationService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbit(): OnorbitService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitantenna(): OnorbitantennaService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitbattery(): OnorbitbatteryService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitdetails(): OnorbitdetailService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitevent(): OnorbiteventService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitlist(): OnorbitlistService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitsolararray(): OnorbitsolararrayService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitthruster(): OnorbitthrusterService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun onorbitthrusterstatus(): OnorbitthrusterstatusService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun onorbitassessment(): OnorbitassessmentService.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun operatingunit(): OperatingunitService.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun operatingunitremark(): OperatingunitremarkService.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Orbit Determination (OD)
         * data. Orbit Determination data contains algorithm results that describe General
         * Perturbations or Special Perturbations orbital updates.
         */
        fun orbitdetermination(): OrbitdeterminationService.WithRawResponse

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        fun orbittrack(): OrbittrackService.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun organization(): OrganizationService.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun organizationdetails(): OrganizationdetailService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        fun personnelrecovery(): PersonnelrecoveryService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun poi(): PoiService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun port(): PortService.WithRawResponse

        fun reportAndActivities(): ReportAndActivityService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        fun rfBand(): RfBandService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        fun rfBandType(): RfBandTypeService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        fun rfEmitter(): RfEmitterService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun routeStats(): RouteStatService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun sarObservation(): SarObservationService.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun scientific(): ScientificService.WithRawResponse

        fun scs(): ScService.WithRawResponse

        /**
         * Secure Messaging is based on Apache Kafka which is an open-source stream-processing
         * software platform developed by the Apache Software Foundation, written in Scala and Java.
         * Kafka provides a unified, high-throughput, low-latency platform for handling real-time
         * data feeds. All messaging is secured; consumers will not receive messages unless
         * authorized to do so. J2000 is the preferred coordinate frame for all observations, but in
         * some cases observations may be in another frame depending on the provider. Please see the
         * 'Discover' tab in the storefront to confirm coordinate frames by data provider.
         */
        fun secureMessaging(): SecureMessagingService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensor(): SensorService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensorStating(): SensorStatingService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensorMaintenance(): SensorMaintenanceService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensorObservationType(): SensorObservationTypeService.WithRawResponse

        /** These services provide operations for posting and querying Sensor Tasking data. */
        fun sensorPlan(): SensorPlanService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun sensorType(): SensorTypeService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        fun seraDataCommDetails(): SeraDataCommDetailService.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun seraDataEarlyWarning(): SeraDataEarlyWarningService.WithRawResponse

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        fun seraDataNavigation(): SeraDataNavigationService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun seradataOpticalPayload(): SeradataOpticalPayloadService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun seradataRadarPayload(): SeradataRadarPayloadService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        fun seradataSigintPayload(): SeradataSigintPayloadService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun seradataSpacecraftDetails(): SeradataSpacecraftDetailService.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of space weather/solar,
         * geomagnetic, and radiation belt index data.
         */
        fun sgi(): SgiService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        fun sigact(): SigactService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun site(): SiteService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun siteRemark(): SiteRemarkService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun siteStatus(): SiteStatusService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of sky
         * imagery data. Sky imagery is ground or space based telescope imagery of RSO's and
         * includes metadata on the image (time, source, etc) as well as binary image content (e.g.
         * FITS, EOSSA, EOCHIP, MP4). Binary content must be downloaded individually by ID using the
         * 'getFile' operation.
         */
        fun skyImagery(): SkyImageryService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun soiObservationSet(): SoiObservationSetService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun solarArray(): SolarArrayService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        fun solarArrayDetails(): SolarArrayDetailService.WithRawResponse

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
        fun sortiePpr(): SortiePprService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun spaceEnvObservation(): SpaceEnvObservationService.WithRawResponse

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        fun stage(): StageService.WithRawResponse

        /**
         * These services provide operations for posting and querying Star Catalog data. The Star
         * Catalog model is a representation of astronomical data and photometric data for stars.
         * Astronomical data includes positional information, proper motions, parallaxes and their
         * respective uncertainties. Photometric data contains optical and near-infrared magnitudes,
         * and their uncertainties across multiple bandpasses. Note: Multiple source catalogs may
         * contribute to a single record.
         */
        fun starCatalog(): StarCatalogService.WithRawResponse

        /**
         * This service provides operations for querying and manipulation of state vectors for
         * On-orbit objects. State vectors are cartesian vectors of position (r) and velocity (v)
         * that together with their time (epoch) (t) uniquely determine the trajectory of the
         * orbiting body in space. J2000 is the preferred coordinate frame for all state vector
         * positions/velocities in UDL, but in some cases data may be in another frame depending on
         * the provider and/or datatype. Please see the 'Discover' tab in the storefront to confirm
         * coordinate frames by data provider.
         */
        fun stateVector(): StateVectorService.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun status(): StatusService.WithRawResponse

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        fun substatus(): SubstatusService.WithRawResponse

        fun supportingData(): SupportingDataService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun surface(): SurfaceService.WithRawResponse

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        fun surfaceObstruction(): SurfaceObstructionService.WithRawResponse

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        fun swir(): SwirService.WithRawResponse

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
        fun taiUtc(): TaiUtcService.WithRawResponse

        fun tdoaFdoa(): TdoaFdoaService.WithRawResponse

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        fun track(): TrackService.WithRawResponse

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        fun trackDetails(): TrackDetailService.WithRawResponse

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
        fun trackRoute(): TrackRouteService.WithRawResponse

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        fun transponder(): TransponderService.WithRawResponse

        fun user(): UserService.WithRawResponse

        /**
         * This service provides operations for manipulation and querying of maritime Vessel and
         * Vessel Status data. Vessel contains the static data of the specific vessel: mmsi, cruise
         * speed, max speed, etc.
         */
        fun vessel(): VesselService.WithRawResponse

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
        fun weatherData(): WeatherDataService.WithRawResponse

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
        fun weatherReport(): WeatherReportService.WithRawResponse
    }
}
