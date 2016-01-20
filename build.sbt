// Project information
name := "receiveIT backend"
version := "0.0.1"
organization := "it.chalmers"

// Tool versions and settings
scalaVersion := "2.11.7"
lazy val ScalatraVersion = "2.4.0"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-specs2" % ScalatraVersion % "test",

  "javax.servlet" % "javax.servlet-api" % "3.1.0"
)

enablePlugins(JettyPlugin)
