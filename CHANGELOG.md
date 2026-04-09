# Changelog

## 0.11.0 (2026-04-09)

Full Changelog: [v0.10.0...v0.11.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.10.0...v0.11.0)

### Features

* **api:** api update ([819d69e](https://github.com/Bluestaq/udl-java-sdk/commit/819d69ed1d458515e0cb6dda3aa57e050ce37364))
* **api:** manual updates ([3dd239d](https://github.com/Bluestaq/udl-java-sdk/commit/3dd239d89a46be1354c857f76eb599e2b251f9e4))
* re-generate sdk ([9c06a26](https://github.com/Bluestaq/udl-java-sdk/commit/9c06a2685dd01529f132e002db2f69877932bd59))


### Chores

* formatting ([71e6ab6](https://github.com/Bluestaq/udl-java-sdk/commit/71e6ab65384c9c2a223158bfe85b2ac142d484ee))
* increase gradle JVM max memory to 16G ([42a77b2](https://github.com/Bluestaq/udl-java-sdk/commit/42a77b2979f25ce577d6e1754b01c328a7225019))
* **internal:** update multipart form array serialization ([011e0f7](https://github.com/Bluestaq/udl-java-sdk/commit/011e0f7ad4ede86cdc6272a34cb2515218d6bbfa))
* **tests:** bump steady to v0.20.1 ([2de360c](https://github.com/Bluestaq/udl-java-sdk/commit/2de360cfc3fc89aa1a8b8c806a0e40925b5f66ba))
* **tests:** bump steady to v0.20.2 ([b828e36](https://github.com/Bluestaq/udl-java-sdk/commit/b828e36b1e979fbaeb92d527fbaf8d39443dc7a1))

## 0.10.0 (2026-03-24)

Full Changelog: [v0.9.0...v0.10.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.9.0...v0.10.0)

### Features

* **api:** api update ([0af180f](https://github.com/Bluestaq/udl-java-sdk/commit/0af180f257c5a92c12c0729c91f29464d5aabcbc))
* **client:** add connection pooling option ([7b939f7](https://github.com/Bluestaq/udl-java-sdk/commit/7b939f7d22a5187f719c81fb219372eeda5fedc7))
* **client:** add more convenience service method overloads ([b0758a6](https://github.com/Bluestaq/udl-java-sdk/commit/b0758a600ff302fc80a0a7cbe9c04175c6a0106d))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([d0244f2](https://github.com/Bluestaq/udl-java-sdk/commit/d0244f2664085848cf6a242d90a2c6434eb7d0b0))
* **client:** incorrect `Retry-After` parsing ([034cce8](https://github.com/Bluestaq/udl-java-sdk/commit/034cce8dcf2f34ea4a08d9aa877bba133fc515af))
* fix request delays for retrying to be more respectful of high requested delays ([897bba8](https://github.com/Bluestaq/udl-java-sdk/commit/897bba841cba5c7ed73cd4f62df565bdb9da989e))
* set Accept header in more places ([4d4c745](https://github.com/Bluestaq/udl-java-sdk/commit/4d4c7455ff13aa6f960bd203692e7f759bc208ef))


### Chores

* **ci:** skip lint on metadata-only changes ([a685370](https://github.com/Bluestaq/udl-java-sdk/commit/a685370b94cba0d873c896341d84a505e6e11722))
* **ci:** skip uploading artifacts on stainless-internal branches ([61bfb45](https://github.com/Bluestaq/udl-java-sdk/commit/61bfb45c688a9abf16dc54129e6992b758c29ca9))
* **docs:** add missing descriptions ([f4e2dda](https://github.com/Bluestaq/udl-java-sdk/commit/f4e2dda2d37f6c61666e818fdfc092f343a672a4))
* drop apache dependency ([a0465db](https://github.com/Bluestaq/udl-java-sdk/commit/a0465db781ea9894c82ce77bbbe544bf0fa40d26))
* **internal:** bump palantir-java-format ([1842d24](https://github.com/Bluestaq/udl-java-sdk/commit/1842d24eb4d342bea2f6fdba60861fbc41b78b1b))
* **internal:** codegen related update ([6ef30c4](https://github.com/Bluestaq/udl-java-sdk/commit/6ef30c4ce586d94436d7eca12adb567801caa8b1))
* **internal:** expand imports ([fbfc05c](https://github.com/Bluestaq/udl-java-sdk/commit/fbfc05c9acbcfc92cadc795cd8492e04244a3572))
* **internal:** make `OkHttp` constructor internal ([e0b317c](https://github.com/Bluestaq/udl-java-sdk/commit/e0b317c3a87f72030d851c83dc6310f72c1212b7))
* **internal:** tweak CI branches ([0e70da3](https://github.com/Bluestaq/udl-java-sdk/commit/0e70da3e5206b375e9b4fb9f7f69e5ccc50496b6))
* **internal:** update `TestServerExtension` comment ([9e98814](https://github.com/Bluestaq/udl-java-sdk/commit/9e98814df9bb81665e779b45313afa90ecc0acf5))
* **internal:** update gitignore ([f68d8f1](https://github.com/Bluestaq/udl-java-sdk/commit/f68d8f15acb23144cb601f92b5e0bd27632aed8a))
* **internal:** update retry delay tests ([5681216](https://github.com/Bluestaq/udl-java-sdk/commit/5681216d469571b0d8a991d40632519c7b9d5bcb))
* make `Properties` more resilient to `null` ([41dc6fd](https://github.com/Bluestaq/udl-java-sdk/commit/41dc6fdb1730ed7448ccc195e7d07e83be556750))
* **test:** do not count install time for mock server timeout ([8617949](https://github.com/Bluestaq/udl-java-sdk/commit/8617949fb602dcbfa4628291a662ba128af2314d))
* **tests:** bump steady to v0.19.4 ([0ab5c9c](https://github.com/Bluestaq/udl-java-sdk/commit/0ab5c9cbd706eda232b82a4a621a6054f0d2a420))
* **tests:** bump steady to v0.19.5 ([fe21900](https://github.com/Bluestaq/udl-java-sdk/commit/fe2190080430ccb997f22771d23351851717948c))
* **tests:** bump steady to v0.19.6 ([cb8abff](https://github.com/Bluestaq/udl-java-sdk/commit/cb8abff6ac915febe7bcfbe7f5b097e0e9d1cdbe))
* **tests:** bump steady to v0.19.7 ([9d440f0](https://github.com/Bluestaq/udl-java-sdk/commit/9d440f00cab58b88945c0cd1b6f688de00baa51c))
* update placeholder string ([1f03089](https://github.com/Bluestaq/udl-java-sdk/commit/1f0308903eb073f33d7f503a7faff96bd4243a0f))


### Refactors

* **tests:** switch from prism to steady ([8914ccc](https://github.com/Bluestaq/udl-java-sdk/commit/8914cccd28ce04d0d9b54fd7ed944e566ec3038f))

## 0.9.0 (2026-02-06)

Full Changelog: [v0.8.0...v0.9.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.8.0...v0.9.0)

### Features

* **client:** send `X-Stainless-Kotlin-Version` header ([2e25ff1](https://github.com/Bluestaq/udl-java-sdk/commit/2e25ff17c6962aa84c6a2c110cd24c368b41adbb))


### Bug Fixes

* add missing fields ([b61bcfd](https://github.com/Bluestaq/udl-java-sdk/commit/b61bcfdddb13c6f2092a6f241febb9b8c1605ece))
* **client:** preserve time zone in lenient date-time parsing ([b18eeb2](https://github.com/Bluestaq/udl-java-sdk/commit/b18eeb26f26a4c6d6305e16f5ebd9b4b51d56083))
* **docs:** fix mcp installation instructions for remote servers ([cffa5bb](https://github.com/Bluestaq/udl-java-sdk/commit/cffa5bba230bcc2a34a63bc474ce77f7e3052565))


### Chores

* **ci:** upgrade `actions/github-script` ([591786f](https://github.com/Bluestaq/udl-java-sdk/commit/591786f7b9f250959ea3084a5274b59f9ed014a5))
* **internal:** allow passing args to `./scripts/test` ([fdf2483](https://github.com/Bluestaq/udl-java-sdk/commit/fdf24836622e8f1d555ce18864b15abf57efc010))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([5152565](https://github.com/Bluestaq/udl-java-sdk/commit/5152565878bd57819090fe76e8a24aa00f7333f0))
* **internal:** update maven repo doc to include authentication ([c796df5](https://github.com/Bluestaq/udl-java-sdk/commit/c796df573cce44b5ea93d45ef2c9ec7c117715f9))
* **internal:** upgrade AssertJ ([6e078ec](https://github.com/Bluestaq/udl-java-sdk/commit/6e078ec372af39d0455eac31b0544fc5e9b38d62))

## 0.8.0 (2026-01-16)

Full Changelog: [v0.7.0...v0.8.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.7.0...v0.8.0)

### Features

* **client:** add `HttpRequest#url()` method ([df9007d](https://github.com/Bluestaq/udl-java-sdk/commit/df9007d90e689d271609bf12ff8253e829c348bb))
* **client:** allow configuring dispatcher executor service ([72db58e](https://github.com/Bluestaq/udl-java-sdk/commit/72db58ef185c7ec18b6ccd0675e725a49b03c80c))


### Bug Fixes

* **client:** disallow coercion from float to int ([7fdceb8](https://github.com/Bluestaq/udl-java-sdk/commit/7fdceb80c1f90bf6c99ea898a8926a1d76f53601))
* **client:** fully respect max retries ([da90298](https://github.com/Bluestaq/udl-java-sdk/commit/da9029896a1689833747a3b30d30ac9dddc16566))
* **client:** send retry count header for max retries 0 ([da90298](https://github.com/Bluestaq/udl-java-sdk/commit/da9029896a1689833747a3b30d30ac9dddc16566))
* date time deserialization leniency ([00b11fd](https://github.com/Bluestaq/udl-java-sdk/commit/00b11fd3cab6c4a80cf564c676074b049d7d57c5))


### Chores

* **ci:** upgrade `actions/setup-java` ([e099016](https://github.com/Bluestaq/udl-java-sdk/commit/e099016c97398fe16725e7edb0bfee3d7581fc4c))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([faeff17](https://github.com/Bluestaq/udl-java-sdk/commit/faeff17a7ef6c558a73d47c7f2b6d1e65074c565))
* **internal:** depend on packages directly in example ([da90298](https://github.com/Bluestaq/udl-java-sdk/commit/da9029896a1689833747a3b30d30ac9dddc16566))
* **internal:** improve maven repo docs ([d9eceb7](https://github.com/Bluestaq/udl-java-sdk/commit/d9eceb7bcc63d5ea858716434cc7ec1d04e95464))
* **internal:** support uploading Maven repo artifacts to stainless package server ([f3afe9c](https://github.com/Bluestaq/udl-java-sdk/commit/f3afe9c3079f9d5f4b2ffcd171544be8835972e1))
* **internal:** update `actions/checkout` version ([df236cf](https://github.com/Bluestaq/udl-java-sdk/commit/df236cf1221185244ee1c2077a4a684d3c3cd692))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/Bluestaq/udl-java-sdk/issues/3240) in tests ([00b11fd](https://github.com/Bluestaq/udl-java-sdk/commit/00b11fd3cab6c4a80cf564c676074b049d7d57c5))


### Documentation

* prominently feature MCP server setup in root SDK readmes ([facd975](https://github.com/Bluestaq/udl-java-sdk/commit/facd97572299629a746e75f3c7d0c569e0f44fd3))

## 0.7.0 (2025-12-05)

Full Changelog: [v0.6.2...v0.7.0](https://github.com/Bluestaq/udl-java-sdk/compare/v0.6.2...v0.7.0)

### Features

* **api:** api update ([eebdfdc](https://github.com/Bluestaq/udl-java-sdk/commit/eebdfdc2e6d0b626287b9f82604afcdea06e7d7e))
* **api:** bumps to v1.37.0 of UDL API ([ffedb02](https://github.com/Bluestaq/udl-java-sdk/commit/ffedb0263a6da2448e436a7eae3db94de2032dd6))

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
