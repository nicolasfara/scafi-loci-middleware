import Dependencies._

ThisBuild / scalaVersion     := "2.13.11"
ThisBuild / scalaVersion     := "2.13.11"
ThisBuild / version          := "0.1.0-SNAPSHOT"
//ThisBuild / organization     := "com.example"
//ThisBuild / organizationName := "example"

ThisBuild / semanticdbEnabled := true

lazy val startupTransition: State => State = "conventionalCommits" :: _
Global / onLoad := startupTransition compose (Global / onLoad).value

resolvers += "jitpack" at "https://jitpack.io"

lazy val root = (project in file("."))
  .settings(
    name := "scafi-loci-middleware",
    scalacOptions ++= Seq("-feature", "-deprecation", "-unchecked", "-Xlint", "-Ymacro-annotations", "-Ywarn-unused"),
    libraryDependencies ++= Seq(
      munit % Test,
      scalactic,
      scalaTest,
      lociLanguage,
      lociRuntime,
      lociTransmitter,
      lociCommunicatorTcp,
      lociSerializerUpickle,
      lociSerializerCirce,
      scafiCore
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
