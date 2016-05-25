import sbt.Keys._

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.6",
  "org.scala-lang" % "scala-reflect" % "2.11.8",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.5",
  "org.scalatra" %% "scalatra" % "2.4.0",
  "org.scalatra" %% "scalatra-scalatest" % "2.4.0",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.14.v20151106" % "container;compile",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided",
  "ch.qos.logback" % "logback-classic" % "1.1.7" % "runtime"
)

lazy val root = (project in file("."))
  .enablePlugins(JettyPlugin)
  .settings(
    name := "bdir-back",
    version := "1.0.0",
    scalaVersion := "2.11.8",
    sbtVersion := "0.13.11"
  )
