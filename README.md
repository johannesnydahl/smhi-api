# SMHI-API

This is a library written in Scala 3 to be used for communicating with the [SMHI Open Data API](https://opendata.smhi.se/apidocs/). It uses [uPickle](https://github.com/com-lihaoyi/upickle) for JSON serialization and [requests-scala](https://github.com/com-lihaoyi/requests-scala) for HTTP communication with the API.

This library was written by me to improve my `Scala` knowledge and learn how to publish a package. As a result, the library will probably never be production-ready. My goal is to implement at least two API endpoints.

It is recommended to use this library **together** with the [Official documentation from SMHI](https://opendata.smhi.se/apidocs/).

If you have any improvement ideas or other feedback, please leave an issue.

## Currently supported API Endpoints

- ⛔ Meteorological Observations
- ⛔ Meteorological Forecasts **(Work in progress)**
- ⛔ Meteorological Analysis MESAN
- ⛔ Meteorological Analysis STRÅNG
- ⛔ Hydrological Observations
- ⛔ Hydrography
- ⛔ PTHBV
- ⛔ Oceanographic Observations
- ⛔ Radar
- ⛔ Lightning Strikes
- ⛔ Lightning Archive
- ⛔ Lightning Sensor Data
- ⛔ Ice Maps
- ⛔ Algae Maps
- ⛔ Impact based weather warnings
- ⛔ Archived Model and Analysis data
- ⛔ Fire risk forecasts
- ⛔ Fire risk analysis

## How to build this library yourself

To build `SMHI-API` yourself, you need `Git`, `Scala 3.4.2` and `sbt`. 

Clone this repo on to the building machine using Git. Run `sbt assembly` in the root directory. This will produce a so-called **"fat jar"** - containing the library and its dependencies - located in `target/scala-3.4.2`. This jar should then be placed on classpath for the library to be used in your code.

Thanks to [sbt-assembly](https://github.com/sbt/sbt-assembly#using-published-plugin) for the sbt plugin used for building fat jars.