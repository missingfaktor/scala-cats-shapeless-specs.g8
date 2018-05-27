name := "$name$"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.6"

organization := "$organization$"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:experimental.macros",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint:delayedinit-select",
  "-Xlint:doc-detached",
  "-Xlint:infer-any",
  "-Xlint:missing-interpolator",
  "-Xlint:nullary-override",
  "-Xlint:nullary-unit",
  "-Xlint:private-shadow",
  "-Xlint:stars-align",
  "-Xlint:type-parameter-shadow",
  "-Xlint:unsound-match",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Ypartial-unification",
  "-Xmax-classfile-name", "200"
)

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

libraryDependencies ++= Seq(
  // cats
  "org.typelevel" %% "cats-core" % "1.1.0",
  "org.typelevel" %% "cats-macros" % "1.1.0",
  "org.typelevel" %% "cats-kernel" % "1.1.0",
  "org.typelevel" %% "cats-core" % "1.1.0",
  "org.typelevel" %% "cats-laws" % "1.1.0",
  "org.typelevel" %% "cats-free" % "1.1.0",
  "org.typelevel" %% "cats-testkit" % "1.1.0",
  "org.typelevel" %% "alleycats-core" % "1.1.0",

  // shapeless
  "com.chuusai" %% "shapeless" % "2.3.3",

  // specs
  "org.specs2" %% "specs2-core" % "4.2.0" % "test"
)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.6")

testFrameworks := Seq(TestFrameworks.Specs2)
