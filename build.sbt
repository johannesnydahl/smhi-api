lazy val Scala3Version = "3.4.2"
lazy val Name          = "smhi-api"
lazy val Version        = "0.1.0" 


lazy val root = project
  .in(file("."))
  .settings(
    name := Name,
    version := Version,
    scalaVersion := Scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test,
    assembly / assemblyJarName := s"smhi-api-${Version}.jar"
  )

ThisBuild / scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-Wunused:all",
  "-Wvalue-discard", 
  "-Ysafe-init",
)
