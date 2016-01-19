// Project information
lazy val Name = "receiveIT backend"
lazy val Version = "0.0.1"
lazy val Organization = "it.chalmers"

// Tool versions and settings
lazy val ScalaVersion = "2.11.7"
lazy val ScalatraVersion = "2.4.0"

// Dependencies
lazy val scalatra = "org.scalatra" %% "scalatra" % ScalatraVersion
lazy val scalatra_specs2 = "org.scalatra" %% "scalatra-specs2" % ScalatraVersion % "test"

lazy val root = (project in file("."))
  // Project information
  .settings(
    name := Name,
    version := Version,
    organization := Organization
  )
  // Tool versions and settings
  .settings(
    scalaVersion := ScalaVersion
  )
  // Dependencies
  .settings(
    libraryDependencies ++= Seq(
      scalatra,
      scalatra_specs2
    )
  )
