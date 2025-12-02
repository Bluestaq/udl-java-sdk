# Changelog

## 0.6.2 (2025-12-02)

Full Changelog: [v0.6.1...v0.6.2](https://github.com/Bluestaq/udl-java-sdk/compare/v0.6.1...v0.6.2)

### Bug Fixes

* **client:** cancel okhttp call when future cancelled ([f9e82f3](https://github.com/Bluestaq/udl-java-sdk/commit/f9e82f304c30a9dd01fac0d3e9fc266ebb521f02))


### Documentation

* remove `$` for better copy-pasteabality ([f128f11](https://github.com/Bluestaq/udl-java-sdk/commit/f128f1100e9020f13a4d8fcdfe33c60bdb70406a))

## 0.6.1 (2025-11-13)

Full Changelog: [v0.6.0...v0.6.1](https://github.com/Bluestaq/udl-java-sdk/compare/v0.6.0...v0.6.1)

### Bug Fixes

* **client:** multi-value header serialization ([60b9b6b](https://github.com/Bluestaq/udl-java-sdk/commit/60b9b6bd5dce17b686c060d69646964a6266a400))

## 0.6.0 (2025-10-21)

Full Changelog: [v0.5.0...v0.6.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.5.0...v0.6.0)

### Features

* **api:** api update ([51bfdd0](https://github.com/Bluestaq/udl-java-sdk/commit/51bfdd0b01d1ac70a81b0c3f0dbf22b8b923b89e))
* **api:** manual updates ([37c2ec8](https://github.com/Bluestaq/udl-java-sdk/commit/37c2ec83fc953751bd7540ecb4ffb9bc8cbfc456))


### Bug Fixes

* **client:** add missing additional properties fields ([cbb6011](https://github.com/Bluestaq/udl-java-sdk/commit/cbb60112d172b800d6330bd6ab155791095307f4))

## 0.5.0 (2025-09-25)

Full Changelog: [v0.4.1...v0.5.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.4.1...v0.5.0)

### Features

* **api:** adding obs correlation, staging data for emitters, and user auth endpoint ([f3cbe40](https://github.com/Bluestaq/udl-java-sdk/commit/f3cbe4041ffeae22c00f93f51dd16a01e57002f1))
* **api:** api update ([5e5e4da](https://github.com/Bluestaq/udl-java-sdk/commit/5e5e4da6114b19f0c977f1dbc8962b473b64847c))


### Bug Fixes

* **client:** deserialization of empty objects ([fe31095](https://github.com/Bluestaq/udl-java-sdk/commit/fe310958a37793dc8838b2444b7091737fa566ed))


### Chores

* **internal:** change some comment formatting ([40f1e03](https://github.com/Bluestaq/udl-java-sdk/commit/40f1e0310622ccc1584acd19c3d21e584a04cee7))

## 0.4.1 (2025-09-22)

Full Changelog: [v0.4.0...v0.4.1](https://github.com/Bluestaq/udl-java-sdk/compare/v0.4.0...v0.4.1)

### Chores

* **internal:** improve examples ([2b164df](https://github.com/Bluestaq/udl-java-sdk/commit/2b164df227d6bf0e93ccbf392b14e425ce4c5b54))

## 0.4.0 (2025-09-19)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.3.0...v0.4.0)

### Features

* **client:** add convenience overloads for some methods ([0c10c79](https://github.com/Bluestaq/udl-java-sdk/commit/0c10c793cbac1fa1b48277e83efc52c888282c35))
* **client:** expose sleeper option ([d300281](https://github.com/Bluestaq/udl-java-sdk/commit/d3002814fb6f0039fbc8e167424f79200be9ef02))


### Bug Fixes

* **client:** ensure single timer is created per client ([d300281](https://github.com/Bluestaq/udl-java-sdk/commit/d3002814fb6f0039fbc8e167424f79200be9ef02))


### Chores

* improve formatter performance ([e5e7e94](https://github.com/Bluestaq/udl-java-sdk/commit/e5e7e946c0cc692d779fb8f1fb400d6b6fac837a))

## 0.3.0 (2025-09-17)

Full Changelog: [v0.2.0...v0.3.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.2.0...v0.3.0)

### Features

* **api:** removing old routes ([cbc6781](https://github.com/Bluestaq/udl-java-sdk/commit/cbc6781ee6706a5e7c271e4ead6f4e417b62e9e9))
* **api:** Support for latest UDL release ([84f8bdb](https://github.com/Bluestaq/udl-java-sdk/commit/84f8bdbb41f86639f229a773909bfd5a1bd9d3e7))

## 0.2.0 (2025-09-15)

Full Changelog: [v0.1.9...v0.2.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.9...v0.2.0)

### Features

* **api:** api update ([846eacc](https://github.com/Bluestaq/udl-java-sdk/commit/846eacc084a18bbe1ab8d2e589150ef63ab8ece0))
* **api:** api update ([ec7377c](https://github.com/Bluestaq/udl-java-sdk/commit/ec7377c2e18551c081cf07cb8a1d310f6b898dbf))
* **api:** manual updates ([6fe8047](https://github.com/Bluestaq/udl-java-sdk/commit/6fe8047288fbbbc5af279355592e33ba82db1ad6))


### Bug Fixes

* **client:** incorrect `getPackageVersion` impl ([400e7c6](https://github.com/Bluestaq/udl-java-sdk/commit/400e7c64ee90fb025a0a443e332bb6c480711f9c))


### Chores

* improve formatter performance ([1c97019](https://github.com/Bluestaq/udl-java-sdk/commit/1c97019340a43475cc0d7ae92bdbe71d42c41ea9))
* **internal:** codegen related update ([30c36bc](https://github.com/Bluestaq/udl-java-sdk/commit/30c36bc85b05549711604ae30eb97fef5903cb9c))
* **internal:** codegen related update ([7c024c3](https://github.com/Bluestaq/udl-java-sdk/commit/7c024c3933dcba360f0c7828cecfe227b4164532))

## 0.1.9 (2025-09-03)

Full Changelog: [v0.1.8...v0.1.9](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.8...v0.1.9)

### Bug Fixes

* **client:** name conflict ([d129f24](https://github.com/Bluestaq/udl-java-sdk/commit/d129f243c70395b17bca3f22e56570dcff59bea9))

## 0.1.8 (2025-09-03)

Full Changelog: [v0.1.7...v0.1.8](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.7...v0.1.8)

### Bug Fixes

* **ci:** use java-version 21 for publish step ([5e80451](https://github.com/Bluestaq/udl-java-sdk/commit/5e804512c7d363a940d0e05b616ba79e09a17fff))


### Chores

* disable java docs ([188f0a9](https://github.com/Bluestaq/udl-java-sdk/commit/188f0a9a5b1491bd2ccc94d54fea1fb5de4fc7a7))

## 0.1.7 (2025-09-02)

Full Changelog: [v0.1.6...v0.1.7](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.6...v0.1.7)

## 0.1.6 (2025-09-02)

Full Changelog: [v0.1.5...v0.1.6](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.5...v0.1.6)

## 0.1.5 (2025-08-23)

Full Changelog: [v0.1.4...v0.1.5](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.4...v0.1.5)

### Bug Fixes

* fix casing issue ([3e01072](https://github.com/Bluestaq/udl-java-sdk/commit/3e01072c579ffb2daee1f036e25d524bc7f111c1))
* update singularization rules ([70efca2](https://github.com/Bluestaq/udl-java-sdk/commit/70efca2a9f3fd9771a250d144e7631d4ce3a2c80))


### Chores

* set gradle max memory to 14G ([6c98ebe](https://github.com/Bluestaq/udl-java-sdk/commit/6c98ebeb9af33f39ef7c0b156ab342471e24979a))

## 0.1.4 (2025-08-22)

Full Changelog: [v0.1.3...v0.1.4](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.3...v0.1.4)

### Chores

* **ci:** reduce log noise ([2afa961](https://github.com/Bluestaq/udl-java-sdk/commit/2afa9614bd064258f0dc51d0b58769c1f8eb55a8))

## 0.1.3 (2025-08-21)

Full Changelog: [v0.1.2...v0.1.3](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.2...v0.1.3)

### Chores

* remove memory upper bound from publishing step ([0032115](https://github.com/Bluestaq/udl-java-sdk/commit/00321158671e75fc35827c8d2019762d378c8809))

## 0.1.2 (2025-08-20)

Full Changelog: [v0.1.1...v0.1.2](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.1...v0.1.2)

### Bug Fixes

* **client:** ensure correct binary content type ([383b125](https://github.com/Bluestaq/udl-java-sdk/commit/383b1252ccfb610eb806e5d80e7b995083a79915))


### Chores

* **client:** refactor closing / shutdown ([8ca0e64](https://github.com/Bluestaq/udl-java-sdk/commit/8ca0e644e090937165a983ddb13fd13269152f15))
* **client:** rename parameter ([383b125](https://github.com/Bluestaq/udl-java-sdk/commit/383b1252ccfb610eb806e5d80e7b995083a79915))
* enable publishing to maven ([e19d591](https://github.com/Bluestaq/udl-java-sdk/commit/e19d5913ee67970de433088b54564b94fd4e54da))
* **internal:** support running formatters directly ([d6bf236](https://github.com/Bluestaq/udl-java-sdk/commit/d6bf23608fb3d645e2bb71e5c4c49bf2fd66bba1))

## 0.1.1 (2025-08-19)

Full Changelog: [v0.1.0...v0.1.1](https://github.com/Bluestaq/udl-java-sdk/compare/v0.1.0...v0.1.1)

### Bug Fixes

* use '2006-01-02T15:04:05.000000Z' format for date-time ([eb7bb98](https://github.com/Bluestaq/udl-java-sdk/commit/eb7bb983e2a00564121024ac184c7867886831fb))


### Chores

* **ci:** add build job ([1341a5a](https://github.com/Bluestaq/udl-java-sdk/commit/1341a5a2b845739121ef0437f6cf8dc0bf8941e0))
* **ci:** increase build timeout ([ddd23cf](https://github.com/Bluestaq/udl-java-sdk/commit/ddd23cfe245bdfe754650c1da1e402f0feddafe0))
* **ci:** increase timeout ([8e50e36](https://github.com/Bluestaq/udl-java-sdk/commit/8e50e36be62137291900f3277c7f0922e39bd064))

## 0.1.0 (2025-08-14)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.0.1...v0.1.0)

### Features

* re-generate sdk ([9c06a26](https://github.com/Bluestaq/udl-java-sdk/commit/9c06a2685dd01529f132e002db2f69877932bd59))


### Chores

* formatting ([bbd9cf8](https://github.com/Bluestaq/udl-java-sdk/commit/bbd9cf8321dcecf66978294d24e15e63e94d10c7))
* formatting ([71e6ab6](https://github.com/Bluestaq/udl-java-sdk/commit/71e6ab65384c9c2a223158bfe85b2ac142d484ee))
* increase gradle JVM max memory to 16G ([42a77b2](https://github.com/Bluestaq/udl-java-sdk/commit/42a77b2979f25ce577d6e1754b01c328a7225019))
* remove custom code ([03f8ff3](https://github.com/Bluestaq/udl-java-sdk/commit/03f8ff3a05f9b754750756d5969a0c287b81d2af))

## 0.1.0 (2025-08-12)

Full Changelog: [v0.0.2...v0.1.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.0.2...v0.1.0)

### Features

* re-generate sdk ([9c06a26](https://github.com/Bluestaq/udl-java-sdk/commit/9c06a2685dd01529f132e002db2f69877932bd59))


### Chores

* formatting ([71e6ab6](https://github.com/Bluestaq/udl-java-sdk/commit/71e6ab65384c9c2a223158bfe85b2ac142d484ee))
* increase gradle JVM max memory to 16G ([42a77b2](https://github.com/Bluestaq/udl-java-sdk/commit/42a77b2979f25ce577d6e1754b01c328a7225019))

## 0.0.2 (2025-08-07)

Full Changelog: [v0.0.1...v0.0.2](https://github.com/Bluestaq/udl-java-sdk/compare/v0.0.1...v0.0.2)
