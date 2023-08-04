import sbt.*

object Dependencies {
  val scalaLociVersion = "130f6d7259"
  val scafiVersion = "1.1.6"

    lazy val munit = "org.scalameta" %% "munit" % "0.7.29"

  lazy val lociLanguage = "io.github.scala-loci.scala-loci" %% "scala-loci-language" % scalaLociVersion % "provided"
  lazy val lociRuntime = "io.github.scala-loci.scala-loci" %% "scala-loci-language-runtime" % scalaLociVersion
  lazy val lociTransmitter = "io.github.scala-loci.scala-loci" %% "scala-loci-language-transmitter-rescala" % scalaLociVersion
  lazy val lociCommunicatorTcp = "io.github.scala-loci.scala-loci" %% "scala-loci-communicator-tcp" % scalaLociVersion
  lazy val lociSerializerUpickle = "io.github.scala-loci.scala-loci" %% "scala-loci-serializer-upickle" % scalaLociVersion
  lazy val lociSerializerCirce = "io.github.scala-loci.scala-loci" %% "scala-loci-serializer-circe" % scalaLociVersion

  lazy val scafiCore = "it.unibo.scafi" %% "scafi-core" % scafiVersion
  lazy val scafiSimulatorGui = "it.unibo.scafi" %% "scafi-simulator-gui" % scafiVersion

}
